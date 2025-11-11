package practica5;


public class Principal5 {
	public static void main(String[] args) {
		
		String ruta = "ipconfig";
		String[] parametros= {"/all"};
		GenerarProceso5 lanzador = new GenerarProceso5();
		lanzador.ejecutar(ruta, parametros);
		
	}
}
