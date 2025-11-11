package ficheros;
import java.io.*;
import java.util.*;

public class Ejercicio1 {
	public static void main(String[] args) {
       Scanner scanner = new Scanner(System.in);
       System.out.print("Introduce la ruta del directorio: ");
       String ruta = scanner.nextLine();
       File directorio = new File(ruta);
if (directorio.exists()) {
           String[] elementos = directorio.list();
          
           for (int i = 0; i < elementos.length; i++) {
               System.out.println(elementos[i]);
           }
	
}  else {
               System.out.println("El directorio está vacío.");
           }
	scanner.close();
	}
}
