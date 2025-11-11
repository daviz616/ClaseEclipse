package Enunciado1;

import java.io.IOException;

public class GenerarProcesosE {
    public void ejecutarYDestruir(String ruta) {
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
