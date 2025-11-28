package EmailVentana;

import javax.swing.JFrame;

public class VentanaEmail extends JFrame{

	public VentanaEmail() {	
		setTitle("ENVIAR EMAIL");
		setSize(800, 600);

		setLocationRelativeTo(null);
		
		Panel miPanel= new Panel();		
		add(miPanel);		
	}

}
