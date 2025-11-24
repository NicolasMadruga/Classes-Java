package com.biblioteca;

public class Livro
	{
		String nome;
		String autor;
		int numPaginas;
		double preco;
		
		public Livro()
		{
			this.nome = null;
			this.autor = null;
			this.numPaginas = 0;
			this.preco = 0;
		}
		
		public Livro(String nome, String autor, int numPaginas, double preco)
		{
			this.nome = nome;
			this.autor = autor;
			this.numPaginas = numPaginas;
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

		public String getAutor()
		{
			return autor;
		}

		public void setAutor(String autor)
		{
			this.autor = autor;
		}

		public int getNumPaginas()
		{
			return numPaginas;
		}

		public void setNumPaginas(int numPaginas)
		{
			this.numPaginas = numPaginas;
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
