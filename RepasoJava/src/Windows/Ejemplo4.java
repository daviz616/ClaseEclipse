package Windows;

import java.awt.Dimension;
import java.awt.EventQueue;
import java.awt.Toolkit;

import javax.swing.JFrame;

public class Ejemplo4 {

	private JFrame frame;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Ejemplo4 window = new Ejemplo4();
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
	public Ejemplo4() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	
	private void initialize() {
		
		Dimension monitor = Toolkit.getDefaultToolkit().getScreenSize();
		int height =(int) monitor.getHeight();
		int width =(int) monitor.getWidth();
		
		frame = new JFrame();
		frame.setBounds(100, 100, 450, 300);
		frame.setLocation((width/2 - frame.getWidth()/2), (height/2-frame.getHeight()/2));
		
		//(resolution_x/2)-(mi ventana_x/2),(resolucion_y/2)-(mi ventana_y/2)
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}

}
