package br.com.MundoDoEstudante.aplicacao;

import br.com.MundoDoEstudante.classes.Atendente;

public class AplicacaoMundo {

	
	public static void main (String args[]) {
		
		Atendente lucas = new Atendente("Lucas");
		Atendente victor = new Atendente("Victor");
		Atendente alexandre = new Atendente("Alexandre");
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
		Atendente sara = new Atendente("Sara");
		
		Atendente.calculadorGratificacao();
		
		sara.setVendasPrimeiraSemana(1266.70);
		natiele.setVendasPrimeiraSemana(7607.06);
		kawan.setVendasPrimeiraSemana(6000.87);
		costa.setVendasPrimeiraSemana(10167.19);
		lucas.setVendasPrimeiraSemana(2153.26);
		victor.setVendasPrimeiraSemana(8439.69);
		alexandre.setVendasPrimeiraSemana(15.98);
		loja.setVendasPrimeiraSemana(4538.51+157.30);
		nailton.setVendasPrimeiraSemana(4195.37);
		julia.setVendasPrimeiraSemana(20.00);
		apoio.setVendasPrimeiraSemana(0);
		camila.setVendasPrimeiraSemana(8496.77);
		alvaro.setVendasPrimeiraSemana(83.45);
		thaina.setVendasPrimeiraSemana(5198.26);
		
		Atendente.calculadorGratificacao("Mundo");
		
		natiele.setVendasSegundaSemana(9911.03);
		kawan.setVendasSegundaSemana(9001.82);
		costa.setVendasSegundaSemana(9258.39);
		lucas.setVendasSegundaSemana(3512.52);
		victor.setVendasSegundaSemana(7992.30);
		alexandre.setVendasSegundaSemana(34.26);
		loja.setVendasSegundaSemana(5.97+7194.57);
		nailton.setVendasSegundaSemana(7283.30);
		julia.setVendasSegundaSemana(0);
		apoio.setVendasSegundaSemana(0);
		camila.setVendasSegundaSemana(10988.19);
		alvaro.setVendasSegundaSemana(314.73);
		thaina.setVendasSegundaSemana(16164.86);
		
		Atendente.calculadorGratificacao("Mundo");
		
		natiele.setVendasTerceiraSemana(11011.94);
		kawan.setVendasTerceiraSemana(13692.83);
		costa.setVendasTerceiraSemana(7575.07);
		lucas.setVendasTerceiraSemana(4519.89);
		victor.setVendasTerceiraSemana(13017.03);
		alexandre.setVendasTerceiraSemana(3.80);
		loja.setVendasTerceiraSemana(6026.94);
		nailton.setVendasTerceiraSemana(1963.57);
		julia.setVendasTerceiraSemana(0);
		apoio.setVendasTerceiraSemana(0);
		camila.setVendasTerceiraSemana(6921.01);
		alvaro.setVendasTerceiraSemana(805.57);
		thaina.setVendasTerceiraSemana(15760.25);
		
		Atendente.calculadorGratificacao("Mundo");
		
		natiele.setVendasQuartaSemana(7599.27);
		kawan.setVendasQuartaSemana(10376.85);
		costa.setVendasQuartaSemana(6059.31);
		lucas.setVendasQuartaSemana(2085.56);
		victor.setVendasQuartaSemana(6645.10);
		alexandre.setVendasQuartaSemana(75.90);
		loja.setVendasQuartaSemana(5845.04);
		nailton.setVendasQuartaSemana(9423.48);
		julia.setVendasQuartaSemana(0);
		apoio.setVendasQuartaSemana(549.43);
		camila.setVendasQuartaSemana(10694.37);
		alvaro.setVendasQuartaSemana(813.38);
		thaina.setVendasQuartaSemana(11154.77);
		
		Atendente.calculadorGratificacao("Mundo");
		
		natiele.setVendasQuintaSemana(7430.99);
		kawan.setVendasQuintaSemana(6201.35);
		costa.setVendasQuintaSemana(3673.24);
		lucas.setVendasQuintaSemana(1261.58);
		victor.setVendasQuintaSemana(5661.08);
		alexandre.setVendasQuintaSemana(2.8);
		loja.setVendasQuintaSemana(2738.32+30);
		nailton.setVendasQuintaSemana(3955.59);
		julia.setVendasQuintaSemana(2500.07);
		apoio.setVendasQuintaSemana(168.70);
		camila.setVendasQuintaSemana(6446.73);
		alvaro.setVendasQuintaSemana(282.34);
		thaina.setVendasQuintaSemana(8184.71);
		
		Atendente.calculadorGratificacao("Mundo");
		
		Atendente.ordenarVendaTotal();
		
		Atendente.imprimeResultado();
	}

}
