package JavaNIO;

import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardCopyOption;
import java.nio.file.StandardOpenOption;
import java.util.List;
import java.util.stream.Stream;

public class Main {
/*Lectura con clase Files de Java.NIO*/
	public static void LeerFiles() {
		Path ruta = Paths.get("planetas.txt");
		try {
			/*Lee todo el contenido del fichero*/
			String contenido = Files.readString(ruta);
			System.out.println(contenido);
			System.out.println("------------------");
			
			List<String> listaContenido = Files.readAllLines(ruta);
			for(String linea:listaContenido){
				System.out.println("linea: "+linea);
			}			
		}catch(IOException e) {
			e.getMessage();
		}
	}
	
	public static void EscrituraFiles() {
		Path ruta = Paths.get("FicheroEscritura.txt");
		try {
			String contenido = "Hola esta es mi primera escritura";
			Files.write(ruta, contenido.getBytes(StandardCharsets.UTF_8), StandardOpenOption.CREATE);
		}catch(IOException e) {
			e.printStackTrace();
		}
	}
	
	public static void Copiar() {
		Path rutaOrigen = Paths.get("FicheroEscritura.txt");
		Path rutaDestino = Paths.get("FicheroCopia.txt");
		try {
			Files.copy(rutaOrigen,rutaDestino,StandardCopyOption.REPLACE_EXISTING);
		}catch(IOException e) {
			e.printStackTrace();
		}
	}
	
	public static void listaContenidos() {
		Path  directorio = Path.of(".");
		try(Stream<Path> flujo = Files.list(directorio)){
			flujo.forEach(archivo-> System.out.println(archivo.getFileName()));
			
		}catch(IOException e) {
			e.printStackTrace();
		}
	}
	
	public static void PropiedadesFichero() {
		
	Path ruta = Path.of("primos.txt");
	System.out.println("Fichero existe: "+Files.exists(ruta));
	System.out.println("Fichero es directorio: "+Files.isDirectory(ruta));
	}
	
	public static void BorrarFichero() {
	
		Path ruta = Path.of("primos.txt");
		try {
		Files.deleteIfExists(ruta);
		}catch(IOException e) {
			e.getMessage();
		}
	}
	
	public static void main(String[] args) {
		LeerFiles();
		EscrituraFiles();
		Copiar();
		PropiedadesFichero();
		BorrarFichero();
	}
}
