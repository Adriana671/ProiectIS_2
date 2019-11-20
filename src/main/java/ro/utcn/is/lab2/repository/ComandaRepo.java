package ro.utcn.is.lab2.repository;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import ro.utcn.is.lab2.entity.Comanda;

public class ComandaRepo {
	
	private EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("ro.tutorial.lab.IS"); 

	
	public void insert (Comanda com)
	{
		EntityManager entityManager = entityManagerFactory.createEntityManager();
		entityManager.getTransaction().begin();
		entityManager.merge(com);
		entityManager.getTransaction().commit();
		entityManager.close();
		
	}

}
