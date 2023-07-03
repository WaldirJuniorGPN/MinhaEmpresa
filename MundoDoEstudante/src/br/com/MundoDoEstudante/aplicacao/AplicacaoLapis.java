package br.com.MundoDoEstudante.aplicacao;

import java.math.BigDecimal;

import br.com.MundoDoEstudante.modelos.Atendente;
import br.com.MundoDoEstudante.modelos.Lojas;

public class AplicacaoLapis {

	public static void main(String args[]) {

		Atendente erik = new Atendente("Erik");
		Atendente val = new Atendente("Val");
		Atendente rodrigues = new Atendente("Rodrigues");
		Atendente cintiane = new Atendente("Cintiane");
		Atendente guilherme = new Atendente("Guilherme");
		Atendente jose = new Atendente("Jose");
		Atendente jhon = new Atendente("Jhon");
		Atendente loja = new Atendente("loja");
		Atendente lincoln = new Atendente("Lincoln");

		Atendente.calcularGratificacao(Lojas.LAPIS);

		rodrigues.setVendasPrimeiraSemana("2985,73");
		erik.setVendasPrimeiraSemana("4045,23");
		val.setVendasPrimeiraSemana(BigDecimal.ZERO);
		cintiane.setVendasPrimeiraSemana("2342,78");
		lincoln.setVendasPrimeiraSemana("2318,77");
		loja.setVendasPrimeiraSemana("1618,60");
		guilherme.setVendasPrimeiraSemana("2542,58");

		Atendente.calcularGratificacao(Lojas.LAPIS);

		jhon.setVendasSegundaSemana(BigDecimal.ZERO);
		jose.setVendasSegundaSemana(BigDecimal.ZERO);
		cintiane.setVendasSegundaSemana("3530,49");
		lincoln.setVendasSegundaSemana("4447,05");
		val.setVendasSegundaSemana(BigDecimal.ZERO);
		erik.setVendasSegundaSemana("6606,39");
		loja.setVendasSegundaSemana("3106,48");
		guilherme.setVendasSegundaSemana("5261,49");
		rodrigues.setVendasSegundaSemana("3817,86");

		Atendente.calcularGratificacao(Lojas.LAPIS);

		jhon.setVendasTerceiraSemana(BigDecimal.ZERO);
		jose.setVendasTerceiraSemana(BigDecimal.ZERO);
		cintiane.setVendasTerceiraSemana("2493,88");
		lincoln.setVendasTerceiraSemana("3685,25");
		val.setVendasTerceiraSemana(BigDecimal.ZERO);
		erik.setVendasTerceiraSemana("4723,80");
		loja.setVendasTerceiraSemana("2793,65");
		guilherme.setVendasTerceiraSemana("4258,95");
		rodrigues.setVendasTerceiraSemana("2626,26");

		Atendente.calcularGratificacao(Lojas.LAPIS);

		jhon.setVendasQuartaSemana(BigDecimal.ZERO);
		jose.setVendasQuartaSemana(BigDecimal.ZERO);
		cintiane.setVendasQuartaSemana("2926,07");
		lincoln.setVendasQuartaSemana("5161,02");
		val.setVendasQuartaSemana(BigDecimal.ZERO);
		erik.setVendasQuartaSemana("6652,87");
		loja.setVendasQuartaSemana("1396,44");
		guilherme.setVendasQuartaSemana("4603,69");
		rodrigues.setVendasQuartaSemana("3121,07");

		Atendente.calcularGratificacao(Lojas.LAPIS);

		jhon.setVendasQuintaSemana(BigDecimal.ZERO);
		jose.setVendasQuintaSemana(BigDecimal.ZERO);
		cintiane.setVendasQuintaSemana("1837,13");
		lincoln.setVendasQuintaSemana("2693,58");
		val.setVendasQuintaSemana(BigDecimal.ZERO);
		erik.setVendasQuintaSemana("2662,74");
		loja.setVendasQuintaSemana("493,46");
		guilherme.setVendasQuintaSemana("4089,88");
		rodrigues.setVendasQuintaSemana(new BigDecimal("2.38").add(new BigDecimal("3103.09")));

		Atendente.calcularGratificacao(Lojas.LAPIS);

		Atendente.ordenarVendaTotal();

		Atendente.imprimirResultado();

	}
}
