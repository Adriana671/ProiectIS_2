package gui;

import java.awt.EventQueue;
import javax.swing.BorderFactory;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.border.EmptyBorder;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import java.awt.SystemColor;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import javax.swing.border.LineBorder;
import javax.swing.border.TitledBorder;
import java.awt.Color;
import java.awt.Cursor;

import javax.swing.JButton;
import java.awt.Font;
import javax.swing.UIManager;
import javax.swing.JLabel;
import javax.swing.SwingConstants;
import javax.swing.border.BevelBorder;
import javax.swing.JTextPane;

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
	    String[] header = { "Denumire", "Categorie", "Descriere","Cantitate","Pret" };
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
	    		{null, null, null, null, null},
	    		{null, null, null, null, null},
	    		{null, null, null, null, null},
	    	},
	    	new String[] {
	    		"Denumire", "Categorie", "Descriere", "Cantitate", "Pret"
	    	}
	    ));
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
	      
	    JButton btnVeziPromo = new JButton("Vezi promo");
	    btnVeziPromo.setFont(new Font("Times New Roman", Font.BOLD, 15));
	    btnVeziPromo.setForeground(Color.BLACK);
	    btnVeziPromo.setBounds(404, 115, 144, 34);
        panel.add(btnVeziPromo);
	      
        JButton btnVeziCos = new JButton("Vezi cos");
        btnVeziCos.setForeground(Color.BLACK);
        btnVeziCos.setFont(new Font("Times New Roman", Font.BOLD, 15));
        btnVeziCos.setBounds(404, 182, 144, 34);
        panel.add(btnVeziCos);
	      
        JButton btnDetaliiCont = new JButton("Detalii cont");
        btnDetaliiCont.setFont(new Font("Times New Roman", Font.BOLD, 13));
        btnDetaliiCont.setBackground(UIManager.getColor("Button.shadow"));
        btnDetaliiCont.setForeground(new Color(0, 0, 51));
        btnDetaliiCont.setBounds(404, 308, 144, 34);
        panel.add(btnDetaliiCont);
        
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
}
