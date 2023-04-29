package br.com.MundoDoEstudante.classes;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Locale;

import br.com.MundoDoEstudante.classes.calculadoraGratificacao.LapisCalculadoraGratificacao;
import br.com.MundoDoEstudante.classes.calculadoraGratificacao.MundoCalculadoraGratificacao;
import br.com.MundoDoEstudante.classes.calculadoraGratificacao.SonhoCalculadoraGratificacao;
import br.com.MundoDoEstudante.classes.calculadoraGratificacao.VovoCalculadoraGratificacao;

public class Atendente extends Funcionario implements Gratificacao {

	private double vendasSemanais;
	private double vendasTotal;
	private double gratificacaoSemanal;
	private double gratificacaoTotal;
	static private List<Atendente> lista = new ArrayList<>();

	public void cadastra(Atendente atende) {
		lista.add(atende);
	}

	public Atendente(String nome) {
		super(nome);
		lista.add(this);
	}
	
	public Atendente() {}

	@Override
	public double getGraficacao() {
		return this.gratificacaoSemanal;
	}

	@Override
	public void setGratificacaoSemana(double valor) {
		this.gratificacaoSemanal = valor;
		this.gratificacaoTotal += valor;

	}

	public double getGratificacaoTotal() {
		return this.gratificacaoTotal;
	}

	public double getVendasTotal() {
		return this.vendasTotal;
	}

	public double getVendasSemana() {
		return this.vendasSemanais;
	}

	public void setVendasPrimeiraSemana(double valor) {

		if (valor < 0) {
			throw new IllegalArgumentException("O valor da venda não pode ser negativo");
		}

		this.vendasSemanais = valor;
		this.vendasTotal += valor;
	}

	public void setVendasSegundaSemana(double valor) {
		this.setVendasPrimeiraSemana(valor);
	}

	public void setVendasTerceiraSemana(double valor) {
		this.setVendasPrimeiraSemana(valor);
	}

	public void setVendasQuartaSemana(double valor) {
		this.setVendasPrimeiraSemana(valor);
	}

	public void setVendasQuintaSemana(double valor) {
		this.setVendasPrimeiraSemana(valor);
	}

	@Override
	public String toString() {

		String novaString = String.format(new Locale("pt", "BR"), "Funcionario: %s%nVendas: %.2f%nGratificacao: %.2f%n",
				this.getNome(), this.getVendasTotal(), this.getGratificacaoTotal());
		return novaString;

	}

	public static void calcularGratificacao(Lojas loja) {
		switch (loja) {
		case MUNDO:
			lista = (List<Atendente>) new MundoCalculadoraGratificacao(lista).calcularGratificacao();
			break;
		case SONHO:
			lista = (List<Atendente>) new SonhoCalculadoraGratificacao(lista).calcularGratificacao();
			break;
		case LAPIS:
			lista = (List<Atendente>) new LapisCalculadoraGratificacao(lista).calcularGratificacao();
			break;
		case VOVO:
			lista = (List<Atendente>) new VovoCalculadoraGratificacao(lista).calcularGratificacao();
			break;
		default:
			throw new IllegalArgumentException("É necessário informar uma loja válida");
		}

	}

	public static void calcularGratificacao() {
		new MundoCalculadoraGratificacao(lista);
		
	}
	
	public static void ordenarVendaTotal() {
		lista.sort(Comparator.comparing(Atendente::getVendasTotal));
		Collections.reverse(lista);
	}

	public static void imprimirResultado() {
		lista.forEach(System.out::println);
	}

}
