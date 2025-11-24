package com.mecanica;

import com.mecanica.service.Garagem;
import com.mecanica.view.Mecanico;

public class Main
	{
		public static void main(String[] args)
		{
			Garagem garagem = new Garagem();
			Mecanico mecanico = new Mecanico();
			
			int opcaoEscolhida;
			
			do
			{
				opcaoEscolhida = mecanico.menu();
				
				garagem.gestaoGaragem(opcaoEscolhida, mecanico);
			}while (opcaoEscolhida != 0);
		}

	}
