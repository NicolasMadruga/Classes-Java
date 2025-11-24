package com.cinema;

import com.cinema.view.Atendente;
import com.cinema.service.StockFootage;

public class Main
	{
		public static void main(String[] args)
		{
			StockFootage gestao = new StockFootage();
			Atendente atendente = new Atendente();
			
			int opcaoEscolhida;
			
			do
			{
				opcaoEscolhida = atendente.menu();
				
				gestao.gestaoFilmes(opcaoEscolhida, atendente);
			} while (opcaoEscolhida != 0);
		}

	}
