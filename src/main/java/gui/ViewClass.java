package gui;

import java.awt.Color;
import java.awt.Font;
import java.awt.Image;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JTextField;
import javax.swing.SwingConstants;

import controller.LoginController;
import javax.swing.JLabel;
import javax.swing.JComboBox;
import javax.swing.JTextPane;
import java.awt.SystemColor;

public class ViewClass {

	private JFrame frmProiect;
	private JTextField txtImagineaTaConteaza;
	private LoginController loginContr = new LoginController();
	public ViewClass() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frmProiect = new JFrame();
		frmProiect.getContentPane().setBackground(Color.BLACK);
		frmProiect.setTitle("Magazin");
		frmProiect.setBackground(Color.BLACK);
		frmProiect.setBounds(100, 100, 674, 422);
		frmProiect.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frmProiect.getContentPane().setLayout(null);
		
		txtImagineaTaConteaza = new JTextField();
		txtImagineaTaConteaza.setFont(new Font("Century Schoolbook", Font.BOLD | Font.ITALIC, 13));
		txtImagineaTaConteaza.setHorizontalAlignment(SwingConstants.CENTER);
		txtImagineaTaConteaza.setBackground(new Color(0, 0, 0));
		txtImagineaTaConteaza.setForeground(new Color(255, 255, 255));
		txtImagineaTaConteaza.setText("Imaginea ta conteaza!");
		txtImagineaTaConteaza.setBounds(187, 58, 213, 25);
		frmProiect.getContentPane().add(txtImagineaTaConteaza);
		txtImagineaTaConteaza.setColumns(10);
		
		//buton care arata toate produsele
		//cand este actionat acest buton se deschide un new frame de tipul ProduseView unde se afiseaza toate produsele din magazin
		JButton btnProduseNoi = new JButton("PRODUSE");
		btnProduseNoi.setBackground(Color.BLACK);
		btnProduseNoi.setForeground(Color.WHITE);
		btnProduseNoi.setFont(new Font("Perpetua Titling MT", Font.BOLD | Font.ITALIC, 12));
		btnProduseNoi.setBounds(31, 110, 107, 25);
		frmProiect.getContentPane().add(btnProduseNoi);
		
		
		//buton care arata toate hainele din magazin
		JButton btnHaine = new JButton("Haine");
		btnHaine.setForeground(Color.WHITE);
		btnHaine.setBackground(Color.BLACK);
		btnHaine.setFont(new Font("Perpetua Titling MT", Font.BOLD | Font.ITALIC, 12));
		btnHaine.setBounds(159, 110, 102, 25);
		frmProiect.getContentPane().add(btnHaine);
		
		
		//buton care arata toata incaltamintea din magazin
		JButton btnNewButton = new JButton("Incaltaminte");
		btnNewButton.setForeground(Color.WHITE);
		btnNewButton.setBackground(Color.BLACK);
		btnNewButton.setFont(new Font("Perpetua Titling MT", Font.BOLD | Font.ITALIC, 12));
		btnNewButton.setBounds(279, 110, 161, 25);
		frmProiect.getContentPane().add(btnNewButton);
		

		//buton de inregistrare pentru admin sau client 
		//cand este apasat acest buton se deschide un npu frame de tipul LoginFrame
		JButton btnNewButton_1 = new JButton("Login");
		btnNewButton_1.setFont(new Font("Times New Roman", Font.BOLD, 14));
		btnNewButton_1.setBounds(501, 27, 132, 32);
		frmProiect.getContentPane().add(btnNewButton_1);
		
  	    //btnNewButton_1.addActionListener(e-> loginContr.loginUser("aa", "bb"));

		//buton pentru produse noi/oferta

		//btnNewButton_1.addActionListener(e-> loginContr.loginUser());

		//btnNewButton_1.addActionListener(e-> loginContr.loginUser("aa", "bb"));
		//btnNewButton_1.addActionListener(e -> loginContr.loginUser());

		
		//buron pentru produse noi/oferta
		JButton btnProduseNoi_1 = new JButton("PRODUSE NOI");
		btnProduseNoi_1.setBackground(Color.BLACK);
		btnProduseNoi_1.setForeground(Color.WHITE);
		btnProduseNoi_1.setFont(new Font("Perpetua Titling MT", Font.BOLD | Font.ITALIC, 12));
		btnProduseNoi_1.setBounds(453, 109, 141, 25);
		frmProiect.getContentPane().add(btnProduseNoi_1);
		
		
		String imagePath = "C:\\UTCNCTI\\An 3\\IS\\ProiectFinal\\ProiectIS_2\\src\\img\\photo.jpg";
		//String imagePath = "D:\\s1.jpg";

		BufferedImage myPicture = null;
		try {
			myPicture = ImageIO.read(new File(imagePath));
		} catch (IOException e) {
			e.printStackTrace();
		}
		JLabel label = new JLabel(new ImageIcon(myPicture));
		label.setForeground(Color.WHITE);
		label.setBackground(Color.WHITE);
		label.setBounds(31, 153, 590, 137);
		
		frmProiect.getContentPane().add(label);
		
		JTextPane txtpnComenziTelefonic = new JTextPane();
		txtpnComenziTelefonic.setFont(new Font("Verdana", Font.BOLD, 12));
		txtpnComenziTelefonic.setBackground(Color.BLACK);
		txtpnComenziTelefonic.setForeground(SystemColor.desktop);
		txtpnComenziTelefonic.setText("Comenzi telefonic :");
		txtpnComenziTelefonic.setBounds(85, 301, 177, 25);
		frmProiect.getContentPane().add(txtpnComenziTelefonic);
		
		JTextPane textPane = new JTextPane();
		textPane.setForeground(SystemColor.desktop);
		textPane.setBackground(Color.BLACK);
		textPane.setFont(new Font("Tahoma", Font.BOLD, 12));
		textPane.setText("0755895685");
		textPane.setBounds(119, 337, 119, 25);
		frmProiect.getContentPane().add(textPane);
		
		JTextPane textPane_1 = new JTextPane();
		textPane_1.setBackground(Color.BLACK);
		textPane_1.setFont(new Font("Tahoma", Font.BOLD, 12));
		textPane_1.setForeground(SystemColor.desktop);
		textPane_1.setText("0758652361");
		textPane_1.setBounds(348, 337, 125, 25);
		frmProiect.getContentPane().add(textPane_1);
		
		JTextPane txtpnMagazin = new JTextPane();
		txtpnMagazin.setFont(new Font("Segoe Print", Font.BOLD | Font.ITALIC, 20));
		txtpnMagazin.setBackground(Color.BLACK);
		txtpnMagazin.setForeground(SystemColor.textHighlightText);
		txtpnMagazin.setText("       MAGAZIN");
		txtpnMagazin.setBounds(187, 27, 213, 32);
		frmProiect.getContentPane().add(txtpnMagazin);
		
		String iconPhonePath = "C:\\UTCNCTI\\An 3\\IS\\ProiectFinal\\ProiectIS_2\\src\\img\\iconPhone.jpg";
		//String iconPhonePath = "D:\\s1.jpg";

		BufferedImage myIcon = null;
		try {
			myIcon = ImageIO.read(new File(iconPhonePath));
		} catch (IOException e) {
			e.printStackTrace();
		}
		JLabel label_1 = new JLabel(new ImageIcon(myIcon));
		label_1.setForeground(Color.WHITE);
		label_1.setBounds(41, 301, 36, 36);
		
		frmProiect.getContentPane().add(label);
		frmProiect.getContentPane().add(label_1);
		frmProiect.setVisible(true);
	}
}
