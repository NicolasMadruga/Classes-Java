package com.mecanica.model;

public class Bicicleta
	{
		String marca;
		String modelo;
		int tamanhoQuadro;
		double preco;
		
		public Bicicleta()
		{
			this.marca = null;
			this.modelo = null;
			this.tamanhoQuadro = 0;
			this.preco = 0;
		}
		
		public Bicicleta(String marca, String modelo, int tamanhoQuadro, double preco)
		{
			this.marca = marca;
			this.modelo = modelo;
			this.tamanhoQuadro = tamanhoQuadro;
			this.preco = preco;
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

		public int getTamanhoQuadro()
		{
			return tamanhoQuadro;
		}

		public void setTamanhoQuadro(int tamanhoQuadro)
		{
			this.tamanhoQuadro = tamanhoQuadro;
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
