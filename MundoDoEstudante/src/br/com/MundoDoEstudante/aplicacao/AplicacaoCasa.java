package br.com.MundoDoEstudante.aplicacao;

import br.com.MundoDoEstudante.classes.Atendente;

public class AplicacaoCasa {
	
	public static void main(String args[]) {
		
		Atendente beatriz = new Atendente("Beatriz");
		Atendente juliana = new Atendente("Juliana");
		Atendente valeria = new Atendente("Valeria");
		Atendente loja = new Atendente("Loja");
		
		Atendente.calculadorGratificacao("Casa");
		
		beatriz.setVendasPrimeiraSemana(5018.67);
		juliana.setVendasPrimeiraSemana(629.16);
		loja.setVendasPrimeiraSemana(437.00);
		valeria.setVendasPrimeiraSemana(5910.43);
		
		Atendente.calculadorGratificacao("Casa");
		
		beatriz.setVendasSegundaSemana(16455.99);
		juliana.setVendasSegundaSemana(116.78);
		loja.setVendasSegundaSemana(123.98 + 378.00);
		valeria.setVendasSegundaSemana(13085.75);

		Atendente.calculadorGratificacao("Casa");
		
		beatriz.setVendasTerceiraSemana(9292.07);
		juliana.setVendasTerceiraSemana(98.00);
		loja.setVendasTerceiraSemana(157.75 + 352.00);
		valeria.setVendasTerceiraSemana(12708.37);

		Atendente.calculadorGratificacao("Casa");

		beatriz.setVendasQuartaSemana(5688.79);
		juliana.setVendasQuartaSemana(154.57);
		loja.setVendasQuartaSemana(278.00);
		valeria.setVendasQuartaSemana(10293.10);

		Atendente.calculadorGratificacao("Casa");
		
		beatriz.setVendasQuintaSemana(5426.18);
		juliana.setVendasQuintaSemana(69.99);
		loja.setVendasQuintaSemana(430.00);
		valeria.setVendasQuintaSemana(2690.19);
		
		Atendente.calculadorGratificacao("Casa");
		
		Atendente.ordenarVendaTotal();
		
		Atendente.imprimeResultado();
		
	}
}
