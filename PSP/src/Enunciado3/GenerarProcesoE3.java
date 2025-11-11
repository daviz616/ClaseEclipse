package Enunciado3;

import java.io.IOException;
import java.util.List;
import java.util.ArrayList;

public class GenerarProcesoE3 {
    public void ejecutar(String ruta, String[] comandos) {
    	
    	List <String> nombreArgumentos = new ArrayList<>();

		if(ruta == null || ruta.isEmpty()) {
			System.out.println("El nombre de la ruta está mal");
		}

		nombreArgumentos.add(ruta);
		for(String parametros : comandos) {
		nombreArgumentos.add(parametros);
		}
		
		

        ProcessBuilder pb = new ProcessBuilder(ruta);
        pb.command(nombreArgumentos);
        pb.inheritIO();
        
        try {
            Process proceso = pb.start();
            System.out.println("Se lanzó el proceso y esperará a que el hijo termine");
            
            proceso.waitFor();
            
            System.out.println("Código de salida: " + proceso.exitValue());
            
        } catch (IOException | InterruptedException e) {
            e.printStackTrace();
        }
     }
   }
