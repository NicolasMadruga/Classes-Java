package com.negocio;

import com.negocio.services.Estoque;
import com.negocio.view.Atendente;

public class Main
	{
		public static void main(String[] args)
		{
			Estoque estoque = new Estoque();
			Atendente atendente = new Atendente();
			
			int opcaoEscolhida;
			
			do
			{
				opcaoEscolhida = atendente.menu();
				
				estoque.gerenciarEstoque(opcaoEscolhida, atendente);
			} while (opcaoEscolhida != 0);
		}

	}
