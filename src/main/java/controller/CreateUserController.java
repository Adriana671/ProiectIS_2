package controller;

import gui.CreateNewAccount;
import ro.utcn.is.lab2.entity.User;
import ro.utcn.is.lab2.service.UserService;

public class CreateUserController {
	
	private static UserService service = new UserService();
	
	public static void createAcc()
	{
		
		CreateNewAccount ac = new CreateNewAccount();
		ac.setVisible(true);
		
	}
	
	public static void createUser(String name,String adress, int age,  String email, String pass)
	{
		User us1 = new User();
		us1.setName(name);
		us1.setAdresa(adress);
		us1.setVarsta(age);
		us1.setEmail(email);
		us1.setPassword(pass);
		us1.setRol("Client");
		service.insertUser(us1);
		
	}

}
