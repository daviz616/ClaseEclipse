package practica2;

public class Principalico {

	public static void main(String[] args) {
		
		String ruta = "C:/windows/system32";
		String nombre = "notepad.exe";
		
		GeneradorProceso lanzador = new GeneradorProceso();
		
		lanzador.ejecutar(ruta, nombre);
		
		System.out.println("Proceso ejecutado con exito");
		
	}

}

