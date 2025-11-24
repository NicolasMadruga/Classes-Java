package com.appcasa;

import com.appcasa.model.Casa;
import com.appcasa.service.Estoque;
import com.appcasa.view.Atendente;

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
				
				estoque.gerenciarEstoque(opcaoEscolhida, atendente);
				
			} while (opcaoEscolhida != 0);
			
		}

	}
