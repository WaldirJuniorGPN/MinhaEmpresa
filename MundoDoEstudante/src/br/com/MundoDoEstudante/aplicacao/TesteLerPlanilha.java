package br.com.MundoDoEstudante.aplicacao;

import java.util.List;

import br.com.MundoDoEstudante.classes.Atendente;

public class TesteLerPlanilha {
	private static List<Atendente> lista;
	public static void main(String args[]) {
		
		
		lista = Atendente.lerPlanilha();
		
		System.out.println(lista);

	}
}
