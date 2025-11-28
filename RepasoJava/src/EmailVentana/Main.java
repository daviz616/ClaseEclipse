package EmailVentana;

import java.awt.EventQueue;



public class Main {

	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
				  
					VentanaEmail miVentana= new VentanaEmail();		
					miVentana.setSize(800, 600);
					miVentana.setVisible(true);				
					
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
		
		
		
	}

}
