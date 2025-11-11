package practica4;



public class Principal4 {
	public static void main(String[] args) {
		
		String ruta = "ipconfig";
		GenerarProceso4 lanzador = new GenerarProceso4();
		lanzador.ejecutar(ruta);
		System.out.println("Proceso lanzado con exito");
	}
}
