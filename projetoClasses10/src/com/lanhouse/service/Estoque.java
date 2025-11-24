package com.lanhouse.service;

import com.lanhouse.view.Atendente;
import com.lanhouse.model.Jogo;

import java.util.List;
import java.util.ArrayList;

public class Estoque
	{
		ArrayList<Jogo> estoque;
		
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
				
			String titulo = atendente.jogoTitulo();
			String plataforma = atendente.jogoPlataforma();
			String classEtaria = atendente.jogoClassEtaria();
			double preco = atendente.jogoPreco();
			
			Jogo jogo = new Jogo(titulo, plataforma, classEtaria, preco);
			
			estoque.add(jogo);
			
			break;
			
			}
			
			case 2:
			{
				
				for(Jogo jogo : estoque)
				{
					atendente.visualizar(jogo);
				}
				
				break;
			}
			
			case 3:
			{
				
				String titulo = atendente.jogoTitulo();
				boolean excluido = false;
				
				for(int i = 0; i < estoque.size(); i++)
				{
					if(estoque.get(i).getTitulo().equalsIgnoreCase(titulo))
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
					atendente.nEcontrado();
				}
				
				break;
			}
			
			case 4:
			{
				String titulo = atendente.jogoTitulo();
				Jogo bJogo = null;
				
				for(Jogo jogo : estoque)
				{
					if(jogo.getTitulo().equalsIgnoreCase(titulo))
					{
						bJogo = jogo;
					}
				}
				
				if (bJogo != null)
				{
					atendente.visualizar(bJogo);
				}
				else
				{
					atendente.nEcontrado();
				}
				
				break;
			}
			
			case 0:
			{
				atendente.encerrar();
			}
			
			break;
			}
		}
	}
