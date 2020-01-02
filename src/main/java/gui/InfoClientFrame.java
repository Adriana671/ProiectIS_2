package gui;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Cursor;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.SystemColor;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.JTextPane;
import javax.swing.SwingConstants;
import javax.swing.UIManager;
import javax.swing.border.EmptyBorder;
import javax.swing.table.DefaultTableModel;
import javax.swing.border.BevelBorder;

public class InfoClientFrame extends JFrame {
	
	private JPanel contentPane;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	private JTextField textField_3;
	private JTextField txtAstaNuIs;
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					InfoClientFrame frame = new InfoClientFrame();
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
	public InfoClientFrame() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 471, 348);
		contentPane = new JPanel();
		contentPane.setBackground(SystemColor.activeCaptionText);
		contentPane.setBorder(new BevelBorder(BevelBorder.LOWERED, null, null, null, null));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblX = new JLabel("X");
		lblX.setHorizontalAlignment(SwingConstants.CENTER);
		lblX.setForeground(SystemColor.text);
		lblX.setFont(new Font("Tahoma", Font.BOLD, 15));
		lblX.setBounds(424, 0, 36, 19);
		contentPane.add(lblX);
		
		JLabel lblNewLabel = new JLabel("Informatii client ");
		lblNewLabel.setFont(new Font("Perpetua Titling MT", Font.BOLD, 21));
		lblNewLabel.setHorizontalAlignment(SwingConstants.LEFT);
		lblNewLabel.setForeground(SystemColor.activeCaption);
		lblNewLabel.setBounds(1, 11, 413, 26);
		contentPane.add(lblNewLabel);
		
		textField = new JTextField();
		textField.setBackground(SystemColor.info);
		textField.setBounds(161, 83, 169, 26);
		contentPane.add(textField);
		textField.setColumns(10);
		
		textField_1 = new JTextField();
		textField_1.setBackground(SystemColor.info);
		textField_1.setBounds(161, 120, 169, 26);
		contentPane.add(textField_1);
		textField_1.setColumns(10);
		
		textField_2 = new JTextField();
		textField_2.setBackground(SystemColor.info);
		textField_2.setBounds(161, 157, 169, 26);
		contentPane.add(textField_2);
		textField_2.setColumns(10);
		
		JTextPane txtpnFirst = new JTextPane();
		txtpnFirst.setBackground(SystemColor.activeCaptionText);
		txtpnFirst.setForeground(SystemColor.activeCaption);
		txtpnFirst.setFont(new Font("Tahoma", Font.BOLD, 13));
		txtpnFirst.setText("Name:");
		txtpnFirst.setBounds(67, 83, 84, 26);
		contentPane.add(txtpnFirst);
		
		JTextPane txtpnLastName = new JTextPane();
		txtpnLastName.setBackground(SystemColor.activeCaptionText);
		txtpnLastName.setForeground(SystemColor.activeCaption);
		txtpnLastName.setFont(new Font("Tahoma", Font.BOLD, 13));
		txtpnLastName.setText("Address:");
		txtpnLastName.setBounds(67, 120, 84, 26);
		contentPane.add(txtpnLastName);
		
		JTextPane txtpnUsername = new JTextPane();
		txtpnUsername.setBackground(SystemColor.activeCaptionText);
		txtpnUsername.setForeground(SystemColor.activeCaption);
		txtpnUsername.setFont(new Font("Tahoma", Font.BOLD, 13));
		txtpnUsername.setText("Age: ");
		txtpnUsername.setBounds(67, 157, 73, 26);
		contentPane.add(txtpnUsername);
		
		JTextPane txtpnPassword = new JTextPane();
		txtpnPassword.setBackground(SystemColor.activeCaptionText);
		txtpnPassword.setForeground(SystemColor.activeCaption);
		txtpnPassword.setFont(new Font("Tahoma", Font.BOLD, 13));
		txtpnPassword.setText("Password:");
		txtpnPassword.setBounds(67, 227, 73, 26);
		contentPane.add(txtpnPassword);
		
		lblX.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		
		JTextPane txtpnEmail = new JTextPane();
		txtpnEmail.setBackground(SystemColor.activeCaptionText);
		txtpnEmail.setForeground(SystemColor.activeCaption);
		txtpnEmail.setFont(new Font("Tahoma", Font.BOLD, 13));
		txtpnEmail.setText("Email");
		txtpnEmail.setBounds(67, 197, 84, 19);
		contentPane.add(txtpnEmail);
		
		textField_3 = new JTextField();
		textField_3.setBackground(SystemColor.info);
		textField_3.setBounds(161, 194, 169, 22);
		contentPane.add(textField_3);
		textField_3.setColumns(10);
		
		txtAstaNuIs = new JTextField();
		txtAstaNuIs.setBackground(SystemColor.info);
		txtAstaNuIs.setText("asta nu is sigura ca trebuie ");
		txtAstaNuIs.setBounds(161, 227, 169, 19);
		contentPane.add(txtAstaNuIs);
		txtAstaNuIs.setColumns(10);
		lblX.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent arg0) {
				dispose();
			}
		});
		setUndecorated(true);
	}

}
