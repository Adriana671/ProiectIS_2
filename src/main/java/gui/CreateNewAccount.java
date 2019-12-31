package gui;

import java.awt.BorderLayout;
import java.awt.Cursor;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.SystemColor;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.SwingConstants;
import javax.swing.JTextField;
import javax.swing.JTextPane;
import javax.swing.JPasswordField;
import javax.swing.JButton;

public class CreateNewAccount extends JFrame {

	private JPanel contentPane;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	private JPasswordField passwordField;
	private JPasswordField passwordField_1;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					CreateNewAccount frame = new CreateNewAccount();
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
	public CreateNewAccount() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 460, 462);
		contentPane = new JPanel();
		contentPane.setBackground(SystemColor.activeCaptionText);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblX = new JLabel("X");
		lblX.setHorizontalAlignment(SwingConstants.CENTER);
		lblX.setForeground(SystemColor.text);
		lblX.setFont(new Font("Tahoma", Font.BOLD, 15));
		lblX.setBounds(424, 0, 36, 19);
		contentPane.add(lblX);
		
		JLabel lblNewLabel = new JLabel("Creare cont nou");
		lblNewLabel.setFont(new Font("Perpetua Titling MT", Font.BOLD, 21));
		lblNewLabel.setHorizontalAlignment(SwingConstants.LEFT);
		lblNewLabel.setForeground(SystemColor.text);
		lblNewLabel.setBounds(1, 11, 413, 26);
		contentPane.add(lblNewLabel);
		
		textField = new JTextField();
		textField.setBounds(161, 83, 169, 26);
		contentPane.add(textField);
		textField.setColumns(10);
		
		textField_1 = new JTextField();
		textField_1.setBounds(161, 133, 169, 26);
		contentPane.add(textField_1);
		textField_1.setColumns(10);
		
		textField_2 = new JTextField();
		textField_2.setBounds(161, 182, 169, 26);
		contentPane.add(textField_2);
		textField_2.setColumns(10);
		
		JTextPane txtpnFirst = new JTextPane();
		txtpnFirst.setBackground(SystemColor.activeCaptionText);
		txtpnFirst.setForeground(SystemColor.activeCaption);
		txtpnFirst.setFont(new Font("Tahoma", Font.BOLD, 13));
		txtpnFirst.setText("First Name:");
		txtpnFirst.setBounds(67, 83, 84, 26);
		contentPane.add(txtpnFirst);
		
		JTextPane txtpnLastName = new JTextPane();
		txtpnLastName.setBackground(SystemColor.activeCaptionText);
		txtpnLastName.setForeground(SystemColor.activeCaption);
		txtpnLastName.setFont(new Font("Tahoma", Font.BOLD, 13));
		txtpnLastName.setText("Last Name");
		txtpnLastName.setBounds(67, 133, 84, 26);
		contentPane.add(txtpnLastName);
		
		JTextPane txtpnUsername = new JTextPane();
		txtpnUsername.setBackground(SystemColor.activeCaptionText);
		txtpnUsername.setForeground(SystemColor.activeCaption);
		txtpnUsername.setFont(new Font("Tahoma", Font.BOLD, 13));
		txtpnUsername.setText("Username:");
		txtpnUsername.setBounds(67, 182, 73, 26);
		contentPane.add(txtpnUsername);
		
		JTextPane txtpnPassword = new JTextPane();
		txtpnPassword.setBackground(SystemColor.activeCaptionText);
		txtpnPassword.setForeground(SystemColor.activeCaption);
		txtpnPassword.setFont(new Font("Tahoma", Font.BOLD, 13));
		txtpnPassword.setText("Password:");
		txtpnPassword.setBounds(67, 232, 73, 26);
		contentPane.add(txtpnPassword);
		
		JTextPane txtpnRePassword = new JTextPane();
		txtpnRePassword.setBackground(SystemColor.activeCaptionText);
		txtpnRePassword.setForeground(SystemColor.activeCaption);
		txtpnRePassword.setFont(new Font("Tahoma", Font.BOLD, 13));
		txtpnRePassword.setText("Password:");
		txtpnRePassword.setBounds(67, 287, 73, 26);
		contentPane.add(txtpnRePassword);
		
		passwordField = new JPasswordField();
		passwordField.setBounds(161, 232, 169, 26);
		contentPane.add(passwordField);
		
		passwordField_1 = new JPasswordField();
		passwordField_1.setBounds(161, 287, 169, 26);
		contentPane.add(passwordField_1);
		
		JButton btnCreare = new JButton("Creare cont");
		btnCreare.setBackground(SystemColor.activeCaption);
		btnCreare.setFont(new Font("Tahoma", Font.BOLD, 13));
		btnCreare.setBounds(191, 360, 111, 26);
		contentPane.add(btnCreare);
		
		lblX.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		lblX.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent arg0) {
				dispose();
			}
		});
		setUndecorated(true);
	}
}
