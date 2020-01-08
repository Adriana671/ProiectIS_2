package gui;

import java.awt.Color;
import java.awt.Cursor;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.SystemColor;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JTextPane;
import javax.swing.SwingConstants;
import javax.swing.border.BevelBorder;
import javax.swing.border.EmptyBorder;
import javax.swing.table.DefaultTableModel;

import controller.AdminController;
import controller.ProduseController;

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
	
	private int row, column;
	private DefaultTableModel tbModel;
	private JTable table;
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
	    String[] header = { "Id","Denumire", "Categorie", "Descriere","Cantitate","Pret" };
	    contentPane.setLayout(null);
	    panel.setLayout(null);
	    table = new JTable(rec, header);
	    table.setBackground(SystemColor.info);
	    table.setModel(new DefaultTableModel(
	    	new Object[][] {	
	    	},
	    	new String[] {
	    		"Id","Denumire", "Categorie", "Descriere", "Cantitate", "Pret"
	    	}
	    ));
	    
	    
	    table.addMouseListener(new MouseListener() {

			@Override
			public void mouseClicked(MouseEvent e) {
	    	    if (e.getClickCount() == 1) {
	    	    	row = table.getSelectedRow();
	    	    	column=table.getSelectedColumn();
	    	    	System.out.println(table.getValueAt(row, column));
	    	     // do some stuff
	    	    }
	    	  }


			@Override
			public void mousePressed(MouseEvent e) {
				// TODO Auto-generated method stub
				
			}

			@Override
			public void mouseReleased(MouseEvent e) {
				// TODO Auto-generated method stub
				
			}

			@Override
			public void mouseEntered(MouseEvent e) {
				// TODO Auto-generated method stub
				
			}

			@Override
			public void mouseExited(MouseEvent e) {
				// TODO Auto-generated method stub
				
			}
	    
	    });
	    tbModel = (DefaultTableModel) table.getModel();    

	    
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
	    
	    btnAdaugareProdus.addActionListener(e->ProduseController.addProdusFrame());
	    
	    JButton btnNewButton = new JButton("Stergere produs");
	    btnNewButton.setBackground(SystemColor.controlHighlight);
	    btnNewButton.setFont(new Font("Tahoma", Font.BOLD, 11));
	    btnNewButton.setBounds(442, 181, 135, 30);
	    contentPane.add(btnNewButton);
	    
	    btnNewButton.addActionListener(e->ProduseController.stergeProdus((int) table.getValueAt(row, 0)));
	    
	    JButton btnModificareProdus = new JButton("Modificare produs");
	    btnModificareProdus.setBackground(SystemColor.controlHighlight);
	    btnModificareProdus.setFont(new Font("Tahoma", Font.BOLD, 11));
	    btnModificareProdus.setBounds(442, 239, 135, 29);
	    contentPane.add(btnModificareProdus);
	    
	    btnModificareProdus.addActionListener(e->ProduseController.modifProdusFrame((int)table.getValueAt(row, 0)));
	    
	    JButton btnCreeazaPromo = new JButton("Creeaza promo");
	    btnCreeazaPromo.setBackground(SystemColor.controlHighlight);
	    btnCreeazaPromo.setFont(new Font("Tahoma", Font.BOLD, 11));
	    btnCreeazaPromo.setBounds(442, 324, 135, 36);
	    contentPane.add(btnCreeazaPromo);
	    
	    btnCreeazaPromo.addActionListener(e->ProduseController.produsPromoFrame((int)table.getValueAt(row, 0)));
	    
	    JButton btnGestioneazaClienti = new JButton("Gestioneaza clienti");
	    btnGestioneazaClienti.setBackground(SystemColor.controlHighlight);
	    btnGestioneazaClienti.setFont(new Font("Tahoma", Font.BOLD, 11));
	    btnGestioneazaClienti.setBounds(138, 369, 164, 23);
	    contentPane.add(btnGestioneazaClienti);
	    
	    btnGestioneazaClienti.addActionListener(e->AdminController.gestClientiFrame());
	    
	    JButton btnAdaugaAdmin = new JButton("Adauga admin");
	    btnAdaugaAdmin.setBackground(SystemColor.controlHighlight);
	    btnAdaugaAdmin.setFont(new Font("Tahoma", Font.BOLD, 11));
	    btnAdaugaAdmin.setBounds(223, 293, 127, 23);
	    contentPane.add(btnAdaugaAdmin);

	    btnAdaugaAdmin.addActionListener(e->AdminController.adaugaAdminFrame());
		
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
		
		btnVeziAdmini.addActionListener(e->AdminController.veziAdmFrame());
		contentPane.add(btnVeziAdmini);
		setUndecorated(true);
	}
	public JTable getTable()
	{
		return table;
	}

	public DefaultTableModel getTbModel() {
		return tbModel;
	}
	public void setTbModel(DefaultTableModel tbModel) {
		this.tbModel = tbModel;
	}
	public void setTable(JTable table) {
		this.table = table;
	}
}
