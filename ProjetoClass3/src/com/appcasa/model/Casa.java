package com.appcasa.model;

public class Casa
	{
		String endereco;
		int area;
		int numQuartos;
		double preco;

		public Casa()
		{
			this.endereco = "j";
			this.area = 0;
			this.numQuartos = 0;
			this.preco = 0;
		}

		public Casa(String endereco, int area, int numQuartos, double preco)
		{
			this.endereco = endereco;
			this.area = area;
			this.numQuartos = numQuartos;
			this.preco = preco;
		}

		public String getEndereco()
		{
			return endereco;
		}

		public void setEndereco(String endereco)
		{
			this.endereco = endereco;
		}

		public int getArea()
		{
			return area;
		}

		public void setArea(int area)
		{
			this.area = area;
		}

		public int getNumQuartos()
		{
			return numQuartos;
		}

		public void setNumQuartos(int numQuartos)
		{
			this.numQuartos = numQuartos;
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
