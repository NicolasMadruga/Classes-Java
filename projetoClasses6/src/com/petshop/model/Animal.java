package com.petshop.model;

public class Animal
	{
		String especie;
		String raca;
		int idade;
		double peso;
		
		public Animal()
		{
			this.especie = null;
			this.raca = null;
			this.idade = 0;
			this.peso = 0;
		}

		public String getEspecie()
		{
			return especie;
		}

		public void setEspecie(String especie)
		{
			this.especie = especie;
		}

		public String getRaca()
		{
			return raca;
		}

		public void setRaca(String raca)
		{
			this.raca = raca;
		}

		public int getIdade()
		{
			return idade;
		}

		public void setIdade(int idade)
		{
			this.idade = idade;
		}

		public double getPeso()
		{
			return peso;
		}

		public void setPeso(double peso)
		{
			this.peso = peso;
		}
	}
