 package Enunciado1;

public class PrincipalE {
	public static void main(String[] args){
		String ruta = "notepad";
		GenerarProcesosE lanzador = new GenerarProcesosE();	
		lanzador.ejecutarYDestruir(ruta);
		System.out.println("Proceso ejecutado!!");
		}
}
