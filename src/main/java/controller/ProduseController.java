package controller;

import java.util.ArrayList;
import ro.utcn.is.lab2.entity.Produse;
import ro.utcn.is.lab2.repository.ProduseRepo;

public class ProduseController {

	private ArrayList<Produse> produse = new ArrayList<Produse>();
	private ProduseRepo pr = new ProduseRepo();
	
	public ProduseController() {
		
	}
	
	//aici trebuie o metoda prin care sa pui in lista "produse" toate produsele din baza de date
	//sa verifici si tu daca e ok cum am facut (daca am creat metodele in clasele potrivite)
	
	public ArrayList<Produse> gasesteProduse()
	{		
		produse = (ArrayList<Produse>) pr.findAll();
		return produse;
	}
}
