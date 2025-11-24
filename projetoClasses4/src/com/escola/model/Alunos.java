package com.escola.model;

public class Alunos
	{
		private String nome;
		private int idade;
		private String matricula;
		private int anoIngresso;
		
		public Alunos()
		{
			this.nome = "";
			this.idade = 0;
			this.matricula = "0000000";
			this.anoIngresso = 0;
		}

		public String getNome()
		{
			return nome;
		}

		public void setNome(String nome)
		{
			this.nome = nome;
		}

		public int getIdade()
		{
			return idade;
		}

		public void setIdade(int idade)
		{
			this.idade = idade;
		}

		public String getMatricula()
		{
			return matricula;
		}

		public void setMatricula(String matricula)
		{
			this.matricula = matricula;
		}

		public int getAnoIngresso()
		{
			return anoIngresso;
		}

		public void setAnoIngresso(int anoIngresso)
		{
			this.anoIngresso = anoIngresso;
		}
	}
