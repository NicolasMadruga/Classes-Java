package br.com.main.model;

public class Telefone
	{
		String marca;
		String modelo;
		double preco;
		double memoria;
		
		public Telefone()
		{
			this.marca = "Motorola";
			this.modelo = "G35";
			double preco = 1.100;
			double memoria = 24;
		}
		
		public Telefone(String marca, String modelo, double preco, double memoria)
		{
			this.marca = marca;
			this.modelo = modelo;
			this.preco = preco;
			this.memoria = memoria;
		}
		
		public String getMarca()
		{
			return marca;
		}
		
		public void setMarca(String marca)
		{
			this.marca = marca;
		}
		
		public String getModelo()
		{
			return modelo;
		}
		
		public void setModelo(String modelo)
		{
			this.modelo = modelo;
		}
		
		public double getPreco()
		{
			return preco;
		}
		
		public void setPreco(double preco)
		{
			this.preco = preco;
		}
		
		public double getMemoria()
		{
			return memoria;
		}
		
		public void setMemoria(double memoria)
		{
			this.memoria = memoria;
		}
	}
