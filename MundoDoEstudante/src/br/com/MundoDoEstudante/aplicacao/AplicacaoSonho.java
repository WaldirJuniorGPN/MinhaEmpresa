package br.com.MundoDoEstudante.aplicacao;

import java.math.BigDecimal;
import br.com.MundoDoEstudante.classes.Atendente;
import br.com.MundoDoEstudante.classes.Lojas;

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

		Atendente.calcularGratificacao(Lojas.SONHO);

		karol.setVendasPrimeiraSemana(new BigDecimal("2421.54"));
		dani.setVendasPrimeiraSemana(new BigDecimal("1968.61"));
		alef.setVendasPrimeiraSemana(BigDecimal.ZERO);
		loja.setVendasPrimeiraSemana(new BigDecimal("49.90"));
		vanisse.setVendasPrimeiraSemana(new BigDecimal("222.65"));
		sara.setVendasPrimeiraSemana(new BigDecimal("3074.78"));
		meiri.setVendasPrimeiraSemana(new BigDecimal("1367.80"));

		Atendente.calcularGratificacao(Lojas.SONHO);

		ana.setVendasSegundaSemana(new BigDecimal("1549.90"));
		alef.setVendasSegundaSemana(BigDecimal.ZERO);
		dani.setVendasSegundaSemana(new BigDecimal("7812.97"));
		karol.setVendasSegundaSemana(new BigDecimal("8815.42"));
		loja.setVendasSegundaSemana(new BigDecimal("227.47"));
		vanisse.setVendasSegundaSemana(new BigDecimal("96.94"));
		sara.setVendasSegundaSemana(new BigDecimal("11313.93"));
		meiri.setVendasSegundaSemana(new BigDecimal("6277.23"));

		Atendente.calcularGratificacao(Lojas.SONHO);

		alef.setVendasTerceiraSemana(BigDecimal.ZERO);
		dani.setVendasTerceiraSemana(new BigDecimal("6600.94"));
		karol.setVendasTerceiraSemana(new BigDecimal("11238.82"));
		loja.setVendasTerceiraSemana(new BigDecimal("261.59"));
		vanisse.setVendasTerceiraSemana(new BigDecimal("2987.10"));
		sara.setVendasTerceiraSemana(new BigDecimal("13539.39"));
		meiri.setVendasTerceiraSemana(new BigDecimal("12992.49"));

		Atendente.calcularGratificacao(Lojas.SONHO);

		alef.setVendasQuartaSemana(new BigDecimal("14.99"));
		dani.setVendasQuartaSemana(new BigDecimal("5531.56"));
		karol.setVendasQuartaSemana(new BigDecimal("3058.06"));
		loja.setVendasQuartaSemana(new BigDecimal("22.98"));
		vanisse.setVendasQuartaSemana(new BigDecimal("293.82"));
		sara.setVendasQuartaSemana(new BigDecimal("7840.14"));
		meiri.setVendasQuartaSemana(new BigDecimal("8207.67"));

		Atendente.calcularGratificacao(Lojas.SONHO);

		alef.setVendasQuintaSemana(BigDecimal.ZERO);
		dani.setVendasQuintaSemana(new BigDecimal("6580.47"));
		karol.setVendasQuintaSemana(new BigDecimal("6189.66"));
		loja.setVendasQuintaSemana(new BigDecimal("231.89"));
		vanisse.setVendasQuintaSemana(new BigDecimal("502.64"));
		sara.setVendasQuintaSemana(new BigDecimal("9936.34"));
		meiri.setVendasQuintaSemana(new BigDecimal("4554.16"));

		Atendente.calcularGratificacao(Lojas.SONHO);

		Atendente.ordenarVendaTotal();

		Atendente.imprimirResultado();
	}
}
