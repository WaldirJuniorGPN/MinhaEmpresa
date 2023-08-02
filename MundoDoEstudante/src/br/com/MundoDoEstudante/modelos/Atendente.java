package br.com.MundoDoEstudante.modelos;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Locale;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Transient;

import br.com.MundoDoEstudante.classes.calculadoraGratificacao.CalculadorGratificacao;
import br.com.MundoDoEstudante.classes.leitor.LeitorDePlanilhas;

@Entity
@Table(name = "atendentes")
public class Atendente extends Funcionario implements Gratificacao {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long id;
	
	@Column(name = "gratificacao", updatable = true, scale = 2, nullable = true)
	private BigDecimal gratificacaoTotal = BigDecimal.ZERO;

	@Column(name = "vendas", updatable = true, scale = 2)
	private BigDecimal vendasTotal = BigDecimal.ZERO;

	@Transient
	private BigDecimal vendasSemanais = BigDecimal.ZERO;
	
	@Transient
	private BigDecimal gratificacaoSemanal = BigDecimal.ZERO;
	
	static private List<Atendente> lista = new ArrayList<>();
	
	private static CalculadorGratificacao calculador = new CalculadorGratificacao();
	
	private static AtendenteObserver observer = new AtendenteObserver();

	public Atendente(Atendente atendente) {
		Atendente.calculador.inspecionarAtendentes(this);
	}
	
	public Atendente(String nome) {
		super(nome);
		Atendente.calculador.inspecionarAtendentes(this);
	}
	
	public Atendente() {
		
	}

	public static Atendente INSTANCE() {
		return new Atendente(new Atendente());
	}
	

	@Override
	public BigDecimal getGraficacao() {
		return this.gratificacaoSemanal;
	}

	
	public long getId() {
		return this.id;
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

	@Override
	public void setGratificacaoSemana(BigDecimal valor) {
		this.vendasSemanais = BigDecimal.ZERO;
		this.setGraficacaoSemanal(valor);
		this.gratificacaoTotal = this.gratificacaoTotal.add(valor);
		
	}
	
	
	public void setGraficacaoSemanal(BigDecimal valor) {
		this.gratificacaoSemanal = valor;
	}
	
	public void setGratificacaoTotal(BigDecimal valor) {
		this.gratificacaoTotal = valor;
	}
	

	public void setVendasPrimeiraSemana(BigDecimal valor) {

		if (valor.compareTo(BigDecimal.ZERO) < 0) {
			throw new IllegalArgumentException("O valor da venda não pode ser negativo");
		}
		this.vendasSemanais = valor;
		this.vendasTotal = this.vendasTotal.add(valor);
	}
	
	public void setVendasTotal(BigDecimal vendasTotal) {
		this.vendasTotal = vendasTotal;
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

	public void setVendasSextaSemana(BigDecimal valor) {this.setVendasPrimeiraSemana(valor);}

	
	@Override
	public String toString() {

		String novaString = String.format(new Locale("pt", "BR"), "Funcionario: %s%nVendas: %.2f%nGratificacao: %.2f%n",
				this.getNome(), this.getVendasTotal(), this.getGratificacaoTotal());
		return novaString;

	}
	
	public static void polularBanco() {
		Atendente.lista.forEach(atendente -> Atendente.observer.inspecionarAtendentes(atendente));
	}

		
	public static void lerPlanilha() {
		Atendente.lista = new LeitorDePlanilhas().carregarAtendentes();
	}
	
	public static void calcularGratificacao(Lojas loja) {
		Atendente.lista = Atendente.calculador.calcularPercentuais(loja);
	}
	
	public static void ordenarVendaTotal() {
		Atendente.lista.sort(Comparator.comparing(Atendente::getVendasTotal));
		Collections.reverse(Atendente.lista);
	}

	public static void imprimirResultado() {
		Atendente.lista.forEach(System.out::println);
	}

}
