package com.studio;

import com.studio.service.Album;
import com.studio.view.Atendente;

public class Main
	{
		public static void main(String[] args)
		{
			Album album = new Album();
			Atendente atendente = new Atendente();
			
			int opcaoEscolhida;
			
			do
			{
				opcaoEscolhida = atendente.menu();
				
				album.gestaoMusica(opcaoEscolhida, atendente);
			} while (opcaoEscolhida != 0);
			
		}

	}
