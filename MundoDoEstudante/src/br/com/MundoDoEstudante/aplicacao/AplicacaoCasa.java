package br.com.MundoDoEstudante.aplicacao;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import br.com.MundoDoEstudante.classes.Atendente;

public class AplicacaoCasa {
	
	public static final double PRIMEIRO_COLOCADO = 0.009;
	public static final double SEGUNDO_COLOCADO = 0.007;
	public static final double TERCEIRO_COLOCADO = 0.005;
	public static final double DEMAIS_COLOCADOS = 0.004;
	
	public static double total = 0;
	
	public static List<Atendente> lista = new ArrayList<Atendente>();
	
	public static void calculadoraGratificacao() {
		lista.sort((a1, a2) -> Double.compare(a1.getVendasSemana(), a2.getVendasSemana()));
		Collections.reverse(lista);
		
		lista.get(0).setGratificacaoSemana(lista.get(0).getVendasSemana() * PRIMEIRO_COLOCADO);
		lista.get(1).setGratificacaoSemana(lista.get(1).getVendasSemana() * SEGUNDO_COLOCADO);
		lista.get(2).setGratificacaoSemana(lista.get(2).getVendasSemana() * TERCEIRO_COLOCADO);
		
		lista.subList(3, lista.size()).forEach((atendente) -> atendente.setGratificacaoSemana(atendente.getVendasSemana() * DEMAIS_COLOCADOS));
		
		for(Atendente atendente : lista) {
			atendente.setVendasPrimeiraSemana(0);
		}
		
	}
	
	static void calculaSemana() {
		for (Atendente atendente : lista) {
			total += atendente.getVendasSemana();
		}
		System.out.println(total);
	}
	
	public static void main(String args[]) {
		
		Atendente beatriz = new Atendente("Beatriz");
		Atendente juliana = new Atendente("Juliana");
		Atendente valeria = new Atendente("Valeria");
		Atendente loja = new Atendente("Loja");
		
		lista.add(valeria);
		lista.add(beatriz);
		lista.add(loja);
		lista.add(juliana);
		
		beatriz.setVendasPrimeiraSemana(5018.67);
		juliana.setVendasPrimeiraSemana(629.16);
		loja.setVendasPrimeiraSemana(437.00);
		valeria.setVendasPrimeiraSemana(5910.43);
		
		calculadoraGratificacao();
		
		beatriz.setVendasSegundaSemana(16455.99);
		juliana.setVendasSegundaSemana(116.78);
		loja.setVendasSegundaSemana(123.98 + 378.00);
		valeria.setVendasSegundaSemana(13085.75);

		calculadoraGratificacao();
		
		beatriz.setVendasTerceiraSemana(9292.07);
		juliana.setVendasTerceiraSemana(98.00);
		loja.setVendasTerceiraSemana(157.75 + 352.00);
		valeria.setVendasTerceiraSemana(12708.37);

		calculadoraGratificacao();

		beatriz.setVendasQuartaSemana(5688.79);
		juliana.setVendasQuartaSemana(154.57);
		loja.setVendasQuartaSemana(278.00);
		valeria.setVendasQuartaSemana(10293.10);

		calculadoraGratificacao();
		
		beatriz.setVendasQuintaSemana(5426.18);
		juliana.setVendasQuintaSemana(69.99);
		loja.setVendasQuintaSemana(430.00);
		valeria.setVendasQuintaSemana(2690.19);
		
		calculadoraGratificacao();
		
		lista.sort((a1, a2) -> Double.compare(a1.getVendasTotal(), a2.getVendasTotal()));
		Collections.reverse(lista);
		
		lista.forEach((resultados) -> System.out.println(resultados));
		
	}
}
