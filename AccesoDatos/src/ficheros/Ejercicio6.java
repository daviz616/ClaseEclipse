package ficheros;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;
	public class Ejercicio6 {
	    public static void main(String[] args) {
	        Scanner sc = new Scanner(System.in);
	        System.out.print("Introduce el nombre del fichero: ");
	        String nombre = sc.nextLine();
	        File f = new File(nombre);
	        try {
	            if (f.exists()) {
	                System.out.println("El fichero ya existe en: " + f.getAbsolutePath());
	            } else {
	                if (f.createNewFile()) {
	                    System.out.println("Fichero creado.");
	                    boolean cambiado = f.setReadable(true, false); // solo lectura
	                    if (cambiado) {
	                        System.out.println("Permisos cambiados a solo lectura.");
	                    }
	                }
	            }
	        } catch (IOException e) {
	            System.out.println("Error al crear el fichero.");
	        }
	        sc.close();
	    }
	}