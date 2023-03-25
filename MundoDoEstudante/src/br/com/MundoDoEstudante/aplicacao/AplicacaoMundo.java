package br.com.MundoDoEstudante.aplicacao;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import br.com.MundoDoEstudante.classes.Atendente;

public class AplicacaoMundo {
	
	public static final double PRIMEIRO_COLOCADO = 0.010;
	public static final double SEGUNDO_COLOCADO = 0.008;
	public static final double TERCEIRO_COLOCADO = 0.006;
	public static final double DEMAIS_COLOCADOS = 0.005;
	
	static List<Atendente> lista = new ArrayList<Atendente>();
	
	public static void calculadoraGratificacao() {
		
		lista.sort((a1, a2) -> Double.compare(a1.getVendasSemana(), a2.getVendasSemana()));
		Collections.reverse(lista);	
		
		lista.get(0).setGratificacao(lista.get(0).getVendasSemana() * PRIMEIRO_COLOCADO);
		lista.get(1).setGratificacao(lista.get(1).getVendasSemana() * SEGUNDO_COLOCADO);
		lista.get(2).setGratificacao(lista.get(2).getVendasSemana() * TERCEIRO_COLOCADO);
		
		lista.subList(3, lista.size()).forEach((atribuiDemais) -> 
		atribuiDemais.setGratificacao(atribuiDemais.getVendasSemana() * DEMAIS_COLOCADOS));
	}
	
	public static void main (String args[]) {
		
		Atendente felipe = new Atendente("Felipe");
		Atendente goncalves = new Atendente("Goncalves");
		Atendente lucas = new Atendente("Lucas");
		Atendente victor = new Atendente("Victor");
		Atendente alexandre = new Atendente("Alexandre");
		Atendente elias = new Atendente("Elias");
		Atendente loja = new Atendente("Loja");
		Atendente nailton = new Atendente("Nailton");
		Atendente julia = new Atendente("Julia");
		Atendente apoio = new Atendente("Apoio");
		Atendente camila = new Atendente("Camila");
		Atendente alvaro = new Atendente("Alvaro");
		Atendente thaina = new Atendente("Thaina");
		
		lista.add(felipe);
		lista.add(goncalves);
		lista.add(lucas);
		lista.add(victor);
		lista.add(alexandre);
		lista.add(elias);
		lista.add(loja);
		lista.add(nailton);
		lista.add(julia);
		lista.add(apoio);
		lista.add(camila);
		lista.add(alvaro);
		lista.add(thaina);

		felipe.setVendasPrimeiraSemana(2399.39);
		goncalves.setVendasPrimeiraSemana(680.97);
		lucas.setVendasPrimeiraSemana(358.43);
		victor.setVendasPrimeiraSemana(288.80);
		alexandre.setVendasPrimeiraSemana(319.80);
		elias.setVendasPrimeiraSemana(1119.75);
		loja.setVendasPrimeiraSemana(2606.84);
		nailton.setVendasPrimeiraSemana(3166.94);
		julia.setVendasPrimeiraSemana(2667.66);
		apoio.setVendasPrimeiraSemana(1516.36);
		camila.setVendasPrimeiraSemana(2443.04);
		alvaro.setVendasPrimeiraSemana(168.29);
		thaina.setVendasPrimeiraSemana(3132.95);
		
		calculadoraGratificacao();
		
		felipe.setVendasSegundaSemana(8129.45);
		goncalves.setVendasSegundaSemana(4747.84);
		lucas.setVendasSegundaSemana(2765.58);
		victor.setVendasSegundaSemana(2753.33);
		alexandre.setVendasSegundaSemana(216.80);
		elias.setVendasSegundaSemana(4521.29);
		loja.setVendasSegundaSemana(3414.08);
		nailton.setVendasSegundaSemana(6075.28);
		julia.setVendasSegundaSemana(6749.27);
		apoio.setVendasSegundaSemana(58.08);
		camila.setVendasSegundaSemana(4776.91);
		alvaro.setVendasSegundaSemana(445.35);
		thaina.setVendasSegundaSemana(9637.52);
		
		calculadoraGratificacao();
		
		felipe.setVendasTerceiraSemana(11635.96);
		goncalves.setVendasTerceiraSemana(4826.95);
		lucas.setVendasTerceiraSemana(1339.13);
		victor.setVendasTerceiraSemana(3478.77);
		alexandre.setVendasTerceiraSemana(50.00);
		elias.setVendasTerceiraSemana(5352.84);
		loja.setVendasTerceiraSemana(3665.90);
		nailton.setVendasTerceiraSemana(6465.58);
		julia.setVendasTerceiraSemana(9241.50);
		apoio.setVendasTerceiraSemana(1001.68);
		camila.setVendasTerceiraSemana(5024.59);
		alvaro.setVendasTerceiraSemana(1438.44);
		thaina.setVendasTerceiraSemana(9439.81);
		
		calculadoraGratificacao();
		
		felipe.setVendasQuartaSemana(10555.75);
		goncalves.setVendasQuartaSemana(6776.44);
		lucas.setVendasQuartaSemana(905.36);
		victor.setVendasQuartaSemana(981.15);
		alexandre.setVendasQuartaSemana(1102.87);
		elias.setVendasQuartaSemana(8024.22);
		loja.setVendasQuartaSemana(5404.32);
		nailton.setVendasQuartaSemana(10452.41);
		julia.setVendasQuartaSemana(5830.30);
		apoio.setVendasQuartaSemana(771.70);
		camila.setVendasQuartaSemana(7411.71);
		alvaro.setVendasQuartaSemana(326.95);
		thaina.setVendasQuartaSemana(9305.00);
		
		calculadoraGratificacao();
		
		felipe.setVendasQuintaSemana(14402.92);
		goncalves.setVendasQuintaSemana(9400.77);
		lucas.setVendasQuintaSemana(421.73);
		victor.setVendasQuintaSemana(14.97);
		alexandre.setVendasQuintaSemana(44.39);
		elias.setVendasQuintaSemana(9872.83);
		loja.setVendasQuintaSemana(1985.65);
		nailton.setVendasQuintaSemana(8770.94);
		julia.setVendasQuintaSemana(8177.20);
		apoio.setVendasQuintaSemana(1185.09);
		camila.setVendasQuintaSemana(10945.41);
		alvaro.setVendasQuintaSemana(112.16);
		thaina.setVendasQuintaSemana(12983.51);
		
		calculadoraGratificacao();
		
		lista.sort((a1, a2) -> Double.compare(a1.getVendasTotal(), a2.getVendasTotal()));
		Collections.reverse(lista);	
		
		lista.forEach((resultados) -> System.out.println(resultados));
		
	}

}
