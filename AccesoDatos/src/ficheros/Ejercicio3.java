package ficheros;
import java.io.*;
import java.util.*;
public class Ejercicio3 {
	public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);
       System.out.print("Introduce el nombre del directorio: ");
       String dirNombre = sc.nextLine();
       System.out.print("Introduce el nombre del fichero: ");
       String ficheroNombre = sc.nextLine();
       File dir = new File(dirNombre);
       if (!dir.exists()) {
           dir.mkdir(); // crea el directorio si no existe
       }
       File fichero = new File(dir, ficheroNombre);
       try {
           if (fichero.createNewFile()) {
               System.out.println("Fichero creado: " + fichero.getAbsolutePath());
           } else {
               System.out.println("El fichero ya existe.");
           }
       } catch (IOException e) {
           System.out.println("Error al crear el fichero.");
       }
       sc.close();
   }
}

