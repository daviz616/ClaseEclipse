package Mosca;

import java.awt.event.*;
import javax.swing.*;
import java.util.Random;

public class EventoMosca implements ActionListener {

    private JFrame frame;
    private JLabel lblMOSCA;
    private JLabel lblInfo;

    private int labelX, labelY;
    private int labelW, labelH;

    private int xM, yM;

    private Random random = new Random();

    public EventoMosca(JFrame frame, JLabel lblMOSCA) {

        this.frame = frame;
        this.lblMOSCA = lblMOSCA;

        
        this.labelX = lblMOSCA.getX();
        this.labelY = lblMOSCA.getY();
        this.labelW = lblMOSCA.getWidth();
        this.labelH = lblMOSCA.getHeight();

        
        lblInfo = new JLabel("Coordenadas");
        lblInfo.setBounds(542, 554, 150, 14);
        frame.getContentPane().add(lblInfo);

       
        frame.addMouseMotionListener(new MouseMotionAdapter() {
            @Override
            public void mouseMoved(MouseEvent e) {
                xM = e.getX();
                yM = e.getY();
            }
        });
    }

    @Override
    public void actionPerformed(ActionEvent e) {

        labelX = lblMOSCA.getX();
        labelY = lblMOSCA.getY();

        lblInfo.setText("Mx: " + xM + " My: " + yM);

        int distX = Math.abs(xM - labelX);
        int distY = Math.abs(yM - labelY);

        int limite = 75;

        
        if (distX < limite && distY < limite) {

            int moverX = random.nextInt(101) - 50;
            int moverY = random.nextInt(101) - 50;

            int nuevoX = Math.max(0, Math.min(labelX + moverX, frame.getWidth() - labelW));
            int nuevoY = Math.max(0, Math.min(labelY + moverY, frame.getHeight() - labelH));

            lblMOSCA.setLocation(nuevoX, nuevoY);
        }
    }
}


