package ro.utcn.is.lab2.repository;

import java.util.ArrayList;
import java.util.List;

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
	
	List<Produse> listaProduse = new ArrayList<Produse>();
	
	
	public List<Produse> findAll()
	{
		EntityManager entityManager = entityManagerFactory.createEntityManager();

		entityManager.getTransaction().begin();
		listaProduse= entityManager.createQuery("from Produse").getResultList();
		entityManager.getTransaction().commit();
		entityManager.close();
		return listaProduse;
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
		entityManager.getTransaction().begin();
		entityManager.remove(entityManager.contains(prod) ? prod : entityManager.merge(prod));
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
