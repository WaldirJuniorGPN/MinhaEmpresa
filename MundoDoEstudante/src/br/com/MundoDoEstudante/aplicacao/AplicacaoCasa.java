package br.com.MundoDoEstudante.aplicacao;

import br.com.MundoDoEstudante.classes.Atendente;
import br.com.MundoDoEstudante.classes.Lojas;

public class AplicacaoCasa {
	
	public static void main(String args[]) {
		
		Atendente beatriz = new Atendente("Beatriz");
		Atendente juliana = new Atendente("Juliana");
		Atendente valeria = new Atendente("Valeria");
		Atendente loja = new Atendente("Loja");
		
		Atendente.calcularGratificacao(Lojas.VOVO);
		
		beatriz.setVendasPrimeiraSemana(1194.06);
		juliana.setVendasPrimeiraSemana(104.80);
		loja.setVendasPrimeiraSemana(66.00);
		valeria.setVendasPrimeiraSemana(2417.98);
		
		Atendente.calcularGratificacao(Lojas.VOVO);
		
		beatriz.setVendasSegundaSemana(5331.31);
		juliana.setVendasSegundaSemana(362.87);
		loja.setVendasSegundaSemana((23.99 + 390.00));
		valeria.setVendasSegundaSemana(8626.86);

		Atendente.calcularGratificacao(Lojas.VOVO);
		
		beatriz.setVendasTerceiraSemana(5530.14);
		juliana.setVendasTerceiraSemana(48.97);
		loja.setVendasTerceiraSemana((173.87 + 352.98));
		valeria.setVendasTerceiraSemana(10937.92);

		Atendente.calcularGratificacao(Lojas.VOVO);

		beatriz.setVendasQuartaSemana(5847.61);
		juliana.setVendasQuartaSemana(22.90 + 22.00);
		loja.setVendasQuartaSemana((348.00));
		valeria.setVendasQuartaSemana(3910.73);

		Atendente.calcularGratificacao(Lojas.VOVO);
		
		beatriz.setVendasQuintaSemana(2704.52);
		juliana.setVendasQuintaSemana(0);
		loja.setVendasQuintaSemana((23.99 + 369.00));
		valeria.setVendasQuintaSemana(7184.58);

		
		Atendente.calcularGratificacao(Lojas.VOVO);
		
		Atendente.ordenarVendaTotal();
		
		Atendente.imprimirResultado();
		
	}
}
