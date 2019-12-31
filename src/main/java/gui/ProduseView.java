package gui;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.border.EmptyBorder;
import java.awt.SystemColor;
import javax.swing.JTable;
import java.awt.Color;
import java.awt.Cursor;
import java.awt.Font;
import javax.swing.table.DefaultTableModel;
import javax.swing.border.BevelBorder;
import javax.swing.border.LineBorder;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.ActionEvent;
import javax.swing.JLabel;
import javax.swing.SwingConstants;
import javax.swing.JTextPane;
import javax.swing.JTextField;

public class ProduseView extends JFrame {

	private JPanel contentPane;
	private JTable table;
	private JButton btnNewButton;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	private JTextField textField_3;
	private JTextField textField_4;
	private JTextField textField_5;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					ProduseView frame = new ProduseView();
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
	public ProduseView() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 674, 422);
		contentPane = new JPanel();
		contentPane.setForeground(Color.WHITE);
		contentPane.setBackground(Color.BLACK);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		

		
		table = new JTable();
		table.setForeground(Color.MAGENTA);
		table.setFont(new Font("Tahoma", Font.PLAIN, 13));
		table.setModel(new DefaultTableModel(
			new Object[][] {
				{null, null, null, null, null},
				{null, null, null, null, null},
				{null, null, null, null, null},
				{null, null, null, null, null},
			},
			new String[] {
				"Id", "Denumire", "Descriere", "Cantitate produs", "Pret produs"
			}
		));
		table.getColumnModel().getColumn(3).setPreferredWidth(98);
		table.getColumnModel().getColumn(4).setPreferredWidth(104);
		table.setBounds(53, 279, 522, -209);
		
		
		contentPane.add(table);
		
		JButton btnAdaugaProdus = new JButton("Adauga produs");
		btnAdaugaProdus.setBounds(53, 11, 152, 23);
		contentPane.add(btnAdaugaProdus);
		
		btnNewButton = new JButton("Modificare produs");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnNewButton.setBounds(229, 11, 152, 23);
		contentPane.add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("Stergere produs");
		btnNewButton_1.setBounds(412, 11, 163, 23);
		contentPane.add(btnNewButton_1);
		
		JLabel lblX = new JLabel("X");
		lblX.setFont(new Font("Tahoma", Font.BOLD, 15));
		lblX.setForeground(Color.WHITE);
		lblX.setHorizontalAlignment(SwingConstants.CENTER);
		lblX.setBounds(628, 0, 46, 14);
		lblX.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		lblX.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent arg0) {
				dispose();
			}
		});
		contentPane.add(lblX);
		
		JTextPane txtpnId = new JTextPane();
		txtpnId.setFont(new Font("Tahoma", Font.BOLD, 14));
		txtpnId.setForeground(SystemColor.activeCaption);
		txtpnId.setBackground(SystemColor.activeCaptionText);
		txtpnId.setText("Id");
		txtpnId.setBounds(29, 113, 51, 23);
		contentPane.add(txtpnId);
		
		JTextPane txtpnCategorie = new JTextPane();
		txtpnCategorie.setFont(new Font("Tahoma", Font.BOLD, 14));
		txtpnCategorie.setForeground(SystemColor.activeCaption);
		txtpnCategorie.setBackground(SystemColor.activeCaptionText);
		txtpnCategorie.setText("Categorie");
		txtpnCategorie.setBounds(29, 155, 77, 23);
		contentPane.add(txtpnCategorie);
		
		JTextPane txtpnDenumire = new JTextPane();
		txtpnDenumire.setFont(new Font("Tahoma", Font.BOLD, 14));
		txtpnDenumire.setForeground(SystemColor.activeCaption);
		txtpnDenumire.setBackground(SystemColor.activeCaptionText);
		txtpnDenumire.setText("Denumire");
		txtpnDenumire.setBounds(29, 189, 77, 23);
		contentPane.add(txtpnDenumire);
		
		JTextPane txtpnDescriere = new JTextPane();
		txtpnDescriere.setFont(new Font("Tahoma", Font.BOLD, 14));
		txtpnDescriere.setForeground(SystemColor.activeCaption);
		txtpnDescriere.setBackground(SystemColor.activeCaptionText);
		txtpnDescriere.setText("Descriere");
		txtpnDescriere.setBounds(29, 234, 77, 23);
		contentPane.add(txtpnDescriere);
		
		JTextPane txtpnCantitate = new JTextPane();
		txtpnCantitate.setFont(new Font("Tahoma", Font.BOLD, 14));
		txtpnCantitate.setForeground(SystemColor.activeCaption);
		txtpnCantitate.setBackground(SystemColor.activeCaptionText);
		txtpnCantitate.setText("Cantitate");
		txtpnCantitate.setBounds(29, 279, 78, 23);
		contentPane.add(txtpnCantitate);
		
		JTextPane txtpnPret = new JTextPane();
		txtpnPret.setFont(new Font("Tahoma", Font.BOLD, 14));
		txtpnPret.setForeground(SystemColor.activeCaption);
		txtpnPret.setBackground(SystemColor.activeCaptionText);
		txtpnPret.setText("Pret");
		txtpnPret.setBounds(29, 317, 77, 23);
		contentPane.add(txtpnPret);
		
		textField = new JTextField();
		textField.setBackground(SystemColor.controlHighlight);
		textField.setBounds(119, 113, 113, 20);
		contentPane.add(textField);
		textField.setColumns(10);
		
		textField_1 = new JTextField();
		textField_1.setBackground(SystemColor.controlHighlight);
		textField_1.setBounds(119, 155, 113, 23);
		contentPane.add(textField_1);
		textField_1.setColumns(10);
		
		textField_2 = new JTextField();
		textField_2.setBackground(SystemColor.controlHighlight);
		textField_2.setBounds(119, 189, 113, 23);
		contentPane.add(textField_2);
		textField_2.setColumns(10);
		
		textField_3 = new JTextField();
		textField_3.setBackground(SystemColor.controlHighlight);
		textField_3.setBounds(119, 234, 113, 20);
		contentPane.add(textField_3);
		textField_3.setColumns(10);
		
		textField_4 = new JTextField();
		textField_4.setBackground(SystemColor.controlHighlight);
		textField_4.setBounds(117, 279, 115, 20);
		contentPane.add(textField_4);
		textField_4.setColumns(10);
		
		textField_5 = new JTextField();
		textField_5.setBackground(SystemColor.controlHighlight);
		textField_5.setBounds(116, 317, 116, 23);
		contentPane.add(textField_5);
		textField_5.setColumns(10);
		
		setUndecorated(true);
	}
}
