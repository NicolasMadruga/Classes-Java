package br.com.main;

import br.com.main.service.Estoque;
import br.com.main.view.Atendente;

public class Main
	{

		public static void main(String[] args)
		{
			Estoque estoque = new Estoque();
			Atendente atendente = new Atendente();
			int opcaoEscolhida = 1;
			
			do
			{
				opcaoEscolhida = atendente.menu();
				estoque.gerenciarEstoque(opcaoEscolhida, atendente);
			}
			while(opcaoEscolhida != 0);
			
			atendente.finalizar();
		}
	}