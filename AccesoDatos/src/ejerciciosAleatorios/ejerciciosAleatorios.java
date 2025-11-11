package ejerciciosAleatorios;
import java.io.File;
import java.io.IOException;
import java.io.RandomAccessFile;


public class ejerciciosAleatorios {
	public static void main(String[] args) {
		int numeroLista;//4 bytes
		String nombre = "Pedro";//2 bytes
		double nota;//8 bytes 
		try {
			File fichero = new File("datos.txt");
			fichero.createNewFile();
			
			RandomAccessFile raf = new RandomAccessFile(fichero,"rw");
			
			raf.writeInt(1);
			raf.writeChars(nombre);
			raf.writeDouble(6.5);
			
			
			System.out.println(raf.getFilePointer());
			//raf.seek(4);
			
			//Lee los siguientes 4 bytes
			//System.out.println(raf.readInt());
			String cadena = "";
			raf.seek(0);
			
			while(raf.getFilePointer()<raf.length()) {
				System.out.println(raf.readInt());
				for(int i = 0; i<nombre.length();i++) {
					cadena+=raf.readChar();
				}
			System.out.println(cadena);
			System.out.println(raf.readDouble());
		}
			}catch(IOException e) {
			e.printStackTrace();
		}
		
	}
}
