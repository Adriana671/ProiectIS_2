package gui;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Cursor;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.SystemColor;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import javax.swing.DefaultComboBoxModel;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.JTextPane;
import javax.swing.SwingConstants;
import javax.swing.border.BevelBorder;
import javax.swing.border.EmptyBorder;
import javax.swing.table.DefaultTableModel;

public class ListaAdminiFrame extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					ListaAdminiFrame frame = new ListaAdminiFrame();
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
	private DefaultTableModel tbModel = new DefaultTableModel();
	public ListaAdminiFrame() {
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
	         { null, null},
	         { null, null},
	         { null, null},
	         { null, null},
	         { null, null},
	         { null, null},
	      };
	    String[] header = { "Nume", "Email"};
	    panel.setLayout(null);
	    JTable table = new JTable(rec, header);
	    table.setBackground(SystemColor.info);
	    table.setModel(new DefaultTableModel(
	    	new Object[][] {
	    	},
	    	new String[] {
	    		"Nume", "Email"
	    	}
	    ));
	    
	    tbModel = (DefaultTableModel) table.getModel();
	    
	    
	    JScrollPane scrollPane = new JScrollPane(table);
	    scrollPane.setBounds(59, 169, 395, 138);
	    panel.add(scrollPane);
	    this.getContentPane().add(panel);
	    
	    JLabel lblX = new JLabel("X");
	    lblX.setHorizontalAlignment(SwingConstants.CENTER);
	    lblX.setForeground(SystemColor.window);
	    lblX.setFont(new Font("Tahoma", Font.BOLD, 15));
	    lblX.setBounds(458, 0, 46, 14);
		lblX.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		lblX.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent arg0) {
				dispose();
			}
		});
		
	    panel.add(lblX);
	    
	    JTextPane txtpnListaAdmini = new JTextPane();
	    txtpnListaAdmini.setBackground(SystemColor.activeCaptionText);
	    txtpnListaAdmini.setForeground(SystemColor.activeCaption);
	    txtpnListaAdmini.setFont(new Font("Times New Roman", Font.BOLD, 22));
	    txtpnListaAdmini.setText("Lista admini : ");
	    txtpnListaAdmini.setBounds(162, 91, 187, 50);
	    panel.add(txtpnListaAdmini);
	    
	    
	    setUndecorated(true);
	}
	public DefaultTableModel getTbModel() {
		return tbModel;
	}
	public void setTbModel(DefaultTableModel tbModel) {
		this.tbModel = tbModel;
	}

}
