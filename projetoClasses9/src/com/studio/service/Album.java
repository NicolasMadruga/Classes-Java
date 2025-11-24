package com.studio.service;

import com.studio.view.Atendente;
import com.studio.model.Musica;

import java.util.ArrayList;

public class Album
	{
		ArrayList<Musica> listaMusicas;
		
		public Album()
		{
			listaMusicas = new ArrayList<>();
		}
		
		public void gestaoMusica(int opcao, Atendente atendente)
		{
			switch(opcao)
			{
			
			case 1:
			{
				String nome = atendente.musicaNome();
				String artista = atendente.musicaArtista();
				int duracao = atendente.musicaDuracao();
				double preco = atendente.musicaPreco();
				
				Musica musica = new Musica(nome, artista, duracao, preco);
				
				listaMusicas.add(musica);
				break;
			}
			
			case 2:
			{
				for (Musica musica : listaMusicas)
				{
					atendente.visualizar(musica);
				}
				
				break;
			}
			
			case 3:
			{
				String nome = atendente.musicaNome();
				boolean removido = false;
				
				for(int i = 0; i < listaMusicas.size(); i++)
				{
					if(listaMusicas.get(i).getTitulo().equalsIgnoreCase(nome))
					{
						listaMusicas.remove(i);
						removido = true;
					}
					
					if (removido)
					{
						atendente.removido();
					}
					else
					{
						atendente.nEncontrado();
					}
				}
			}
			
			case 4:
			{
				String nome = atendente.musicaNome();
				Musica bMusica = null;
				
				for (Musica musica : listaMusicas)
				{
					if(musica.getTitulo().equalsIgnoreCase(nome))
					{
						bMusica = musica;
					}
					
					if (bMusica != null)
					{
						atendente.visualizar(bMusica);
					}
					else
					{
						atendente.nEncontrado();
					}
				}
				
				break;
			}
			
			case 5:
			{
				String nome = atendente.musicaNome();
				boolean tocando = false;
				
				for (Musica musica : listaMusicas)
				{
					if(musica.getTitulo().equalsIgnoreCase(nome))
					{
						tocando = true;
					}
				}
				
				if (tocando)
				{
					atendente.tocando();
				}
				else
				{
					atendente.nEncontrado();
				}
				
				break;
			}
			
			case 6:
			{
				String nome = atendente.musicaNome();

				boolean tocando = false;
				
				for (Musica musica : listaMusicas)
				{
					if(musica.getTitulo().equalsIgnoreCase(nome))
					{
						tocando = true;
					}
				}
				
				if (tocando)
				{
					atendente.parar();
				}
				else
				{
					atendente.nEncontrado();
				}
				
				break;
			}
			}
		}
	}
