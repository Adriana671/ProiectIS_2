package gui;

import java.awt.Color;
import java.awt.Cursor;
import java.awt.Font;
import java.awt.Frame;
import java.awt.SystemColor;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JTextPane;
import javax.swing.SwingConstants;

import controller.LoginController;

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
		frmProiect.setUndecorated(true);
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
		

		JButton btnLoginUser = new JButton("Log in user");
		btnLoginUser.setFont(new Font("Times New Roman", Font.BOLD, 14));
		btnLoginUser.setBounds(233, 269, 195, 32);
		frmProiect.getContentPane().add(btnLoginUser);
		
		btnLoginUser.addActionListener(e->LoginController.loginUser());
		
		
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
		label.setBounds(29, 104, 590, 137);
		
		frmProiect.getContentPane().add(label);
		
		JTextPane txtpnMagazin = new JTextPane();
		txtpnMagazin.setFont(new Font("Segoe Print", Font.BOLD | Font.ITALIC, 20));
		txtpnMagazin.setBackground(Color.BLACK);
		txtpnMagazin.setForeground(SystemColor.textHighlightText);
		txtpnMagazin.setText("       MAGAZIN");
		txtpnMagazin.setBounds(187, 11, 213, 32);
		frmProiect.getContentPane().add(txtpnMagazin);
		
		String iconPhonePath = "C:\\UTCNCTI\\An 3\\IS\\ProiectFinal\\ProiectIS_2\\src\\img\\iconPhone.jpg";
		//String iconPhonePath = "D:\\s1.jpg";

		BufferedImage myIcon = null;
		try {
			myIcon = ImageIO.read(new File(iconPhonePath));
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		frmProiect.getContentPane().add(label);
		
		JButton btnCreateNewAccount = new JButton("Create new account");
		btnCreateNewAccount.setFont(new Font("Times New Roman", Font.BOLD, 14));
		btnCreateNewAccount.setBounds(29, 270, 173, 32);
		frmProiect.getContentPane().add(btnCreateNewAccount);
		
		JButton btnLoginAdmin = new JButton("Log in admin");
		btnLoginAdmin.setFont(new Font("Times New Roman", Font.BOLD, 14));
		btnLoginAdmin.setBounds(457, 269, 162, 32);
		frmProiect.getContentPane().add(btnLoginAdmin);
		
		JLabel lblX = new JLabel("X");
		lblX.setHorizontalAlignment(SwingConstants.CENTER);
		lblX.setForeground(SystemColor.text);
		lblX.setFont(new Font("Tahoma", Font.BOLD, 15));
		lblX.setBounds(628, 0, 46, 14);
		lblX.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		lblX.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent arg0) {
				frmProiect.dispose();
			}
		});
		
		frmProiect.getContentPane().add(lblX);
		frmProiect.setUndecorated(true);
		frmProiect.getContentPane().add(lblX);
		frmProiect.setVisible(true);
		
	}
}
