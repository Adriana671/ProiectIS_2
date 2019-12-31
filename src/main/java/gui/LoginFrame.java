package gui;

import java.awt.BorderLayout;
import java.awt.EventQueue;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.Color;
import java.awt.Cursor;
import javax.swing.JButton;
import javax.swing.JTextField;
import java.awt.Font;
import javax.swing.SwingConstants;
import javax.swing.JTextPane;
import java.awt.SystemColor;
import javax.swing.JPasswordField;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JLabel;
import javax.swing.ImageIcon;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class LoginFrame extends JFrame {

	private JPanel contentPane;
	private JTextField textField;
	private JPasswordField passwordField;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					LoginFrame frame = new LoginFrame();
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
	public LoginFrame() {
		
		setBackground(Color.BLACK);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 674, 422);
		contentPane = new JPanel();
		contentPane.setBackground(Color.BLACK);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		//buton pentru inregistrarea clientului
		JButton btnClient = new JButton("LOGIN");
		btnClient.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnClient.setBackground(SystemColor.activeCaption);
		btnClient.setFont(new Font("Tahoma", Font.PLAIN, 15));
		btnClient.setBounds(276, 244, 89, 23);
		contentPane.add(btnClient);
		
		//buton pentru a crea un nou cont
		//cand este actionat acest buton se deschide un nou frame pentru crearea contului de tipul CreateNewAccount
		JButton btnContNou = new JButton("CONT NOU");
		btnContNou.setBackground(SystemColor.activeCaption);
		btnContNou.setFont(new Font("Tahoma", Font.PLAIN, 15));
		btnContNou.setBounds(227, 300, 208, 23);
		contentPane.add(btnContNou);
		
		JTextPane txtpnInregistrareCa = new JTextPane();
		txtpnInregistrareCa.setFont(new Font("Sitka Subheading", Font.BOLD, 26));
		txtpnInregistrareCa.setBackground(Color.BLACK);
		txtpnInregistrareCa.setForeground(Color.WHITE);
		txtpnInregistrareCa.setText("LOGIN :");
		txtpnInregistrareCa.setBounds(276, 53, 137, 54);
		contentPane.add(txtpnInregistrareCa);
		
		textField = new JTextField();
		textField.setBounds(227, 137, 208, 23);
		contentPane.add(textField);
		textField.setColumns(10);
		
		passwordField = new JPasswordField();
		passwordField.setBounds(227, 180, 208, 23);
		contentPane.add(passwordField);
		
		JLabel user = new JLabel("New label");
		user.setIcon(new ImageIcon(LoginFrame.class.getResource("/profileIcon.png")));
		user.setBounds(180, 123, 37, 42);
		contentPane.add(user);
		
		JLabel pass = new JLabel("New label");
		pass.setIcon(new ImageIcon(LoginFrame.class.getResource("/passIcon1.png")));
		pass.setBounds(170, 170, 47, 42);
		contentPane.add(pass);
		
		JLabel lblX = new JLabel("X");
		lblX.setHorizontalAlignment(SwingConstants.CENTER);
		lblX.setFont(new Font("Tahoma", Font.BOLD, 15));
		lblX.setForeground(Color.WHITE);
		lblX.setBounds(628, 0, 46, 14);
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
