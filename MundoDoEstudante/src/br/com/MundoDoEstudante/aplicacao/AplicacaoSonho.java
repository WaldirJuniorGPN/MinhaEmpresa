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

		Atendente.calcularGratificacao(Lojas.SONHO);

		karol.setVendasPrimeiraSemana(new BigDecimal("1026.39"));
		dani.setVendasPrimeiraSemana(new BigDecimal("1029.21"));
		alef.setVendasPrimeiraSemana(new BigDecimal("0.00"));
		loja.setVendasPrimeiraSemana(new BigDecimal("0.00"));
		vanisse.setVendasPrimeiraSemana(new BigDecimal("40.98"));
		sara.setVendasPrimeiraSemana(new BigDecimal("3469.22"));
		meiri.setVendasPrimeiraSemana(new BigDecimal("2212.41"));
		camila.setVendasPrimeiraSemana(new BigDecimal("2061.10"));

		Atendente.calcularGratificacao(Lojas.SONHO);

		ana.setVendasSegundaSemana(new BigDecimal("2451.06"));
		alef.setVendasSegundaSemana(new BigDecimal("63.97"));
		dani.setVendasSegundaSemana(new BigDecimal("172.78"));
		karol.setVendasSegundaSemana(new BigDecimal("6950.63"));
		loja.setVendasSegundaSemana(new BigDecimal("324.58"));
		vanisse.setVendasSegundaSemana(new BigDecimal("0.00"));
		sara.setVendasSegundaSemana(new BigDecimal("12615.27"));
		meiri.setVendasSegundaSemana(new BigDecimal("11760.45"));
		camila.setVendasSegundaSemana(new BigDecimal("8991.67"));

		Atendente.calcularGratificacao(Lojas.SONHO);

		alef.setVendasTerceiraSemana(new BigDecimal("0.00"));
		dani.setVendasTerceiraSemana(new BigDecimal("1301.81"));
		karol.setVendasTerceiraSemana(new BigDecimal("10516.49"));
		loja.setVendasTerceiraSemana(new BigDecimal("29.99").add(new BigDecimal("491.23")));
		vanisse.setVendasTerceiraSemana(new BigDecimal("589.42"));
		sara.setVendasTerceiraSemana(new BigDecimal("10348.03"));
		meiri.setVendasTerceiraSemana(new BigDecimal("10089.41"));
		camila.setVendasTerceiraSemana(new BigDecimal("13248.13"));

		Atendente.calcularGratificacao(Lojas.SONHO);

		alef.setVendasQuartaSemana(new BigDecimal("0.00"));
		dani.setVendasQuartaSemana(new BigDecimal("979.47"));
		karol.setVendasQuartaSemana(new BigDecimal("9146.19"));
		loja.setVendasQuartaSemana(new BigDecimal("406.76"));
		vanisse.setVendasQuartaSemana(new BigDecimal("0.00"));
		sara.setVendasQuartaSemana(new BigDecimal("9815.13"));
		meiri.setVendasQuartaSemana(new BigDecimal("8243.85"));
		camila.setVendasQuartaSemana(new BigDecimal("5695.23"));

		Atendente.calcularGratificacao(Lojas.SONHO);

		alef.setVendasQuintaSemana(new BigDecimal("0.00"));
		dani.setVendasQuintaSemana(new BigDecimal("3984.96"));
		karol.setVendasQuintaSemana(new BigDecimal("11099.34"));
		loja.setVendasQuintaSemana(new BigDecimal("4043.28"));
		vanisse.setVendasQuintaSemana(new BigDecimal("0.00"));
		sara.setVendasQuintaSemana(new BigDecimal("3398.66"));
		meiri.setVendasQuintaSemana(new BigDecimal("8269.55"));
		camila.setVendasQuintaSemana(new BigDecimal("6969.82"));

		Atendente.calcularGratificacao(Lojas.SONHO);

		camila.setVendasSextaSemana(new BigDecimal("345.82"));
		dani.setVendasSextaSemana(new BigDecimal("21.98"));
		karol.setVendasSextaSemana(new BigDecimal("227.63"));
		meiri.setVendasSextaSemana(new BigDecimal("1198.70"));
		sara.setVendasSextaSemana(new BigDecimal("353.45"));

		Atendente.calcularGratificacao(Lojas.SONHO);

		Atendente.ordenarVendaTotal();

		Atendente.imprimirResultado();
	}
}
