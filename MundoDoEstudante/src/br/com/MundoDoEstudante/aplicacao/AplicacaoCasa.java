package br.com.MundoDoEstudante.aplicacao;

import java.math.BigDecimal;
import java.util.BitSet;

import br.com.MundoDoEstudante.modelos.Atendente;
import br.com.MundoDoEstudante.modelos.Lojas;

public class AplicacaoCasa {

	public static void main(String args[]) {

		Atendente beatriz = new Atendente("Beatriz");
		Atendente juliana = new Atendente("Juliana");
		Atendente valeria = new Atendente("Valeria");
		Atendente loja = new Atendente("Loja");
		Atendente vanisse = new Atendente("Vanisse");

		Atendente.calcularGratificacao(Lojas.VOVO);

		beatriz.setVendasPrimeiraSemana(new BigDecimal("2466.33"));
		juliana.setVendasPrimeiraSemana(new BigDecimal("0.00"));
		loja.setVendasPrimeiraSemana(new BigDecimal("2.98").add(new BigDecimal("167.00")));
		valeria.setVendasPrimeiraSemana(new BigDecimal("2203.12"));

		Atendente.calcularGratificacao(Lojas.VOVO);

		beatriz.setVendasSegundaSemana(new BigDecimal("8175.61").add(new BigDecimal("2451.06")));
		juliana.setVendasSegundaSemana(new BigDecimal("0.00"));
		loja.setVendasSegundaSemana(new BigDecimal("72.92").add(new BigDecimal("540.00")).add(new BigDecimal("33.0")));
		valeria.setVendasSegundaSemana(new BigDecimal("12122.76"));
		vanisse.setVendasSegundaSemana(new BigDecimal("113.96"));

		Atendente.calcularGratificacao(Lojas.VOVO);

		beatriz.setVendasTerceiraSemana(new BigDecimal("4926.50"));
		juliana.setVendasTerceiraSemana(new BigDecimal("0.00"));
		loja.setVendasTerceiraSemana(new BigDecimal("279.73").add(new BigDecimal("640.00")));
		valeria.setVendasTerceiraSemana(new BigDecimal("6466.66"));
		vanisse.setVendasTerceiraSemana(new BigDecimal("731.46"));

		Atendente.calcularGratificacao(Lojas.VOVO);

		beatriz.setVendasQuartaSemana(new BigDecimal("8251.48"));
		juliana.setVendasQuartaSemana(new BigDecimal("0.00"));
		loja.setVendasQuartaSemana(new BigDecimal("189.84").add(new BigDecimal("486.99")));
		valeria.setVendasQuartaSemana(new BigDecimal("5562.61"));
		vanisse.setVendasQuartaSemana(new BigDecimal("585.35"));

		Atendente.calcularGratificacao(Lojas.VOVO);

		beatriz.setVendasQuintaSemana(new BigDecimal("5211.42"));
		juliana.setVendasQuintaSemana(new BigDecimal("0.00"));
		loja.setVendasQuintaSemana(new BigDecimal("126.88").add(new BigDecimal("478.00")));
		valeria.setVendasQuintaSemana(new BigDecimal("5738.31"));
		vanisse.setVendasQuintaSemana(new BigDecimal("82.32"));

		Atendente.calcularGratificacao(Lojas.VOVO);

		beatriz.setVendasSextaSemana(new BigDecimal("231.68"));
		loja.setVendasSextaSemana(new BigDecimal("47.90").add(new BigDecimal("98.00")));
		valeria.setVendasSextaSemana(new BigDecimal("384.45"));

		Atendente.calcularGratificacao(Lojas.VOVO);

		Atendente.ordenarVendaTotal();

		Atendente.imprimirResultado();

	}
}
