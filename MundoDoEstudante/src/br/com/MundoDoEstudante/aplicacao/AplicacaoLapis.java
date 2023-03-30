package br.com.MundoDoEstudante.aplicacao;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import br.com.MundoDoEstudante.classes.Atendente;

public class AplicacaoLapis {
	
	public static final double PRIMEIRO_COLOCADO = 0.01;
	public static final double SEGUNDO_COLOCADO = 0.008;
	public static final double TERCEIRO_COLOCADO = 0.006;
	public static final double DEMAIS_COLOCADO = 0.005;
	
	public static List<Atendente> lista = new ArrayList<Atendente>();
	
	public static void calculadorGratificacao() {
		lista.sort((a1, a2) -> Double.compare(a1.getVendasSemana(), a2.getVendasSemana()));
		Collections.reverse(lista);
		
		lista.get(0).setGratificacao(lista.get(0).getVendasSemana() * PRIMEIRO_COLOCADO);
		lista.get(1).setGratificacao(lista.get(1).getVendasSemana() * SEGUNDO_COLOCADO);
		lista.get(2).setGratificacao(lista.get(2).getVendasSemana() * TERCEIRO_COLOCADO);
		
		lista.subList(3, lista.size()).forEach((demaisAtendentes) -> 
		demaisAtendentes.setGratificacao(demaisAtendentes.getVendasSemana() * DEMAIS_COLOCADO));
	}
	
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
		
		lista.add(rodrigues);
		lista.add(erik);
		lista.add(val);
		lista.add(gabriel);
		lista.add(cintiane);
		lista.add(jose);
		lista.add(guilherme);
		lista.add(jhon);
		lista.add(loja);
		lista.add(lincoln);
		
		erik.setVendasPrimeiraSemana(15616.16);
		val.setVendasPrimeiraSemana(13559.07);
		cintiane.setVendasPrimeiraSemana(1962.71);
		lincoln.setVendasPrimeiraSemana(11414.20);
		loja.setVendasPrimeiraSemana(2059.38);
		gabriel.setVendasPrimeiraSemana(13567.28);
		guilherme.setVendasPrimeiraSemana(13304.23);
		
		calculadorGratificacao();
		
		jhon.setVendasSegundaSemana(0);
		jose.setVendasSegundaSemana(0);
		cintiane.setVendasSegundaSemana(488.78);
		lincoln.setVendasSegundaSemana(12615.13);
		val.setVendasSegundaSemana(14588.91);
		erik.setVendasSegundaSemana(18134.84);
		loja.setVendasSegundaSemana(5847.74);
		gabriel.setVendasSegundaSemana(18115.96);
		guilherme.setVendasSegundaSemana(14967.65);
		
		calculadorGratificacao();
		
		jhon.setVendasTerceiraSemana(0);
		jose.setVendasTerceiraSemana(0);
		cintiane.setVendasTerceiraSemana(447.36);
		lincoln.setVendasTerceiraSemana(13227.11);
		val.setVendasTerceiraSemana(20269.49);
		erik.setVendasTerceiraSemana(28574.94);
		loja.setVendasTerceiraSemana(9922.24);
		gabriel.setVendasTerceiraSemana(20657.84);
		guilherme.setVendasTerceiraSemana(22911.65);
		
		calculadorGratificacao();
		
		jhon.setVendasQuartaSemana(0);
		jose.setVendasQuartaSemana(0);
		cintiane.setVendasQuartaSemana(161.84);
		lincoln.setVendasQuartaSemana(26980.66);
		val.setVendasQuartaSemana(43287.50);
		erik.setVendasQuartaSemana(36329.91);
		loja.setVendasQuartaSemana(22649.17);
		gabriel.setVendasQuartaSemana(29515.93);
		guilherme.setVendasQuartaSemana(24515.44);
		
		calculadorGratificacao();
		
		jhon.setVendasQuintaSemana(19.90);
		jose.setVendasQuintaSemana(0);
		cintiane.setVendasQuintaSemana(464.82);
		lincoln.setVendasQuintaSemana(14577.41);
		val.setVendasQuintaSemana(20416.83);
		erik.setVendasQuintaSemana(8994.29);
		loja.setVendasQuintaSemana(9444.41);
		gabriel.setVendasQuintaSemana(7861.14);
		guilherme.setVendasQuintaSemana(11756.76);
		
		calculadorGratificacao();
		
		
		lista.sort((a1, a2) -> Double.compare(a1.getVendasTotal(), a2.getVendasTotal()));
		Collections.reverse(lista);
		
		lista.forEach((resultados) -> System.out.println(resultados));
		
		
	}
}
