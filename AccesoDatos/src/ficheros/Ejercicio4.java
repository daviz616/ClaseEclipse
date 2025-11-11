package ficheros;

import java.io.File;
import java.util.Scanner;
public class Ejercicio4 {
	
	    public static void main(String[] args) {
	        Scanner sc = new Scanner(System.in);
	        System.out.print("Ruta del directorio: ");
	        String ruta = sc.nextLine();
	        File dir = new File(ruta);
	        if (dir.exists() && dir.isDirectory()) {
	   File[] elementos = dir.listFiles();
	            for (File f : dir.listFiles()) {
	                System.out.println((f.isDirectory() ? "[DIR] " : "[FILE] ") + f.getName());
	            }
	        } else {
	            System.out.println("No existe o no es un directorio.");
	        }
	    }
}
