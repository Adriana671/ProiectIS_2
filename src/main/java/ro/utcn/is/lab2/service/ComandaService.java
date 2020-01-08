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
	
	public void insertComanda(Comanda com)
	{

			cp.insert(com);
			JOptionPane.showMessageDialog(new JPanel(),"Comanda efectuata cu succes!");

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
