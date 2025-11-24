package com.lanhouse.model;

public class Jogo
	{
		String titulo;
		String plataforma;
		String classificacao_etaria;
		double preco;
		
		public Jogo()
		{
			this.titulo = null;
			this.plataforma = null;
			this.classificacao_etaria = null;
			this.preco = 0;
		}
		
		public Jogo(String titulo, String plataforma, String classificacao_etaria, double preco)
		{
			this.titulo = titulo;
			this.plataforma = plataforma;
			this.classificacao_etaria = classificacao_etaria;
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
		
		public String getPlataforma()
		{
			return plataforma;
		}
		
		public void setPlataforma(String plataforma)
		{
			this.plataforma = plataforma;
		}
		
		public String getClassEtaria()
		{
			return classificacao_etaria;
		}
		
		public void setClassEtaria(String classificacao_etaria)
		{
			this.classificacao_etaria = classificacao_etaria;
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
