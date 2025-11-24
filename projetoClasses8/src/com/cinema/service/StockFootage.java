package com.cinema.service;

import com.cinema.model.Filme;
import com.cinema.view.Atendente;

import java.util.List;
import java.util.ArrayList;

public class StockFootage
	{
		ArrayList<Filme> listaFilmes;

		public StockFootage()
		{
			listaFilmes = new ArrayList<>();
		}

		public void gestaoFilmes(int opcao, Atendente atendente)
		{
			switch (opcao)
			{
			case 1: 
			{
				String nome = atendente.filmeNome();
				String artista = atendente.filmeArtista();
				int duracao = atendente.filmeDuracao();
				double preco = atendente.filmePreco();

				Filme filme = new Filme(nome, artista, duracao, preco);

				listaFilmes.add(filme);
				break;
			}

			case 2: 
			{
				for (Filme filme : listaFilmes)
				{
					atendente.visualizar(filme);
				}
				break;
			}

			case 3: 
			{
				String nome = atendente.filmeNome();
				boolean removido = false;

				for (int i = 0; i < listaFilmes.size(); i++)
				{
					if(listaFilmes.get(i).getNome().equalsIgnoreCase(nome))
					{
						listaFilmes.remove(i);
						removido = true;
					}
				}
				
			if (removido)
			{
				atendente.removido();
			}
			else
			{
				atendente.nEncontrado();
			}
			
			break;
			}
			
			case 4:
			{
				String nome = atendente.filmeNome();
				Filme bFilme = null;
				
				for (Filme filme : listaFilmes)
				{
					if(filme.getNome().equalsIgnoreCase(nome))
					{
						bFilme = filme;
					}
				}
				
				if(bFilme != null)
				{
					atendente.visualizar(bFilme);
				}
				else
				{
					atendente.nEncontrado();
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
