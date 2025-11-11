 package Enunciado2;

public class PrincipalE2 {
	public static void main(String[] args){
		String ruta = "notepad";
		String archivoRuta = "C:/Users/DAM/Documents/Marquitis.txt";
		
		GenerarProcesoE2 lanzador = new GenerarProcesoE2();	
		lanzador.ejecutarYDestruir(ruta, archivoRuta);
		System.out.println("Proceso ejecutado!!");
		}
}
