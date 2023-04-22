package br.com.MundoDoEstudante.aplicacao;

<<<<<<< HEAD
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import br.com.MundoDoEstudante.classes.Atendente;

public class AplicacaoSonho {

	public static final double PRIMEIRO_COLOCADO = 0.01;
	public static final double SEGUNDO_COLOCADO = 0.008;
	public static final double TERCEIRO_COLOCADO = 0.006;
	public static final double DEMAIS_COLOCADOS = 0.005;
	public static List<Atendente> lista = new ArrayList<Atendente>();
	
	public static void calculadorGratificacao() {
		lista.sort((a1, a2) -> Double.compare(a1.getVendasSemana(),a2.getVendasSemana()));
		Collections.reverse(lista);
		
		lista.get(0).setGratificacaoSemana(lista.get(0).getVendasSemana() * PRIMEIRO_COLOCADO);
		lista.get(1).setGratificacaoSemana(lista.get(1).getVendasSemana() * SEGUNDO_COLOCADO);
		lista.get(2).setGratificacaoSemana(lista.get(2).getVendasSemana() * TERCEIRO_COLOCADO);
		
		lista.subList(3, lista.size()).forEach((atendente) -> atendente.setGratificacaoSemana(atendente.getVendasSemana() * DEMAIS_COLOCADOS));
		
		for (Atendente atendente : lista) {
			atendente.setVendasPrimeiraSemana(0);
		}
		
	}
	
	public static void main (String args[]) {
		
		Atendente karol = new Atendente("Karol");
		Atendente dani = new Atendente("Dani");
		Atendente meiri = new Atendente("Meiri");
		Atendente vanisse = new Atendente("Vanisse");
		Atendente alef = new Atendente("Alef");
		Atendente sara = new Atendente("Sara");
		Atendente loja= new Atendente("loja");
		
		lista.add(meiri);
		lista.add(karol);
		lista.add(dani);
		lista.add(vanisse);
		lista.add(alef);
		lista.add(sara);
		lista.add(loja);
		
		karol.setVendasPrimeiraSemana(5529.19);
		dani.setVendasPrimeiraSemana(7498.25);
		alef.setVendasPrimeiraSemana(0);
		loja.setVendasPrimeiraSemana(525.91);
		vanisse.setVendasPrimeiraSemana(6237.82);
		sara.setVendasPrimeiraSemana(862.26);
		meiri.setVendasPrimeiraSemana(15704.94);
		
		calculadorGratificacao();
		
		alef.setVendasSegundaSemana(7.99);
		dani.setVendasSegundaSemana(6965.09);
		karol.setVendasSegundaSemana(10628.15);
		loja.setVendasSegundaSemana(397.38);
		vanisse.setVendasSegundaSemana(2882.23);
		sara.setVendasSegundaSemana(7393.43);
		meiri.setVendasSegundaSemana(7626.03);
		
		calculadorGratificacao();
		
		alef.setVendasTerceiraSemana(0);
		dani.setVendasTerceiraSemana(4107.13);
		karol.setVendasTerceiraSemana(7361.85);
		loja.setVendasTerceiraSemana(971.81);
		vanisse.setVendasTerceiraSemana(1063.18);
		sara.setVendasTerceiraSemana(6670.60);
		meiri.setVendasTerceiraSemana(11770.92);
		
		calculadorGratificacao();
		
		alef.setVendasQuartaSemana(0);
		dani.setVendasQuartaSemana(7823.57);
		karol.setVendasQuartaSemana(4593.37);
		loja.setVendasQuartaSemana(460.88);
		vanisse.setVendasQuartaSemana(272.79);
		sara.setVendasQuartaSemana(5561.78);
		meiri.setVendasQuartaSemana(4047.33);
		
		calculadorGratificacao();
		
		alef.setVendasQuintaSemana(0);
		dani.setVendasQuintaSemana(1874.83);
		karol.setVendasQuintaSemana(677.23);
		loja.setVendasQuintaSemana(24.90);
		vanisse.setVendasQuintaSemana(676.83);
		sara.setVendasQuintaSemana(3201.65);
		meiri.setVendasQuintaSemana(3374.60);
		
		calculadorGratificacao();
		
		lista.sort((a1, a2) -> Double.compare(a1.getVendasTotal(), a2.getVendasTotal()));
		Collections.reverse(lista);
		
		lista.forEach((atendentes) -> System.out.println(atendentes));
	}

=======
public class AplicacaoSonho {

>>>>>>> master
}
