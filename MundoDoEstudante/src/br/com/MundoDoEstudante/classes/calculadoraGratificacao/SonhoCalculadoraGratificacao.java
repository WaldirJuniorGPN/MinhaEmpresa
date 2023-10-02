package br.com.MundoDoEstudante.classes.calculadoraGratificacao;

import java.math.BigDecimal;
import java.util.List;

import br.com.MundoDoEstudante.modelos.Atendente;

public class SonhoCalculadoraGratificacao extends CalculadorGratificacao {

	private static final Double PRIMEIRO_COLOCADO = 0.012;
	private static final Double SEGUNDO_COLOCADO = 0.008;
	private static final Double TERCEIRO_COLOCADO = 0.004;
	private static final Double DEMAIS_COLOCADOS = 0.002;
	
	
	public List<Atendente> calcularGratificacao() {
		
		return super.calcularGratificacao(BigDecimal.valueOf(PRIMEIRO_COLOCADO), BigDecimal.valueOf(SEGUNDO_COLOCADO),
				BigDecimal.valueOf(TERCEIRO_COLOCADO), BigDecimal.valueOf(DEMAIS_COLOCADOS));
	}

}
