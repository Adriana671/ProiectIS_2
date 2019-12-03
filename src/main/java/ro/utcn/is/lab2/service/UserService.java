package ro.utcn.is.lab2.service;

import javax.swing.JOptionPane;
import javax.swing.JPanel;

import Validatori.EmailIncorect;
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
				throw new VarstaPreaMica("Varsta este pre mica.");
			}
			
			if(user.getAdresa().matches(pattern)==false)
			{
				throw new EmailIncorect("Emai-ul are un format gresit!");
			}
			
			userRepo.insert(user);
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

}
