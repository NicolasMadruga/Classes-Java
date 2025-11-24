package br.com.apptv.view;

import java.util.Scanner;
import br.com.apptv.model.TV;

public class Atendente
	{
		TV tv;
		Scanner scanner;
		
		public Atendente()
		{
			tv = new TV();
			scanner = new Scanner(System.in);
		}
		
		public int menu()
		{
			System.out.println("Digite:");
			System.out.println("1 para cadastrar nova TV");
			System.out.println("2 para listar todas TVs");
			System.out.println("3 para remover uma TV");
			System.out.println("4 para buscar uma TV");
			System.out.println("0 para terminar aplicação");
			int opcao = scanner.nextInt();
			return opcao;
		}
		public String tvMarca()
		{
			System.out.println("Digite a marca da tv: ");
			scanner.nextLine();
			return scanner.nextLine();
		}
		
		public double tvTamanho()
		{
			System.out.println("Digite o tamanho da tv: ");
			return scanner.nextDouble();
		}
		
		public String tvResolucao()
		{
			System.out.println("Digite a resolução da tv: ");
			scanner.nextLine();
			return scanner.nextLine();
		}
		
		public double tvPreco()
		{
			System.out.println("Digite o preço da tv: ");
			return scanner.nextDouble();
		}
		
		public void visualizar(TV tv)
		{
			System.out.println("-------------");
			System.out.println("Marca: " + tv.getMarca());
			System.out.println("Tamanho: " + tv.getTamanho());
			System.out.println("Resolução: " + tv.getResolucao());
			System.out.println("Preço: " + tv.getPreco());
		}
		
		public String remocao()
		{
			System.out.println("Digite a marca da TV que quer remover: ");
			scanner.nextLine();
			return scanner.nextLine();
		}
		
		public void removido()
		{
			System.out.println("A TV foi removida com sucesso!");
		}
		
		public void naoEncontrado()
		{
			System.out.println("Não encontramos essa tv.");
		}
		
		public String busca()
		{
			System.out.println("Digite a marca da TV que quer buscar: ");
			scanner.nextLine();
			return scanner.nextLine();
			
		}
		
		public void finalizar()
		{
			System.out.println("Finalizando aplicação...");
		}
		
		public void outOfBounds()
		{
			System.out.println("Por favor, digite um numero válido!");
			menu();
		}
	}
