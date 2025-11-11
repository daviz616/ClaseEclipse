package practica5;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class GenerarProceso5 {
	
	public void ejecutar (String ruta, String [] args) {
		
		List <String> nombreArgumentos = new ArrayList<>();
		
		if(ruta == null || ruta.isEmpty()) {
			System.out.println("Falta el nombre del comando");
			System.exit(1);
		}
		nombreArgumentos.add(ruta);
		
		for(int i = 0; i<args.length; i++) {
			nombreArgumentos.add(args[i]);
		}
		
		ProcessBuilder pb = new ProcessBuilder();
		pb.command(nombreArgumentos);
		pb.inheritIO();
		
		try {

			Process proceso = pb.start();
			int codigoRetorno = proceso.waitFor();
			System.out.println("$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$");
			System.out.println("El comando devuelve: " + codigoRetorno);
			System.out.println("$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$");
			if(codigoRetorno == 0) {
				System.out.println("Ejecución correcta");
			}else {
				System.out.println("Ejecución con errores");
			}
		}catch(IOException e) {
			System.out.println("Error durante la ejecución del comando");
			System.out.println("Información adicional");
			e.printStackTrace();
			System.exit(2);
		}catch(InterruptedException e){
			System.err.println("Proceso interrumpido");
			System.exit(3);
		}

	}


}
