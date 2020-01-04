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
import javax.swing.UIManager;
import javax.swing.border.BevelBorder;
import javax.swing.table.DefaultTableModel;

import controller.LoginController;
import controller.ProduseController;

public class ClientFrame extends JFrame {

	private static final long serialVersionUID = 1L;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					ClientFrame frame = new ClientFrame();
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
	
	private DefaultTableModel tbModel;
	private JTable table;
	private int row,column;
	public ClientFrame() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setTitle("Client");
		this.getContentPane().setForeground(Color.WHITE);
		this.getContentPane().setBackground(Color.BLACK);
	    JPanel panel = new JPanel();
	    panel.setBorder(new BevelBorder(BevelBorder.LOWERED, null, null, null, null));
	    panel.setForeground(Color.WHITE);
	    panel.setBackground(Color.BLACK);
	    String[][] rec = {
	         { null, null, null,null,null },
	         { null, null, null,null,null },
	         { null, null, null,null,null },
	         { null, null, null,null,null },
	         { null, null, null,null,null },
	         { null, null, null,null,null },
	      };
	    String[] header = { "Id","Denumire", "Categorie", "Descriere","Cantitate","Pret" };
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
	    scrollPane.setBounds(29, 132, 335, 190);
	    panel.add(scrollPane);
	    this.getContentPane().add(panel);
	      
	    JButton btnNewButton = new JButton("Adauga in cos");
	    btnNewButton.setBackground(UIManager.getColor("Button.light"));
	    btnNewButton.setForeground(Color.BLACK);
	    btnNewButton.setFont(new Font("Times New Roman", Font.BOLD, 15));
	    btnNewButton.setBounds(404, 51, 144, 34);
	    panel.add(btnNewButton);
	    
	    //// prooblema la cas
	    btnNewButton.addActionListener(e->ProduseController.adaugaInCos((int)table.getValueAt(row, 0)));
	      
	    JButton btnVeziPromo = new JButton("Vezi promo");
	    btnVeziPromo.setFont(new Font("Times New Roman", Font.BOLD, 15));
	    btnVeziPromo.setForeground(Color.BLACK);
	    btnVeziPromo.setBounds(404, 115, 144, 34);
        panel.add(btnVeziPromo);
        
        btnVeziPromo.addActionListener(e->ProduseController.veziPromo());
	      
        JButton btnVeziCos = new JButton("Vezi cos");
        btnVeziCos.setForeground(Color.BLACK);
        btnVeziCos.setFont(new Font("Times New Roman", Font.BOLD, 15));
        btnVeziCos.setBounds(404, 182, 144, 34);
        panel.add(btnVeziCos);
        
        btnVeziCos.addActionListener(e->ProduseController.veziCos());
	      
        JButton btnDetaliiCont = new JButton("Detalii cont");
        btnDetaliiCont.setFont(new Font("Times New Roman", Font.BOLD, 13));
        btnDetaliiCont.setBackground(UIManager.getColor("Button.shadow"));
        btnDetaliiCont.setForeground(new Color(0, 0, 51));
        btnDetaliiCont.setBounds(404, 308, 144, 34);
        panel.add(btnDetaliiCont);
        
        btnDetaliiCont.addActionListener(e->LoginController.infoClient());
        
        JLabel lblX = new JLabel("X");
        lblX.setHorizontalAlignment(SwingConstants.CENTER);
        lblX.setFont(new Font("Tahoma", Font.BOLD, 15));
        lblX.setForeground(SystemColor.text);
        lblX.setBounds(579, 0, 46, 14);
    	lblX.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		lblX.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent arg0) {
				dispose();
			}
		});
		
        panel.add(lblX);
        
        JTextPane txtpnProduse = new JTextPane();
        txtpnProduse.setForeground(UIManager.getColor("TextField.inactiveForeground"));
        txtpnProduse.setFont(new Font("Sitka Heading", Font.BOLD | Font.ITALIC, 28));
        txtpnProduse.setBackground(SystemColor.activeCaptionText);
        txtpnProduse.setText("Produse");
        txtpnProduse.setBounds(129, 42, 114, 58);
        panel.add(txtpnProduse);
        setUndecorated(true);
        
        this.setSize(625, 407); 
	}
	
	public DefaultTableModel getTable()
	{
		return tbModel;
	}
}
