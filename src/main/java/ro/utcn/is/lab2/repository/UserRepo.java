package ro.utcn.is.lab2.repository;


import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import ro.utcn.is.lab2.entity.User;

public class UserRepo {

	/**
	 * Cream un entity manager factory cu denumirea <persistence-unit> din persistence.xml (--> a se vedea randul 6).
	 */
	private EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("ro.tutorial.lab.IS"); 
	
    
	public void insert(User user) {
		/**
		 * Pentru fiecare metoda se instantiaza un entiy manager din EMF-ul de mai sus.
		 */
		EntityManager entityManager = entityManagerFactory.createEntityManager();
		/**
		 * Denota ca ca incepe o operatie pe baza de date
		 */
		entityManager.getTransaction().begin();
		/**
		 * Declaram operatia sau operatiile ce se vor face pe BD.
		 */
		entityManager.merge(user);
		/**
		 * Executam operatia.
		 */
		entityManager.getTransaction().commit();
		/**
		 * Inchidem EM-ul. Ca la operatii pe fisiere, il deschizi, il citesti si in final il inchizi.
		 */
		entityManager.close();

	}
	
	public User findById(int id)
	{
		User us1 = null;
		EntityManager entityManager = entityManagerFactory.createEntityManager();
		
		us1=entityManager.find(User.class, id);
		
		System.out.println(us1);
		
		return us1;
		
		
		
	}
	
	public void delete(int id)
	{
		EntityManager entityManager = entityManagerFactory.createEntityManager();
		User us1 = entityManager.find(User.class, id);
		/// EXCEPTIE DE PRINS DACA NU SE GASESTE USERU-UL, 
		/// IN NIVELUL URAMTOR --> SERVICE
		entityManager.getTransaction().begin();
		entityManager.remove(us1);
		entityManager.getTransaction().commit();
		entityManager.close();
		
	}
}
