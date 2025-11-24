package br.com.main.service;

import br.com.main.model.Telefone;
import br.com.main.view.Atendente;
import java.util.ArrayList;

public class Estoque
	{
		ArrayList<Telefone> estoque;

		public Estoque()
		{
			estoque = new ArrayList<>();
		}

		public void gerenciarEstoque(int opcao, Atendente atendente)
		{
			switch (opcao)
			{
			
			case 1: 
			{
				String modelo = atendente.telefoneModelo();
				String marca = atendente.telefoneMarca();
				double preco = atendente.telefonePreco();
				double memoria = atendente.telefoneMemo();

				Telefone telefone = new Telefone(marca, modelo, preco, memoria);
				estoque.add(telefone);
				break;
			}
			
			case 2: 
			{
				for (Telefone telefone : estoque)
				{
					atendente.visualizar(telefone);
				}
				break;
			}
			
			case 3: 
			{
				String modelo = atendente.remover();
				boolean removido = false;

				for (int i = 0; i < estoque.size(); i++)
				{
					if (estoque.get(i).getModelo().equalsIgnoreCase(modelo))
					{
						estoque.remove(i);
						removido = true;
					}
				}

				if (removido)
				{
					atendente.modeloRemovido(modelo);
				} 
				else
				{
					atendente.removeFail();
				}
				break;
			}
			
			case 4: 
			{
				String modelo = atendente.modeloBusca();
				boolean encontrado = false;
						
				for(int i = 0; i < estoque.size(); i++)
				{
					if(estoque.get(i).getModelo().equalsIgnoreCase(modelo))
					{
						encontrado = true;
					}
				}
				
				if(encontrado)
				{
					atendente.encontrado();
					for(Telefone telefone : estoque)
					{
						atendente.visualizar(telefone);
					}
				}
				else
				{
					atendente.nEncontrado();
				}

			}
		}
		}
	}
