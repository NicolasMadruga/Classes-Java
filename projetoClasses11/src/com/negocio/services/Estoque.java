package com.negocio.services;

import com.negocio.model.Bolsa;
import com.negocio.view.Atendente;

import java.util.ArrayList;

public class Estoque
	{
		ArrayList<Bolsa> estoque;
		
		public Estoque()
		{
			estoque = new ArrayList<>();
		}
		
		public void gerenciarEstoque(int opcao, Atendente atendente)
		{
			switch(opcao)
			{
			case 1:
			{
				String empresa = atendente.bolsaEmpresa();
				double preco_acao = atendente.bolsaPreco();
				double volume_negociacoes = atendente.bolsaVolumeNegociacoes();
				double variacao_diaria = atendente.bolsaVariacaoDiaria();
				
				Bolsa bolsa = new Bolsa(empresa, preco_acao, volume_negociacoes, variacao_diaria);
				
				estoque.add(bolsa);
				break;
			}
			
			case 2:
			{
				for (Bolsa bolsa : estoque)
				{
					atendente.visualizar(bolsa);
				}
				
				break;
			}
			
			case 3:
			{
				String empresa = atendente.bolsaEmpresa();
				boolean excluido = false;
				
				for(int i = 0; i < estoque.size(); i++)
				{
					if(estoque.get(i).getEmpresa().equalsIgnoreCase(empresa))
					{
						estoque.remove(i);
						excluido = true;
					}
				}
				
				if(excluido)
				{
					atendente.excluido();
				}
				else
				{
					atendente.nEncontrado();
				}
				
				break;
			}
			
			case 4:
			{
				
				String empresa = atendente.bolsaEmpresa();
				Bolsa bBolsa = null;
				
				for (Bolsa bolsa : estoque)
				{
					if(bolsa.getEmpresa().equalsIgnoreCase(empresa))
					{
						bBolsa = bolsa;
					}
				}
				
				if (bBolsa != null)
				{
					atendente.visualizar(bBolsa);
				}
				else
				{
					atendente.nEncontrado();
				}
			}
			}
		}
	}
