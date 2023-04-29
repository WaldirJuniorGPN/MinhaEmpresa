package br.com.MundoDoEstudante.classes.calculadoraGratificacao;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

import br.com.MundoDoEstudante.classes.Atendente;

public class LapisCalculadoraGratificacao extends CalculadorGratificacao {

	private static final double PRIMEIRO_COLOCADO = 0.01;
	private static final double SEGUNDO_COLOCADO = 0.008;
	private static final double TERCEIRO_COLOCADO = 0.006;
	private static final double DEMAIS_COLOCADOS = 0.005;
	private List<Atendente> gratificacoes = new ArrayList<>();

	public LapisCalculadoraGratificacao(List<Atendente> lista) {
		gratificacoes = lista;
	}

	public List<Atendente> calcularGratificacao() {
		return super.calcularGratificacao(PRIMEIRO_COLOCADO, SEGUNDO_COLOCADO, TERCEIRO_COLOCADO, DEMAIS_COLOCADOS,
				this.gratificacoes);
	}

}
