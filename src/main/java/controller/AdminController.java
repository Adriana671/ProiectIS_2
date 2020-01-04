package controller;

import java.util.ArrayList;
import java.util.List;

import gui.CreateAdminFrame;
import gui.GestioneazaClientiFrame;
import gui.ListaAdminiFrame;
import gui.ModificareClientFrame;
import ro.utcn.is.lab2.entity.User;
import ro.utcn.is.lab2.service.UserService;

public class AdminController {
	
	private static UserService us = new UserService();
	private static int idClModif;
	private static ModificareClientFrame mc = new ModificareClientFrame();
    private static GestioneazaClientiFrame gf = new GestioneazaClientiFrame();

	
	public static void gestClientiFrame()
	{
		GestioneazaClientiFrame gc = new  GestioneazaClientiFrame();
		List<User> clienti = new ArrayList<User>();
		clienti = us.findAll();
		for(User u : clienti)
		{
			if (u.getRol().equals("Client"))
			{
				gc.getTbModel().addRow(new Object[]{u.getId(), u.getName(), u.getAdresa(), u.getVarsta(), u.getEmail(), u.getPassword()});
			}
		}
		gc.setVisible(true);
	}
	
	
	public static void adaugaAdminFrame()
	{
		CreateAdminFrame ad = new CreateAdminFrame();
		ad.setVisible(true);
	}
	
	public static void createAdm(String nume, String address, int age, String email, String pass)
	{
		User u = new User();
		u.setRol("Admin");
		u.setName(nume);
		u.setAdresa(address);
		u.setVarsta(age);
		u.setEmail(email);
		u.setPassword(pass);

		us.insertUser(u);
		
		
	}
	
	public static void veziAdmFrame()
	{
		ListaAdminiFrame ad = new ListaAdminiFrame();
		
		List<User> users =  new ArrayList<User>();
		users= us.findAll();
		for(User u : users)
		{
			if(u.getRol().equals("Admin"))
			{
				ad.getTbModel().addRow(new Object[] {u.getName(), u.getEmail()});
			}
		}
		
		ad.setVisible(true);
	}
	
	public static void stergeClient(int id)
	{
		User u = us.findById(id);
		us.deleteUser(u);
		
		
		List<User> users = new ArrayList<>();
		users = us.findAll();
		
		int rowCount = gf.getTbModel().getRowCount();
		for (int i=rowCount-1; i>=0;i--)
		{
			gf.getTbModel().removeRow(i);
		}
		gf.getTable().revalidate();
		
		for (User p1: users)
		{
			gf.getTbModel().addRow(new Object[] {p1.getId(), p1.getName(), p1.getVarsta(),p1.getAdresa(),p1.getEmail()});
		}
		
	}
	
	
	public static void modifClient(int id)
	{
		User u = us.findById(id);
		idClModif = id;
		mc.getTextField().setText(u.getName());
		mc.getTextField_1().setText(u.getVarsta()+"");
		mc.getTextField_2().setText(u.getAdresa());
		mc.getTextField_3().setText(u.getEmail());
		
		mc.setVisible(true);
	}
	
	public static void modificareC()
	{
		User u = us.findById(idClModif);
		u.setName(mc.getTextField().getText());
		u.setVarsta(Integer.parseInt(mc.getTextField_1().getText()));
		u.setAdresa(mc.getTextField_2().getText());
		u.setEmail(mc.getTextField_3().getText());
		us.updateUser(u);
		
		List<User> users = new ArrayList<>();
		users = us.findAll();
		
		int rowCount = gf.getTbModel().getRowCount();
		for (int i=rowCount-1; i>=0;i--)
		{
			gf.getTbModel().removeRow(i);
		}
		gf.getTable().revalidate();
		
		for (User p1: users)
		{
			gf.getTbModel().addRow(new Object[] {p1.getId(), p1.getName(), p1.getVarsta(),p1.getAdresa(),p1.getEmail()});
		}
	}

}
