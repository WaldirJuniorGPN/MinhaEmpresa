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
		
		rodrigues.setVendasPrimeiraSemana(1420.10);
		erik.setVendasPrimeiraSemana(961.74);
		val.setVendasPrimeiraSemana(2561.47);
		cintiane.setVendasPrimeiraSemana(469.28);
		lincoln.setVendasPrimeiraSemana(1267.77);
		loja.setVendasPrimeiraSemana(656.69);
		gabriel.setVendasPrimeiraSemana(632.93);
		guilherme.setVendasPrimeiraSemana(0);

		Atendente.calcularGratificacao(Lojas.LAPIS);

		jhon.setVendasSegundaSemana(0);
		jose.setVendasSegundaSemana(33.29);
		cintiane.setVendasSegundaSemana(0);
		lincoln.setVendasSegundaSemana(6876.54);
		val.setVendasSegundaSemana(12438.49);
		erik.setVendasSegundaSemana(7753.85);
		loja.setVendasSegundaSemana(4087.31);
		gabriel.setVendasSegundaSemana(660.09);
		guilherme.setVendasSegundaSemana(0);
		rodrigues.setVendasSegundaSemana(3608.48);

		Atendente.calcularGratificacao(Lojas.LAPIS);

		jhon.setVendasTerceiraSemana(0);
		jose.setVendasTerceiraSemana(20.90);
		cintiane.setVendasTerceiraSemana(0);
		lincoln.setVendasTerceiraSemana(5487.24);
		val.setVendasTerceiraSemana(12145.17);
		erik.setVendasTerceiraSemana(5017.44);
		loja.setVendasTerceiraSemana(2730.03);
		gabriel.setVendasTerceiraSemana(0);
		guilherme.setVendasTerceiraSemana(787.10);
		rodrigues.setVendasTerceiraSemana(4133.65);

		Atendente.calcularGratificacao(Lojas.LAPIS);

		jhon.setVendasQuartaSemana(0);
		jose.setVendasQuartaSemana(25.90);
		cintiane.setVendasQuartaSemana(0);
		lincoln.setVendasQuartaSemana(3106.83);
		val.setVendasQuartaSemana(6996.61);
		erik.setVendasQuartaSemana(3016.37);
		loja.setVendasQuartaSemana(2227.99);
		gabriel.setVendasQuartaSemana(0);
		guilherme.setVendasQuartaSemana(2694.94);
		rodrigues.setVendasQuartaSemana(3108.09);

		Atendente.calcularGratificacao(Lojas.LAPIS);

		jhon.setVendasQuintaSemana(0);
		jose.setVendasQuintaSemana(0);
		cintiane.setVendasQuintaSemana(0);
		lincoln.setVendasQuintaSemana(4396.33);
		val.setVendasQuintaSemana(8266.64);
		erik.setVendasQuintaSemana(4012.73);
		loja.setVendasQuintaSemana(1359.95);
		gabriel.setVendasQuintaSemana(0);
		guilherme.setVendasQuintaSemana(3079.85);
		rodrigues.setVendasQuintaSemana(2421.45);

		
		Atendente.calcularGratificacao(Lojas.LAPIS);
		
		Atendente.ordenarVendaTotal();
		
		Atendente.imprimirResultado();
		
		
	}
}
