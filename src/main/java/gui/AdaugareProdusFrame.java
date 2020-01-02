package gui;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Cursor;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.SystemColor;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import javax.swing.JTextPane;
import javax.swing.SwingConstants;

import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.border.BevelBorder;

public class AdaugareProdusFrame extends JFrame {

	private JPanel contentPane;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	private JTextField textField_3;
	private JTextField textField_4;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					AdaugareProdusFrame frame = new AdaugareProdusFrame();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public AdaugareProdusFrame() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 473, 398);
		contentPane = new JPanel();
		contentPane.setBackground(SystemColor.activeCaptionText);
		contentPane.setBorder(new BevelBorder(BevelBorder.LOWERED, null, null, null, null));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JTextPane txtpnAdaugareProdusNou = new JTextPane();
		txtpnAdaugareProdusNou.setFont(new Font("Times New Roman", Font.BOLD, 23));
		txtpnAdaugareProdusNou.setForeground(SystemColor.activeCaption);
		txtpnAdaugareProdusNou.setBackground(SystemColor.activeCaptionText);
		txtpnAdaugareProdusNou.setText("Adaugare produs");
		txtpnAdaugareProdusNou.setBounds(131, 0, 204, 28);
		contentPane.add(txtpnAdaugareProdusNou);
		
		textField = new JTextField();
		textField.setBackground(SystemColor.info);
		textField.setBounds(171, 64, 148, 28);
		contentPane.add(textField);
		textField.setColumns(10);
		
		textField_1 = new JTextField();
		textField_1.setBackground(SystemColor.info);
		textField_1.setBounds(171, 103, 148, 30);
		contentPane.add(textField_1);
		textField_1.setColumns(10);
		
		textField_2 = new JTextField();
		textField_2.setBackground(SystemColor.info);
		textField_2.setBounds(171, 144, 148, 30);
		contentPane.add(textField_2);
		textField_2.setColumns(10);
		
		textField_3 = new JTextField();
		textField_3.setBackground(SystemColor.info);
		textField_3.setBounds(171, 185, 148, 28);
		contentPane.add(textField_3);
		textField_3.setColumns(10);
		
		textField_4 = new JTextField();
		textField_4.setBackground(SystemColor.info);
		textField_4.setBounds(171, 224, 148, 28);
		contentPane.add(textField_4);
		textField_4.setColumns(10);
		
		JTextPane txtpnDenumire = new JTextPane();
		txtpnDenumire.setFont(new Font("Tahoma", Font.PLAIN, 15));
		txtpnDenumire.setForeground(SystemColor.text);
		txtpnDenumire.setBackground(SystemColor.activeCaptionText);
		txtpnDenumire.setText("Denumire");
		txtpnDenumire.setBounds(36, 64, 110, 28);
		contentPane.add(txtpnDenumire);
		
		JTextPane txtpnCategorie = new JTextPane();
		txtpnCategorie.setFont(new Font("Tahoma", Font.PLAIN, 15));
		txtpnCategorie.setForeground(SystemColor.text);
		txtpnCategorie.setBackground(SystemColor.activeCaptionText);
		txtpnCategorie.setText("Categorie");
		txtpnCategorie.setBounds(36, 105, 110, 28);
		contentPane.add(txtpnCategorie);
		
		JTextPane txtpnDescriere = new JTextPane();
		txtpnDescriere.setFont(new Font("Tahoma", Font.PLAIN, 15));
		txtpnDescriere.setForeground(SystemColor.text);
		txtpnDescriere.setBackground(SystemColor.activeCaptionText);
		txtpnDescriere.setText("Descriere");
		txtpnDescriere.setBounds(36, 144, 110, 30);
		contentPane.add(txtpnDescriere);
		
		JTextPane txtpnCantitate = new JTextPane();
		txtpnCantitate.setFont(new Font("Tahoma", Font.PLAIN, 15));
		txtpnCantitate.setForeground(SystemColor.text);
		txtpnCantitate.setBackground(SystemColor.activeCaptionText);
		txtpnCantitate.setText("Cantitate");
		txtpnCantitate.setBounds(36, 185, 110, 28);
		contentPane.add(txtpnCantitate);
		
		JTextPane txtpnPret = new JTextPane();
		txtpnPret.setFont(new Font("Tahoma", Font.PLAIN, 15));
		txtpnPret.setForeground(SystemColor.text);
		txtpnPret.setBackground(SystemColor.activeCaptionText);
		txtpnPret.setText("Pret");
		txtpnPret.setBounds(36, 224, 110, 28);
		contentPane.add(txtpnPret);
		
		JButton btnAdauga = new JButton("Adauga");
		btnAdauga.setBackground(SystemColor.controlHighlight);
		btnAdauga.setForeground(SystemColor.textText);
		btnAdauga.setFont(new Font("Times New Roman", Font.BOLD, 13));
		btnAdauga.setBounds(136, 294, 117, 28);
		contentPane.add(btnAdauga);
		
		JLabel lblX = new JLabel("X");
		lblX.setHorizontalAlignment(SwingConstants.CENTER);
		lblX.setForeground(SystemColor.textHighlightText);
		lblX.setFont(new Font("Tahoma", Font.BOLD, 15));
		lblX.setBounds(431, 0, 42, 28);
		lblX.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		lblX.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent arg0) {
				dispose();
			}
		});
		contentPane.add(lblX);
		
		setUndecorated(true);
	}
}
