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

import javax.swing.JButton;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.SwingConstants;
import javax.swing.border.BevelBorder;
import javax.swing.JTextPane;

public class GestioneazaClientiFrame extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					GestioneazaClientiFrame frame = new GestioneazaClientiFrame();
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
	public GestioneazaClientiFrame() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 668, 369);
		contentPane = new JPanel();
		contentPane.setBorder(new BevelBorder(BevelBorder.LOWERED, null, null, null, null));
		contentPane.setLayout(new BorderLayout(0, 0));
		setContentPane(contentPane);
		this.setTitle("Promotii");
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
	    String[] header = { "Nume", "Varsta", "Adresa","Email"};
	    panel.setLayout(null);
	    JTable table = new JTable(rec, header);
	    table.setBackground(SystemColor.info);
	    table.setModel(new DefaultTableModel(
	    	new Object[][] {
	    		{null, null, null, null},
	    		{null, null, null, null},
	    		{null, null, null, null},
	    		{null, null, null, null},
	    		{null, null, null, null},
	    		{null, null, null, null},
	    		{null, null, null, null},
	    		{null, null, null, null},
	    	},
	    	new String[] {
	    		"Nume", "Varsta", "Adresa", "Email"
	    	}
	    ));
	    JScrollPane scrollPane = new JScrollPane(table);
	    scrollPane.setBounds(10, 104, 369, 144);
	    panel.add(scrollPane);
	    this.getContentPane().add(panel);
	    
	    JButton btnAdaugaClient = new JButton("Adauga client");
	    btnAdaugaClient.setBounds(468, 102, 120, 33);
	    btnAdaugaClient.setBackground(SystemColor.controlHighlight);
	    btnAdaugaClient.setForeground(SystemColor.textText);
	    panel.add(btnAdaugaClient);
	    
	    JButton btnStergeClient = new JButton("Sterge client");
	    btnStergeClient.setBounds(468, 171, 120, 33);
	    btnStergeClient.setBackground(SystemColor.controlHighlight);
	    btnStergeClient.setForeground(SystemColor.textText);
	    panel.add(btnStergeClient);
	    
	    JButton btnModificaClient = new JButton("Modifica client");
	    btnModificaClient.setBounds(468, 235, 120, 33);
	    btnModificaClient.setBackground(SystemColor.controlHighlight);
	    btnModificaClient.setForeground(SystemColor.textText);
	    panel.add(btnModificaClient);
	    
	    JLabel lblX = new JLabel("X");
	    lblX.setBounds(618, 0, 46, 14);
	    lblX.setForeground(SystemColor.text);
	    lblX.setHorizontalAlignment(SwingConstants.CENTER);
	    lblX.setFont(new Font("Tahoma", Font.BOLD, 15));
		lblX.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		lblX.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent arg0) {
				dispose();
			}
		});
	    panel.add(lblX);
	    
	    JTextPane txtpnGestionareClienti = new JTextPane();
	    txtpnGestionareClienti.setForeground(SystemColor.activeCaption);
	    txtpnGestionareClienti.setFont(new Font("Tahoma", Font.BOLD, 22));
	    txtpnGestionareClienti.setBackground(SystemColor.activeCaptionText);
	    txtpnGestionareClienti.setText("Gestionare clienti");
	    txtpnGestionareClienti.setBounds(194, 0, 223, 41);
	    panel.add(txtpnGestionareClienti);
	    
	    setUndecorated(true);
	}

}
