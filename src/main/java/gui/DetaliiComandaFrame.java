package gui;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Cursor;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.border.EmptyBorder;
import javax.swing.table.DefaultTableModel;

import java.awt.SystemColor;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import javax.swing.JTextPane;
import java.awt.Font;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.SwingConstants;
import javax.swing.border.BevelBorder;

public class DetaliiComandaFrame extends JFrame {

	private JPanel contentPane;
	private JTextField txtAiciETextfield;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					DetaliiComandaFrame frame = new DetaliiComandaFrame();
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
	public DetaliiComandaFrame() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 508, 411);
		contentPane = new JPanel();
		contentPane.setBorder(new BevelBorder(BevelBorder.LOWERED, null, null, null, null));
		contentPane.setLayout(new BorderLayout(0, 0));
		setContentPane(contentPane);
		this.setTitle("Detalii comanda");
	    JPanel panel = new JPanel();
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
	    scrollPane.setBounds(47, 77, 395, 138);
	    panel.add(scrollPane);
	    this.getContentPane().add(panel);
	    
	    JTextPane txtpnSelectieMetodaPlata = new JTextPane();
	    txtpnSelectieMetodaPlata.setBackground(SystemColor.activeCaptionText);
	    txtpnSelectieMetodaPlata.setForeground(SystemColor.activeCaptionBorder);
	    txtpnSelectieMetodaPlata.setFont(new Font("Times New Roman", Font.PLAIN, 17));
	    txtpnSelectieMetodaPlata.setText("Selectie metoda plata:");
	    txtpnSelectieMetodaPlata.setBounds(75, 225, 167, 28);
	    panel.add(txtpnSelectieMetodaPlata);
	    
	    JComboBox comboBox = new JComboBox();
	    comboBox.setModel(new DefaultComboBoxModel(new String[] {"Card", "Ramburs"}));
	    comboBox.setBounds(268, 225, 133, 28);
	    panel.add(comboBox);
	    
	    JTextPane txtpnAdresa = new JTextPane();
	    txtpnAdresa.setFont(new Font("Times New Roman", Font.PLAIN, 17));
	    txtpnAdresa.setForeground(SystemColor.activeCaptionBorder);
	    txtpnAdresa.setBackground(SystemColor.activeCaptionText);
	    txtpnAdresa.setText("Adresa:");
	    txtpnAdresa.setBounds(75, 279, 78, 28);
	    panel.add(txtpnAdresa);
	    
	    txtAiciETextfield = new JTextField();
	    txtAiciETextfield.setText("aici e textField, si o sa punem adresa ");
	    txtAiciETextfield.setForeground(SystemColor.text);
	    txtAiciETextfield.setBackground(SystemColor.activeCaptionText);
	    txtAiciETextfield.setBounds(173, 269, 219, 60);
	    panel.add(txtAiciETextfield);
	    txtAiciETextfield.setColumns(10);
	    
	    JButton btnFinali = new JButton("Finalizare comanda");
	    btnFinali.setForeground(SystemColor.inactiveCaptionText);
	    btnFinali.setBackground(SystemColor.menu);
	    btnFinali.setFont(new Font("Tahoma", Font.BOLD, 13));
	    btnFinali.setBounds(154, 340, 167, 28);
	    panel.add(btnFinali);
	    
	    JLabel lblX = new JLabel("X");
	    lblX.setHorizontalAlignment(SwingConstants.CENTER);
	    lblX.setForeground(SystemColor.window);
	    lblX.setFont(new Font("Tahoma", Font.BOLD, 15));
	    lblX.setBounds(452, 0, 46, 14);
		lblX.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		lblX.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent arg0) {
				dispose();
			}
		});
		
	    panel.add(lblX);
	    
	    JTextPane txtpnDetaliiDespreComanda = new JTextPane();
	    txtpnDetaliiDespreComanda.setForeground(SystemColor.activeCaption);
	    txtpnDetaliiDespreComanda.setFont(new Font("Palatino Linotype", Font.BOLD, 22));
	    txtpnDetaliiDespreComanda.setBackground(SystemColor.activeCaptionText);
	    txtpnDetaliiDespreComanda.setText("Detalii despre comanda");
	    txtpnDetaliiDespreComanda.setBounds(119, 0, 282, 47);
	    panel.add(txtpnDetaliiDespreComanda);
	    
	    setUndecorated(true);
	}
}
