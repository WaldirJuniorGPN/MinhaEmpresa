package br.com.MundoDoEstudante.classes.calculadoraGratificacao;

import java.math.BigDecimal;
<<<<<<< HEAD
=======
import java.math.RoundingMode;
>>>>>>> Servlet
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

import br.com.MundoDoEstudante.modelos.Atendente;
import br.com.MundoDoEstudante.modelos.Lojas;

public class CalculadorGratificacao {
	
	
<<<<<<< HEAD
	private List<Atendente> gratificacoes = new ArrayList<>();
	
	
	protected List<Atendente> calcularGratificacao(double percentual1, double percentual2, double percentual3, double percentual4, List<Atendente> lista) {
		
		this.gratificacoes = lista;
		
		this.gratificacoes.sort(Comparator.comparing(Atendente::getVendasSemana));
		Collections.reverse(gratificacoes);
		this.gratificacoes.get(0).setGratificacaoSemana(gratificacoes.get(0).getVendasSemana().multiply(BigDecimal.valueOf(percentual1)));
		this.gratificacoes.get(1).setGratificacaoSemana(gratificacoes.get(1).getVendasSemana().multiply(BigDecimal.valueOf(percentual2)));
		this.gratificacoes.get(2).setGratificacaoSemana(gratificacoes.get(2).getVendasSemana().multiply(BigDecimal.valueOf(percentual3)));

		this.gratificacoes.subList(3, gratificacoes.size()).forEach(
				atendente -> atendente.setGratificacaoSemana(atendente.getVendasSemana().multiply(BigDecimal.valueOf(percentual4))));
		
		return this.gratificacoes;
=======
	
	private static List<Atendente> gratificacoes = new ArrayList<>();
	
	public void inspecionarAtendentes (Atendente atendente) {
		gratificacoes.add(atendente);
	}
	
	
	protected List<Atendente> calcularGratificacao(BigDecimal percentual1, BigDecimal percentual2, BigDecimal percentual3, BigDecimal percentual4) {
	    gratificacoes.sort(Comparator.comparing(Atendente::getVendasSemana).reversed());
	    gratificacoes.get(0).setGratificacaoSemana(gratificacoes.get(0).getVendasSemana().multiply(percentual1).setScale(2, RoundingMode.HALF_UP));
	    gratificacoes.get(1).setGratificacaoSemana(gratificacoes.get(1).getVendasSemana().multiply(percentual2).setScale(2, RoundingMode.HALF_UP));
	    gratificacoes.get(2).setGratificacaoSemana(gratificacoes.get(2).getVendasSemana().multiply(percentual3).setScale(2, RoundingMode.HALF_UP));

	    gratificacoes.subList(3, gratificacoes.size()).forEach(
	        atendente -> atendente.setGratificacaoSemana(atendente.getVendasSemana().multiply(percentual4).setScale(2, RoundingMode.HALF_UP))
	    );
	    
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

>>>>>>> Servlet
	}

}
