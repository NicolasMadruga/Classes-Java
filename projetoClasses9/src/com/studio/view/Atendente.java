package com.studio.view;

import com.studio.model.Musica;

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
			System.out.println("1 para cadastrar uma musica");
			System.out.println("2 para listar as musicas");
			System.out.println("3 para remover uma musica");
			System.out.println("4 para buscar uma musica");
			System.out.println("5 para tocar uma musica");
			System.out.println("6 para para uma musica");
			System.out.println("0 para encerrar");
			
			int opcao = scanner.nextInt();
			scanner.nextLine();
			
			return opcao;
		}
		
		public String musicaNome()
		{
			System.out.println("Insira o nome da música: ");
			String nome = scanner.nextLine();
			
			return nome;
		}
		
		public String musicaArtista()
		{
			System.out.println("Insira o artista da música: ");
			String artista = scanner.nextLine();
			
			return artista;
		}
		
		public int musicaDuracao()
		{
			System.out.println("Insira a duração da música: ");
			int duracao = scanner.nextInt();
			scanner.nextLine();
			
			return duracao;
		}
		
		public double musicaPreco()
		{
			System.out.println("Insira o preço da música: ");
			double preco = scanner.nextDouble();
			scanner.nextLine();
			
			return preco;
		}
		
		
		public void visualizar(Musica musica)
		{
			System.out.println("---------------");
			System.out.println("Nome: " + musica.getTitulo());
			System.out.println("Artista: " + musica.getArtista());
			System.out.println("Duração: " + musica.getDuracao());
			System.out.println("Preco: " + musica.getPreco());
		}
		
		public void removido()
		{
			System.out.println("A música foi removida com sucesso");
		}
		
		public void nEncontrado()
		{
			System.out.println("A música não foi encontrada");
		}
		
		public void tocando()
		{
			System.out.println("A musica está tocando!");
		}
		
		public void parar()
		{
			System.out.println("A musica parou.");
		}
	}
