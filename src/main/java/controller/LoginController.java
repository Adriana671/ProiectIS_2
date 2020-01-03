package controller;


import gui.ClientFrame;
import gui.LoginFrame;

public class LoginController {

	public static void loginUser()
	{
		
		LoginFrame l = new LoginFrame();
		l.setVisible(true);
		
	}
	
	public static void userFrame()
	{
		
		ClientFrame cf = new ClientFrame();
		cf.setVisible(true);
		
	}
	
}
