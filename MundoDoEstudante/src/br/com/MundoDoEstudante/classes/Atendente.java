package br.com.MundoDoEstudante.classes;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;

import br.com.MundoDoEstudante.classes.calculadoraGratificacao.MundoCalculadoraGratificacao;

public class Atendente extends Funcionario implements Gratificacao, CalculadorGratificacao {

	private double vendasSemana;
	private double vendasTotal;
	private double gratificacaoSemana;
	private double gratificacaoTotal;
	static private List<Atendente> lista = new ArrayList<>();

	public void cadastra(Atendente atende) {
		lista.add(atende);
	}

	public Atendente(String nome) {
		super(nome);
		lista.add(this);
	}

	@Override
	public double getGraficacao() {
		return this.gratificacaoSemana;
	}

	@Override
	public void setGratificacaoSemana(double valor) {
		this.gratificacaoSemana = valor;
		this.gratificacaoTotal += valor;

	}

	public double getGratificacaoTotal() {
		return this.gratificacaoTotal;
	}

	public double getVendasTotal() {
		return this.vendasTotal;
	}

	public double getVendasSemana() {
		return this.vendasSemana;
	}

	public void setVendasPrimeiraSemana(double valor) {

		if (valor <= 0) {
			throw new IllegalArgumentException("O valor da venda precisa ser maior do que zero");
		}

		this.vendasSemana = valor;
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

	@Override
	public void calcularGratificacao(List<Atendente> atendentes) {
		atendentes = lista;
		new MundoCalculadoraGratificacao().calcularGratificacao(atendentes);
	}

}
