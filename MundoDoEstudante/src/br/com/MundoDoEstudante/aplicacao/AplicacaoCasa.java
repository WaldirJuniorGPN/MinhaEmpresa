package br.com.MundoDoEstudante.aplicacao;

import java.math.BigDecimal;

import br.com.MundoDoEstudante.classes.Atendente;
import br.com.MundoDoEstudante.classes.Lojas;

public class AplicacaoCasa {

	public static void main(String args[]) {

		Atendente beatriz = new Atendente("Beatriz");
		Atendente juliana = new Atendente("Juliana");
		Atendente valeria = new Atendente("Valeria");
		Atendente loja = new Atendente("Loja");

		Atendente.calcularGratificacao(Lojas.VOVO);

		beatriz.setVendasPrimeiraSemana(new BigDecimal("1194.06"));
		juliana.setVendasPrimeiraSemana(new BigDecimal("104.80"));
		loja.setVendasPrimeiraSemana(new BigDecimal("66.00"));
		valeria.setVendasPrimeiraSemana(new BigDecimal("2417.98"));

		Atendente.calcularGratificacao(Lojas.VOVO);

		beatriz.setVendasSegundaSemana(new BigDecimal("5331.31"));
		juliana.setVendasSegundaSemana(new BigDecimal("362.87"));
		loja.setVendasSegundaSemana(new BigDecimal("23.99").add(new BigDecimal("390.00")));
		valeria.setVendasSegundaSemana(new BigDecimal("8626.86"));

		Atendente.calcularGratificacao(Lojas.VOVO);

		beatriz.setVendasTerceiraSemana(new BigDecimal("5530.14"));
		juliana.setVendasTerceiraSemana(new BigDecimal("48.97"));
		loja.setVendasTerceiraSemana(new BigDecimal("173.87").add(new BigDecimal("352.98")));
		valeria.setVendasTerceiraSemana(new BigDecimal("10937.92"));

		Atendente.calcularGratificacao(Lojas.VOVO);

		beatriz.setVendasQuartaSemana(new BigDecimal("5847.61"));
		juliana.setVendasQuartaSemana(new BigDecimal("22.90").add(new BigDecimal("22.00")));
		loja.setVendasQuartaSemana(new BigDecimal("348.00"));
		valeria.setVendasQuartaSemana(new BigDecimal("3910.73"));

		Atendente.calcularGratificacao(Lojas.VOVO);

		beatriz.setVendasQuintaSemana(new BigDecimal("2704.52"));
		juliana.setVendasQuintaSemana(BigDecimal.ZERO);
		loja.setVendasQuintaSemana(new BigDecimal("23.99").add(new BigDecimal("369.00")));
		valeria.setVendasQuintaSemana(new BigDecimal("7184.58"));

		Atendente.calcularGratificacao(Lojas.VOVO);

		Atendente.ordenarVendaTotal();

		Atendente.imprimirResultado();

	}
}
