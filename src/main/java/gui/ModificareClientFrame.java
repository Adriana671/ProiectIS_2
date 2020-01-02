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

public class ModificareClientFrame extends JFrame {

	private JPanel contentPane;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	private JTextField textField_3;
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
					ModificareClientFrame frame = new ModificareClientFrame();
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
	public ModificareClientFrame() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 458, 398);
		contentPane = new JPanel();
		contentPane.setBackground(SystemColor.activeCaptionText);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
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
		
		JTextPane txtpnNume = new JTextPane();
		txtpnNume.setFont(new Font("Tahoma", Font.PLAIN, 15));
		txtpnNume.setForeground(SystemColor.text);
		txtpnNume.setBackground(SystemColor.activeCaptionText);
		txtpnNume.setText("Nume");
		txtpnNume.setBounds(36, 64, 110, 28);
		contentPane.add(txtpnNume);
		
		JTextPane txtpnVarsta = new JTextPane();
		txtpnVarsta.setFont(new Font("Tahoma", Font.PLAIN, 15));
		txtpnVarsta.setForeground(SystemColor.text);
		txtpnVarsta.setBackground(SystemColor.activeCaptionText);
		txtpnVarsta.setText("Varsta");
		txtpnVarsta.setBounds(36, 105, 110, 28);
		contentPane.add(txtpnVarsta);
		
		JTextPane txtpnAdresa = new JTextPane();
		txtpnAdresa.setFont(new Font("Tahoma", Font.PLAIN, 15));
		txtpnAdresa.setForeground(SystemColor.text);
		txtpnAdresa.setBackground(SystemColor.activeCaptionText);
		txtpnAdresa.setText("Adresa");
		txtpnAdresa.setBounds(36, 144, 110, 30);
		contentPane.add(txtpnAdresa);
		
		JTextPane txtpnEmail = new JTextPane();
		txtpnEmail.setFont(new Font("Tahoma", Font.PLAIN, 15));
		txtpnEmail.setForeground(SystemColor.text);
		txtpnEmail.setBackground(SystemColor.activeCaptionText);
		txtpnEmail.setText("Email");
		txtpnEmail.setBounds(36, 185, 110, 28);
		contentPane.add(txtpnEmail);
		
		btnModifica = new JButton("OK");
		btnModifica.setForeground(SystemColor.textText);
		btnModifica.setBackground(SystemColor.controlHighlight);
		btnModifica.setFont(new Font("Times New Roman", Font.BOLD, 15));
		btnModifica.setBounds(187, 282, 120, 28);
		contentPane.add(btnModifica);
		
		txtpnModificareProdus = new JTextPane();
		txtpnModificareProdus.setBackground(SystemColor.textText);
		txtpnModificareProdus.setForeground(SystemColor.activeCaption);
		txtpnModificareProdus.setFont(new Font("Tahoma", Font.BOLD, 20));
		txtpnModificareProdus.setText("Modificare date client");
		txtpnModificareProdus.setBounds(104, 0, 250, 48);
		contentPane.add(txtpnModificareProdus);
		
		lblX = new JLabel("X");
		lblX.setHorizontalAlignment(SwingConstants.CENTER);
		lblX.setForeground(SystemColor.text);
		lblX.setFont(new Font("Tahoma", Font.BOLD, 15));
		lblX.setBounds(415, 0, 46, 19);
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
