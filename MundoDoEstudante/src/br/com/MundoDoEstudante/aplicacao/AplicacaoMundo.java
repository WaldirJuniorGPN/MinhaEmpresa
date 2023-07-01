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

        natiele.setVendasPrimeiraSemana(BigDecimal.valueOf(3501.66));
        kawan.setVendasPrimeiraSemana(BigDecimal.valueOf(720.23));
        costa.setVendasPrimeiraSemana(BigDecimal.valueOf(3780.44));
        lucas.setVendasPrimeiraSemana(BigDecimal.valueOf(40.29));
        victor.setVendasPrimeiraSemana(BigDecimal.valueOf(4408.28));
        loja.setVendasPrimeiraSemana(BigDecimal.valueOf(1500.73));
        nailton.setVendasPrimeiraSemana(BigDecimal.valueOf(2132.69));
        julia.setVendasPrimeiraSemana(BigDecimal.valueOf(1630.06));
        camila.setVendasPrimeiraSemana(BigDecimal.valueOf(3082.44));
        alvaro.setVendasPrimeiraSemana(BigDecimal.valueOf(47.57));
        thaina.setVendasPrimeiraSemana(BigDecimal.valueOf(2485.07));

        Atendente.calcularGratificacao(Lojas.MUNDO);

        natiele.setVendasSegundaSemana(BigDecimal.valueOf(6109.99));
        kawan.setVendasSegundaSemana(BigDecimal.valueOf(7256.17));
        costa.setVendasSegundaSemana(BigDecimal.valueOf(9371.63));
        lucas.setVendasSegundaSemana(BigDecimal.valueOf(1130.36));
        victor.setVendasSegundaSemana(BigDecimal.valueOf(5102.28));
        loja.setVendasSegundaSemana(BigDecimal.valueOf(4364.65));
        nailton.setVendasSegundaSemana(BigDecimal.valueOf(5021.04));
        julia.setVendasSegundaSemana(BigDecimal.valueOf(5944.46));
        apoio.setVendasSegundaSemana(BigDecimal.valueOf(461.78));
        camila.setVendasSegundaSemana(BigDecimal.valueOf(7228.64));
        alvaro.setVendasSegundaSemana(BigDecimal.valueOf(454.09));
        thaina.setVendasSegundaSemana(BigDecimal.valueOf(7150.17));

        Atendente.calcularGratificacao(Lojas.MUNDO);

        natiele.setVendasTerceiraSemana(BigDecimal.valueOf(6434.42));
        kawan.setVendasTerceiraSemana(BigDecimal.valueOf(7579.14));
        costa.setVendasTerceiraSemana(BigDecimal.valueOf(6794.67));
        lucas.setVendasTerceiraSemana(BigDecimal.valueOf(2231.22));
        victor.setVendasTerceiraSemana(BigDecimal.valueOf(9806.41));
        loja.setVendasTerceiraSemana(BigDecimal.valueOf(3770.05));
        nailton.setVendasTerceiraSemana(BigDecimal.valueOf(6046.99));
        julia.setVendasTerceiraSemana(BigDecimal.valueOf(4782.81));
        apoio.setVendasTerceiraSemana(BigDecimal.valueOf(18.72));
        camila.setVendasTerceiraSemana(BigDecimal.valueOf(3138.33));
        alvaro.setVendasTerceiraSemana(BigDecimal.valueOf(355.22));
        thaina.setVendasTerceiraSemana(BigDecimal.valueOf(8475.50));

        Atendente.calcularGratificacao(Lojas.MUNDO);

        natiele.setVendasQuartaSemana(BigDecimal.valueOf(6006.42));
        kawan.setVendasQuartaSemana(BigDecimal.valueOf(5976.76));
        costa.setVendasQuartaSemana(BigDecimal.valueOf(3260.59));
        lucas.setVendasQuartaSemana(BigDecimal.valueOf(189.11));
        victor.setVendasQuartaSemana(BigDecimal.valueOf(4579.32));
        loja.setVendasQuartaSemana(BigDecimal.valueOf(867.34));
        nailton.setVendasQuartaSemana(BigDecimal.valueOf(3959.95));
        julia.setVendasQuartaSemana(BigDecimal.valueOf(1189.44));
        apoio.setVendasQuartaSemana(BigDecimal.ZERO);
        camila.setVendasQuartaSemana(BigDecimal.valueOf(3286.61));
        alvaro.setVendasQuartaSemana(BigDecimal.valueOf(95.97));
        thaina.setVendasQuartaSemana(BigDecimal.valueOf(6121.20));

        Atendente.calcularGratificacao(Lojas.MUNDO);

        natiele.setVendasQuintaSemana(BigDecimal.valueOf(3867.44));
        kawan.setVendasQuintaSemana(BigDecimal.valueOf(5498.11));
        costa.setVendasQuintaSemana(BigDecimal.valueOf(3119.99));
        lucas.setVendasQuintaSemana(BigDecimal.valueOf(1335.81));
        victor.setVendasQuintaSemana(BigDecimal.valueOf(6224.91));
        loja.setVendasQuintaSemana(BigDecimal.valueOf(2659.47));
        nailton.setVendasQuintaSemana(BigDecimal.valueOf(5343.11));
        julia.setVendasQuintaSemana(BigDecimal.valueOf(3112.83));
        apoio.setVendasQuintaSemana(BigDecimal.valueOf(49.90));
        camila.setVendasQuintaSemana(BigDecimal.valueOf(2148.67));
        alvaro.setVendasQuintaSemana(BigDecimal.valueOf(466.13));
        thaina.setVendasQuintaSemana(BigDecimal.valueOf(6676.59));

        Atendente.calcularGratificacao(Lojas.MUNDO);
        
//        Atendente.polularBanco();
        
        Atendente.ordenarVendaTotal();

        Atendente.imprimirResultado();
    }
}
