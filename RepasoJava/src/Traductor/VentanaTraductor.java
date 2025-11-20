package Traductor;

import javax.swing.JFrame;

public class VentanaTraductor extends JFrame {
	
	public VentanaTraductor() {	
		setTitle("TRADUCTOR ES-IN");
		setSize(800, 600);
		setResizable(false);
		setLocationRelativeTo(null);		
		Panel miPanel= new Panel();		
		add(miPanel);		
	}		
}
