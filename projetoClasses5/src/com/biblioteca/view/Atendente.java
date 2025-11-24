package com.biblioteca.view;

import com.biblioteca.Livro;

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
			System.out.println("1 para cadastrar um livro");
			System.out.println("2 para listar os livros");
			System.out.println("3 para remover um livro");
			System.out.println("4 para buscar um livro");
			System.out.println("0 para encerrar");
			
			int opcao = scanner.nextInt();
			scanner.nextLine();
			
			return opcao;
		}
		
		public void visualizar(Livro livro)
		{
			System.out.println("----------------------");
			System.out.println("Nome: " + livro.getNome());
			System.out.println("Autor: " + livro.getAutor());
			System.out.println("Número de páginas: " + livro.getNumPaginas());
			System.out.println("Preço: " + livro.getPreco());
		}
		
		public String livroNome()
		{
			System.out.println("Insira o nome do livro: ");
			scanner.nextLine();
			String nome = scanner.nextLine();
			
			return nome;
		}
		
		public String livroAutor()
		{
			System.out.println("Insira o autor do livro: ");
			scanner.nextLine();
			String autor = scanner.nextLine();
			
			return autor;
		}
		
		public int livroPaginas()
		{
			System.out.println("Insira a quantidade de páginas do livro: ");
			int numPaginas = scanner.nextInt();
			scanner.nextLine();
			
			return numPaginas;
		}
		
		public double livroPreco()
		{
			System.out.println("Insira o preço do livro: ");
			double preco = scanner.nextDouble();
			scanner.nextLine();
			
			return preco;
		}
		
		public void removido()
		{
			System.out.println("O livro foi removido com sucesso!");
		}
		
		public void nEncontrado()
		{
			System.out.println("O livro não foi encontrado");
		}
		
		public void encerrar()
		{
			System.out.println("Encerrando...");
		}
	}
