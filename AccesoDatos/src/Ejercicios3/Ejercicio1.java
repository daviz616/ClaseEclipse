package Ejercicios3;

import java.io.*;
import java.util.Scanner;

public class Ejercicio1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        try {
            
            System.out.print("¿Cuántos números de Fibonacci deseas generar? ");
            int n = sc.nextInt();

            
            File archivo = new File("fibonacci.bin");
            DataOutputStream salida = new DataOutputStream(new FileOutputStream(archivo));

            long a = 0, b = 1;

            
            for (int i = 0; i < n; i++) {
                salida.writeLong(a);
                long temp = a + b;
                a = b;
                b = temp;
            }
            salida.close();
            System.out.println("Serie guardada en " + archivo.getName());

          
            System.out.print("Introduce la posición del número que quieres ver (empezando en 0): ");
            int pos = sc.nextInt();

            if (pos < 0 || pos >= n) {
                System.out.println("Posición fuera de rango.");
                return;
            }

           
            DataInputStream entrada = new DataInputStream(new FileInputStream(archivo));

            for (int i = 0; i <= pos; i++) {
                a = entrada.readLong();
            }
            entrada.close();

            System.out.println("El número en la posición " + pos + " es: " + a);

        } catch (IOException e) {
            System.out.println("Error de entrada/salida: " + e.getMessage());
        }
    }
}
