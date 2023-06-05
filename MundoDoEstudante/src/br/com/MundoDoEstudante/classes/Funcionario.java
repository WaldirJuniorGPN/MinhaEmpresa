package br.com.MundoDoEstudante.classes;

import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.MappedSuperclass;

@MappedSuperclass
public abstract class Funcionario {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long id;
	private String nome;
	@Column(scale = 2)
	private double salario;
	
	public Funcionario(String nome) {
		this.nome = nome;
	}
	
	public Funcionario() {}
	
	public String getNome() {
		return this.nome;
	}
	
	public double getSalario() {
		return this.salario;
	}
	
	public void setNome(String nome) {
		this.nome = nome;
	}
	
	public void setSalario(double salario) {
		this.salario = salario;
	}
}
