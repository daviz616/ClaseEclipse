package enlaces;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JButton;
import javax.swing.JTextField;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;

import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JLabel;
import java.awt.Color;
import java.net.URLEncoder;
import java.nio.charset.StandardCharsets;


public class Traductor_ventana {

	private JFrame frame;
	private String palabra;
	private JLabel lblNewLabel;
	private JButton btnNewButton;
	private JButton btnNewButton_1;
	private JLabel  lblNewLabel_1;
	private JTextField textField;
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Traductor_ventana window = new Traductor_ventana();
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
	public Traductor_ventana() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 450, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		lblNewLabel = new JLabel("Palabra para traducir: ");
		lblNewLabel.setBackground(new Color(128, 255, 255));
		lblNewLabel.setAutoscrolls(true);
		lblNewLabel.setBounds(192, 63, 160, 23);
		frame.getContentPane().add(lblNewLabel);
		
		btnNewButton_1 = new JButton("Salir");
        btnNewButton_1.setFont(new Font("Arial", Font.BOLD, 18));
        btnNewButton_1.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                frame.dispose();
                System.exit(0);
            }
        });
        btnNewButton_1.setBounds(347, 219, 77, 31);
        frame.getContentPane().add(btnNewButton_1);
        
        btnNewButton = new JButton("Pulsa");
        btnNewButton.setBounds(30, 96, 89, 23);
        frame.getContentPane().add(btnNewButton);
        btnNewButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {

                palabra = textField.getText().trim();

                if (palabra.isEmpty()) {
                    lblNewLabel_1.setText("Introduce algo.");
                    return;
                }

                // ✔ Si es un número → traducir sin usar web
                if (palabra.matches("\\d+")) {
                    int num = Integer.parseInt(palabra);
                    String traducido = numeroAIngles(num);
                    lblNewLabel_1.setText(traducido.toUpperCase());
                    return;
                }

                // ✔ Si NO es número → usa SpanishDict como siempre
                try {
                    String palabraCodificada = URLEncoder.encode(palabra, StandardCharsets.UTF_8.toString());
                    String web = "https://www.spanishdict.com/translate/" + palabraCodificada;

                    Document document = Jsoup.connect(web).get();
                    Element traduccion = document.selectFirst("div#quickdef1-es a.tCur1iYh");

                    if (traduccion != null) {
                        lblNewLabel_1.setText(traduccion.text().toUpperCase());
                    } else {
                        lblNewLabel_1.setText("Sin resultados.");
                    }

                } catch (Exception ex) {
                    lblNewLabel_1.setText("Error.");
                }
            }
        });


        lblNewLabel_1 = new JLabel("");
        lblNewLabel_1.setOpaque(true);
        lblNewLabel_1.setBackground(new Color(128, 255, 255));
        lblNewLabel_1.setBounds(192, 149, 160, 40);
        frame.getContentPane().add(lblNewLabel_1);
        
        textField = new JTextField();
        textField.setBounds(192, 97, 160, 20);
        frame.getContentPane().add(textField);
        textField.setColumns(10);
	}
	private boolean campoVacio(JTextField tf) {
	    return tf.getText() == null || tf.getText().trim().isEmpty();
	}
	private String numeroAIngles(int n) {
	    String[] unidades = {"zero","one","two","three","four","five","six","seven","eight","nine"};
	    String[] especiales = {"ten","eleven","twelve","thirteen","fourteen","fifteen","sixteen","seventeen","eighteen","nineteen"};
	    String[] decenas = {"","","twenty","thirty","forty","fifty","sixty","seventy","eighty","ninety"};

	    if (n < 10) return unidades[n];
	    if (n < 20) return especiales[n - 10];
	    if (n < 100) {
	        int d = n / 10;
	        int u = n % 10;
	        return decenas[d] + (u > 0 ? "-" + unidades[u] : "");
	    }
	    if (n < 1000) {
	        int c = n / 100;
	        int resto = n % 100;
	        if (resto == 0) return unidades[c] + " hundred";
	        return unidades[c] + " hundred and " + numeroAIngles(resto);
	    }
	    if (n < 10000) {
	        int m = n / 1000;
	        int resto = n % 1000;
	        if (resto == 0) return unidades[m] + " thousand";
	        return unidades[m] + " thousand " + numeroAIngles(resto);
	    }

	    return "Número demasiado grande";
	}


}
