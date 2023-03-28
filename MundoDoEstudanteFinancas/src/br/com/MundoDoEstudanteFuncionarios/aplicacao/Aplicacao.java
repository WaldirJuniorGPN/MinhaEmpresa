package br.com.MundoDoEstudanteFuncionarios.aplicacao;

import java.util.ArrayList;
import java.util.List;

import br.com.MundoDoEstudanteFuncionarios.classes.Atendente;

public class Aplicacao {

	public static final double PRIMEIRO_COLOCADO = 0.1;
	public static final double SEGUNDO_COLOCADO = 0.08;
	public static final double TERCEIRO_COLOCADO = 0.07;
	public static final double DEMAIS_COLOCADO = 0.05;
	
	public static void main(String args[]) {
		
		Atendente at1 = new Atendente();
		Atendente at2 = new Atendente();
		Atendente at3 = new Atendente();
		
		List lista = new ArrayList<Atendente>();
		lista.add(at1);
		lista.add(at2);
		lista.add(at3);
		
	}
}
