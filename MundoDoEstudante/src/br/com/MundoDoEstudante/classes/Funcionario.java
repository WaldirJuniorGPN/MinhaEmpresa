package br.com.MundoDoEstudante.classes;

import java.math.BigDecimal;

public abstract class Funcionario {
	
	private String nome;
	private BigDecimal salario;
	
	public Funcionario(String nome) {
		this.nome = nome;
	}
	
	public Funcionario() {}
	
	public String getNome() {
		return this.nome;
	}
	
	public BigDecimal getSalario() {
		return this.salario;
	}
	
	public void setNome(String nome) {
		this.nome = nome;
	}
	
	public void setSalario(BigDecimal salario) {
		this.salario = salario;
	}
}
