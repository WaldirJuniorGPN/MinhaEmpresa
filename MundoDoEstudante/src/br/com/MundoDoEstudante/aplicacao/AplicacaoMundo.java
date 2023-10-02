package br.com.MundoDoEstudante.aplicacao;

import java.math.BigDecimal;

<<<<<<< HEAD
import br.com.MundoDoEstudante.classes.Atendente;
import br.com.MundoDoEstudante.classes.Lojas;

public class AplicacaoMundo {

	
	public static void main (String args[]) {
		
		Atendente lucas = new Atendente("Lucas");
		Atendente victor = new Atendente("Victor");
		Atendente loja = new Atendente("Loja");
		Atendente nailton = new Atendente("Nailton");
		Atendente julia = new Atendente("Julia");
		Atendente apoio = new Atendente("Apoio");
		Atendente camila = new Atendente("Camila");
		Atendente alvaro = new Atendente("Alvaro");
		Atendente thaina = new Atendente("Thaina");
		Atendente costa = new Atendente("Costa");
		Atendente kawan = new Atendente("Kawan");
		Atendente natiele = new Atendente("Natiele");
		
		Atendente.calcularGratificacao(Lojas.MUNDO);
		
		natiele.setVendasPrimeiraSemana(new BigDecimal(3501.66));
		kawan.setVendasPrimeiraSemana(new BigDecimal(720.23));
		costa.setVendasPrimeiraSemana(new BigDecimal(3780.44));
		lucas.setVendasPrimeiraSemana(new BigDecimal(40.29));
		victor.setVendasPrimeiraSemana(new BigDecimal(4408.28));
		loja.setVendasPrimeiraSemana(new BigDecimal(1500.73));
		nailton.setVendasPrimeiraSemana(new BigDecimal(2132.69));
		julia.setVendasPrimeiraSemana(new BigDecimal(1630.06));
		camila.setVendasPrimeiraSemana(new BigDecimal(3082.44));
		alvaro.setVendasPrimeiraSemana(new BigDecimal(47.57));
		thaina.setVendasPrimeiraSemana(new BigDecimal(2485.07));
		
		Atendente.calcularGratificacao(Lojas.MUNDO);
		
		natiele.setVendasSegundaSemana(new BigDecimal(6109.99));
		kawan.setVendasSegundaSemana(new BigDecimal(7256.17));
		costa.setVendasSegundaSemana(new BigDecimal(9371.63));
		lucas.setVendasSegundaSemana(new BigDecimal(1130.36));
		victor.setVendasSegundaSemana(new BigDecimal(5102.28));
		loja.setVendasSegundaSemana(new BigDecimal(4364.65));
		nailton.setVendasSegundaSemana(new BigDecimal(5021.04));
		julia.setVendasSegundaSemana(new BigDecimal(5944.46));
		apoio.setVendasSegundaSemana(new BigDecimal(461.78));
		camila.setVendasSegundaSemana(new BigDecimal(7228.64));
		alvaro.setVendasSegundaSemana(new BigDecimal(454.09));
		thaina.setVendasSegundaSemana(new BigDecimal(7150.17));
		
		Atendente.calcularGratificacao(Lojas.MUNDO);
		
		natiele.setVendasTerceiraSemana(new BigDecimal(6434.42));
		kawan.setVendasTerceiraSemana(new BigDecimal(7579.14));
		costa.setVendasTerceiraSemana(new BigDecimal(6794.67));
		lucas.setVendasTerceiraSemana(new BigDecimal(2231.22));
		victor.setVendasTerceiraSemana(new BigDecimal(9806.41));
		loja.setVendasTerceiraSemana(new BigDecimal((7.98 + 3762.07)));
		nailton.setVendasTerceiraSemana(new BigDecimal(6046.99));
		julia.setVendasTerceiraSemana(new BigDecimal(4782.81));
		apoio.setVendasTerceiraSemana(new BigDecimal(18.72));
		camila.setVendasTerceiraSemana(new BigDecimal(3138.33));
		alvaro.setVendasTerceiraSemana(new BigDecimal(355.22));
		thaina.setVendasTerceiraSemana(new BigDecimal(8475.50));
		
		Atendente.calcularGratificacao(Lojas.MUNDO);
		
		natiele.setVendasQuartaSemana(new BigDecimal(6006.42));
		kawan.setVendasQuartaSemana(new BigDecimal(5976.76));
		costa.setVendasQuartaSemana(new BigDecimal(3260.59));
		lucas.setVendasQuartaSemana(new BigDecimal(189.11));
		victor.setVendasQuartaSemana(new BigDecimal(4579.32));
		loja.setVendasQuartaSemana(new BigDecimal(867.34));
		nailton.setVendasQuartaSemana(new BigDecimal(3959.95));
		julia.setVendasQuartaSemana(new BigDecimal(1189.44));
		apoio.setVendasQuartaSemana(new BigDecimal(0));
		camila.setVendasQuartaSemana(new BigDecimal(3286.61));
		alvaro.setVendasQuartaSemana(new BigDecimal(95.97));
		thaina.setVendasQuartaSemana(new BigDecimal(6121.20));
		
		Atendente.calcularGratificacao(Lojas.MUNDO);
		
		natiele.setVendasQuintaSemana(new BigDecimal(3867.44));
		kawan.setVendasQuintaSemana(new BigDecimal(5498.11));
		costa.setVendasQuintaSemana(new BigDecimal(3119.99));
		lucas.setVendasQuintaSemana(new BigDecimal(1335.81));
		victor.setVendasQuintaSemana(new BigDecimal(6224.91));
		loja.setVendasQuintaSemana(new BigDecimal(2659.47));
		nailton.setVendasQuintaSemana(new BigDecimal(5343.11));
		julia.setVendasQuintaSemana(new BigDecimal(3112.83));
		apoio.setVendasQuintaSemana(new BigDecimal(49.90));
		camila.setVendasQuintaSemana(new BigDecimal(2148.67));
		alvaro.setVendasQuintaSemana(new BigDecimal(466.13));
		thaina.setVendasQuintaSemana(new BigDecimal(6676.59));
		
		Atendente.calcularGratificacao(Lojas.MUNDO);
		
		Atendente.ordenarVendaTotal();
		
		Atendente.imprimirResultado();
	}
=======
import br.com.MundoDoEstudante.modelos.Atendente;
import br.com.MundoDoEstudante.modelos.Lojas;

public class AplicacaoMundo {

