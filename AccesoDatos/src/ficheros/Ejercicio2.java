 package ficheros;
import java.io.*;
import java.util.*;
public class Ejercicio2 {
	public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);
       System.out.print("Nombre del fichero: ");
       String nombre = sc.nextLine();
       File f = new File(nombre);
       if (f.exists()) {
           if (f.delete()) System.out.println("Fichero borrado.");
           else System.out.println("No se pudo borrar.");
       } else {
           System.out.println("El fichero no existe.");
       }
       sc.close();
   }
}

