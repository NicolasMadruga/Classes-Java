package com.studio.model;

public class Musica
	{
		String titulo;
		String artista;
		int duracao;
		double preco;
		
		public Musica()
		{
			this.titulo = null;
			this.artista = null;
			this.duracao = 0;
			this.preco = 0;
		}
		
		public Musica(String titulo, String artista, int duracao, double preco)
		{
			this.titulo = titulo;
			this.artista = artista;
			this.duracao = duracao;
			this.preco = preco;
		}

		public String getTitulo()
		{
			return titulo;
		}

		public void setTitulo(String titulo)
		{
			this.titulo = titulo;
		}

		public String getArtista()
		{
			return artista;
		}

		public void setArtista(String artista)
		{
			this.artista = artista;
		}

		public int getDuracao()
		{
			return duracao;
		}

		public void setDuracao(int duracao)
		{
			this.duracao = duracao;
		}

		public double getPreco()
		{
			return preco;
		}

		public void setPreco(double preco)
		{
			this.preco = preco;
		}
	}
