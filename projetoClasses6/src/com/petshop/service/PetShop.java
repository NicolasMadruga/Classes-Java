package com.petshop.service;

import com.petshop.model.Animal;
import com.petshop.view.Atendente;

import java.util.List;
import java.util.ArrayList;


public class PetShop
	{
		ArrayList<Animal> listaAnimais;
		
		public PetShop()
		{
			listaAnimais = new ArrayList<>();
		}
		
		public void gestaoPetShop(int opcao, Atendente atendente)
		{
			switch(opcao)
			{
			case 1:
			{
				String especie = atendente.animalEspecie();
				String raca = atendente.animalRaca();
				int idade = atendente.animalIdade();
				double peso = atendente.animalPeso();
				
				Animal animal = new Animal();
				
				listaAnimais.add(animal);
				
				break;
			}
			
			case 2:
			{
				for(Animal animal : listaAnimais)
				{
					atendente.visualizar(animal);
				}
				
				break;
			}
			
			case 3:
			{
				String raca = atendente.animalRaca();
				boolean removido = false;
				
				for (int i = 0; i < listaAnimais.size(); i++)
				{
					if(listaAnimais.get(i).getRaca().equalsIgnoreCase(raca))
					{
						listaAnimais.remove(i);
						removido = true;
					}
				}
				
				if (removido)
				{
					atendente.removido();
				}
				else
				{
					atendente.nEncontrado();
				}
				
				break;
			}
			
			case 4:
			{
				String raca = atendente.animalRaca();
				Animal bAnimal = null;
				
				for (Animal animal : listaAnimais)
				{
					if(animal.getRaca().equalsIgnoreCase(raca))
					{
						bAnimal = animal;
					}
				}
				
				if(bAnimal != null)
				{
					atendente.visualizar(bAnimal);
				}
				else
				{
					atendente.nEncontrado();
				}
				
				break;
			}
			
			case 0:
			{
				atendente.encerrado();
				
				break;
			}
			}
		}
	}
