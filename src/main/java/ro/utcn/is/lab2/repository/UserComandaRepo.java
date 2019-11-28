package ro.utcn.is.lab2.repository;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import ro.utcn.is.lab2.entity.ProdusComandat;
import ro.utcn.is.lab2.entity.UserComanda;

public class UserComandaRepo {

private EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("ro.tutorial.lab.IS");
	
	public void insert(UserComanda userCom) {
		
		EntityManager entityManager = entityManagerFactory.createEntityManager();
		entityManager.getTransaction().begin();
		entityManager.merge(userCom);
		entityManager.getTransaction().commit();
		entityManager.close();
	}
	
	public UserComanda findById(int id)
	{
		UserComanda userCom = null;
		EntityManager entityManager = entityManagerFactory.createEntityManager();
		userCom=entityManager.find(UserComanda.class, id);
		System.out.println(userCom);
		
		return userCom;
	}
	
	public void delete(int id)
	{
		EntityManager entityManager = entityManagerFactory.createEntityManager();
		UserComanda userCom = entityManager.find(UserComanda.class, id);
		entityManager.getTransaction().begin();
		entityManager.remove(userCom);
		entityManager.getTransaction().commit();
		entityManager.close();
		
	}
}
