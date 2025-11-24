package br.com.apptv.service;

import java.util.ArrayList;

import br.com.apptv.model.TV;
import br.com.apptv.view.Atendente;

public class Estoque
	{
		ArrayList<TV> estoque;
		
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
				String marca = atendente.tvMarca();
				double tamanho = atendente.tvTamanho();
				String resolucao = atendente.tvResolucao();
				double preco = atendente.tvPreco();
				
				TV tv = new TV(marca, tamanho, resolucao, preco);
				estoque.add(tv);
				break;
			}
			
			case 2:
			{
				for(TV tv : estoque)
				{
					atendente.visualizar(tv);
				}
				break;
			}
			
			case 3:
			{
				String marca = atendente.remocao();
				boolean removido = false;
				
				for(int i = 0; i < estoque.size(); i++)
				{
					if(estoque.get(i).getMarca().equalsIgnoreCase(marca))
					{
						estoque.remove(i);
						removido = true;
					}
				}
				
				if(removido)
				{
					atendente.removido();
				}
				else
				{
					atendente.naoEncontrado();
				}
				break;
			}
			
			case 4:
			{
				atendente.busca();
				
				TV marca = null;
				
				for (TV tv : estoque)
				{
					marca = tv;
				}
				
				if(marca != null)
				{
					atendente.visualizar(marca);
				}
				else
				{
					atendente.naoEncontrado();
				}
				break;
			}
			case 5:
			{
				atendente.finalizar();
				break;
			}
			
			default:
			{
				atendente.menu();
				break;
			}
			}
		}
	}
