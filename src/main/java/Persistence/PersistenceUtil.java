package Persistence;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import java.io.Serializable;

public class PersistenceUtil implements Serializable {
	private static final long serialVersionUID = 1L;

	protected static EntityManagerFactory entityManagerFactory =
					Persistence.createEntityManagerFactory("gaaManagementSystem");

	public static void persist(Object entity) {
		EntityManager entityManager = entityManagerFactory.createEntityManager();
		entityManager.getTransaction().begin();
		entityManager.persist(entity);
		entityManager.getTransaction().commit();
		entityManager.close();
	}
}