package br.com.MundoDoEstudante.classes;

public abstract class Funcionario {
	
	private String nome;
	private double salario;
	
	public Funcionario(String nome) {
		this.nome = nome;
	}
	
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
