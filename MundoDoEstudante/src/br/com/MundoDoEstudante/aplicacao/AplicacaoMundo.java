package br.com.MundoDoEstudante.aplicacao;

import java.math.BigDecimal;

import br.com.MundoDoEstudante.modelos.Atendente;
import br.com.MundoDoEstudante.modelos.Lojas;

public class AplicacaoMundo {

	public static void main(String[] args) {

		Atendente lucas = new Atendente("Lucas");
		Atendente victor = new Atendente("Victor");
		Atendente loja = new Atendente("Loja");
		Atendente nailton = new Atendente("Nailton");
		Atendente apoio = new Atendente("Apoio");
		Atendente alvaro = new Atendente("Alvaro");
		Atendente thaina = new Atendente("Thaina");
		Atendente costa = new Atendente("Costa");
		Atendente kawan = new Atendente("Kawan");
		Atendente natiele = new Atendente("Natiele");

		Atendente.calcularGratificacao(Lojas.MUNDO);

		natiele.setVendasPrimeiraSemana("4474,86");
		kawan.setVendasPrimeiraSemana("5753,55");
		costa.setVendasPrimeiraSemana("4850,61");
		lucas.setVendasPrimeiraSemana("2940,40");
		victor.setVendasPrimeiraSemana("5826,96");
		loja.setVendasPrimeiraSemana("1244,00");
		nailton.setVendasPrimeiraSemana(BigDecimal.ZERO);
		alvaro.setVendasPrimeiraSemana(BigDecimal.ZERO);
		thaina.setVendasPrimeiraSemana("4883,74");
		apoio.setVendasPrimeiraSemana("475,38");

		Atendente.calcularGratificacao(Lojas.MUNDO);

		natiele.setVendasSegundaSemana("7696,23");
		kawan.setVendasSegundaSemana("6866,07");
		costa.setVendasSegundaSemana("5310,00");
		lucas.setVendasSegundaSemana("2067,33");
		victor.setVendasSegundaSemana("7025,42");
		loja.setVendasSegundaSemana(new BigDecimal("31.95").add(new BigDecimal("2259.96")));
		nailton.setVendasSegundaSemana(BigDecimal.ZERO);
		apoio.setVendasSegundaSemana("513,55");
		alvaro.setVendasSegundaSemana(BigDecimal.ZERO);
		thaina.setVendasSegundaSemana("8050,99");

		Atendente.calcularGratificacao(Lojas.MUNDO);

		natiele.setVendasTerceiraSemana("4798,25");
		kawan.setVendasTerceiraSemana("9840,28");
		costa.setVendasTerceiraSemana("6876,06");
		lucas.setVendasTerceiraSemana("3481,10");
		victor.setVendasTerceiraSemana("5702,20");
		loja.setVendasTerceiraSemana(
				new BigDecimal("82.68").add(new BigDecimal("1965.89").add(new BigDecimal("62.44"))));
		nailton.setVendasTerceiraSemana(BigDecimal.ZERO);
		apoio.setVendasTerceiraSemana("1193,15");
		alvaro.setVendasTerceiraSemana(BigDecimal.ZERO);
		thaina.setVendasTerceiraSemana("9631,76");

		Atendente.calcularGratificacao(Lojas.MUNDO);

		natiele.setVendasQuartaSemana("5232,97");
		kawan.setVendasQuartaSemana("6825,80");
		costa.setVendasQuartaSemana("5587,43");
		lucas.setVendasQuartaSemana("3666,56");
		victor.setVendasQuartaSemana("4057,67");
		loja.setVendasQuartaSemana(new BigDecimal("197.62").add(new BigDecimal("1101.81")));
		nailton.setVendasQuartaSemana(BigDecimal.ZERO);
		apoio.setVendasQuartaSemana("575,88");
		alvaro.setVendasQuartaSemana(BigDecimal.ZERO);
		thaina.setVendasQuartaSemana("6007,48");

		Atendente.calcularGratificacao(Lojas.MUNDO);

		natiele.setVendasQuintaSemana("3491,75");
		kawan.setVendasQuintaSemana("4835,59");
		costa.setVendasQuintaSemana("4271,00");
		lucas.setVendasQuintaSemana("3356,79");
		victor.setVendasQuintaSemana("5307,01");
		loja.setVendasQuintaSemana(new BigDecimal("35.06").add(new BigDecimal("544.90")));
		nailton.setVendasQuintaSemana(BigDecimal.ZERO);
		apoio.setVendasQuintaSemana("417,36");
		alvaro.setVendasQuintaSemana(BigDecimal.ZERO);
		thaina.setVendasQuintaSemana("4311,92");

		Atendente.calcularGratificacao(Lojas.MUNDO);

//        Atendente.polularBanco();

		Atendente.ordenarVendaTotal();

		Atendente.imprimirResultado();
	}
}
