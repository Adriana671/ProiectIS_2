package ro.utcn.is.lab2.service;

import java.util.List;

import javax.swing.JOptionPane;
import javax.swing.JPanel;

import Validatori.EmailIncorect;
import Validatori.UserInexistent;
import Validatori.VarstaPreaMica;
import ro.utcn.is.lab2.entity.User;
import ro.utcn.is.lab2.repository.UserRepo;

public class UserService {
	
	private UserRepo userRepo = new UserRepo();
	
	
	public void insertUser(User user) 
	{
		String pattern = new String("\\w+@\\w+.\\w+");
		try 
		{
			if(user.getVarsta() < 14 )
			{
				throw new VarstaPreaMica("Varsta este prea mica.");
			}
			
			if(user.getAdresa().matches(pattern)==false)
			{
				throw new EmailIncorect("Emai-ul are un format gresit!");
			}
			
			userRepo.insert(user);
		}
		catch(NullPointerException e)
		{
			JOptionPane.showMessageDialog(new JPanel(), "Trebuie completate toate casutele");

		}
		catch(VarstaPreaMica v)
		{
			JOptionPane.showMessageDialog(new JPanel(), "Varsta este prea mica");
		}
		
		catch(EmailIncorect e)
		{
			JOptionPane.showMessageDialog(new JPanel(), "Emai-ul are un format gresit!");

			
		}
		

	}
	
	public void deleteUser(User user)
	{
		List us = userRepo.findAll();
		try {
			if(us.contains(user))
				{
					System.out.println("se sterge user");
					userRepo.delete(user);
				}
				else
				{
					System.out.println("nu exista user");

					throw new UserInexistent("Userul nu mai exista!");
				}
		}catch (UserInexistent i)
		{
			JOptionPane.showMessageDialog(new JPanel(), "Userul nu mai exista");
		}
		
		
	}
	
	/////findById de implementat inca 
	public User findById(int id)
	{
		return userRepo.findById(id);
	}
	
	public List<User> findAll()
	{		
		return userRepo.findAll();
	}
	
	public void updateUser(User us)
	{
		userRepo.updateUser(us);
	}

}
