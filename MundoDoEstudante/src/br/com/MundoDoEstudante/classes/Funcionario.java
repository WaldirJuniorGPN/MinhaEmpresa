package br.com.MundoDoEstudante.classes;

import java.math.BigDecimal;

import javax.persistence.Column;
import javax.persistence.MappedSuperclass;

@MappedSuperclass
public abstract class Funcionario {
	
	@Column(name = "nome_atendente")
	private String nome;
	@Column(scale = 2)
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
