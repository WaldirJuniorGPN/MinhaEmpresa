package br.com.MundoDoEstudante.classes.calculadoraGratificacao;

import java.math.BigDecimal;
import java.util.List;

import br.com.MundoDoEstudante.modelos.Atendente;

public class VovoCalculadoraGratificacao extends CalculadorGratificacao{

	private static final Double PRIMEIRO_COLOCADO = 0.01;
	private static final Double SEGUNDO_COLOCADO = 0.005;
	private static final Double TERCEIRO_COLOCADO = 0.002;
	private static final Double DEMAIS_COLOCADOS = 0.000;
	
	
	public List<Atendente> calcularGratificacao() {
		
		return super.calcularGratificacao(BigDecimal.valueOf(PRIMEIRO_COLOCADO), BigDecimal.valueOf(SEGUNDO_COLOCADO),
				BigDecimal.valueOf(TERCEIRO_COLOCADO), BigDecimal.valueOf(DEMAIS_COLOCADOS));
	}

}
