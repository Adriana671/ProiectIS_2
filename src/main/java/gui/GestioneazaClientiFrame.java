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

import controller.AdminController;
import controller.CreateUserController;

import java.awt.SystemColor;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

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
	private JTable table;
	private DefaultTableModel tbModel = new DefaultTableModel();
	private int row,column;
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
	    String[] header = { "Id","Nume", "Varsta", "Adresa","Email"};
	    panel.setLayout(null);
	    table = new JTable(rec, header);
	    table.setBackground(SystemColor.info);
	    table.setModel(new DefaultTableModel(
	    	new Object[][] {
	    	},
	    	new String[] {
	    		"Id","Nume", "Varsta", "Adresa", "Email"
	    	}
	    ));
	    
	    table.addMouseListener(new MouseListener() {

			@Override
			public void mouseClicked(MouseEvent e) {
	    	    if (e.getClickCount() == 1) {
	    	    	row = table.getSelectedRow();
	    	    	column=table.getSelectedColumn();
	    	    	System.out.println(table.getValueAt(row, column));
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
	    scrollPane.setBounds(10, 104, 369, 144);
	    panel.add(scrollPane);
	    this.getContentPane().add(panel);
	    
	    JButton btnAdaugaClient = new JButton("Adauga client");
	    btnAdaugaClient.setBounds(468, 102, 120, 33);
	    btnAdaugaClient.setBackground(SystemColor.controlHighlight);
	    btnAdaugaClient.setForeground(SystemColor.textText);
	    panel.add(btnAdaugaClient);
	    
	    btnAdaugaClient.addActionListener(e->CreateUserController.createAcc());
	    
	    JButton btnStergeClient = new JButton("Sterge client");
	    btnStergeClient.setBounds(468, 171, 120, 33);
	    btnStergeClient.setBackground(SystemColor.controlHighlight);
	    btnStergeClient.setForeground(SystemColor.textText);
	    panel.add(btnStergeClient);
	    
	    btnStergeClient.addActionListener(e->AdminController.stergeClient((int)table.getValueAt(row, 0)));
	    
	    JButton btnModificaClient = new JButton("Modifica client");
	    btnModificaClient.setBounds(468, 235, 120, 33);
	    btnModificaClient.setBackground(SystemColor.controlHighlight);
	    btnModificaClient.setForeground(SystemColor.textText);
	    panel.add(btnModificaClient);
	    
	    btnModificaClient.addActionListener(e->AdminController.modifClient((int)table.getValueAt(row, 0)));
	    
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
	public DefaultTableModel getTbModel() {
		return tbModel;
	}
	public void setTbModel(DefaultTableModel tbModel) {
		this.tbModel = tbModel;
	}
	public JTable getTable() {
		return table;
	}
	public void setTable(JTable table) {
		this.table = table;
	}

}
