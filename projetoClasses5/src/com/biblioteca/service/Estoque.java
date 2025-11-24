package com.biblioteca.service;

import com.biblioteca.view.Atendente;
import com.biblioteca.Livro;

import java.util.List;
import java.util.ArrayList;

public class Estoque
	{
		ArrayList<Livro> listaLivros;
		
		public Estoque()
		{
			listaLivros = new ArrayList<>();
		}
		
		public void gestaoEstoque(int opcao, Atendente atendente)
		{
			switch(opcao)
			{
			
			case 1:
			{
				String nome = atendente.livroNome();
				String autor = atendente.livroAutor();
				int numPaginas = atendente.livroPaginas();
				double preco = atendente.livroPreco();
				
				Livro livro = new Livro(nome, autor, numPaginas, preco);
				
				listaLivros.add(livro);
			}
			
			case 2:
			{
				for(Livro livro : listaLivros)
				{
					atendente.visualizar(livro);
				}
			}
			
			case 3:
			{
				String nome = atendente.livroNome();
				boolean removido = false;
				
				for(int i = 0; i < listaLivros.size(); i++)
				{
					if(listaLivros.get(i).getNome().equalsIgnoreCase(nome))
					{
						listaLivros.remove(i);
						removido = true;
					}
				}
				
				if (removido = true)
				{
					atendente.removido();
				}
				else
				{
					atendente.nEncontrado();
				}
			}
			
			case 4:
			{
				String nome = atendente.livroNome();
				Livro bLivro = null;
				
				for (Livro livro : listaLivros)
				{
					if(livro.getNome().equalsIgnoreCase(nome))
					{
						bLivro = livro;
						atendente.visualizar(bLivro);
					}
				}
				
				if(bLivro != null)
				{
					atendente.visualizar(bLivro);
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
