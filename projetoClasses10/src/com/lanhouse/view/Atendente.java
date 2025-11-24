package com.lanhouse.view;

import com.lanhouse.model.Jogo;

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
			System.out.println("1 para cadastrar um jogo");
			System.out.println("2 para listar os jogos");
			System.out.println("3 para excluir um jogo");
			System.out.println("4 para buscar um jogo");
			System.out.println("0 para encerrar");
			
			int opcao = scanner.nextInt();
			scanner.nextLine();
			
			return opcao;
		}
		
		public String jogoTitulo()
		{
			System.out.println("Insira o título do jogo: ");
			String titulo = scanner.nextLine();
			
			return titulo;
		}
		
		public String jogoPlataforma()
		{
				System.out.println("Insira a plataforma do jogo: ");
				String plataforma = scanner.nextLine();
				
				return plataforma;
		}
		
		public String jogoClassEtaria()
		{
			System.out.println("Insira a classificação etária do jogo: ");
			String classEtaria = scanner.nextLine();
			
			return classEtaria;
		}
		
		public double jogoPreco()
		{
			System.out.println("Insira o preço do jogo:");
			double preco = scanner.nextDouble();
			scanner.nextLine();
			
			return preco;
		}
		
		public void visualizar(Jogo jogo)
		{
			System.out.println("Titulo: " + jogo.getTitulo());
			System.out.println("Plataforma: " + jogo.getPlataforma());
			System.out.println("Classificação etária: " + jogo.getClassEtaria());
			System.out.println("Preço" + jogo.getPreco());
		}
		
		public void excluido()
		{
			System.out.println("O jogo foi excluido com sucesso.");
		}
		
		public void nEcontrado()
		{
			System.out.println("O jogo não foi encontrado.");
		}
		
		public void encerrar()
		{
			System.out.println("Encerrando...");
		}
		
	}
