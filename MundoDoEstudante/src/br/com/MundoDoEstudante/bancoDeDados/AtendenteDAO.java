package br.com.MundoDoEstudante.bancoDeDados;

import java.math.BigDecimal;

import javax.persistence.EntityManager;
import javax.persistence.EntityTransaction;
import javax.persistence.TypedQuery;

import br.com.MundoDoEstudante.modelos.Atendente;

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

	public static void limparTabela() {

		if (tabelaExiste()) {

			EntityManager entityManager = JpaUtil.getEntityManager();
			EntityTransaction transaction = entityManager.getTransaction();

			try {
				transaction.begin();
				entityManager.createNativeQuery("DROP TABLE IF EXISTS Atendente").executeUpdate();
				transaction.commit();
			} catch (Exception e) {
				if (transaction != null && transaction.isActive()) {
					transaction.rollback();
				}
				throw new RuntimeException("Erro ao limpar dados na tabela" + e.getMessage(), e);
			} finally {
				entityManager.close();
			}
		} else {
			System.out.println("Não existe tabela Atendente no banco de dados");
		}
	}

	private static boolean tabelaExiste() {
		EntityManager entityManager = JpaUtil.getEntityManager();
		try {
			entityManager.createNativeQuery("SELECT 1 FROM Atendente").getSingleResult();
			return true;
		} catch (Exception e) {
			return false;
		}
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
			throw new RuntimeException("Erro ao salvar a gratificacao: " + e.getMessage(), e);
		} finally {
			JpaUtil.closeEntityManager();
		}
	}

	public static void adicionarVendasTotal(Atendente atendente, BigDecimal vendasTotal) {
		EntityManager entityManager = JpaUtil.getEntityManager();
		EntityTransaction transaction = entityManager.getTransaction();

		try {
			transaction.begin();
			Atendente atendenteAtualizado = entityManager.find(Atendente.class, atendente.getId());
			atendenteAtualizado.setVendasTotal(atendenteAtualizado.getVendasTotal().add(vendasTotal));
			transaction.commit();
		} catch (Exception e) {
			if (transaction != null && transaction.isActive()) {
				transaction.rollback();
			}
			throw new RuntimeException("Erro ao adicionar vendas totais " + e.getMessage(), e);
		} finally {
			JpaUtil.closeEntityManager();
		}
	}

}
