package br.com.MundoDoEstudante.classes;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;

public class Atendente extends Funcionario implements Gratificacao {

	private double vendasSemana;
	private double vendasTotal;
	private double gratificacaoSemana;
	private double gratificacaoTotal;
	static private List<Atendente> lista = new ArrayList<>();
	static private Map<String, List<Double>> lojas = new HashMap<>();

	public static void calculadorGratificacao(String loja) {
		try {
			List<Double> percentual = lojas.get(loja);
			initLojas();
			
			if(percentual != null) {
				lista.sort(Comparator.comparing(Atendente::getVendasSemana));
				Collections.reverse(lista);
				lista.get(0).setGratificacaoSemana(lista.get(0).getVendasSemana() * percentual.get(0));
				lista.get(1).setGratificacaoSemana(lista.get(1).getVendasSemana() * percentual.get(1));
				lista.get(2).setGratificacaoSemana(lista.get(2).getVendasSemana() * percentual.get(2));
				
				lista.subList(3, lista.size()).forEach(atendentes -> 
					atendentes.setGratificacaoSemana(atendentes.getVendasSemana() * percentual.get(3)));
			} else {
				throw new Exception("É necessário que informe o nome da Loja, Mundo, Sonho, Vovó ou Lápis, para poder usar a regra de gratificação correta");
			}
		} catch(Exception e) {
			e.printStackTrace();
		}
	}


	public static void ordenarVendaTotal() {
		lista.sort(Comparator.comparing(Atendente::getVendasTotal));
		Collections.reverse(lista);
	}

	public static void imprimeResultado() {
		lista.forEach(System.out::println);
	}

	private static void initLojas() {
		lojas.put("Mundo", Arrays.asList(0.01, 0.008, 0.006, 0.005));
		lojas.put("Sonho", Arrays.asList(0.01, 0.008, 0.006, 0.005));
		lojas.put("Casa", Arrays.asList(0.009, 0.007, 0.005, 0.004));
		lojas.put("Lapis", Arrays.asList(0.01, 0.008, 0.006, 0.005));
	}

	public void cadastra(Atendente atende) {
		lista.add(atende);
	}

	public Atendente(String nome) {
		super(nome);
		lista.add(this);
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

		String novaString = String.format(new Locale("pt", "BR"), "Funcionario: %s%nVendas: %.2f%nGratificacao: %.2f%n",
				this.getNome(), this.getVendasTotal(), this.getGratificacaoTotal());
		return novaString;

	}

}
