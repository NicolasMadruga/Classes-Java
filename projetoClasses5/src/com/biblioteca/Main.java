package com.biblioteca;

import com.biblioteca.view.Atendente;
import com.biblioteca.service.Estoque;

public class Main
	{

		public static void main(String[] args)
		{
			Atendente atendente = new Atendente();
			Estoque estoque = new Estoque();
			int opcaoEscolhida;
			
			do
			{
				opcaoEscolhida = atendente.menu();
				
				estoque.gestaoEstoque(opcaoEscolhida, atendente);
				
			}while (opcaoEscolhida != 0);
		}

	}
