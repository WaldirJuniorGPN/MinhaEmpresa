package br.com.MundoDoEstudante.classes.calculadoraGratificacao;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

import br.com.MundoDoEstudante.classes.Atendente;
import br.com.MundoDoEstudante.classes.CalculadorGratificacao;

public class MundoCalculadoraGratificacao implements CalculadorGratificacao {

	private static final Double PRIMEIRO_COLOCADO = 0.1;
	private static final Double SEGUNDO_COLOCADO = 0.1;
	private static final Double TERCEIRO_COLOCADO = 0.1;
	private static final Double DEMAIS_COLOCADOS = 0.1;
	private List<Atendente> gratificacoes = new ArrayList<>();
	
	@Override
	public void calcularGratificacao(List<Atendente> atendentes) {
		
		gratificacoes = atendentes;

		gratificacoes.sort(Comparator.comparing(Atendente::getVendasSemana));
		Collections.reverse(gratificacoes);
		gratificacoes.get(0).setGratificacaoSemana(gratificacoes.get(0).getVendasSemana() * PRIMEIRO_COLOCADO);
		gratificacoes.get(1).setGratificacaoSemana(gratificacoes.get(1).getVendasSemana() * SEGUNDO_COLOCADO);
		gratificacoes.get(2).setGratificacaoSemana(gratificacoes.get(2).getVendasSemana() * TERCEIRO_COLOCADO);

		gratificacoes.subList(3, gratificacoes.size()).forEach(
				atendente -> atendente.setGratificacaoSemana(atendente.getVendasSemana() * DEMAIS_COLOCADOS));
		
	}
	
	public void ordenarVendaTotal() {
		gratificacoes.sort(Comparator.comparing(Atendente::getVendasTotal));
		Collections.reverse(gratificacoes);
	}
	
	public void imprimeResultado() {
		gratificacoes.forEach(System.out::println);
	}

}
