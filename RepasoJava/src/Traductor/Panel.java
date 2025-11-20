package Traductor;

import javax.swing.JPanel;
import java.awt.Dimension;
import javax.swing.JButton;
import javax.swing.JTextField;
import javax.swing.JLabel;

public class Panel extends JPanel{
	private JTextField palabraIN;
	private JTextField palabraOUT;
	private JButton traducir;
	private JLabel lblIN;
	private JLabel lblOUT;
	
	public Panel() {
		setSize(new Dimension(800, 600));
		setLayout(null);
		
		traducir = new JButton("TRADUCIR");
		traducir.setBounds(173, 272, 130, 40);
		
		add(traducir);
		
		palabraIN = new JTextField();
		palabraIN.setBounds(334, 189, 130, 33);
		add(palabraIN);
		palabraIN.setColumns(10);
		
		lblIN = new JLabel("PALABRA PARA TRADUCIR");
		lblIN.setBounds(173, 185, 151, 40);
		add(lblIN);
		
		lblOUT = new JLabel("PALABRA TRADUCIDA");
		lblOUT.setBounds(173, 362, 151, 40);
		add(lblOUT);
		
		palabraOUT = new JTextField();
		palabraOUT.setEnabled(false);
		palabraOUT.setBounds(334, 362, 130, 30);
		add(palabraOUT);
		palabraOUT.setColumns(10);
		
		traducir.addActionListener(new EventoTraducir(palabraIN, palabraOUT));
	}
}
