import java.io.File;
import java.util.Scanner;

	public class Permisos {
	    public static void main(String[] args) {
	        Scanner sc = new Scanner(System.in);
	        System.out.print("Nombre del fichero: ");
	        String nombre = sc.nextLine();

	        File f = new File(nombre);
	        if (f.exists()) {
	            String permisos = (f.canRead() ? "r" : "_")
	                            + (f.canWrite() ? "w" : "_")
	                            + (f.canExecute() ? "x" : "_");
	            System.out.println("Permisos actuales: " + permisos);

	            if (permisos.equals("rwx")) {
	                System.out.print("Cambiar permisos (r,w,x): ");
	                String p = sc.nextLine();
	                f.setReadable(p.contains("r"));
	                f.setWritable(p.contains("w"));
	                f.setExecutable(p.contains("x"));
	                System.out.println("Permisos cambiados.");
	            }
	        } else {
	            System.out.println("El fichero no existe.");
	        }
	    }
	}


