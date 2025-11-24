package br.com.main.view;

import java.util.Scanner;
import br.com.main.model.Telefone;

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
			System.out.println("1 para cadastrar");
			System.out.println("2 para listar todos produtos");
			System.out.println("3 para remover algum produto");
			System.out.println("4 para buscar algum produto");
			System.out.println("0 para sair");
			int opcao = scanner.nextInt();
			return opcao;
		}
		
		public void visualizar(Telefone telefone)
		{
			System.out.println("--------------");
			System.out.println("Marca: " + telefone.getMarca());
			System.out.println("Modelo: " + telefone.getModelo());
			System.out.println("Preco: " + telefone.getPreco());
			System.out.println("Memória: " + telefone.getMemoria());
		}
		
		public String remover()
		{
			System.out.println("Digite o modelo que você deseja remover: ");
			scanner.nextLine();
			return scanner.nextLine();
		}
		
		public void modeloRemovido(String modelo)
		{
			System.out.println("O modelo removido foi: " + modelo);
		}
		
		public void removeFail()
		{
			System.out.println("O modelo não foi encontrado.");
		}
		
		public String modeloBusca()
		{
			System.out.println("Insira o modelo que quer buscar: ");
			scanner.nextLine();
			return scanner.nextLine();
		}
		
		public void buscando(String modelo)
		{	
			System.out.println("Buscando " + modelo + "...");
		}
		
		public void encontrado()
		{
			System.out.println("Encontrado!");
		}
		public void nEncontrado()
		{
			System.out.println("Modelo não encontrado.");
		}
		
		public void finalizar()
 		{
 			System.out.println("finalizando aplicação...");
 		}
		
 		public String telefoneModelo()
		{
			System.out.println("Digite o modelo do celular que você quer adicionar: ");
			scanner.nextLine();
			return scanner.nextLine();
		}
		
		public String telefoneMarca()
		{
			System.out.println("Digite a marca do celular que você quer adicionar: ");
			
			return scanner.nextLine();

		}
		
		public double telefonePreco()
		{
			System.out.println("Digite o preco do celular que você quer inserir: ");
			return scanner.nextDouble();
		}
		
		public double telefoneMemo()
		{
			System.out.println("Digite a memoria do celular que você quer inserir: ");
			return scanner.nextDouble();
		}
		
	}
