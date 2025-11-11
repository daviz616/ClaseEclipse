package practica3;

import java.util.List;
import java.util.ArrayList;

public class GenerarProceso3 {
	
	
	public void ejecutar(String ruta) {
		
		List <String> nombreArgumentos = new ArrayList<>();
		nombreArgumentos.add(ruta);
		ProcessBuilder pb = new ProcessBuilder();
		pb.command(nombreArgumentos);
		
	}
}
