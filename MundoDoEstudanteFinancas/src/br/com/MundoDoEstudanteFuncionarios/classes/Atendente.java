package br.com.MundoDoEstudanteFuncionarios.classes;

public class Atendente extends Funcionario implements Gratificacao, Comparable<Atendente>{

	private double gratificacao;
	private double vendasSemana;
	private double vendasTotal;
	
	public void setVendasSemana(double valor) {
		this.vendasSemana = valor;
		this.vendasTotal += valor;
	}
	
	public double getVendasTotal() {
		return this.vendasTotal;	
	}

	@Override
	public void setGratificacao(double valor) {
		this.gratificacao = valor;
	}

	@Override
	public double getGratificacao() {
		return this.gratificacao;
	}

	
	@Override
	public int compareTo(Atendente outro) {
		if(this.vendasSemana > outro.vendasSemana) {
			return 1;
		}else if(this.vendasSemana < outro.vendasSemana){
			return -1;
		}
		return 0;
	}
	

}
