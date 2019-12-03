 package ro.utcn.is.lab2.start;

<<<<<<< HEAD
import ro.utcn.is.lab2.entity.User;
=======
import com.mysql.jdbc.Connection;
import com.mysql.jdbc.PreparedStatement;

import ro.utcn.is.lab2.entity.Comanda;
import ro.utcn.is.lab2.entity.Produse;
import ro.utcn.is.lab2.entity.User;
import ro.utcn.is.lab2.repository.ComandaRepo;
import ro.utcn.is.lab2.repository.ProduseRepo;
>>>>>>> ff6f759cb80ad67d748908df2504822cc8c509d1
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
<<<<<<< HEAD
		  com.setNrProduse(5);
		  cr.insert(com);*/
		  
		UserService us = new UserService();
		user.setVarsta(12);
		
		us.insertUser(user);
=======
		//  com.setNrProduse(5);
		//  cr.insert(com);*/
>>>>>>> ff6f759cb80ad67d748908df2504822cc8c509d1

		  ProduseRepo pr = new ProduseRepo();
		  Produse prod = new Produse();
	}
	
}
