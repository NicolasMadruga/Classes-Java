package com.escola;

import com.escola.service.gestaoEscolar;
import com.escola.view.Atendente;

public class Main
	{
		public static void main(String[] args)
		{
			gestaoEscolar gestao = new gestaoEscolar();
			Atendente atendente = new Atendente();
			int opcao;
			
			do
			{
				opcao = atendente.menu();
				gestao.gestaoAlunos(opcao, atendente);
			} while (opcao != 0);
		}

	}
