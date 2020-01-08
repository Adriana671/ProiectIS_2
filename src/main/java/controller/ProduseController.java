package controller;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;

import Validatori.StocMic;
import gui.AdaugareProdusFrame;
import gui.AdminFrame;
import gui.CreeazaPromoFrame;
import gui.DetaliiComandaFrame;
import gui.ModificareProdusFrame;
import gui.PromoFrame;
import ro.utcn.is.lab2.entity.Comanda;
import ro.utcn.is.lab2.entity.Produse;
import ro.utcn.is.lab2.entity.User;
import ro.utcn.is.lab2.service.ComandaService;
import ro.utcn.is.lab2.service.ProduseService;
import ro.utcn.is.lab2.service.UserService;

public class ProduseController {

	
	private static ProduseService ps = new ProduseService();
	private static UserService us = new UserService();
	private static ComandaService cs = new ComandaService();
	
	private static Set<Produse> produseCos = new HashSet<Produse>();
	private static List<Produse> produsePromo = new ArrayList<Produse>();
	private static AdminFrame af = new AdminFrame();
	private static PromoFrame pf = new PromoFrame();
	private static DetaliiComandaFrame detCom= new DetaliiComandaFrame();


	private static int idProdusModificat;
	private static int idPromo;
	

	public ProduseController() {
		
	}

	public static void adaugaInCos(int id)
	{
		Produse produs = ps.findById(id);
		
		try {
			
		
			if (produs.getCantitateProdus()==0)
			{
				throw new StocMic("Ne pare rau!Nu mai sunt produse pe stoc!");
			}
			else
			{
				produs.setCantitateProdus(produs.getCantitateProdus()-1);
				ps.updateProdus(produs);
				produseCos.add(produs);
			
			}
			
		}catch(StocMic e)
		{
			JOptionPane.showMessageDialog(new JPanel(), "Ne pare rau!Nu mai sunt produse pe stoc!");

		}
		
		
		
	}
	
	
	public static void veziCos()
	{
		DetaliiComandaFrame pf = new DetaliiComandaFrame();
				
		for(Produse p1: produseCos)
		{
			System.out.println(p1.getPretProdus());
			pf.getTbModel().addRow(new Object[] {p1.getId(),p1.getDenumireProdus(), p1.getCategorieProdus(), p1.getDescriereProdus(),p1.getCantitateProdus(), p1.getPretProdus()});

		}
		pf.setVisible(true);
	}
	
	
	public static void stergeProdus(int id)
	{
		Produse pNew = ps.findById(id);
		ps.deleteProdus(pNew);	
		
		//af.setVisible(true);
		
		List<Produse> pr = new ArrayList<>();
		pr = ps.findAll();
		
		DefaultTableModel md = new DefaultTableModel();
		
		for (Produse p1:pr)
		{
			md.addRow(new Object[] {p1.getId(),p1.getDenumireProdus(), p1.getCategorieProdus(), p1.getDescriereProdus(),p1.getCantitateProdus(), p1.getPretProdus()});
		}
			af.getTable().setModel(md);

		//af.getTable().fireTableDataChanged();

	
	}
	
	public static void addProdusFrame()
	{
		AdaugareProdusFrame addP = new AdaugareProdusFrame();
		addP.setVisible(true);
	}
	
	public static void addProdus(String denumire,String categorie, String descriere,  int cantitate,int pret )
	{
		Produse p = new Produse();
		p.setDenumireProdus(denumire);
		p.setDescriereProdus(descriere);
		p.setCategorieProdus(categorie);
		p.setCantitateProdus(cantitate);
		p.setPretProdus(pret);
		
		ps.insertProdus(p);
		


		//actualizare tabel
		List<Produse> pr = new ArrayList<>();
		pr = ps.findAll();
		for (Produse p1:pr)
		{
			af.getTbModel().addRow(new Object[] {p1.getId(),p1.getDenumireProdus(), p1.getCategorieProdus(), p1.getDescriereProdus(),p1.getCantitateProdus(), p1.getPretProdus()});
			
		}
		
	}
	
	public static void modifProdusFrame(int id)
	{
		Produse p = ps.findById(id);
		idProdusModificat = id;
		ModificareProdusFrame mf = new ModificareProdusFrame();
		mf.getTextField().setText(p.getDenumireProdus());
		mf.getTextField_1().setText(p.getCategorieProdus());
		mf.getTextField_2().setText(p.getDescriereProdus());
		mf.getTextField_3().setText(p.getCantitateProdus()+"");
		mf.getTextField_4().setText(p.getPretProdus()+"");
		
		mf.setVisible(true);
		
		
	}
	
