package ro.utcn.is.lab2.repository;

import java.util.ArrayList;
import java.util.List;

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
	List<Comanda> listaComenzi = new ArrayList<Comanda>();
	
	public List<Comanda> findAll()
	{
		EntityManager entityManager = entityManagerFactory.createEntityManager();

		entityManager.getTransaction().begin();
		listaComenzi= entityManager.createQuery("from Comanda").getResultList();
		entityManager.getTransaction().commit();
		entityManager.close();
		return listaComenzi;
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
