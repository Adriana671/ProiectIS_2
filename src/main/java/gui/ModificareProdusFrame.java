package gui;

import java.awt.BorderLayout;
import java.awt.Cursor;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.SystemColor;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.JTextPane;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.SwingConstants;
import javax.swing.border.BevelBorder;

public class ModificareProdusFrame extends JFrame {

	private JPanel contentPane;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	private JTextField textField_3;
	private JTextField textField_4;
	private JButton btnModifica;
	private JTextPane txtpnModificareProdus;
	private JLabel lblX;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					ModificareProdusFrame frame = new ModificareProdusFrame();
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
	public ModificareProdusFrame() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 489, 395);
		contentPane = new JPanel();
		contentPane.setBackground(SystemColor.activeCaptionText);
		contentPane.setBorder(new BevelBorder(BevelBorder.LOWERED, null, null, null, null));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		

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
		
		btnModifica = new JButton("OK");
		btnModifica.setForeground(SystemColor.textText);
		btnModifica.setBackground(SystemColor.controlHighlight);
		btnModifica.setFont(new Font("Times New Roman", Font.BOLD, 15));
		btnModifica.setBounds(186, 308, 120, 28);
		contentPane.add(btnModifica);
		
		txtpnModificareProdus = new JTextPane();
		txtpnModificareProdus.setBackground(SystemColor.textText);
		txtpnModificareProdus.setForeground(SystemColor.activeCaption);
		txtpnModificareProdus.setFont(new Font("Tahoma", Font.BOLD, 20));
		txtpnModificareProdus.setText("Modificare produs ");
		txtpnModificareProdus.setBounds(141, 0, 205, 40);
		contentPane.add(txtpnModificareProdus);
		
		lblX = new JLabel("X");
		lblX.setHorizontalAlignment(SwingConstants.CENTER);
		lblX.setFont(new Font("Tahoma", Font.BOLD, 15));
		lblX.setForeground(SystemColor.text);
		lblX.setBounds(443, 0, 46, 14);
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
