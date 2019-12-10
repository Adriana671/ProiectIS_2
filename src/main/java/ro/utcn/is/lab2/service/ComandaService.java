package ro.utcn.is.lab2.service;

import java.util.List;

import javax.swing.JOptionPane;
import javax.swing.JPanel;

import Validatori.StocMic;
import ro.utcn.is.lab2.entity.Comanda;
import ro.utcn.is.lab2.entity.Produse;
import ro.utcn.is.lab2.repository.ComandaRepo;

public class ComandaService {

	private ComandaRepo cp = new ComandaRepo();
	private int cantitateDorita;
	
	public void insertComanda(Comanda com)
	{
		try {
			/// sa se verifice la fiecare produs pe rand, altfel cantotateaDorita ramane la fel, a ultimului produs
			for(Produse p : com.getProduse())
			{
				if (p.getCantitateProdus()<cantitateDorita)
				{
					throw new StocMic("Nu exista atatea produse pe stoc.");
				}
			}
			cp.insert(com);
		}
		
		catch(StocMic s)
		{
			JOptionPane.showMessageDialog(new JPanel(),"Nu exista atatea produse pe stoc.");
		}
	}
	
	public List<Comanda> findAll()
	{
		return cp.findAll();
	}
	
	public Comanda findById(int id)
	{
		return cp.findById(id);
	}
	
	public void deleteComanda(Comanda com)
	{
		cp.deleteComanda(com);
	}
	
	public void updateComanda(Comanda com)
	{
		cp.updateComanda(com);
	}
	
	
	
	
}
