package br.com.MundoDoEstudante.aplicacao;

import java.math.BigDecimal;

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
