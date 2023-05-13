package br.com.MundoDoEstudante.classes.calculadoraGratificacao;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

import br.com.MundoDoEstudante.classes.Atendente;

public class CalculadorGratificacao {
	
	
	
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
	}

}
