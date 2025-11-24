package com.appcasa.service;

import com.appcasa.view.Atendente;
import com.appcasa.model.Casa;

import java.util.List;
import java.util.ArrayList;

public class Estoque
	{
		ArrayList<Casa> listaCasas;
		
		public Estoque()
		{
			listaCasas = new ArrayList<>();
		}
		
		public void gerenciarEstoque(int opcao, Atendente atendente)
		{
			switch(opcao)
			{
			
			case 1:
			{
				String endereco = atendente.casaEndereco();
				int area = atendente.casaArea();
				int numQuartos = atendente.casaNumQuartos();
				double preco = atendente.casaPreco();
				
				Casa casa = new Casa(endereco, area, numQuartos, preco);
				
				listaCasas.add(casa);
				break;
			}
			
			case 2:
			{
				for(Casa casa : listaCasas)
				{
					atendente.visualizar(casa);
				}
				
				break;
			}
			
			case 3:
			{
				String endereco = atendente.casaEndereco();
				boolean registrada = false;
				
				for(int i = 0; i < listaCasas.size(); i++)
				{
					if(listaCasas.get(i).getEndereco().equalsIgnoreCase(endereco))
					{
						listaCasas.remove(i);
						registrada = true;
					}
				}
				
				if(registrada = true)
				{
					atendente.deletada();
				}
				else
				{
					atendente.nEncontrada();
				}
				
			}
			
			case 4:
			{
				String endereco = atendente.casaEndereco();
				Casa info = null;
				
				for(Casa casa : listaCasas)
				{
					if(casa.getEndereco().equalsIgnoreCase(endereco))
					{
						info = casa;
					}
				}
				
				if(info != null)
				{
					atendente.visualizar(info);
				}
				else
				{
					atendente.nEncontrada();
				}
				break;
			}
			case 0:
			{
				atendente.encerrar();
			}
			
			}
		}
	}
