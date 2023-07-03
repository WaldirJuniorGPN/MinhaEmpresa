package br.com.MundoDoEstudante.aplicacao;

import java.math.BigDecimal;

import br.com.MundoDoEstudante.modelos.Atendente;
import br.com.MundoDoEstudante.modelos.Lojas;

public class AplicacaoCasa {

	public static void main(String args[]) {

		Atendente beatriz = new Atendente("Beatriz");
		Atendente juliana = new Atendente("Juliana");
		Atendente valeria = new Atendente("Valeria");
		Atendente loja = new Atendente("Loja");

		Atendente.calcularGratificacao(Lojas.VOVO);

		beatriz.setVendasPrimeiraSemana("9546,67");
		juliana.setVendasPrimeiraSemana("69,80");
		loja.setVendasPrimeiraSemana(new BigDecimal(331.00).add(new BigDecimal("4.99")));
		valeria.setVendasPrimeiraSemana("6511,43");

		Atendente.calcularGratificacao(Lojas.VOVO);

		beatriz.setVendasSegundaSemana(new BigDecimal("10185.91").add(new BigDecimal("3419.67")));
		juliana.setVendasSegundaSemana("220,58");
		loja.setVendasSegundaSemana(new BigDecimal("52.89").add(new BigDecimal("610.00")));
		valeria.setVendasSegundaSemana("13469,11");

		Atendente.calcularGratificacao(Lojas.VOVO);

		beatriz.setVendasTerceiraSemana("5118,29");
		juliana.setVendasTerceiraSemana("143,66");
		loja.setVendasTerceiraSemana(new BigDecimal("100.87").add(new BigDecimal("514.00")));
		valeria.setVendasTerceiraSemana(new BigDecimal("9325.84").add(new BigDecimal("2217.65")));

		Atendente.calcularGratificacao(Lojas.VOVO);

		beatriz.setVendasQuartaSemana("7247,62");
		juliana.setVendasQuartaSemana("904,55");
		loja.setVendasQuartaSemana(new BigDecimal("130.85").add(new BigDecimal("459.99")));
		valeria.setVendasQuartaSemana("6272,79");

		Atendente.calcularGratificacao(Lojas.VOVO);

		beatriz.setVendasQuintaSemana("8215,81");
		juliana.setVendasQuintaSemana("150,00");
		loja.setVendasQuintaSemana(new BigDecimal("27.89").add(new BigDecimal("198.00")));
		valeria.setVendasQuintaSemana("5723,24");

		Atendente.calcularGratificacao(Lojas.VOVO);

		Atendente.ordenarVendaTotal();

		Atendente.imprimirResultado();

	}
}
