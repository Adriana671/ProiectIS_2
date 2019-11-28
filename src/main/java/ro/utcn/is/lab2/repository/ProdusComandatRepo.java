package ro.utcn.is.lab2.repository;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import ro.utcn.is.lab2.entity.ProdusComandat;
import ro.utcn.is.lab2.entity.Produse;

public class ProdusComandatRepo {

	private EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("ro.tutorial.lab.IS");
	
	public void insert(ProdusComandat produsCom) {
		
		EntityManager entityManager = entityManagerFactory.createEntityManager();
		entityManager.getTransaction().begin();
		entityManager.merge(produsCom);
		entityManager.getTransaction().commit();
		entityManager.close();
	}
	
	public ProdusComandat findById(int id)
	{
		ProdusComandat produsCom = null;
		EntityManager entityManager = entityManagerFactory.createEntityManager();
		produsCom=entityManager.find(ProdusComandat.class, id);
		
		System.out.println(produsCom);
		
		return produsCom;
	}
	
	public void delete(int id)
	{
		EntityManager entityManager = entityManagerFactory.createEntityManager();
		ProdusComandat produsCom = entityManager.find(ProdusComandat.class, id);
		
		entityManager.getTransaction().begin();
		entityManager.remove(produsCom);
		entityManager.getTransaction().commit();
		entityManager.close();
		
	}
}
