package ficheros;
import java.io.*;


public class Codigo1 {

	public static void main(String[] args) {
		
		File fichero = new File("FicheroEjemplo.txt");
		
		if(fichero.exists()) {
			
			
			System.out.println("Nombre fichero "+fichero.getName());
			System.out.println("Ruta "+fichero.getPath());
			System.out.println("Ruta absoluta "+fichero.getAbsolutePath());
			System.out.println("Tamaño "+fichero.length());
			System.out.println("Permiso lectura: "+fichero.canRead());
			try {
				//Devuelve caracter a caracter
				FileReader lector = new FileReader(fichero);
				//Lleno el buffer de los caracteres y leo lineas
				BufferedReader buffer = new BufferedReader (lector);
				String Linea;
				while((Linea=buffer.readLine())!=null) {
					System.out.println(Linea);
				}
			lector.close();	
			}catch(IOException e) {
				e.getMessage();
			}
		}else {
			System.out.println("No existe el fichero");
			try {
				fichero.createNewFile();
				
			}catch(IOException io) {
				io.printStackTrace();
			}
		}
	}

}
