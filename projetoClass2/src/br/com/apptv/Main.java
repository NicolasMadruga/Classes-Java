package br.com.apptv;

import br.com.apptv.model.TV;
import br.com.apptv.service.Estoque;
import br.com.apptv.view.Atendente;

public class Main
	{

		public static void main(String[] args)
		{
			Estoque estoque = new Estoque();
			Atendente atendente = new Atendente();
			
			int opcao;
			
			do
			{
				opcao = atendente.menu();
				estoque.gerenciarEstoque(opcao, atendente);
			} while(opcao != 0);
			
			atendente.finalizar();
		}

	}
