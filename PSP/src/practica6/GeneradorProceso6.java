package practica6;

import java.io.*;

public class GeneradorProceso6 {
	
public void ejecutar (String ruta){
	
	Runtime rt = Runtime.getRuntime();
	Process proceso = null;
	String line;
	
	try {
		proceso = rt.exec(ruta);
		BufferedReader br = 
	new BufferedReader(new InputStreamReader(proceso.getInputStream()));
		while((line=br.readLine())!=null) {
			System.out.println(line);
		}
	}catch(Exception e) {
		e.printStackTrace();
		System.exit(1);
	}
	
	if(proceso!=null) {
		proceso.destroy();
	}
	
	try {
		proceso.waitFor();
	}catch(Exception e) {
		
		System.exit(2);
	}
	System.exit(0);
	}
	
}
