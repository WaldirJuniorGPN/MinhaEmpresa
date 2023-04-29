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
		Atendente loja= new Atendente("loja");
		
		Atendente.calcularGratificacao(Lojas.SONHO);
		
		karol.setVendasPrimeiraSemana(5529.19);
		dani.setVendasPrimeiraSemana(7498.25);
		alef.setVendasPrimeiraSemana(0);
		loja.setVendasPrimeiraSemana(525.91);
		vanisse.setVendasPrimeiraSemana(6237.82);
		sara.setVendasPrimeiraSemana(862.26);
		meiri.setVendasPrimeiraSemana(15704.94);
		
		Atendente.calcularGratificacao(Lojas.SONHO);
		
		alef.setVendasSegundaSemana(7.99);
		dani.setVendasSegundaSemana(6965.09);
		karol.setVendasSegundaSemana(10628.15);
		loja.setVendasSegundaSemana(397.38);
		vanisse.setVendasSegundaSemana(2882.23);
		sara.setVendasSegundaSemana(7393.43);
		meiri.setVendasSegundaSemana(7626.03);
		
		Atendente.calcularGratificacao(Lojas.SONHO);
		
		alef.setVendasTerceiraSemana(0);
		dani.setVendasTerceiraSemana(4107.13);
		karol.setVendasTerceiraSemana(7361.85);
		loja.setVendasTerceiraSemana(971.81);
		vanisse.setVendasTerceiraSemana(1063.18);
		sara.setVendasTerceiraSemana(6670.60);
		meiri.setVendasTerceiraSemana(11770.92);
		
		Atendente.calcularGratificacao(Lojas.SONHO);
		
		alef.setVendasQuartaSemana(0);
		dani.setVendasQuartaSemana(7823.57);
		karol.setVendasQuartaSemana(4593.37);
		loja.setVendasQuartaSemana(460.88);
		vanisse.setVendasQuartaSemana(272.79);
		sara.setVendasQuartaSemana(5561.78);
		meiri.setVendasQuartaSemana(4047.33);
		
		Atendente.calcularGratificacao(Lojas.SONHO);
		
		alef.setVendasQuintaSemana(0);
		dani.setVendasQuintaSemana(1874.83);
		karol.setVendasQuintaSemana(677.23);
		loja.setVendasQuintaSemana(24.90);
		vanisse.setVendasQuintaSemana(676.83);
		sara.setVendasQuintaSemana(3201.65);
		meiri.setVendasQuintaSemana(3374.60);
		
		Atendente.calcularGratificacao(Lojas.SONHO);
		
		Atendente.ordenarVendaTotal();
		
		Atendente.imprimirResultado();
	}

}
