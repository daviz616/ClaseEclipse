package Mosca;

import javax.swing.*;


public class VentanaMosca extends JFrame {

    public JLabel lblMOSCA;

    public VentanaMosca() {

        setTitle("Atrapa la Mosca");
        setSize(800, 600);
        setResizable(false);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        PanelMosca miPanel = new PanelMosca();
        add(miPanel);

        
        lblMOSCA = new JLabel(new ImageIcon("bug-with-white-details_icon-icons.com_70544.png")); 
        lblMOSCA.setBounds(300, 200, 40, 40); 
        miPanel.add(lblMOSCA);

        
        EventoMosca evento = new EventoMosca(this, lblMOSCA);

        
        Timer timer = new Timer(30, evento);
        timer.start();
    }
}
