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

		rodrigues.setVendasPrimeiraSemana(new BigDecimal("392.98"));
		erik.setVendasPrimeiraSemana(new BigDecimal("0.00"));
		val.setVendasPrimeiraSemana(new BigDecimal("790.35"));
		cintiane.setVendasPrimeiraSemana(new BigDecimal("451.53"));
		lincoln.setVendasPrimeiraSemana(new BigDecimal("608.88"));
		loja.setVendasPrimeiraSemana(new BigDecimal("19.86"));
		guilherme.setVendasPrimeiraSemana(new BigDecimal("1170.22"));

		Atendente.calcularGratificacao(Lojas.LAPIS);

		jhon.setVendasSegundaSemana(new BigDecimal("0.00"));
		jose.setVendasSegundaSemana(new BigDecimal("0.00"));
		cintiane.setVendasSegundaSemana(new BigDecimal("1522.11"));
		lincoln.setVendasSegundaSemana(new BigDecimal("4234.38"));
		val.setVendasSegundaSemana(new BigDecimal("4695.92"));
		erik.setVendasSegundaSemana(new BigDecimal("4892.08"));
		loja.setVendasSegundaSemana(new BigDecimal("692.02"));
		guilherme.setVendasSegundaSemana(new BigDecimal("2576.01"));
		rodrigues.setVendasSegundaSemana(new BigDecimal("2452.33"));

		Atendente.calcularGratificacao(Lojas.LAPIS);

		jhon.setVendasTerceiraSemana(new BigDecimal("0.00"));
		jose.setVendasTerceiraSemana(new BigDecimal("0.00"));
		cintiane.setVendasTerceiraSemana(new BigDecimal("1792.88"));
		lincoln.setVendasTerceiraSemana(new BigDecimal("3609.26"));
		val.setVendasTerceiraSemana(new BigDecimal("4523.33"));
		erik.setVendasTerceiraSemana(new BigDecimal("3081.92"));
		loja.setVendasTerceiraSemana(new BigDecimal("678.97"));
		guilherme.setVendasTerceiraSemana(new BigDecimal("3725.85"));
		rodrigues.setVendasTerceiraSemana(new BigDecimal("5082.41"));

		Atendente.calcularGratificacao(Lojas.LAPIS);

		jhon.setVendasQuartaSemana(new BigDecimal("0.00"));
		jose.setVendasQuartaSemana(new BigDecimal("0.00"));
		cintiane.setVendasQuartaSemana(new BigDecimal("1953.90"));
		lincoln.setVendasQuartaSemana(new BigDecimal("3457.85"));
		val.setVendasQuartaSemana(new BigDecimal("4038.88"));
		erik.setVendasQuartaSemana(new BigDecimal("2895.03"));
		loja.setVendasQuartaSemana(new BigDecimal("489.80"));
		guilherme.setVendasQuartaSemana(new BigDecimal("4789.02"));
		rodrigues.setVendasQuartaSemana(new BigDecimal("2333.68"));

		Atendente.calcularGratificacao(Lojas.LAPIS);

		jhon.setVendasQuintaSemana(new BigDecimal("0.00"));
		jose.setVendasQuintaSemana(new BigDecimal("0.00"));
		cintiane.setVendasQuintaSemana(new BigDecimal("3155.20"));
		lincoln.setVendasQuintaSemana(new BigDecimal("5133.32"));
		val.setVendasQuintaSemana(new BigDecimal("8331.30"));
		erik.setVendasQuintaSemana(new BigDecimal("1723.02"));
		loja.setVendasQuintaSemana(new BigDecimal("1606.77"));
		guilherme.setVendasQuintaSemana(new BigDecimal("5720.81"));
		rodrigues.setVendasQuintaSemana(new BigDecimal("2846.73"));

		Atendente.calcularGratificacao(Lojas.LAPIS);

		cintiane.setVendasSextaSemana(new BigDecimal("698.18"));
		erik.setVendasSextaSemana(new BigDecimal("1102.74"));
		guilherme.setVendasSextaSemana(new BigDecimal("3150.32"));
		lincoln.setVendasSextaSemana(new BigDecimal("2105.22"));
		loja.setVendasSextaSemana(new BigDecimal("423.92"));
		rodrigues.setVendasSextaSemana(new BigDecimal("859.00"));
		val.setVendasSextaSemana(new BigDecimal("2459.44"));

		Atendente.calcularGratificacao(Lojas.LAPIS);

		Atendente.ordenarVendaTotal();

		Atendente.imprimirResultado();

	}
}
