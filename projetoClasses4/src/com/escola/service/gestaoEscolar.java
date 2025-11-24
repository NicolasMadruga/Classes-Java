package com.escola.service;

import java.util.List;
import java.util.ArrayList;

import com.escola.view.Atendente;
import com.escola.model.Alunos;

public class gestaoEscolar
	{
		ArrayList<Alunos> listaAlunos;
		
		public gestaoEscolar()
		{
			listaAlunos = new ArrayList<>();
		}
		
		public void gestaoAlunos(int opcao, Atendente atendente)
		{
			switch(opcao)
			{
			
			case 1:
			{
				String nome = atendente.alunoNome();
				int idade = atendente.alunoIdade();
				String matricula = atendente.alunoMatricula();
				int anoIngresso = atendente.alunoIngresso();
				
				Alunos aluno = new Alunos();
				
				listaAlunos.add(aluno);
				break;
			}
			
			case 2:
			{
				for (Alunos aluno : listaAlunos)
				{
					atendente.visualizar(aluno);
				}
				break;
			}
			
			case 3:
			{
				String nome = atendente.alunoNome();
				boolean removido = false;
				
				for(int i = 0; i < listaAlunos.size(); i++)
				{
					if(listaAlunos.get(i).getNome().equalsIgnoreCase(nome))
					{
						listaAlunos.remove(i);
						removido = true;
					}
				}
				
				if(removido = true)
				{
					atendente.removido();
				}
				else
				{
					atendente.nEncontrado();
				}
				
				break;
			}
			
			case 4:
			{
				String nome = atendente.alunoNome();
				Alunos bAluno = null;
				
				for(Alunos aluno : listaAlunos)
				{
					if(aluno.getNome().equalsIgnoreCase(nome))
					{
						bAluno = aluno;
					}
				}
				
				if (bAluno != null)
				{
					atendente.visualizar(bAluno);
				}
				else
				{
					atendente.nEncontrado();
				}
			}
			
			case 0:
			{
				atendente.encerrar();
			}
			}
		}
	}
