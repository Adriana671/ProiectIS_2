package controller;


import java.util.ArrayList;
import java.util.List;

import javax.swing.JOptionPane;
import javax.swing.JPanel;

import Validatori.ParolaGresita;
import gui.AdminFrame;
import gui.AdminLoginFrame;
import gui.ClientFrame;
import gui.InfoClientFrame;
import gui.LoginFrame;
import ro.utcn.is.lab2.entity.Produse;
import ro.utcn.is.lab2.entity.User;
import ro.utcn.is.lab2.service.ProduseService;
import ro.utcn.is.lab2.service.UserService;

public class LoginController {
	
	private static UserService us = new UserService();
	private static ProduseService ps = new ProduseService();
	
	private static List<User> users = new ArrayList<>();
	public static String numeClient = new String();
	

	public static void loginUser()
	{
		
		LoginFrame l = new LoginFrame();
		l.setVisible(true);
		
	}
	


	public static void loginAdmin()
	{
		AdminLoginFrame ad = new AdminLoginFrame();
		ad.setVisible(true);
	}
	
	
	public static void adminFrame(String name, String password)
	{
		List<User> users = new ArrayList<>();
		users = us.findAll();
		
		try {
			for(User u1 : users)
			{
				if(u1.getRol().equals("Admin"))
					{
						if(u1.getName().equals(name))
						{
							if (u1.getPassword().equals(password))
							{
								AdminFrame af = new AdminFrame();
								af.setVisible(true);
								List<Produse> pr = new ArrayList<>();
								pr = ps.findAll();
								
								for (Produse p1:pr)
								{
									af.getTable().addRow(new Object[] {p1.getId(),p1.getDenumireProdus(), p1.getCategorieProdus(), p1.getDescriereProdus(),p1.getCantitateProdus(), p1.getPretProdus()});
								}
							}
							
							else 
							{
								throw new ParolaGresita("Parola gresita. Incercati din nou!");
							}
						}
					}

			}
							
		}
		catch(ParolaGresita a)
		{
			JOptionPane.showMessageDialog(new JPanel(),"Parola gresita. Incercati din nou!");

		}
			
		
	}
	
	public static void userFrame(String name, String password)
	{
		
		users = us.findAll();
		numeClient = name;
		try {
			for(User u1 : users)
			{
				if(u1.getRol().equals("Client"))
					{
						if(u1.getName().equals(name))
						{
							if (u1.getPassword().equals(password))
							{
								ClientFrame cf = new ClientFrame();
								cf.setVisible(true);
								List<Produse> pr = new ArrayList<>();
								pr = ps.findAll();
								
								for (Produse p1:pr)
								{
									cf.getTable().addRow(new Object[] {p1.getId(),p1.getDenumireProdus(), p1.getCategorieProdus(), p1.getDescriereProdus(),p1.getCantitateProdus(), p1.getPretProdus()});
								}
							}
							
							else 
							{
								throw new ParolaGresita("Parola gresita. Incercati din nou!");
							}
						}
					}

			}
							
		}
		catch(ParolaGresita a)
		{
			JOptionPane.showMessageDialog(new JPanel(),"Parola gresita. Incercati din nou!");

		}
			
	}
	
	public static void infoClient()
	{
		users = us.findAll();
		InfoClientFrame info = new InfoClientFrame();

		for(User u : users)
		{
			if (u.getName().equals(numeClient))
			{
				info.getTextField().setText(u.getName());
				info.getTextField_1().setText(u.getAdresa());
				info.getTextField_2().setText(u.getVarsta()+"");
				info.getTextField_3().setText(u.getEmail());				
				info.getTxtAstaNuIs().setText(u.getPassword());
			}
		}
		info.setVisible(true);
		
	}
	
	
	
}
