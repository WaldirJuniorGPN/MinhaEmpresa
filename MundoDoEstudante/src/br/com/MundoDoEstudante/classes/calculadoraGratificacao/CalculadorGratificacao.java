package br.com.MundoDoEstudante.classes.calculadoraGratificacao;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

import br.com.MundoDoEstudante.classes.Atendente;
import br.com.MundoDoEstudante.classes.Lojas;

public class CalculadorGratificacao {
	
	
	
	private static List<Atendente> gratificacoes = new ArrayList<>();
	
	public void inspecionarAtendentes (Atendente atendente) {
		gratificacoes.add(atendente);
	}
	
	
	protected List<Atendente> calcularGratificacao(double percentual1, double percentual2, double percentual3, double percentual4) {
		
		gratificacoes.sort(Comparator.comparing(Atendente::getVendasSemana));
		Collections.reverse(gratificacoes);
		gratificacoes.get(0).setGratificacaoSemana(gratificacoes.get(0).getVendasSemana() * percentual1);
		gratificacoes.get(1).setGratificacaoSemana(gratificacoes.get(1).getVendasSemana() * percentual2);
		gratificacoes.get(2).setGratificacaoSemana(gratificacoes.get(2).getVendasSemana() * percentual3);

		gratificacoes.subList(3, gratificacoes.size()).forEach(
				atendente -> atendente.setGratificacaoSemana(atendente.getVendasSemana() * percentual4));
		
		return gratificacoes;
	}
	
	public List<Atendente> calcularPercentuais(Lojas loja){
		switch (loja) {
		case MUNDO:
			return (List<Atendente>) new MundoCalculadoraGratificacao().calcularGratificacao();
		case SONHO:
			return (List<Atendente>) new SonhoCalculadoraGratificacao().calcularGratificacao();
		case LAPIS:
			return (List<Atendente>) new LapisCalculadoraGratificacao().calcularGratificacao();
		case VOVO:
			return (List<Atendente>) new VovoCalculadoraGratificacao().calcularGratificacao();
		default:
			throw new IllegalArgumentException("É necessário informar uma loja válida");
		}

	}

}
