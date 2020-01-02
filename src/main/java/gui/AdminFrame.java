package gui;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Cursor;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.SwingConstants;
import javax.swing.border.EmptyBorder;
import javax.swing.table.DefaultTableModel;

import java.awt.SystemColor;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.Dimension;
import javax.swing.JButton;
import java.awt.Font;
import javax.swing.JTextPane;
import javax.swing.border.BevelBorder;

public class AdminFrame extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					AdminFrame frame = new AdminFrame();
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
	public AdminFrame() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 691, 438);
		contentPane = new JPanel();
		contentPane.setForeground(SystemColor.text);
		contentPane.setBackground(SystemColor.activeCaptionText);
		contentPane.setBorder(new BevelBorder(BevelBorder.LOWERED, null, null, null, null));
		setContentPane(contentPane);
		this.setTitle("Admin");
		
	    JPanel panel = new JPanel();
	    panel.setBorder(new EmptyBorder(0, 0, 0, 0));
	    panel.setBounds(5, 0, 413, 282);
	    panel.setForeground(Color.WHITE);
	    panel.setBackground(Color.BLACK);
	    
	    String[][] rec = {
	         { null, null, null,null,null },
	         { null, null, null,null,null },
	         { null, null, null,null,null },
	      };
	    String[] header = { "Denumire", "Categorie", "Descriere","Cantitate","Pret" };
	    contentPane.setLayout(null);
	    panel.setLayout(null);
	    JTable table = new JTable(rec, header);
	    table.setBackground(SystemColor.info);
	    table.setModel(new DefaultTableModel(
	    	new Object[][] {
	    		{null, null, null, null, null},
	    		{null, null, null, null, null},
	    		{null, null, null, null, null},
	    		{null, null, null, null, null},
	    		{null, null, null, null, null},
	    		{null, null, null, null, null},
	    		{null, null, null, null, null},
	    	},
	    	new String[] {
	    		"Denumire", "Categorie", "Descriere", "Cantitate", "Pret"
	    	}
	    ));
	    JScrollPane scrollPane = new JScrollPane(table);
	    scrollPane.setBounds(29, 86, 374, 150);
	    panel.add(scrollPane);
	    this.getContentPane().add(panel);
	    
	    JTextPane txtpnToateProdusele = new JTextPane();
	    txtpnToateProdusele.setBackground(SystemColor.activeCaptionText);
	    txtpnToateProdusele.setForeground(SystemColor.activeCaption);
	    txtpnToateProdusele.setFont(new Font("Tahoma", Font.BOLD, 14));
	    txtpnToateProdusele.setText("Produse :");
	    txtpnToateProdusele.setBounds(29, 33, 197, 31);
	    panel.add(txtpnToateProdusele);
	    
	    String[][] recAd = {
	         { null, null},
	         { null, null},
	         { null, null},
	      };
	    String[] headerAd = { "Nume", "Email"};
	    
	    JButton btnAdaugareProdus = new JButton("Adaugare produs");
	    btnAdaugareProdus.setBackground(SystemColor.controlHighlight);
	    btnAdaugareProdus.setFont(new Font("Tahoma", Font.BOLD, 11));
	    btnAdaugareProdus.setBounds(442, 121, 135, 30);
	    contentPane.add(btnAdaugareProdus);
	    
	    JButton btnNewButton = new JButton("Stergere produs");
	    btnNewButton.setBackground(SystemColor.controlHighlight);
	    btnNewButton.setFont(new Font("Tahoma", Font.BOLD, 11));
	    btnNewButton.setBounds(442, 181, 135, 30);
	    contentPane.add(btnNewButton);
	    
	    JButton btnModificareProdus = new JButton("Modificare produs");
	    btnModificareProdus.setBackground(SystemColor.controlHighlight);
	    btnModificareProdus.setFont(new Font("Tahoma", Font.BOLD, 11));
	    btnModificareProdus.setBounds(442, 239, 135, 29);
	    contentPane.add(btnModificareProdus);
	    
	    JButton btnCreeazaPromo = new JButton("Creeaza promo");
	    btnCreeazaPromo.setBackground(SystemColor.controlHighlight);
	    btnCreeazaPromo.setFont(new Font("Tahoma", Font.BOLD, 11));
	    btnCreeazaPromo.setBounds(442, 324, 135, 36);
	    contentPane.add(btnCreeazaPromo);
	    
	    JButton btnGestioneazaClienti = new JButton("Gestioneaza clienti");
	    btnGestioneazaClienti.setBackground(SystemColor.controlHighlight);
	    btnGestioneazaClienti.setFont(new Font("Tahoma", Font.BOLD, 11));
	    btnGestioneazaClienti.setBounds(138, 369, 164, 23);
	    contentPane.add(btnGestioneazaClienti);
	    
	    JButton btnAdaugaAdmin = new JButton("Adauga admin");
	    btnAdaugaAdmin.setBackground(SystemColor.controlHighlight);
	    btnAdaugaAdmin.setFont(new Font("Tahoma", Font.BOLD, 11));
	    btnAdaugaAdmin.setBounds(223, 293, 127, 23);
	    contentPane.add(btnAdaugaAdmin);

		
		JLabel lblX = new JLabel("X");
		lblX.setHorizontalAlignment(SwingConstants.CENTER);
		lblX.setForeground(SystemColor.text);
		lblX.setFont(new Font("Tahoma", Font.BOLD, 15));
		lblX.setBounds(645, 0, 46, 14);
		lblX.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		lblX.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent arg0) {
				dispose();
			}
		});
		
		contentPane.add(lblX);
		
		JButton btnVeziAdmini = new JButton("Vezi admini");
		btnVeziAdmini.setBackground(SystemColor.controlHighlight);
		btnVeziAdmini.setFont(new Font("Tahoma", Font.BOLD, 11));
		btnVeziAdmini.setBounds(53, 293, 135, 23);
		contentPane.add(btnVeziAdmini);
		setUndecorated(true);
	}

}
