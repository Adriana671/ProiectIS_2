package controller;

import java.util.ArrayList;
import java.util.List;

import gui.CreateNewAccount;
import gui.GestioneazaClientiFrame;
import ro.utcn.is.lab2.entity.User;
import ro.utcn.is.lab2.service.UserService;

public class CreateUserController {
	
	private static UserService service = new UserService();
    private static GestioneazaClientiFrame gf = new GestioneazaClientiFrame();

	
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
		
		List<User> users = new ArrayList<>();
		users = service.findAll();
		
		for (User p1: users)
		{
			gf.getTbModel().addRow(new Object[] {p1.getId(), p1.getName(), p1.getVarsta(),p1.getAdresa(),p1.getEmail()});
		}
		
	}

}
