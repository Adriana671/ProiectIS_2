package ro.utcn.is.lab2.repository;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import ro.utcn.is.lab2.entity.Comanda;
import ro.utcn.is.lab2.entity.Produse;

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
	
	public Comanda findById(int id)
	{
		Comanda com = null;
		EntityManager entityManager = entityManagerFactory.createEntityManager();
		com=entityManager.find(Comanda.class, id);
		System.out.println(com);
		
		return com;
	}
	
	public void deleteComanda(Comanda com)
	{
		EntityManager entityManager = entityManagerFactory.createEntityManager();
		//Produse prod = entityManager.find(Produse.class, id);
		entityManager.getTransaction().begin();
		entityManager.remove(com);
		entityManager.getTransaction().commit();
		entityManager.close();
	}
	
	public void updateComanda(Comanda com)
	{
		EntityManager entityManager = entityManagerFactory.createEntityManager();

		entityManager.getTransaction().begin();
		entityManager.merge(com);
		entityManager.getTransaction().commit();
		entityManager.close();
	}

}
