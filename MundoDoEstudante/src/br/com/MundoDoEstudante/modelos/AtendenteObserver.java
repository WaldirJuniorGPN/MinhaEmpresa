package br.com.MundoDoEstudante.modelos;

import br.com.MundoDoEstudante.bancoDeDados.AtendenteDAO;

public class AtendenteObserver {
	
	public void inspecionarAtendentes(Atendente atendente) {
		AtendenteDAO.save(atendente);
	}

}
