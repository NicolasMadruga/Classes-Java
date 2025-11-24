package com.mecanica.service;

import com.mecanica.model.Bicicleta;
import com.mecanica.view.Mecanico;

import java.util.List;
import java.util.ArrayList;

public class Garagem
	{
		ArrayList<Bicicleta> listaBikes;
		
		public Garagem()
		{
			listaBikes = new ArrayList<>();
		}
		
		public void gestaoGaragem(int opcao, Mecanico mecanico)
		{
			switch(opcao)
			{
			case 1:
			{
				String marca = mecanico.bikeMarca();
				String modelo = mecanico.bikeModelo();
				int tamanhoQuadro = mecanico.bikeQuadro();
				double preco = mecanico.bikePreco();
				
				Bicicleta bike = new Bicicleta(marca, modelo, tamanhoQuadro, preco);
				
				listaBikes.add(bike);
				
				break;
			}
			
			case 2:
			{
				for(Bicicleta bike : listaBikes)
				{
					mecanico.visualizar(bike);
				}
				
				break;
			}
			
			case 3:
			{
				String modelo = mecanico.bikeModelo();
				boolean removido = false;
				
				for (int i = 0; i < listaBikes.size(); i++)
				{
					if(listaBikes.get(i).getModelo().equalsIgnoreCase(modelo))
					{
						listaBikes.remove(i);
						removido = true;
					}
				}
				
				if (removido)
				{
					mecanico.removido();
				}
				else
				{
					mecanico.nEncontrado();
				}
				
				break;
			}
			
			case 4:
			{
				String modelo = mecanico.bikeModelo();
				Bicicleta bBike = null;
				
				for (Bicicleta bike : listaBikes)
				{
					if(bike.getModelo().equalsIgnoreCase(modelo))
					{
						bBike = bike;
					}
				}
				
				if (bBike != null)
				{
					mecanico.visualizar(bBike);
				}
				else
				{
					mecanico.nEncontrado();
				}
				break;
			}
			
			case 0:
			{
				mecanico.encerrar();
				break;
			}
			}
		}
	}
