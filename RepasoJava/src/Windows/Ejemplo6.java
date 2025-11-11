package Windows;

import java.awt.Component;
import java.awt.EventQueue;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;
import javax.swing.JFrame;
import javax.swing.JPanel;
import java.awt.Toolkit;

public class Ejemplo6 {

    private JFrame frame;

    public static void main(String[] args) {
        EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    Ejemplo6 window = new Ejemplo6();
                    window.frame.setVisible(true);
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        });
    }

    public Ejemplo6() {
        initialize();
    }

    private void initialize() {
        frame = new JFrame();   
        frame.setIconImage(Toolkit.getDefaultToolkit().getImage("C:\\Users\\DAM\\Downloads\\4988b5fe6617f7b2a31be7b31bc93408.jpg"));
        frame.setBounds(100, 100, 450, 300);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        frame.getContentPane().add(buscarImagen());
    }

    private Component buscarImagen() {
        BufferedImage fondo = null;

        try {
            fondo = ImageIO.read(new File("src/ninja-11935.jpg"));
        } catch (IOException e) {
            e.printStackTrace();
        }

        final Image foto = fondo;

        JPanel panelConFondo = new JPanel() {
            private static final long serialVersionUID = 1L;

            @Override
            protected void paintComponent(Graphics g) {
                super.paintComponent(g);
                g.drawImage(foto, 0, 0, getWidth(), getHeight(), null);
            }
        };

        return panelConFondo;
    }
}

