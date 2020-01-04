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

import controller.ProduseController;

import javax.swing.JButton;
import java.awt.SystemColor;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.Font;
import javax.swing.JLabel;
import javax.swing.SwingConstants;
import javax.swing.border.BevelBorder;
import javax.swing.JEditorPane;
import javax.swing.UIManager;

public class PromoFrame extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					PromoFrame frame = new PromoFrame();
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
	private int row,column;
	private DefaultTableModel tbModel = new DefaultTableModel();
	public PromoFrame() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 508, 398);
		contentPane = new JPanel();
		contentPane.setBorder(new BevelBorder(BevelBorder.LOWERED, null, null, null, null));
		contentPane.setLayout(new BorderLayout(0, 0));
		setContentPane(contentPane);
		this.setTitle("Promotii");
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
	    scrollPane.setBounds(30, 71, 440, 197);
	    panel.add(scrollPane);
	    this.getContentPane().add(panel);
	    
	    JButton btnAdaugaInCos = new JButton("Adauga in cos");
	    btnAdaugaInCos.setFont(new Font("Tahoma", Font.BOLD, 13));
	    btnAdaugaInCos.setBackground(SystemColor.inactiveCaption);
	    btnAdaugaInCos.setForeground(SystemColor.activeCaptionText);
	    btnAdaugaInCos.setBounds(187, 296, 145, 32);
	    panel.add(btnAdaugaInCos);
	    
	    btnAdaugaInCos.addActionListener(e->ProduseController.adaugaInCos((int)table.getValueAt(row, 0)));
	    
	    JLabel lblX = new JLabel("X");
	    lblX.setHorizontalAlignment(SwingConstants.CENTER);
	    lblX.setForeground(SystemColor.text);
	    lblX.setFont(new Font("Tahoma", Font.BOLD, 15));
	    lblX.setBounds(458, 0, 46, 14);
	    panel.add(lblX);
	    
	    JLabel lblPromotii = new JLabel("Promotii ");
	    lblPromotii.setFont(new Font("Times New Roman", Font.BOLD | Font.ITALIC, 24));
	    lblPromotii.setForeground(SystemColor.activeCaption);
	    lblPromotii.setHorizontalAlignment(SwingConstants.CENTER);
	    lblPromotii.setBounds(114, 11, 249, 32);
		lblX.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		lblX.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent arg0) {
				dispose();
			}
		});
	    panel.add(lblPromotii);
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
