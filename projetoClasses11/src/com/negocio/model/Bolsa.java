package com.negocio.model;

public class Bolsa
	{
		
		String empresa;
		double preco_acao;
		double volume_negociacoes;
		double variacao_diaria;
		
		public Bolsa()
		{
			this.empresa = null;
			this.preco_acao = 0;
			this.volume_negociacoes = 0;
			this.variacao_diaria = 0;
		}
		
		public Bolsa(String empresa, double preco_acao, double volume_negociacoes, double variacao_diaria)
		{
			this.empresa = empresa;
			this.preco_acao = preco_acao;
			this.volume_negociacoes = volume_negociacoes;
			this.variacao_diaria = variacao_diaria;
		}

		public String getEmpresa()
		{
			return empresa;
		}

		public void setEmpresa(String empresa)
		{
			this.empresa = empresa;
		}

		public double getPreco_acao()
		{
			return preco_acao;
		}

		public void setPreco_acao(double preco_acao)
		{
			this.preco_acao = preco_acao;
		}

		public double getVolume_negociacoes()
		{
			return volume_negociacoes;
		}

		public void setVolume_negociacoes(double volume_negociacoes)
		{
			this.volume_negociacoes = volume_negociacoes;
		}

		public double getVariacao_diaria()
		{
			return variacao_diaria;
		}

		public void setVariacao_diaria(double variacao_diaria)
		{
			this.variacao_diaria = variacao_diaria;
		}
	}
