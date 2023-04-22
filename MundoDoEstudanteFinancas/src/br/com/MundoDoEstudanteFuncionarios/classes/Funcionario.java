package br.com.MundoDoEstudanteFuncionarios.classes;

public class Funcionario {
	private String nome;
	private String cpf;
	private double salario;
	
	public void setNome(String nome) {
		this.nome = nome;
	}
	
	public String getNome() {
		return this.nome;
	}
	
	public void setCpf(String cpf) {
		this.cpf = cpf;
	}
	
	public String getCpf() {
		return this.cpf;
	}
	
	public void setSalario(double valor) {
		this.salario = valor;
	}
	
	public double getSalario() {
		return this.salario;
	}
}
