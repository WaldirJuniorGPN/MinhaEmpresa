package br.com.MundoDoEstudante.classes.calculadoraGratificacao;

import java.util.ArrayList;
import java.util.List;

import br.com.MundoDoEstudante.classes.Atendente;

public class VovoCalculadoraGratificacao extends CalculadorGratificacao{

	private static final Double PRIMEIRO_COLOCADO = 0.01;
	private static final Double SEGUNDO_COLOCADO = 0.008;
	private static final Double TERCEIRO_COLOCADO = 0.006;
	private static final Double DEMAIS_COLOCADOS = 0.005;
	private List<Atendente> gratificacoes = new ArrayList<>();
	
	public VovoCalculadoraGratificacao(List<Atendente> lista) {
		gratificacoes = lista;
	}
	
	public List<Atendente> calcularGratificacao() {
		
		return super.calcularGratificacao(PRIMEIRO_COLOCADO, SEGUNDO_COLOCADO, TERCEIRO_COLOCADO, DEMAIS_COLOCADOS,
				this.gratificacoes);
		
	}

}
