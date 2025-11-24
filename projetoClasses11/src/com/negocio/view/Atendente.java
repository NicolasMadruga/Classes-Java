package com.negocio.view;

import com.negocio.model.Bolsa;

import java.util.Scanner;

public class Atendente
	{
		
		Scanner scanner;
		
		public Atendente()
		{
			scanner = new Scanner(System.in);
		}
		
		public int menu()
		{
			System.out.println("Digite:");
			System.out.println("1 para cadastrar uma bolsa");
			System.out.println("2 para listar as bolsas");
			System.out.println("3 para excluir uma bolsa");
			System.out.println("4 para buscar uma bolsa");
			System.out.println("0 para encerrar");
			
			int opcao = scanner.nextInt();
			scanner.nextLine();
			
			return opcao;
		}
		
		public String bolsaEmpresa()
		{
			System.out.println("Insira o nome da empresa: ");
			String empresa = scanner.nextLine();
			
			return empresa;
		}
		
		public double bolsaPreco()
		{
			System.out.println("Insira o preço das ações: ");
			double preco_acoes = scanner.nextDouble();
			scanner.nextLine();
			
			return preco_acoes;
		}
		
		public double bolsaVolumeNegociacoes()
		{
			System.out.println("Insira o volume das negociações: ");
			double volume_negociacoes = scanner.nextDouble();
			scanner.nextLine();
			
			return volume_negociacoes;
		}
		
		public double bolsaVariacaoDiaria()
		{
			System.out.println("Insira a variação diária: ");
			double variacao_diaria = scanner.nextDouble();
			scanner.nextLine();
			
			return variacao_diaria;
		}
		
		public void visualizar(Bolsa bolsa)
		{
			System.out.println("Empresa: " + bolsa.getEmpresa());
			System.out.println("Preço por ação: " + bolsa.getPreco_acao());
			System.out.println("Volume de negociações: " + bolsa.getVolume_negociacoes());
			System.out.println("Variação diária: " + bolsa.getVariacao_diaria());
		}
		
		public void excluido()
		{
			System.out.println("A bolsa foi excluída com sucesso.");
		}
		
		public void nEncontrado()
		{
			System.out.println("A bolsa não foi encontrada.");
		}
	}
