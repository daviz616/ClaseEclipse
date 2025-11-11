package Enunciado3;


public class PrincipalE3 {
	public static void main(String[] args){
		String ruta = "cmd";
		String[] comandos = {"/c", "dir", "C:\\Users\\DAM\\eclipse-workspace"};
		GenerarProcesoE3 lanzador = new GenerarProcesoE3();	
		lanzador.ejecutar(ruta, comandos);
		System.out.println("Proceso ejecutado!!");
		}
	
	
}
