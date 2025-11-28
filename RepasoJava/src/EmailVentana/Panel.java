package EmailVentana;

import javax.swing.JPanel;

import java.awt.BorderLayout;
import java.awt.Color;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JLabel;
import javax.swing.SwingConstants;

public class Panel extends JPanel{
	public Panel() {
		setBackground(new Color(0, 128, 255));
		
		JButton btnNewButton = new JButton("Pusa enviar");
		btnNewButton.setBounds(175, 170, 89, 23);
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Operaciones.CrearEmail();
			}
		});
		setLayout(null);
		add(btnNewButton, BorderLayout.SOUTH);
		
		JLabel lblNewLabel = new JLabel("Enviar Email");
		lblNewLabel.setBackground(new Color(0, 0, 160));
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setBounds(151, 78, 136, 28);
		add(lblNewLabel, BorderLayout.NORTH);
	}
}
	


