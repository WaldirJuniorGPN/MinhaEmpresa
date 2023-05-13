package br.com.MundoDoEstudante.classes;

import java.io.IOException;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Locale;

public class Atendente extends Funcionario implements Gratificacao {

	private BigDecimal vendasSemanais = BigDecimal.ZERO;
	private BigDecimal vendasTotal = BigDecimal.ZERO;
	private BigDecimal gratificacaoSemanal = BigDecimal.ZERO;
	private BigDecimal gratificacaoTotal = BigDecimal.ZERO;
	static private List<Atendente> lista = new ArrayList<>();
	private AtendenteDAO atendenteDAO = new AtendenteDAO();

	public void cadastra(Atendente atende) {
	}

	public Atendente(String nome) {
		super(nome);
		atendenteDAO.inserirAtendenteBanco(nome);
	}
	
	public Atendente() {}
	
	public Atendente(String nome, BigDecimal vendasSemanais) {
		super(nome);
		this.vendasSemanais = vendasSemanais;
		atendenteDAO.inserirAtendenteBanco(nome);
	}

	@Override
	public BigDecimal getGraficacao() {
		return this.gratificacaoSemanal;
	}

	@Override
	public void setGratificacaoSemana(BigDecimal valor) {
		this.vendasSemanais = BigDecimal.ZERO;
		this.gratificacaoSemanal = valor;
		this.gratificacaoTotal = this.gratificacaoTotal.add(valor);
		atendenteDAO.inserirValoresBanco(this.vendasTotal, this.gratificacaoTotal);

	}

	public BigDecimal getGratificacaoTotal() {
		return this.gratificacaoTotal;
	}

	public BigDecimal getVendasTotal() {
		return this.vendasTotal;
	}

	public BigDecimal getVendasSemana() {
		return this.vendasSemanais;
	}

	public void setVendasPrimeiraSemana(BigDecimal valor) {

		if (valor.compareTo(BigDecimal.ZERO) < 0) {
			throw new IllegalArgumentException("O valor da venda não pode ser negativo");
		}
		this.vendasSemanais = valor;
		this.vendasTotal = this.vendasTotal.add(valor);
	}

	public void setVendasSegundaSemana(BigDecimal valor) {
		this.setVendasPrimeiraSemana(valor);
	}

	public void setVendasTerceiraSemana(BigDecimal valor) {
		this.setVendasPrimeiraSemana(valor);
	}

	public void setVendasQuartaSemana(BigDecimal valor) {
		this.setVendasPrimeiraSemana(valor);
	}

	public void setVendasQuintaSemana(BigDecimal valor) {
		this.setVendasPrimeiraSemana(valor);
	}

	@Override
	public String toString() {

		String novaString = String.format(new Locale("pt", "BR"), "Funcionario: %s%nVendas: %.2f%nGratificacao: %.2f%n",
				this.getNome(), this.getVendasTotal(), this.getGratificacaoTotal());
		return novaString;

	}

	public static void calcularGratificacao(Lojas loja) {
		new AtendenteDAO().calcularGratificacao(loja);
	}
	
	public static List<Atendente> lerPlanilha() {
		try {
			lista = new AtendenteDAO().lerPlanilha();
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		return lista;
	}

	public static void ordenarVendaTotal() {
		lista.sort(Comparator.comparing(Atendente::getVendasTotal));
		Collections.reverse(lista);
	}

	public static void imprimirResultado() {
		lista.forEach(System.out::println);
	}

}
