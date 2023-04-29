package br.com.MundoDoEstudante.aplicacao;

import br.com.MundoDoEstudante.classes.Atendente;
import br.com.MundoDoEstudante.classes.Lojas;

public class AplicacaoLapis {
	
	public static void main(String args[]) {
		
		Atendente erik = new Atendente("Erik");
		Atendente val = new Atendente("Val");
		Atendente rodrigues = new Atendente("Rodrigues");
		Atendente gabriel = new Atendente("Gabriel");
		Atendente cintiane = new Atendente("Cintiane");
		Atendente guilherme = new Atendente("Guilherme");
		Atendente jose = new Atendente("Jose");
		Atendente jhon = new Atendente("Jhon");
		Atendente loja= new Atendente("loja");
		Atendente lincoln = new Atendente("Lincoln");
		
		Atendente.calcularGratificacao(Lojas.LAPIS);
		
		rodrigues.setVendasPrimeiraSemana(2832.75);
		erik.setVendasPrimeiraSemana(3259.36);
		val.setVendasPrimeiraSemana(7354.02);
		cintiane.setVendasPrimeiraSemana(647.13);
		lincoln.setVendasPrimeiraSemana(5069.22);
		loja.setVendasPrimeiraSemana(3828.81 + 1271.76);
		gabriel.setVendasPrimeiraSemana(1839.17);
		guilherme.setVendasPrimeiraSemana(2926.29);
		
		Atendente.calcularGratificacao(Lojas.LAPIS);
		
		jhon.setVendasSegundaSemana(0);
		jose.setVendasSegundaSemana(0);
		cintiane.setVendasSegundaSemana(1919.74);
		lincoln.setVendasSegundaSemana(5861.36);
		val.setVendasSegundaSemana(13162.80);
		erik.setVendasSegundaSemana(3396.00);
		loja.setVendasSegundaSemana(5046.42);
		gabriel.setVendasSegundaSemana(5268.06);
		guilherme.setVendasSegundaSemana(6057.32);
		rodrigues.setVendasSegundaSemana(4205.93);
		
		Atendente.calcularGratificacao(Lojas.LAPIS);
		
		jhon.setVendasTerceiraSemana(0);
		jose.setVendasTerceiraSemana(0);
		cintiane.setVendasTerceiraSemana(1511.73);
		lincoln.setVendasTerceiraSemana(7738.51);
		val.setVendasTerceiraSemana(12543.55);
		erik.setVendasTerceiraSemana(2179.07);
		loja.setVendasTerceiraSemana(4906.21);
		gabriel.setVendasTerceiraSemana(5315.16);
		guilherme.setVendasTerceiraSemana(2228.95);
		rodrigues.setVendasTerceiraSemana(4355.42);
		
		Atendente.calcularGratificacao(Lojas.LAPIS);
		
		jhon.setVendasQuartaSemana(0);
		jose.setVendasQuartaSemana(0);
		cintiane.setVendasQuartaSemana(2121.96);
		lincoln.setVendasQuartaSemana(5536.44);
		val.setVendasQuartaSemana(10936.55);
		erik.setVendasQuartaSemana(6233.35);
		loja.setVendasQuartaSemana(2304.55);
		gabriel.setVendasQuartaSemana(3685.74);
		guilherme.setVendasQuartaSemana(0);
		rodrigues.setVendasQuartaSemana(3927.86);
		
		Atendente.calcularGratificacao(Lojas.LAPIS);
		
		jhon.setVendasQuintaSemana(0);
		jose.setVendasQuintaSemana(0);
		cintiane.setVendasQuintaSemana(1438.62);
		lincoln.setVendasQuintaSemana(4625.86);
		val.setVendasQuintaSemana(8249.70);
		erik.setVendasQuintaSemana(3803.60);
		loja.setVendasQuintaSemana(1608.60);
		gabriel.setVendasQuintaSemana(3358.63);
		guilherme.setVendasQuintaSemana(0);
		rodrigues.setVendasQuintaSemana(5172.51);
		
		Atendente.calcularGratificacao(Lojas.LAPIS);
		
		Atendente.ordenarVendaTotal();
		
		Atendente.imprimirResultado();
		
		
	}
}
