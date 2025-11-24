package com.escola.view;

import java.util.Scanner;

import com.escola.model.Alunos;

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
			System.out.println("1 para cadastrar um aluno");
			System.out.println("2 para listar os alunos");
			System.out.println("3 para exlcuir um aluno");
			System.out.println("4 para buscar um aluno");
			System.out.println("0 para encerrar");
			
			int opcao = scanner.nextInt();
			
			return opcao;
		}
		
		public String alunoNome()
		{
			System.out.println("Insira o nome do aluno: ");
			scanner.nextLine();
			String nome = scanner.nextLine();
			
			return nome;
		}
		
		public int alunoIdade()
		{
			System.out.println("Insira a idade do aluno: ");
			int idade = scanner.nextInt();
			scanner.nextLine();
			
			return idade;
		}
		
		public String alunoMatricula()
		{
			System.out.println("Insira a matrícula do aluno: ");
			scanner.nextLine();
			String matricula = scanner.nextLine();
			
			return matricula;
		}
		
		public int alunoIngresso()
		{
			System.out.println("Insira o ano de ingresso do aluno: ");
			int anoIngresso = scanner.nextInt();
			scanner.nextLine();
			
			return anoIngresso;
		}
		
		public void visualizar(Alunos aluno)
		{
			System.out.println("Nome: " + aluno.getNome());
			System.out.println("Idade: " + aluno.getIdade());
			System.out.println("Matricula: " + aluno.getMatricula());
			System.out.println("Ano de ingresso: " + aluno.getAnoIngresso());
		}
		
		public void removido()
		{
			System.out.println("O aluno foi removido com sucesso!");
		}
		
		public void nEncontrado()
		{
			System.out.println("Aluno não encontrado.");
		}
		
		public void encerrar()
		{
			System.out.println("Encerrando...");
		}
	}
