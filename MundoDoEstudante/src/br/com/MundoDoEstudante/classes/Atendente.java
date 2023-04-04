package br.com.MundoDoEstudante.classes;

import java.util.Locale;

public class Atendente extends Funcionario implements Gratificacao {

	private double vendasSemana;
	private double vendasTotal;
	private double gratificacaoSemana;
	private double gratificacaoTotal;

	public Atendente(String nome) {
		super(nome);
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

		@SuppressWarnings("deprecation")
		String novaString = String.format(new Locale("pt", "BR"), "Funcionario: %s%nVendas: %.2f%nGratificacao: %.2f%n"
				, this.getNome(), this.getVendasTotal(), this.getGratificacaoTotal());
		return novaString;

	}

}
