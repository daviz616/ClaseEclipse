package Windows;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import java.awt.CardLayout;
import java.awt.Color;
import javax.swing.JButton;
import javax.swing.JTextField;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Ejemplo2 {
	private int contador;
	private JFrame frame;
	private JTextField textField;
	private JTextField txtNclicks;
	private JPanel panel_1;
	private JPanel panel_2;
	private JButton btnNewButton_2;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Ejemplo2 window = new Ejemplo2();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public Ejemplo2() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		
		frame = new JFrame();
		frame.setBounds(100, 100, 450, 300);
		frame.setLocationRelativeTo(null);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(new CardLayout(0, 0));
		
		JPanel panel = new JPanel();
		panel.setBackground(Color.ORANGE);
		frame.getContentPane().add(panel, "name_23665305858700");
		panel.setLayout(null);
		
		JButton btnNewButton = new JButton("New button");
		btnNewButton.addActionListener(new ActionListener() {
			 public void actionPerformed(ActionEvent e) {
				 contador++;
				 textField.setText(Integer.toString(contador));
			}
		});
		btnNewButton.setBounds(63, 74, 89, 23);
		panel.add(btnNewButton);
		
		textField = new JTextField();
		textField.setBounds(259, 75, 86, 20);
		panel.add(textField);
		textField.setColumns(10);
		
		txtNclicks = new JTextField();
		txtNclicks.setText("nºclicks");
		txtNclicks.setBackground(Color.ORANGE);
		txtNclicks.setBounds(259, 50, 86, 20);
		panel.add(txtNclicks);
		txtNclicks.setColumns(10);
		
		JButton btnNewButton_1 = new JButton("Siguiente");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				panel.setVisible(false);
				panel_1.setVisible(true);
			}
		});
		btnNewButton_1.setBounds(166, 175, 89, 23);
		panel.add(btnNewButton_1);
		
		
		panel_1 = new JPanel();
		panel_1.setBackground(Color.YELLOW);
		frame.getContentPane().add(panel_1, "name_23665327024100");
		panel_1.setLayout(null);
		
		btnNewButton_2 = new JButton("Anterior");
		btnNewButton_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				panel_1.setVisible(false);
				panel.setVisible(true);
			}
		});
		btnNewButton_2.setBounds(41, 206, 89, 23);
		panel_1.add(btnNewButton_2);
		
		 panel_2 = new JPanel();
		panel_2.setBackground(Color.MAGENTA);
		frame.getContentPane().add(panel_2, "name_23665348736900");
		panel_2.setLayout(null);
	}
}
