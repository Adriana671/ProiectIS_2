 package ro.utcn.is.lab2.start;


import ro.utcn.is.lab2.entity.User;

import com.mysql.jdbc.Connection;
import com.mysql.jdbc.PreparedStatement;

import ro.utcn.is.lab2.entity.Comanda;
import ro.utcn.is.lab2.entity.Produse;
import ro.utcn.is.lab2.entity.User;
import ro.utcn.is.lab2.repository.ComandaRepo;
import ro.utcn.is.lab2.repository.ProduseRepo;

import ro.utcn.is.lab2.repository.UserRepo;
import ro.utcn.is.lab2.service.UserService;

public class ApplicationStart {

	public static void main(String[] args) {

		/**
		 * Testare aplicatie.
		 */
		  UserRepo ur = new UserRepo(); 
		  User user = new User(); 
		  user.setName("Jimmy");
		  //ur.insert(user);
		  
		  ComandaRepo cr = new ComandaRepo();
		  Comanda com = new Comanda();

		  com.setNrProduse(5);
		  cr.insert(com);
		  
		UserService us = new UserService();
		user.setVarsta(12);
		
		us.insertUser(user);



		  ProduseRepo pr = new ProduseRepo();
		  Produse prod = new Produse();
	}
	
}