    public static void main(String[] args) {
    	
    	
        Atendente lucas = new Atendente("Lucas");
        Atendente victor = new Atendente("Victor");
        Atendente loja = new Atendente("Loja");
        Atendente nailton = new Atendente("Nailton");
        Atendente julia = new Atendente("Julia");
        Atendente apoio = new Atendente("Apoio");
        Atendente camila = new Atendente("Camila");
        Atendente alvaro = new Atendente("Alvaro");
        Atendente thaina = new Atendente("Thaina");
        Atendente costa = new Atendente("Costa");
        Atendente kawan = new Atendente("Kawan");
        Atendente natiele = new Atendente("Natiele");
        
>>>>>>> Servlet

        Atendente.calcularGratificacao(Lojas.MUNDO);

        natiele.setVendasPrimeiraSemana(BigDecimal.valueOf(1235.69));
        kawan.setVendasPrimeiraSemana(BigDecimal.valueOf(1447.99));
        costa.setVendasPrimeiraSemana(BigDecimal.valueOf(1150.41));
        lucas.setVendasPrimeiraSemana(BigDecimal.valueOf(572.27));
        victor.setVendasPrimeiraSemana(BigDecimal.valueOf(1913.83));
        loja.setVendasPrimeiraSemana(BigDecimal.valueOf(108.26));
        nailton.setVendasPrimeiraSemana(BigDecimal.valueOf(1690.64));
        alvaro.setVendasPrimeiraSemana(BigDecimal.valueOf(37.96));
        thaina.setVendasPrimeiraSemana(BigDecimal.valueOf(2125.61));

        Atendente.calcularGratificacao(Lojas.MUNDO);

        natiele.setVendasSegundaSemana(BigDecimal.valueOf(6687.75));
        kawan.setVendasSegundaSemana(BigDecimal.valueOf(4644.32));
        costa.setVendasSegundaSemana(BigDecimal.valueOf(7028.83));
        lucas.setVendasSegundaSemana(BigDecimal.valueOf(1231.78));
        victor.setVendasSegundaSemana(BigDecimal.valueOf(8287.35));
        loja.setVendasSegundaSemana(BigDecimal.valueOf(1408.04));
        nailton.setVendasSegundaSemana(BigDecimal.valueOf(5111.17));
        apoio.setVendasSegundaSemana(BigDecimal.valueOf(830.70));
        alvaro.setVendasSegundaSemana(BigDecimal.valueOf(439.47));
        thaina.setVendasSegundaSemana(BigDecimal.valueOf(7387.01));

        Atendente.calcularGratificacao(Lojas.MUNDO);

        natiele.setVendasTerceiraSemana(BigDecimal.valueOf(6449.24));
        kawan.setVendasTerceiraSemana(BigDecimal.valueOf(7337.63));
        costa.setVendasTerceiraSemana(BigDecimal.valueOf(5254.49));
        lucas.setVendasTerceiraSemana(BigDecimal.valueOf(1831.92));
        victor.setVendasTerceiraSemana(BigDecimal.valueOf(6396.27));
        loja.setVendasTerceiraSemana(new BigDecimal("9.90").add(new BigDecimal("1154.47")).add(new BigDecimal("9.90")));
        nailton.setVendasTerceiraSemana(BigDecimal.valueOf(1808.38));
        apoio.setVendasTerceiraSemana(BigDecimal.valueOf(562.33));
        alvaro.setVendasTerceiraSemana(BigDecimal.valueOf(127.31));
        thaina.setVendasTerceiraSemana(BigDecimal.valueOf(11268.94));

        Atendente.calcularGratificacao(Lojas.MUNDO);

        natiele.setVendasQuartaSemana(BigDecimal.valueOf(5906.38));
        kawan.setVendasQuartaSemana(BigDecimal.valueOf(5098.69));
        costa.setVendasQuartaSemana(BigDecimal.valueOf(8299.81));
        lucas.setVendasQuartaSemana(BigDecimal.valueOf(1075.14));
        victor.setVendasQuartaSemana(BigDecimal.valueOf(7012.17));
        loja.setVendasQuartaSemana(BigDecimal.valueOf(1261.52));
        nailton.setVendasQuartaSemana(BigDecimal.valueOf(3381.83));
        apoio.setVendasQuartaSemana(BigDecimal.valueOf(1098.26));
        alvaro.setVendasQuartaSemana(BigDecimal.valueOf(616.59));
        thaina.setVendasQuartaSemana(BigDecimal.valueOf(7795.94));

        Atendente.calcularGratificacao(Lojas.MUNDO);

        natiele.setVendasQuintaSemana(BigDecimal.valueOf(4755.25));
        kawan.setVendasQuintaSemana(BigDecimal.valueOf(3805.33));
        costa.setVendasQuintaSemana(BigDecimal.valueOf(10036.86));
        lucas.setVendasQuintaSemana(BigDecimal.valueOf(1339.94));
        victor.setVendasQuintaSemana(BigDecimal.valueOf(11499.48));
        loja.setVendasQuintaSemana(BigDecimal.valueOf(3590.81));
        nailton.setVendasQuintaSemana(BigDecimal.valueOf(12517.06));
        apoio.setVendasQuintaSemana(BigDecimal.valueOf(1480.77));
        alvaro.setVendasQuintaSemana(BigDecimal.valueOf(1104.99));
        thaina.setVendasQuintaSemana(BigDecimal.valueOf(20330.75));

        Atendente.calcularGratificacao(Lojas.MUNDO);

        alvaro.setVendasSextaSemana(new BigDecimal("377.86"));
        apoio.setVendasSextaSemana(new BigDecimal("106.20"));
        costa.setVendasSextaSemana(new BigDecimal("3842.04"));
        kawan.setVendasSextaSemana(new BigDecimal("1279.35"));
        loja.setVendasSextaSemana(new BigDecimal("4.98").add(new BigDecimal("654.60")));
        lucas.setVendasSextaSemana(new BigDecimal("111.91"));
        nailton.setVendasSextaSemana(new BigDecimal("686.53"));
        thaina.setVendasSextaSemana(new BigDecimal("4898.64"));
        victor.setVendasSextaSemana(new BigDecimal("3638.98"));

        Atendente.calcularGratificacao(Lojas.MUNDO);

//        Atendente.polularBanco();
        
        Atendente.ordenarVendaTotal();

        Atendente.imprimirResultado();
    }
}
