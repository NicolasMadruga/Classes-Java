package com.mecanica.view;

import com.mecanica.model.Bicicleta;

import java.util.Scanner;

public class Mecanico
	{
		Scanner scanner;
		
		public Mecanico()
		{
			scanner = new Scanner(System.in);
		}
		
		public int menu()
		{
			System.out.println("Digite: ");
			System.out.println("1 para cadastrar uma bicicleta");
			System.out.println("2 para listar as bicicletas");
			System.out.println("3 para excluir uma bicicleta");
			System.out.println("4 para buscar uma bicicleta");
			System.out.println("0 para encerrar");
			
			int opcao = scanner.nextInt();
			scanner.nextLine();
			
			return opcao;
		}
		
		public String bikeMarca()
		{
			System.out.println("Insira a marca da bicicleta: ");
			scanner.nextLine();
			String marca = scanner.nextLine();
			
			return marca;
		}
		
		public String bikeModelo()
		{
			System.out.println("Insira o modelo da bicicleta: ");
			scanner.nextLine();
			String modelo = scanner.nextLine();
			
			return modelo;
		}
		
		public int bikeQuadro()
		{
			System.out.println("Insira o tamanho do quadro da bicicleta: ");
			int tamanhoQuadro = scanner.nextInt();
			scanner.nextLine();
			
			return tamanhoQuadro;
		}
		
		public double bikePreco()
		{
			System.out.println("Insira o preco da bicicleta: ");
			double preco = scanner.nextDouble();
			scanner.nextLine();
			
			return preco;
		}
		
		public void visualizar(Bicicleta bike)
		{
			System.out.println("---------------------");
			System.out.println("Marca: " + bike.getMarca());
			System.out.println("Modelo: " + bike.getModelo());
			System.out.println("Tamanho do quadro: " + bike.getTamanhoQuadro());
			System.out.println("Preco: " + bike.getPreco());
		}
		
		public void removido()
		{
			System.out.println("A bike foi removida com sucesso!");
		}
		
		public void nEncontrado()
		{
			System.out.println("A bike não foi encontrada.");
		}
		
		public void encerrar()
		{
			System.out.println("Encerrando...");
		}
				
	}
