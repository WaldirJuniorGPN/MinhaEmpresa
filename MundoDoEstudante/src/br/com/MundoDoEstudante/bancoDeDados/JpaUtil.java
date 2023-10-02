package br.com.MundoDoEstudante.bancoDeDados;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public final class JpaUtil {

	private static final String PERSISTENCE_UNIT = "MundoPU";
	private static ThreadLocal<EntityManager> threadEntityManager = new ThreadLocal<>();
	private static EntityManagerFactory factory;

	public static EntityManager getEntityManager() {
		if (factory == null) {
			try {
				factory = Persistence.createEntityManagerFactory(PERSISTENCE_UNIT);
			} catch (Exception e) {
				throw new RuntimeException("Erro ao criar o EntityManagerFactory: " + e.getMessage(), e);
			}
		}

		EntityManager entityManager = threadEntityManager.get();

		if (entityManager == null || !entityManager.isOpen()) {
			try {
				entityManager = factory.createEntityManager();
				JpaUtil.threadEntityManager.set(entityManager);
			} catch (Exception e) {
				throw new RuntimeException("Erro ao criar o EntityManager: " + e.getMessage(), e);
			}
		}

		return entityManager;
	}

	public static void closeEntityManager() {
		EntityManager em = threadEntityManager.get();

		if (em != null) {
			EntityTransaction transaction = em.getTransaction();

			try {
				if (transaction.isActive()) {
					transaction.commit();
				}
			} catch (Exception e) {
				throw new RuntimeException("Erro ao realizar o commit da transação: " + e.getMessage(), e);
			} finally {
				try {
					em.close();
				} catch (Exception e) {
					throw new RuntimeException("Erro ao fechar o EntityManager: " + e.getMessage(), e);
				}
				threadEntityManager.set(null);
			}
		}
	}

	public static void closeEntityManagerFactory() {
		closeEntityManager();

		if (factory != null) {
			try {
				factory.close();
			} catch (Exception e) {
				throw new RuntimeException("Erro ao fechar o EntityManagerFactory: " + e.getMessage(), e);
			}
		}
	}

}
