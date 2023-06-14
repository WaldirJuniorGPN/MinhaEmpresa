package br.com.MundoDoEstudante.aplicacao;

import java.math.BigDecimal;

import br.com.MundoDoEstudante.modelos.Atendente;
import br.com.MundoDoEstudante.modelos.Lojas;

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
		Atendente loja = new Atendente("loja");
		Atendente lincoln = new Atendente("Lincoln");

		Atendente.calcularGratificacao(Lojas.LAPIS);

		rodrigues.setVendasPrimeiraSemana(new BigDecimal("1420.10"));
		erik.setVendasPrimeiraSemana(new BigDecimal("961.74"));
		val.setVendasPrimeiraSemana(new BigDecimal("2561.47"));
		cintiane.setVendasPrimeiraSemana(new BigDecimal("469.28"));
		lincoln.setVendasPrimeiraSemana(new BigDecimal("1267.77"));
		loja.setVendasPrimeiraSemana(new BigDecimal("656.69"));
		gabriel.setVendasPrimeiraSemana(new BigDecimal("632.93"));
		guilherme.setVendasPrimeiraSemana(BigDecimal.ZERO);

		Atendente.calcularGratificacao(Lojas.LAPIS);

		jhon.setVendasSegundaSemana(BigDecimal.ZERO);
		jose.setVendasSegundaSemana(new BigDecimal("33.29"));
		cintiane.setVendasSegundaSemana(BigDecimal.ZERO);
		lincoln.setVendasSegundaSemana(new BigDecimal("6876.54"));
		val.setVendasSegundaSemana(new BigDecimal("12438.49"));
		erik.setVendasSegundaSemana(new BigDecimal("7753.85"));
		loja.setVendasSegundaSemana(new BigDecimal("4087.31"));
		gabriel.setVendasSegundaSemana(new BigDecimal("660.09"));
		guilherme.setVendasSegundaSemana(BigDecimal.ZERO);
		rodrigues.setVendasSegundaSemana(new BigDecimal("3608.48"));

		Atendente.calcularGratificacao(Lojas.LAPIS);

		jhon.setVendasTerceiraSemana(BigDecimal.ZERO);
		jose.setVendasTerceiraSemana(new BigDecimal("20.90"));
		cintiane.setVendasTerceiraSemana(BigDecimal.ZERO);
		lincoln.setVendasTerceiraSemana(new BigDecimal("5487.24"));
		val.setVendasTerceiraSemana(new BigDecimal("12145.17"));
		erik.setVendasTerceiraSemana(new BigDecimal("5017.44"));
		loja.setVendasTerceiraSemana(new BigDecimal("2730.03"));
		gabriel.setVendasTerceiraSemana(BigDecimal.ZERO);
		guilherme.setVendasTerceiraSemana(new BigDecimal("787.10"));
		rodrigues.setVendasTerceiraSemana(new BigDecimal("4133.65"));

		Atendente.calcularGratificacao(Lojas.LAPIS);

		jhon.setVendasQuartaSemana(BigDecimal.ZERO);
		jose.setVendasQuartaSemana(new BigDecimal("25.90"));
		cintiane.setVendasQuartaSemana(BigDecimal.ZERO);
		lincoln.setVendasQuartaSemana(new BigDecimal("3106.83"));
		val.setVendasQuartaSemana(new BigDecimal("6996.61"));
		erik.setVendasQuartaSemana(new BigDecimal("3016.37"));
		loja.setVendasQuartaSemana(new BigDecimal("2227.99"));
		gabriel.setVendasQuartaSemana(BigDecimal.ZERO);
		guilherme.setVendasQuartaSemana(new BigDecimal("2694.94"));
		rodrigues.setVendasQuartaSemana(new BigDecimal("3108.09"));

		Atendente.calcularGratificacao(Lojas.LAPIS);

		jhon.setVendasQuintaSemana(BigDecimal.ZERO);
		jose.setVendasQuintaSemana(BigDecimal.ZERO);
		cintiane.setVendasQuintaSemana(BigDecimal.ZERO);
		lincoln.setVendasQuintaSemana(new BigDecimal("4396.33"));
		val.setVendasQuintaSemana(new BigDecimal("8266.64"));
		erik.setVendasQuintaSemana(new BigDecimal("4012.73"));
		loja.setVendasQuintaSemana(new BigDecimal("1359.95"));
		gabriel.setVendasQuintaSemana(BigDecimal.ZERO);
		guilherme.setVendasQuintaSemana(new BigDecimal("3079.85"));
		rodrigues.setVendasQuintaSemana(new BigDecimal("2421.45"));

		Atendente.calcularGratificacao(Lojas.LAPIS);

		Atendente.ordenarVendaTotal();

		Atendente.imprimirResultado();

	}
}
