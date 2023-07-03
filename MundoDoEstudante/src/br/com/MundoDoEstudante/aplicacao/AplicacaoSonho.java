package br.com.MundoDoEstudante.aplicacao;

import java.math.BigDecimal;

import br.com.MundoDoEstudante.modelos.Atendente;
import br.com.MundoDoEstudante.modelos.Lojas;

public class AplicacaoSonho {

	public static void main(String args[]) {

		Atendente karol = new Atendente("Karol");
		Atendente dani = new Atendente("Dani");
		Atendente meiri = new Atendente("Meiri");
		Atendente vanisse = new Atendente("Vanisse");
		Atendente alef = new Atendente("Alef");
		Atendente sara = new Atendente("Sara");
		Atendente loja = new Atendente("loja");
		Atendente ana = new Atendente("Ana Beatriz");
		Atendente camila = new Atendente("Camila");
		Atendente valeria = new Atendente("Valéria");

		Atendente.calcularGratificacao(Lojas.SONHO);
		
		camila.setVendasPrimeiraSemana("1396,56");
		karol.setVendasPrimeiraSemana("2377,84");
		dani.setVendasPrimeiraSemana(BigDecimal.ZERO);
		alef.setVendasPrimeiraSemana(BigDecimal.ZERO);
		loja.setVendasPrimeiraSemana("89,78");
		vanisse.setVendasPrimeiraSemana("723,98");
		sara.setVendasPrimeiraSemana("3773,31");
		meiri.setVendasPrimeiraSemana("3286,65");

		Atendente.calcularGratificacao(Lojas.SONHO);

		camila.setVendasSegundaSemana("5572,61");
		ana.setVendasSegundaSemana("3419,67");
		alef.setVendasSegundaSemana(BigDecimal.ZERO);
		dani.setVendasSegundaSemana(BigDecimal.ZERO);
		karol.setVendasSegundaSemana("11266,57");
		loja.setVendasSegundaSemana("683,71");
		vanisse.setVendasSegundaSemana("1729,60");
		sara.setVendasSegundaSemana("17310,99");
		meiri.setVendasSegundaSemana("10541,77");

		Atendente.calcularGratificacao(Lojas.SONHO);
		
		camila.setVendasTerceiraSemana("5111,18");
		alef.setVendasTerceiraSemana("309,90");
		dani.setVendasTerceiraSemana(BigDecimal.ZERO);
		karol.setVendasTerceiraSemana("7823,12");
		loja.setVendasTerceiraSemana("1133,75");
		vanisse.setVendasTerceiraSemana("1294,16");
		sara.setVendasTerceiraSemana("4804,47");
		meiri.setVendasTerceiraSemana("3921,93");
		valeria.setVendasTerceiraSemana("2217,65");

		Atendente.calcularGratificacao(Lojas.SONHO);

		camila.setVendasQuartaSemana("2385,35");
		alef.setVendasQuartaSemana(BigDecimal.ZERO);
		dani.setVendasQuartaSemana(BigDecimal.ZERO);
		karol.setVendasQuartaSemana("4574,03");
		loja.setVendasQuartaSemana("3446,87");
		vanisse.setVendasQuartaSemana("1006,90");
		sara.setVendasQuartaSemana("7559,28");
		meiri.setVendasQuartaSemana("10057,48");

		Atendente.calcularGratificacao(Lojas.SONHO);

		camila.setVendasQuintaSemana("4179,39");
		alef.setVendasQuintaSemana(BigDecimal.ZERO);
		dani.setVendasQuintaSemana(BigDecimal.ZERO);
		karol.setVendasQuintaSemana("4259,81");
		loja.setVendasQuintaSemana("41,97");
		vanisse.setVendasQuintaSemana("426,60");
		sara.setVendasQuintaSemana("4453,66");
		meiri.setVendasQuintaSemana("4496,04");

		Atendente.calcularGratificacao(Lojas.SONHO);

		Atendente.ordenarVendaTotal();

		Atendente.imprimirResultado();
	}
}
