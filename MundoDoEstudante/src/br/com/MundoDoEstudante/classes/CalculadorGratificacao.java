package br.com.MundoDoEstudante.classes;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class CalculadorGratificacao {
	
	
	public void calculadorGratificacao(String nomeDaEmpresa) {
		List<Atendente> lista = new ArrayList<Atendente>();
		lista.sort((a1, a2) -> Double.compare(a1.getVendasSemana(), a2.getVendasSemana()));
		Collections.reverse(lista);
		
		lista.get(0).setGratificacaoSemana(lista.get(0).getVendasSemana());
	}

}
