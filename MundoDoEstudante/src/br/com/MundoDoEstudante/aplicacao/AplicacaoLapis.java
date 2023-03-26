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
		
		lista.subList(3, lista.size()).forEach((demaisAtendentes) -> demaisAtendentes.setGratificacao(demaisAtendentes.getVendasSemana() * DEMAIS_COLOCADO));
	}
	
	public static void main(String args[]) {
		
		Atendente erik = new Atendente("Erik");
		Atendente val = new Atendente("Val");
		Atendente rodrigues = new Atendente("Rodrigues");
		
		lista.add(rodrigues);
		lista.add(erik);
		lista.add(val);
		
		erik.setVendasPrimeiraSemana(2000.0);
		val.setVendasPrimeiraSemana(39000.0);
		rodrigues.setVendasPrimeiraSemana(3222.89);
		
		calculadorGratificacao();
		
		
		lista.sort((a1, a2) -> Double.compare(a1.getVendasTotal(), a2.getVendasTotal()));
		Collections.reverse(lista);
		
		lista.forEach((resultados) -> System.out.println(resultados));
		
		
	}
}
