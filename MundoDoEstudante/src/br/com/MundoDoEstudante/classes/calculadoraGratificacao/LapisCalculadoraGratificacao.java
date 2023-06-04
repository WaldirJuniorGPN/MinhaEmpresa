package br.com.MundoDoEstudante.classes.calculadoraGratificacao;

import java.util.List;

import br.com.MundoDoEstudante.classes.Atendente;

public class LapisCalculadoraGratificacao extends CalculadorGratificacao {

	private static final double PRIMEIRO_COLOCADO = 0.01;
	private static final double SEGUNDO_COLOCADO = 0.008;
	private static final double TERCEIRO_COLOCADO = 0.006;
	private static final double DEMAIS_COLOCADOS = 0.005;


	public List<Atendente> calcularGratificacao() {
		return super.calcularGratificacao(PRIMEIRO_COLOCADO, SEGUNDO_COLOCADO, TERCEIRO_COLOCADO, DEMAIS_COLOCADOS);
	}

}
