 package ro.utcn.is.lab2.start;


import gui.ViewClass;
import ro.utcn.is.lab2.entity.User;
import ro.utcn.is.lab2.repository.UserRepo;



public class ApplicationStart {



	public static void main(String[] args) {



		/**

		 * Testare aplicatie.

		 */

		  UserRepo ur = new UserRepo(); 

		  User user = new User(); 

		  user.setName("Jimmy");

		  //ur.insert(user);

		  

		  new ViewClass();

		  



	}

	

}