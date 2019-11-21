 package ro.utcn.is.lab2.start;

import com.mysql.jdbc.Connection;
import com.mysql.jdbc.PreparedStatement;

import ro.utcn.is.lab2.entity.Comanda;
import ro.utcn.is.lab2.entity.User;
import ro.utcn.is.lab2.repository.ComandaRepo;
import ro.utcn.is.lab2.repository.UserRepo;

public class ApplicationStart {

	public static void main(String[] args) {

		/**
		 * Testare aplicatie.
		 */
		  UserRepo ur = new UserRepo(); 
		  User user = new User(); 
		  user.setName("Jimmy");
		  ur.insert(user);
		  
		  ur.delete(3);
		  
		  ComandaRepo cr = new ComandaRepo();
		  Comanda com = new Comanda();
		  com.setNrProduse(5);
		  cr.insert(com);

	}
	
}
