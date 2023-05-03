package br.com.MundoDoEstudante.aplicacao;

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
		
		natiele.setVendasPrimeiraSemana(3501.66);
		kawan.setVendasPrimeiraSemana(720.23);
		costa.setVendasPrimeiraSemana(3780.44);
		lucas.setVendasPrimeiraSemana(40.29);
		victor.setVendasPrimeiraSemana(4408.28);
		loja.setVendasPrimeiraSemana(1500.73);
		nailton.setVendasPrimeiraSemana(2132.69);
		julia.setVendasPrimeiraSemana(1630.06);
		camila.setVendasPrimeiraSemana(3082.44);
		alvaro.setVendasPrimeiraSemana(47.57);
		thaina.setVendasPrimeiraSemana(2485.07);
		
		Atendente.calcularGratificacao(Lojas.MUNDO);
		
		natiele.setVendasSegundaSemana(6109.99);
		kawan.setVendasSegundaSemana(7256.17);
		costa.setVendasSegundaSemana(9371.63);
		lucas.setVendasSegundaSemana(1130.36);
		victor.setVendasSegundaSemana(5102.28);
		loja.setVendasSegundaSemana(4364.65);
		nailton.setVendasSegundaSemana(5021.04);
		julia.setVendasSegundaSemana(5944.46);
		apoio.setVendasSegundaSemana(461.78);
		camila.setVendasSegundaSemana(7228.64);
		alvaro.setVendasSegundaSemana(454.09);
		thaina.setVendasSegundaSemana(7150.17);
		
		Atendente.calcularGratificacao(Lojas.MUNDO);
		
		natiele.setVendasTerceiraSemana(6434.42);
		kawan.setVendasTerceiraSemana(7579.14);
		costa.setVendasTerceiraSemana(6794.67);
		lucas.setVendasTerceiraSemana(2231.22);
		victor.setVendasTerceiraSemana(9806.41);
		loja.setVendasTerceiraSemana((7.98 + 3762.07));
		nailton.setVendasTerceiraSemana(6046.99);
		julia.setVendasTerceiraSemana(4782.81);
		apoio.setVendasTerceiraSemana(18.72);
		camila.setVendasTerceiraSemana(3138.33);
		alvaro.setVendasTerceiraSemana(355.22);
		thaina.setVendasTerceiraSemana(8475.50);
		
		Atendente.calcularGratificacao(Lojas.MUNDO);
		
		natiele.setVendasQuartaSemana(6006.42);
		kawan.setVendasQuartaSemana(5976.76);
		costa.setVendasQuartaSemana(3260.59);
		lucas.setVendasQuartaSemana(189.11);
		victor.setVendasQuartaSemana(4579.32);
		loja.setVendasQuartaSemana(867.34);
		nailton.setVendasQuartaSemana(3959.95);
		julia.setVendasQuartaSemana(1189.44);
		apoio.setVendasQuartaSemana(0);
		camila.setVendasQuartaSemana(3286.61);
		alvaro.setVendasQuartaSemana(95.97);
		thaina.setVendasQuartaSemana(6121.20);
		
		Atendente.calcularGratificacao(Lojas.MUNDO);
		
		natiele.setVendasQuintaSemana(3867.44);
		kawan.setVendasQuintaSemana(5498.11);
		costa.setVendasQuintaSemana(3119.99);
		lucas.setVendasQuintaSemana(1335.81);
		victor.setVendasQuintaSemana(6224.91);
		loja.setVendasQuintaSemana(2659.47);
		nailton.setVendasQuintaSemana(5343.11);
		julia.setVendasQuintaSemana(3112.83);
		apoio.setVendasQuintaSemana(49.90);
		camila.setVendasQuintaSemana(2148.67);
		alvaro.setVendasQuintaSemana(466.13);
		thaina.setVendasQuintaSemana(6676.59);
		
		Atendente.calcularGratificacao(Lojas.MUNDO);
		
		Atendente.ordenarVendaTotal();
		
		Atendente.imprimirResultado();
	}

}
