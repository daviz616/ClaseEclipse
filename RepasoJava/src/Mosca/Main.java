package Mosca;

import java.awt.EventQueue;


public class Main {

	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
				  
					VentanaMosca miVentana= new VentanaMosca();		
					miVentana.setSize(1200, 800);
					miVentana.setVisible(true);				
					
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
		
		
		
	}

}
