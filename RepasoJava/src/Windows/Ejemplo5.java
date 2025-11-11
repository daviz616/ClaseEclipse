package Windows;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLayeredPane;
import javax.swing.JPanel;
import javax.swing.JButton;
import java.awt.Color;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Ejemplo5 {

	private JFrame frame;
	private JPanel panel;
	private JPanel panel_1;
	private JPanel panel_2;
	private JButton btnNewButton_1;
	private JButton btnNewButton_2;
	private JButton btnNewButton_3;
	private JButton btnNewButton_4;
	private JButton btnNewButton_5;
	private JButton btnNewButton_6;
	
	private JLayeredPane layeredPane;   // <-- La pasamos aquí para poder usarla

	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Ejemplo5 window = new Ejemplo5();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	public Ejemplo5() {
		initialize();
	}

	private void initialize() {
		frame = new JFrame();
		frame.getContentPane().setEnabled(false);
		frame.getContentPane().setBackground(new Color(255, 255, 255));
        frame.setBounds(100, 100, 450, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		layeredPane = new JLayeredPane();
		layeredPane.setBounds(0, 0, 434, 261);
		frame.getContentPane().add(layeredPane);
		layeredPane.setLayout(null);
		
		
		panel = new JPanel();
		panel.setBackground(new Color(255, 128, 0));
		panel.setBounds(0, 0, 434, 261);
		layeredPane.add(panel);
		panel.setLayout(null);
		
		btnNewButton_1 = new JButton("Azul");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				panel.setVisible(false);
				panel_2.setVisible(false);
				panel_1.setVisible(true);

				layeredPane.revalidate();
				layeredPane.repaint();
			}
		});
		btnNewButton_1.setBounds(49, 145, 89, 23);
		panel.add(btnNewButton_1);
		
		btnNewButton_2 = new JButton("Verde");
		btnNewButton_2.setBounds(276, 145, 89, 23);
		panel.add(btnNewButton_2);
		btnNewButton_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				panel.setVisible(false);
				panel_1.setVisible(false);
 				panel_2.setVisible(true);

				layeredPane.revalidate();
				layeredPane.repaint();
			}
		});
		
		
		panel_1 = new JPanel();
		panel_1.setBackground(new Color(128, 255, 255));
		panel_1.setBounds(0, 0, 434, 261);
		layeredPane.add(panel_1);
		panel_1.setLayout(null);
		
		btnNewButton_3 = new JButton("Naranja");
		btnNewButton_3.setBounds(56, 136, 89, 23);
		panel_1.add(btnNewButton_3);
		btnNewButton_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				panel_1.setVisible(false);
				panel_2.setVisible(false);
				panel.setVisible(true);

				layeredPane.revalidate();
				layeredPane.repaint();
			}
		});
		
		btnNewButton_4 = new JButton("Verde");
		btnNewButton_4.setBounds(257, 134, 89, 23);
		panel_1.add(btnNewButton_4);
		
		
		panel_2 = new JPanel();
		panel_2.setBackground(new Color(0, 255, 0));
		panel_2.setBounds(0, 0, 434, 261);
		layeredPane.add(panel_2);
		panel_2.setLayout(null);
		
		btnNewButton_5 = new JButton("Naranja");
		btnNewButton_5.setBounds(67, 143, 89, 23);
		panel_2.add(btnNewButton_5);
		btnNewButton_5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				panel_2.setVisible(false);
				panel_1.setVisible(false);
				panel.setVisible(true);

				layeredPane.revalidate();
				layeredPane.repaint();
			}
		});
		
		btnNewButton_6 = new JButton("Azul");
		btnNewButton_6.setBounds(283, 145, 89, 23);
		panel_2.add(btnNewButton_6);
		btnNewButton_6.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				panel_2.setVisible(false);
				panel.setVisible(false);
				panel_1.setVisible(true);

				layeredPane.revalidate();
				layeredPane.repaint();
			}
		});
		
		btnNewButton_4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				panel_1.setVisible(false);
				panel.setVisible(false);
				panel_2.setVisible(true);

				layeredPane.revalidate();
				layeredPane.repaint();
			}
		});
	}
}