	public static void modifProdus(String denumire,String categorie, String descriere,  int cantitate,int pret )
	{
		Produse p = ps.findById(idProdusModificat);
		
		p.setDenumireProdus(denumire);
		p.setDescriereProdus(descriere);
		p.setCategorieProdus(categorie);
		p.setCantitateProdus(cantitate);
		p.setPretProdus(pret);
		
		ps.updateProdus(p);
		
		List<Produse> pr = new ArrayList<>();
		pr = ps.findAll();
		
		
		DefaultTableModel tm = new DefaultTableModel();
		for (Produse p1:pr)
		{
			System.out.println(p1.getDenumireProdus());
			tm.addRow(new Object[] {p1.getId(),p1.getDenumireProdus(), p1.getCategorieProdus(), p1.getDescriereProdus(),p1.getCantitateProdus(), p1.getPretProdus()});
			//af.getTable().addRow(new Object[] {p1.getId(),p1.getDenumireProdus(), p1.getCategorieProdus(), p1.getDescriereProdus(),p1.getCantitateProdus(), p1.getPretProdus()});
		}
		
		af.getTable().setModel(tm);
		
		
	}
	
	public static void produsPromoFrame(int id)
	{
		Produse promo = ps.findById(id);
		idPromo=id;
		CreeazaPromoFrame prf = new CreeazaPromoFrame();
		prf.getTextField().setText(promo.getDenumireProdus());
		prf.getTextField_1().setText(promo.getPretProdus()+"");
		
		prf.setVisible(true);
		
	}
	
	public static void veziPromo()
	{
		PromoFrame pf = new PromoFrame();
		
		int rowCount = pf.getTbModel().getRowCount();
		for (int i=rowCount-1; i>=0;i--)
		{
			pf.getTbModel().removeRow(i);
		}
		pf.getTable().revalidate();
		
		for(Produse p: produsePromo)
		{
			pf.getTbModel().addRow(new Object[] {p.getId(),p.getDenumireProdus(),p.getCategorieProdus(), p.getDescriereProdus(),p.getCantitateProdus(),p.getPretProdus()});
		}
		
		pf.setVisible(true);	
	}
	
	
	public static void addPromo(int pretNou)
	{
		Produse promo = ps.findById(idPromo);
		try 
		{
			promo.setPretProdus(pretNou);
			ps.updateProdus(promo);
			produsePromo.add(promo);
			
			int rowCount = pf.getTbModel().getRowCount();
			for (int i=rowCount-1; i>=0;i--)
			{
				pf.getTbModel().removeRow(i);
			}
			pf.getTable().revalidate();
			
			for (Produse p1:produsePromo)
			{
				pf.getTbModel().addRow(new Object[] {p1.getId(),p1.getDenumireProdus(), p1.getCategorieProdus(), p1.getDescriereProdus(),p1.getCantitateProdus(), p1.getPretProdus()});
			}
			

		}
		catch(NullPointerException e)
		{
			JOptionPane.showMessageDialog(new JPanel(), "Trebuie completate toate casutele!");
		}
		catch(NumberFormatException e)
		{
			JOptionPane.showMessageDialog(new JPanel(), "Cantitate introdusa gresit");
		}
	}
	
	public static void finalizareComanda(String tipPlata)
	{
		
		Comanda com = new Comanda();
		Date date =new Date();
		
		SimpleDateFormat formatter = new SimpleDateFormat("dd-MM-yyyy HH:mm:ss");
		com.setData(date);
		int nrProduse = produseCos.size();
		com.setNrProduse(nrProduse);
		com.setTipPlata(tipPlata);
		
		int valoare=0;
		User u1 = new User();
		
		for(Produse p:produseCos)
		{
			valoare=valoare + p.getPretProdus();
		}
		com.setProduse(produseCos);
		com.setValoare(valoare);
		
		List<User> users = new ArrayList<User>();
		users = us.findAll();
		
		for(User u:users)
		{
			if(u.getName().equals(LoginController.numeClient))
			{
				u1 =u;
			}
		}
	
		
		com.setUser(u1);
		
		cs.insertComanda(com);
		
		
		produseCos = new HashSet<Produse>();
	}
	
	
}
	
	

