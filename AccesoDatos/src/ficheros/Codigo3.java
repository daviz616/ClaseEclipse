package ficheros;

import java.io.*;

public class Codigo3 {

	public static void main(String[] args) {
		
		//Dentro de new File se pone la ruta del archivo o fichero
		File fichero = new File("FicheroEjemplo.txt");
		
		if(!fichero.exists()) {
			
			try {
				// Crear el fichero
				fichero.createNewFile();
			}catch(IOException e) {
				e.getMessage();
			}
		}
		
		System.out.println("Nombre fichero "+fichero.getName());
		System.out.println("Ruta "+fichero.getPath());
		System.out.println("Ruta absoluta "+fichero.getAbsolutePath());
		System.out.println("Permiso lectura: "+fichero.canRead());
		System.out.println("Tamaño "+fichero.length());
		
		try {
			//FileWriter escritura = new FileWriter(fichero);
			BufferedWriter pw = new BufferedWriter(new FileWriter(fichero,true));
			
			for(int i=0;i<10;i++) {
				pw.write("Linea: "+i);
				pw.newLine();
			}
			pw.close();
			
				//Devuelve caracter a caracter
				FileReader lector = new FileReader(fichero);
				//lleno el buffer de los caracteres y leo lineas
				BufferedReader buffer = new BufferedReader(lector);
				String linea;
				while((linea=buffer.readLine())!=null) {
					System.out.println(linea);
				}
			lector.close();
			
			}catch(IOException e) {
				e.printStackTrace();
			}finally {
				System.out.println("Adios");
			}
		

	}

}
