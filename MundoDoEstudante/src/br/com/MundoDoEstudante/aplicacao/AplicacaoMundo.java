package br.com.MundoDoEstudante.aplicacao;

import java.math.BigDecimal;

import br.com.MundoDoEstudante.classes.Atendente;
import br.com.MundoDoEstudante.classes.Lojas;

public class AplicacaoMundo {

	
	public static void main (String args[]) {
		
		Atendente lucas = new Atendente("Lucas");
		Atendente victor = new Atendente("Victor");
		Atendente loja = new Atendente("Loja");
		Atendente nailton = new Atendente("Nailton");
		Atendente julia = new Atendente("Julia");
		Atendente apoio = new Atendente("Apoio");
		Atendente camila = new Atendente("Camila");
		Atendente alvaro = new Atendente("Alvaro");
		Atendente thaina = new Atendente("Thaina");
		Atendente costa = new Atendente("Costa");
		Atendente kawan = new Atendente("Kawan");
		Atendente natiele = new Atendente("Natiele");
		
		Atendente.calcularGratificacao(Lojas.MUNDO);
		
		natiele.setVendasPrimeiraSemana(new BigDecimal(3501.66));
		kawan.setVendasPrimeiraSemana(new BigDecimal(720.23));
		costa.setVendasPrimeiraSemana(new BigDecimal(3780.44));
		lucas.setVendasPrimeiraSemana(new BigDecimal(40.29));
		victor.setVendasPrimeiraSemana(new BigDecimal(4408.28));
		loja.setVendasPrimeiraSemana(new BigDecimal(1500.73));
		nailton.setVendasPrimeiraSemana(new BigDecimal(2132.69));
		julia.setVendasPrimeiraSemana(new BigDecimal(1630.06));
		camila.setVendasPrimeiraSemana(new BigDecimal(3082.44));
		alvaro.setVendasPrimeiraSemana(new BigDecimal(47.57));
		thaina.setVendasPrimeiraSemana(new BigDecimal(2485.07));
		
		Atendente.calcularGratificacao(Lojas.MUNDO);
		
		natiele.setVendasSegundaSemana(new BigDecimal(6109.99));
		kawan.setVendasSegundaSemana(new BigDecimal(7256.17));
		costa.setVendasSegundaSemana(new BigDecimal(9371.63));
		lucas.setVendasSegundaSemana(new BigDecimal(1130.36));
		victor.setVendasSegundaSemana(new BigDecimal(5102.28));
		loja.setVendasSegundaSemana(new BigDecimal(4364.65));
		nailton.setVendasSegundaSemana(new BigDecimal(5021.04));
		julia.setVendasSegundaSemana(new BigDecimal(5944.46));
		apoio.setVendasSegundaSemana(new BigDecimal(461.78));
		camila.setVendasSegundaSemana(new BigDecimal(7228.64));
		alvaro.setVendasSegundaSemana(new BigDecimal(454.09));
		thaina.setVendasSegundaSemana(new BigDecimal(7150.17));
		
		Atendente.calcularGratificacao(Lojas.MUNDO);
		
		natiele.setVendasTerceiraSemana(new BigDecimal(6434.42));
		kawan.setVendasTerceiraSemana(new BigDecimal(7579.14));
		costa.setVendasTerceiraSemana(new BigDecimal(6794.67));
		lucas.setVendasTerceiraSemana(new BigDecimal(2231.22));
		victor.setVendasTerceiraSemana(new BigDecimal(9806.41));
		loja.setVendasTerceiraSemana(new BigDecimal((7.98 + 3762.07)));
		nailton.setVendasTerceiraSemana(new BigDecimal(6046.99));
		julia.setVendasTerceiraSemana(new BigDecimal(4782.81));
		apoio.setVendasTerceiraSemana(new BigDecimal(18.72));
		camila.setVendasTerceiraSemana(new BigDecimal(3138.33));
		alvaro.setVendasTerceiraSemana(new BigDecimal(355.22));
		thaina.setVendasTerceiraSemana(new BigDecimal(8475.50));
		
		Atendente.calcularGratificacao(Lojas.MUNDO);
		
		natiele.setVendasQuartaSemana(new BigDecimal(6006.42));
		kawan.setVendasQuartaSemana(new BigDecimal(5976.76));
		costa.setVendasQuartaSemana(new BigDecimal(3260.59));
		lucas.setVendasQuartaSemana(new BigDecimal(189.11));
		victor.setVendasQuartaSemana(new BigDecimal(4579.32));
		loja.setVendasQuartaSemana(new BigDecimal(867.34));
		nailton.setVendasQuartaSemana(new BigDecimal(3959.95));
		julia.setVendasQuartaSemana(new BigDecimal(1189.44));
		apoio.setVendasQuartaSemana(new BigDecimal(0));
		camila.setVendasQuartaSemana(new BigDecimal(3286.61));
		alvaro.setVendasQuartaSemana(new BigDecimal(95.97));
		thaina.setVendasQuartaSemana(new BigDecimal(6121.20));
		
		Atendente.calcularGratificacao(Lojas.MUNDO);
		
		natiele.setVendasQuintaSemana(new BigDecimal(3867.44));
		kawan.setVendasQuintaSemana(new BigDecimal(5498.11));
		costa.setVendasQuintaSemana(new BigDecimal(3119.99));
		lucas.setVendasQuintaSemana(new BigDecimal(1335.81));
		victor.setVendasQuintaSemana(new BigDecimal(6224.91));
		loja.setVendasQuintaSemana(new BigDecimal(2659.47));
		nailton.setVendasQuintaSemana(new BigDecimal(5343.11));
		julia.setVendasQuintaSemana(new BigDecimal(3112.83));
		apoio.setVendasQuintaSemana(new BigDecimal(49.90));
		camila.setVendasQuintaSemana(new BigDecimal(2148.67));
		alvaro.setVendasQuintaSemana(new BigDecimal(466.13));
		thaina.setVendasQuintaSemana(new BigDecimal(6676.59));
		
		Atendente.calcularGratificacao(Lojas.MUNDO);
		
		Atendente.ordenarVendaTotal();
		
		Atendente.imprimirResultado();
	}

}
