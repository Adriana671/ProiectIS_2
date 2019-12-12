package gui;

import java.awt.Color;
import java.awt.Font;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JTextField;
import javax.swing.SwingConstants;

import controller.LoginController;

public class ViewClass {

	private JFrame frmProiect;
	private JTextField txtNumeMagazin;
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
		
		txtNumeMagazin = new JTextField();
		txtNumeMagazin.setBackground(new Color(0, 0, 0));
		txtNumeMagazin.setForeground(new Color(255, 255, 255));
		txtNumeMagazin.setFont(new Font("Cinzel", Font.PLAIN, 18));
		txtNumeMagazin.setText("       NUME MAGAZIN");
		txtNumeMagazin.setBounds(187, 11, 213, 48);
		frmProiect.getContentPane().add(txtNumeMagazin);
		txtNumeMagazin.setColumns(10);
		
		txtImagineaTaConteaza = new JTextField();
		txtImagineaTaConteaza.setFont(new Font("Century Schoolbook", Font.BOLD | Font.ITALIC, 13));
		txtImagineaTaConteaza.setHorizontalAlignment(SwingConstants.CENTER);
		txtImagineaTaConteaza.setBackground(new Color(0, 0, 0));
		txtImagineaTaConteaza.setForeground(new Color(255, 255, 255));
		txtImagineaTaConteaza.setText("Imaginea ta conteaza!");
		txtImagineaTaConteaza.setBounds(187, 58, 213, 25);
		frmProiect.getContentPane().add(txtImagineaTaConteaza);
		txtImagineaTaConteaza.setColumns(10);
		
		JButton btnProduseNoi = new JButton("Produse noi");
		btnProduseNoi.setBackground(Color.BLACK);
		btnProduseNoi.setForeground(Color.WHITE);
		btnProduseNoi.setFont(new Font("Perpetua Titling MT", Font.BOLD | Font.ITALIC, 12));
		btnProduseNoi.setBounds(31, 110, 125, 25);
		frmProiect.getContentPane().add(btnProduseNoi);
		
		JButton btnHaine = new JButton("Haine");
		btnHaine.setForeground(Color.WHITE);
		btnHaine.setBackground(Color.BLACK);
		btnHaine.setFont(new Font("Perpetua Titling MT", Font.BOLD | Font.ITALIC, 12));
		btnHaine.setBounds(187, 110, 102, 25);
		frmProiect.getContentPane().add(btnHaine);
		
		JButton btnNewButton = new JButton("Incaltaminte");
		btnNewButton.setForeground(Color.WHITE);
		btnNewButton.setBackground(Color.BLACK);
		btnNewButton.setFont(new Font("Perpetua Titling MT", Font.BOLD | Font.ITALIC, 12));
		btnNewButton.setBounds(312, 110, 132, 25);
		frmProiect.getContentPane().add(btnNewButton);
		
		//btnNewButton.addActionListener(e-> loginContr.loginUser("aa", "bb"));
		
		JButton btnNewButton_1 = new JButton("Inregistrare");
		btnNewButton_1.setFont(new Font("Times New Roman", Font.BOLD, 14));
		btnNewButton_1.setBounds(501, 27, 132, 32);
		frmProiect.getContentPane().add(btnNewButton_1);
		frmProiect.setVisible(true);
	}
}
