package br.com.MundoDoEstudante.aplicacao;

import br.com.MundoDoEstudante.classes.Atendente;
import br.com.MundoDoEstudante.classes.Lojas;

public class AplicacaoSonho {

	public static void main (String args[]) {
		
		Atendente karol = new Atendente("Karol");
		Atendente dani = new Atendente("Dani");
		Atendente meiri = new Atendente("Meiri");
		Atendente vanisse = new Atendente("Vanisse");
		Atendente alef = new Atendente("Alef");
		Atendente sara = new Atendente("Sara");
		Atendente loja = new Atendente("loja");
		Atendente ana = new Atendente("Ana Beatriz");
		
		Atendente.calcularGratificacao(Lojas.SONHO);
		
		karol.setVendasPrimeiraSemana(2421.54);
		dani.setVendasPrimeiraSemana(1968.61);
		alef.setVendasPrimeiraSemana(0);
		loja.setVendasPrimeiraSemana(49.90);
		vanisse.setVendasPrimeiraSemana(222.65);
		sara.setVendasPrimeiraSemana(3074.78);
		meiri.setVendasPrimeiraSemana(1367.80);
		
		Atendente.calcularGratificacao(Lojas.SONHO);
		
		ana.setVendasSegundaSemana(1549.90);
		alef.setVendasSegundaSemana(0);
		dani.setVendasSegundaSemana(7812.97);
		karol.setVendasSegundaSemana(8815.42);
		loja.setVendasSegundaSemana(227.47);
		vanisse.setVendasSegundaSemana(96.94);
		sara.setVendasSegundaSemana(11313.93);
		meiri.setVendasSegundaSemana(6277.23);
		
		Atendente.calcularGratificacao(Lojas.SONHO);
		
		alef.setVendasTerceiraSemana(0);
		dani.setVendasTerceiraSemana(6600.94);
		karol.setVendasTerceiraSemana(11238.82);
		loja.setVendasTerceiraSemana(261.59);
		vanisse.setVendasTerceiraSemana(2987.10);
		sara.setVendasTerceiraSemana(13539.39);
		meiri.setVendasTerceiraSemana(12992.49);
		
		Atendente.calcularGratificacao(Lojas.SONHO);
		
		alef.setVendasQuartaSemana(14.99);
		dani.setVendasQuartaSemana(5531.56);
		karol.setVendasQuartaSemana(3058.06);
		loja.setVendasQuartaSemana(22.98);
		vanisse.setVendasQuartaSemana(293.82);
		sara.setVendasQuartaSemana(7840.14);
		meiri.setVendasQuartaSemana(8207.67);
		
		Atendente.calcularGratificacao(Lojas.SONHO);
		
		alef.setVendasQuintaSemana(0);
		dani.setVendasQuintaSemana(6580.47);
		karol.setVendasQuintaSemana(6189.66);
		loja.setVendasQuintaSemana(231.89);
		vanisse.setVendasQuintaSemana(502.64);
		sara.setVendasQuintaSemana(9936.34);
		meiri.setVendasQuintaSemana(4554.16);

		Atendente.calcularGratificacao(Lojas.SONHO);
		
		Atendente.ordenarVendaTotal();
		
		Atendente.imprimirResultado();
	}

}
