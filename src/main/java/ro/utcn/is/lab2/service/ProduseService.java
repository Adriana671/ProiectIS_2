package ro.utcn.is.lab2.service;

import java.util.List;

import javax.swing.JOptionPane;
import javax.swing.JPanel;

import Validatori.CantitateNegativa;
import Validatori.PretNegativ;
import ro.utcn.is.lab2.entity.Produse;
import ro.utcn.is.lab2.repository.ProduseRepo;

public class ProduseService {
	
	private ProduseRepo pr = new ProduseRepo();
	

	public void insertProdus(Produse prod)
	{
		try 
		{
			if(prod.getCantitateProdus() < 0)
			{
				throw new CantitateNegativa("Nu se poate introduce un stoc negativ.");
			}
			
			if(prod.getPretProdus() < 0)
			{
				throw new PretNegativ("Un produs nu poate avea pret negativ.");
			}
			pr.insert(prod);
			JOptionPane.showMessageDialog(new JPanel(), "Produs adaugat cu succes!");

		}
		catch(NullPointerException e)
		{
			JOptionPane.showMessageDialog(new JPanel(),"Trebuie completate toate casutele");
		}
		catch(CantitateNegativa e)
		{
			JOptionPane.showMessageDialog(new JPanel(),"Nu se poate introduce un stoc negativ.");
		}
		catch(PretNegativ e)
		{
			JOptionPane.showMessageDialog(new JPanel(),"Un produs nu poate avea pret negativ.");
		}
	}
	
	public List<Produse> findAll()
	{
		return pr.findAll();
	}
	
	public Produse findById(int id)
	{
		return pr.findById(id);
	}
	
	public void deleteProdus(Produse prod)
	{
		pr.deleteProdus(prod);
		JOptionPane.showMessageDialog(new JPanel(), "Produs sters cu succes!");

	}
	
	public void updateProdus(Produse prod)
	{
		pr.updateProdus(prod);
		JOptionPane.showMessageDialog(new JPanel(), "Produs modificat!");

	}
}
