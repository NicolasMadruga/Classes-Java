package com.petshop.view;

import com.petshop.model.Animal;

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
			System.out.println("1 para cadastrar animais");
			System.out.println("2 para listar os animais");
			System.out.println("3 para remover um animal");
			System.out.println("4 para buscar um animal");
			System.out.println("0 para encerrar");
			
			int opcao = scanner.nextInt();
			scanner.nextLine();
			
			return opcao;
		}
		
		public String animalRaca()
		{
			System.out.println("Insira a raça do animal: ");
			scanner.nextLine();
			String raca = scanner.nextLine();
			
			return raca;
		}
		
		public String animalEspecie()
		{
			System.out.println("Insira a espécie do animal: ");
			scanner.nextLine();
			String especie = scanner.nextLine();
			
			return especie;
		}
		
		public int animalIdade()
		{
			System.out.println("Insira a idade do animal: ");
		    int idade = scanner.nextInt();
			scanner.nextLine();
			
			return idade;
		}
		
		public double animalPeso()
		{
			System.out.println("Insira o peso do animal: ");
		    double peso = scanner.nextDouble();
			scanner.nextLine();
			
			return peso;
		}
		
		public void visualizar(Animal animal)
		{
			System.out.println("----------------");
			System.out.println("Raça: " + animal.getRaca());
			System.out.println("Espécie: " + animal.getEspecie());
			System.out.println("Idade: " + animal.getIdade());
			System.out.println("Peso: " + animal.getPeso());
		}
		
		public void removido()
		{
			System.out.println("O livro foi removido com sucesso");
		}
		
		public void nEncontrado()
		{
			System.out.println("O livro não foi encontrado");
		}
		
		public void encerrado()
		{
			System.out.println("Encerrando...");
		}
	}
