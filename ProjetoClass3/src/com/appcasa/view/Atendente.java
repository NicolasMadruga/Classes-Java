package com.appcasa.view;

import java.util.Scanner;

import com.appcasa.model.Casa;

public class Atendente
	{
		Scanner scanner;
		Casa casa;
		
		public Atendente()
		{
			scanner = new Scanner(System.in);
			casa = new Casa();
		}
		
		public int menu()
		{
			System.out.println("Digite: ");
			System.out.println("1 para cadastrar uma casa");
			System.out.println("2 para listar uma casa ");
			System.out.println("3 para remover uma casa");
			System.out.println("4 para buscar uma casa");
			
			int opcao = scanner.nextInt();
			
			return opcao;
		}
		
		public void visualizar(Casa casa)
		{
			System.out.println("-----------------------");
			System.out.println("Endereco: " + casa.getEndereco());
			System.out.println("Area: " + casa.getArea());
			System.out.println("Numero de quartos: " + casa.getNumQuartos());
			System.out.println("Preço: " + casa.getPreco());
		}
		
		public void deletada()
		{
			System.out.println("A casa foi excluida.");
		}
		
		public void nEncontrada()
		{
			System.out.println("A casa não foi encontrada.");
		}
		
		public String casaEndereco()
		{
			System.out.println("Insira o endereço da casa: ");
			scanner.nextLine();
			String endereco = scanner.nextLine();
			
			return endereco;
		}
		
		public int casaArea()
		{
			System.out.println("Insira a área da casa: ");
			int area = scanner.nextInt();
			scanner.nextLine();
			
			return area;
		}
		
		public int casaNumQuartos()
		{
			System.out.println("Insira o número de quartos da casa: ");
			int numQuartos = scanner.nextInt();
			scanner.nextLine();
			
			return numQuartos;
		}
		
		public double casaPreco()
		{
			System.out.println("Insira o preço da casa: ");
			double preco = scanner.nextDouble();
			scanner.nextLine();
			
			return preco;
		}
		
		public void encerrar()
		{
			System.out.println("Encerrando aplicacao...");
		}
	}
