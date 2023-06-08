package br.com.MundoDoEstudante.classes;

import javax.persistence.EntityManager;
import javax.persistence.TypedQuery;

import br.com.MundoDoEstudante.bancoDeDados.JpaUtil;

public class AtendenteDAO {
	
	public static double getVendasTotal(Atendente atendente) {
		EntityManager entityManager = JpaUtil.getEntityManager();
		TypedQuery<Double> query = entityManager.createQuery("SELECT a.vendasTotal FROM Atendente a WHERE a = :atendente", Double.class);
		query.setParameter("atendente", atendente);
		Double vendasTotal = query.getSingleResult();
		JpaUtil.closeEntityManager();
		return vendasTotal != null ? vendasTotal: 0.0;
	}

}
