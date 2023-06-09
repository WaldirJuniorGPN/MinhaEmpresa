package br.com.MundoDoEstudante.classes;

import java.math.BigDecimal;

import javax.persistence.EntityManager;
import javax.persistence.EntityTransaction;
import javax.persistence.TypedQuery;

import br.com.MundoDoEstudante.bancoDeDados.JpaUtil;

public class AtendenteDAO {

	public static BigDecimal getVendasTotal(Atendente atendente) {
		EntityManager entityManager = JpaUtil.getEntityManager();
		TypedQuery<BigDecimal> query = entityManager
				.createQuery("SELECT a.vendasTotal FROM Atendente a WHERE a = :atendente", BigDecimal.class);
		query.setParameter("atendente", atendente);
		BigDecimal vendasTotal = query.getSingleResult();
		JpaUtil.closeEntityManager();
		return vendasTotal != null ? vendasTotal : BigDecimal.ZERO;
	}

	public static void salvarGratificacao(Atendente atendente, BigDecimal valor) {
		EntityManager entityManager = JpaUtil.getEntityManager();
		EntityTransaction transaction = entityManager.getTransaction();

		try {
			if (!transaction.isActive()) {
				transaction.begin();
			}
			Atendente atendenteAtualizado = entityManager.find(Atendente.class, atendente.getId());
			atendenteAtualizado.setGraficacaoSemanal(valor);
			atendenteAtualizado.setGratificacaoTotal(atendenteAtualizado.getGratificacaoTotal().add(valor));
			transaction.commit();

		} catch (Exception e) {
			if (transaction != null && transaction.isActive()) {
				transaction.rollback();
			}
			throw new RuntimeException("Erro salvar a gratificacao: " + e.getMessage(), e);
		} finally {
			JpaUtil.closeEntityManager();
		}
	}

	public static void save(Atendente atendente) {
		EntityManager entityManager = JpaUtil.getEntityManager();
		EntityTransaction transaction = entityManager.getTransaction();

		try {
			transaction.begin();
			entityManager.persist(atendente);
			transaction.commit();
		} catch (Exception e) {
			if (transaction != null && transaction.isActive()) {
				transaction.rollback();
			}
			throw new RuntimeException("Erro ao salvar o atendente no banco " + e.getMessage(), e);
		}
	}

}
