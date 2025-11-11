package Enunciado2;

import java.io.IOException;
import java.util.List;
import java.util.ArrayList;

public class GenerarProcesoE2 {
    public void ejecutarYDestruir(String ruta, String archivoRuta) {
    	
    	List <String> nombreArgumentos = new ArrayList<>();

		if(ruta == null || ruta.isEmpty()) {
			System.out.println("El nombre de la ruta está mal");
		}

		nombreArgumentos.add(ruta);
		nombreArgumentos.add(archivoRuta);
        Process proceso = null;
        ProcessBuilder pb = new ProcessBuilder(ruta);
        
        try {
            proceso = pb.start();
            System.out.println("Se lanzó el proceso y esperará a que el hijo termine");
            
            proceso.waitFor();
            
            System.out.println("Código de salida: " + proceso.exitValue());
            
        } catch (IOException | InterruptedException e) {
            e.printStackTrace();
        } catch (IllegalThreadStateException e) {
            System.out.println("El proceso aún está en ejecución: " + e);
        } finally {
            if (proceso != null) {
                proceso.destroy(); 
                System.out.println("Proceso hijo destruido");
            }
        }
    }
}
