package Traductor;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.IOException;

import javax.swing.JOptionPane;
import javax.swing.JTextField;

public class EventoTraducir implements ActionListener {


	JTextField palabraIN,palabraOUT;
	
	
	public EventoTraducir(JTextField palabraIN, JTextField palabraOUT) {		
		this.palabraIN=palabraIN;
		this.palabraOUT=palabraOUT;	
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		
		//1. Control errores -> En función privada?
			if(palabraIN.getText().isBlank()!=true) {
				
				try {
					palabraOUT.setText(Operaciones.traducir(palabraIN.getText()));
				} catch (IOException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
				
				
			}else {
				
				JOptionPane.showMessageDialog(null, 
						"NO se ha intruducido un texto correcto", "ERROR", 0);
				
			}
		
		
	}
}
