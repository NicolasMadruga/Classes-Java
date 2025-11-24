package com.cinema.model;

public class Filme
	{
		String nome;
		String artista;
		int duracao;
		double preco;
		
		public Filme()
		{
			this.nome = null;
			this.artista = null;
			this.duracao = 0;
			this.preco = 0;
		}
		
		public Filme(String nome, String artista, int duracao, double preco)
		{
			this.nome = nome;
			this.artista = artista;
			this.duracao = duracao;
			this.preco = preco;
		}

		public String getNome()
		{
			return nome;
		}

		public void setNome(String nome)
		{
			this.nome = nome;
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
