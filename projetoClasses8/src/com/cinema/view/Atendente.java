package com.cinema.view;

import com.cinema.model.Filme;

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
			System.out.println("Digite: ");
			System.out.println("1 para cadastrar");
			System.out.println("2 listar os filmes");
			System.out.println("3 para remover um filme");
			System.out.println("4 para buscar um filme");
			System.out.println("0 para encerrar");
			
			int opcao = scanner.nextInt();
			scanner.nextLine();
			
			return opcao;
		}
		
		public String filmeNome()
		{
			System.out.println("Insira o nome do filme: ");
			scanner.nextLine();
			String nome = scanner.nextLine();
			
			return nome;
		}
		
		public String filmeArtista()
		{
			System.out.println("Insira o artista do filme: ");
			scanner.nextLine();
			String artista = scanner.nextLine();
			
			return artista;
		}
		
		public int filmeDuracao()
		{
			System.out.println("Insira o nome do filme: ");
			int duracao = scanner.nextInt();
			scanner.nextLine();
			
			return duracao;
		}
		
		public double filmePreco()
		{
			System.out.println("Insira o preço do ingresso: ");
			double preco = scanner.nextDouble();
			scanner.nextLine();
			
			return preco;
		}
		
		public void visualizar(Filme filme)
		{
			System.out.println("------------------");
			System.out.println("Nome: " + filme.getNome());
			System.out.println("Artista: " + filme.getArtista());
			System.out.println("Duracao: " + filme.getDuracao());
			System.out.println("Preco: " + filme.getPreco());
		}
		
		public void removido()
		{
			System.out.println("O filme foi removido com sucesso");
		}
		
		public void nEncontrado()
		{
			System.out.println("O filme não foi encontrado");
		}
		
		public void encerrar()
		{
			System.out.println("Encerrando...");
		}
		
	}
