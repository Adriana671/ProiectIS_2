package ro.utcn.is.lab2.repository;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import ro.utcn.is.lab2.entity.Produse;

public class ProduseRepo {

	private EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("ro.tutorial.lab.IS"); 
    
	public void insert(Produse produs) {
		
		EntityManager entityManager = entityManagerFactory.createEntityManager();
		entityManager.getTransaction().begin();
		entityManager.merge(produs);
		entityManager.getTransaction().commit();
		entityManager.close();
	}
	
	public Produse findById(int id)
	{
		Produse prod = null;
		EntityManager entityManager = entityManagerFactory.createEntityManager();
		prod=entityManager.find(Produse.class, id);
		System.out.println(prod);
		
		return prod;
	}
	
	public void deleteProdus(Produse prod)
	{
		EntityManager entityManager = entityManagerFactory.createEntityManager();
		//Produse prod = entityManager.find(Produse.class, id);
		entityManager.getTransaction().begin();
		entityManager.remove(prod);
		entityManager.getTransaction().commit();
		entityManager.close();
	}
	
	public void updateProdus(Produse prod)
	{
		EntityManager entityManager = entityManagerFactory.createEntityManager();

		entityManager.getTransaction().begin();
		entityManager.merge(prod);
		entityManager.getTransaction().commit();
		entityManager.close();
	}
}
