package Windows;

import java.awt.EventQueue;
import javax.swing.JFrame;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import java.awt.Color;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.Timer;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;
import javax.swing.SwingConstants;
import java.awt.Font;
import javax.swing.JProgressBar;

public class Ejercicio7 {

    private JFrame frame;
    Timer tiempo;
    int i = 0;
    int porcentaje = 0;

    public static void main(String[] args) {
        EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    Ejercicio7 window = new Ejercicio7();
                    window.frame.setVisible(true);
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        });
    }

    public Ejercicio7() {
        initialize();
    }

    private void initialize() {

        frame = new JFrame();
        frame.setBounds(100, 100, 450, 300);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.getContentPane().setLayout(null);

        JLabel lblNewLabel = new JLabel("10");
        lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
        lblNewLabel.setFont(new Font("Arial", Font.BOLD, 20));
        lblNewLabel.setOpaque(true);
        lblNewLabel.setBounds(314, 42, 43, 45);
        lblNewLabel.setBackground(new Color(255, 128, 0));
        frame.getContentPane().add(lblNewLabel);

        JLabel lblNewLabel_1 = new JLabel("FELIZ PUENTE!!!!!");
        lblNewLabel_1.setFont(new Font("Arial", Font.BOLD, 18));
        lblNewLabel_1.setHorizontalAlignment(SwingConstants.CENTER);
        lblNewLabel_1.setOpaque(true);
        lblNewLabel_1.setBackground(new Color(0, 255, 64));
        lblNewLabel_1.setBounds(132, 147, 168, 31);
        lblNewLabel_1.setVisible(false);
        frame.getContentPane().add(lblNewLabel_1);

        JButton btnNewButton = new JButton("Start");
        btnNewButton.setFont(new Font("Arial", Font.BOLD, 18));
        btnNewButton.setBounds(10, 219, 73, 31);
        frame.getContentPane().add(btnNewButton);

        JButton btnNewButton_1 = new JButton("Salir");
        btnNewButton_1.setFont(new Font("Arial", Font.BOLD, 18));
        btnNewButton_1.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                frame.dispose();
                System.exit(0);
            }
        });
        btnNewButton_1.setBounds(347, 219, 77, 31);
        frame.getContentPane().add(btnNewButton_1);

        JProgressBar progressBar = new JProgressBar();
        progressBar.setValue(0);
        progressBar.setFont(new Font("Tahoma", Font.BOLD, 11));
        progressBar.setBounds(23, 42, 238, 45);
        frame.getContentPane().add(progressBar);

        // TIMER
        tiempo = new Timer(1000, new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                i--;
                lblNewLabel.setText(String.valueOf(i));

                porcentaje += 10;
                progressBar.setValue(porcentaje);

                if (i > 0) {
                    int x = lblNewLabel_1.getX() + 10;
                    int y = lblNewLabel_1.getY() + 5;
                    lblNewLabel_1.setLocation(x, y);
                }

                if (i == 0) {
                    tiempo.stop();
                    lblNewLabel_1.setVisible(true);
                    btnNewButton.setEnabled(true);
                    porcentaje = 0;
                    progressBar.setValue(100);
                    JOptionPane.showMessageDialog(null,
                            "Enhorabuena ya no queda nada",
                            "AL RECREO", 1);
                }
            }
        });

        // START ACTION
        btnNewButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                i = 10;
                porcentaje = 0;
                lblNewLabel.setText("10");
                progressBar.setValue(0);
                lblNewLabel_1.setVisible(false);

                btnNewButton.setEnabled(false);
                tiempo.start();
            }
        });

        // NO necesario ― ya controlado en timer
        progressBar.addChangeListener(new ChangeListener() {
            @Override
            public void stateChanged(ChangeEvent e) {
            }
        });
    }
}
