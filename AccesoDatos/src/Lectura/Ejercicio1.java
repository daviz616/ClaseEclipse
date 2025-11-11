package Lectura;

import java.io.FileReader;
import java.io.IOException;

public class Ejercicio1 {
    public static void main(String[] args) {
        try (FileReader fichero = new FileReader("FicheroEjemplo.txt")) {
            int caracter;
            while ((caracter = fichero.read()) != -1) {
                if (caracter != 32) { // O usa: if (!Character.isWhitespace((char) caracter))
                    System.out.print((char) caracter);
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
