package com.petshop;

import com.petshop.service.PetShop;
import com.petshop.view.Atendente;

public class Main
	{
		public static void main(String[] args)
		{
			Atendente atendente = new Atendente();
			PetShop petshop = new PetShop();
			
			int opcaoEscolhida;
			
			do
			{
				opcaoEscolhida = atendente.menu();
				
				petshop.gestaoPetShop(opcaoEscolhida, atendente);
			} while (opcaoEscolhida != 0);
		}

	}
