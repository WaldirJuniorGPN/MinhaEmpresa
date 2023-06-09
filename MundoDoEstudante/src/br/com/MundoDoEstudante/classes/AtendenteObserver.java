package br.com.MundoDoEstudante.classes;

public class AtendenteObserver {
	
	public void inspecionarAtendentes(Atendente atendente) {
		AtendenteDAO.save(atendente);
	}

}
