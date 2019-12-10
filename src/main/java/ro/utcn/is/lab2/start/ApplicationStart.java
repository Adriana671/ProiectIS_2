 package ro.utcn.is.lab2.start;


import java.util.ArrayList;
import java.util.List;

import ro.utcn.is.lab2.entity.Produse;
import ro.utcn.is.lab2.entity.User;
import ro.utcn.is.lab2.repository.UserRepo;
import ro.utcn.is.lab2.service.ProduseService;
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

	}
	
}
