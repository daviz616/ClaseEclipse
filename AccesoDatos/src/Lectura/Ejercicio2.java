package Lectura;

import java.io.FileReader;
import java.io.IOException;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Ejercicio2 {
    public static void main(String[] args) {
        int totalCaracteres = 0;
        int aes = 0, es = 0, ies = 0, oes = 0, ues = 0;

        StringBuilder texto = new StringBuilder();

        // Leer el contenido del fichero carácter a carácter
        try (FileReader fichero = new FileReader("FicheroEjemplo.txt")) {
            int caracter;
            while ((caracter = fichero.read()) != -1) {
                totalCaracteres++;
                texto.append((char) caracter);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }

        // Pasar a minúsculas
        String textoStr = texto.toString().toLowerCase();

        // Usar expresión regular para buscar vocales
        Pattern patron = Pattern.compile("[aeiou]");
        Matcher match = patron.matcher(textoStr);

        while (match.find()) {
            String letra = match.group();
            if (letra.equals("a")) aes++;
            if (letra.equals("e")) es++;
            if (letra.equals("i")) ies++;
            if (letra.equals("o")) oes++;
            if (letra.equals("u")) ues++;
        }

        // Mostrar resultados
        System.out.println("Total de caracteres: " + totalCaracteres);
        System.out.println("Número de vocales:");
        System.out.println("a: " + aes);
        System.out.println("e: " + es);
        System.out.println("i: " + ies);
        System.out.println("o: " + oes);
        System.out.println("u: " + ues);
    }
}

