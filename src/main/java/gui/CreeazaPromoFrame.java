package gui;

import java.awt.BorderLayout;
import java.awt.Cursor;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.SystemColor;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import javax.swing.JTextPane;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.SwingConstants;
import javax.swing.border.BevelBorder;

public class CreeazaPromoFrame extends JFrame {

	private JPanel contentPane;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	private JLabel lblX;
	private JTextPane txtpnCreeazaPromotie;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					CreeazaPromoFrame frame = new CreeazaPromoFrame();
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
	public CreeazaPromoFrame() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 496, 355);
		contentPane = new JPanel();
		contentPane.setBackground(SystemColor.windowText);
		contentPane.setBorder(new BevelBorder(BevelBorder.LOWERED, null, null, null, null));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JTextPane txtpnDenumireProdus = new JTextPane();
		txtpnDenumireProdus.setBackground(SystemColor.windowText);
		txtpnDenumireProdus.setForeground(SystemColor.activeCaptionBorder);
		txtpnDenumireProdus.setFont(new Font("Tahoma", Font.BOLD, 13));
		txtpnDenumireProdus.setText("Denumire produs");
		txtpnDenumireProdus.setBounds(46, 65, 141, 37);
		contentPane.add(txtpnDenumireProdus);
		
		textField = new JTextField();
		textField.setBackground(SystemColor.info);
		textField.setBounds(197, 65, 161, 25);
		contentPane.add(textField);
		textField.setColumns(10);
		
		JTextPane txtpnPretVechi = new JTextPane();
		txtpnPretVechi.setBackground(SystemColor.windowText);
		txtpnPretVechi.setForeground(SystemColor.activeCaptionBorder);
		txtpnPretVechi.setFont(new Font("Tahoma", Font.BOLD, 13));
		txtpnPretVechi.setText("Pret vechi ");
		txtpnPretVechi.setBounds(46, 107, 141, 25);
		contentPane.add(txtpnPretVechi);
		
		JTextPane txtpnPretNou = new JTextPane();
		txtpnPretNou.setBackground(SystemColor.windowText);
		txtpnPretNou.setForeground(SystemColor.activeCaptionBorder);
		txtpnPretNou.setFont(new Font("Tahoma", Font.BOLD, 13));
		txtpnPretNou.setText("Pret nou");
		txtpnPretNou.setBounds(46, 155, 141, 25);
		contentPane.add(txtpnPretNou);
		
		textField_1 = new JTextField();
		textField_1.setBackground(SystemColor.info);
		textField_1.setBounds(197, 101, 161, 25);
		contentPane.add(textField_1);
		textField_1.setColumns(10);
		
		textField_2 = new JTextField();
		textField_2.setBackground(SystemColor.info);
		textField_2.setBounds(197, 143, 161, 25);
		contentPane.add(textField_2);
		textField_2.setColumns(10);
		
		JButton btnOk = new JButton("OK");
		btnOk.setFont(new Font("Times New Roman", Font.BOLD, 15));
		btnOk.setBackground(SystemColor.controlHighlight);
		btnOk.setForeground(SystemColor.textText);
		btnOk.setBounds(158, 229, 114, 37);
		contentPane.add(btnOk);
		
		lblX = new JLabel("X");
		lblX.setHorizontalAlignment(SwingConstants.CENTER);
		lblX.setForeground(SystemColor.text);
		lblX.setFont(new Font("Tahoma", Font.BOLD, 15));
		lblX.setBounds(450, 0, 46, 14);
		
		lblX.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		lblX.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent arg0) {
				dispose();
			}
		});
		
		contentPane.add(lblX);
		
		txtpnCreeazaPromotie = new JTextPane();
		txtpnCreeazaPromotie.setForeground(SystemColor.activeCaption);
		txtpnCreeazaPromotie.setFont(new Font("Tahoma", Font.BOLD, 22));
		txtpnCreeazaPromotie.setBackground(SystemColor.activeCaptionText);
		txtpnCreeazaPromotie.setText("Creeaza promotie");
		txtpnCreeazaPromotie.setBounds(127, 0, 210, 30);
		contentPane.add(txtpnCreeazaPromotie);
		
		setUndecorated(true);
	}

}
