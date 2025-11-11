import java.util.ArrayList;
import java.util.List;

public class GeneradorProceso {
	
	public void ejecutar() {
		
		List <String> nombreArgumentos = new ArrayList<>();
		
		nombreArgumentos.add("C:/Mycode/Sumar2Numeros.exe");
		
		nombreArgumentos.add("18");
		nombreArgumentos.add("20");
		
		//ProcessBuilder pb = new ProcessBuilder();
		 
		try {
			
			//Process proceso = pb.start();
			
		}catch(Exception e) {
			
			e.printStackTrace();
			
		}
		
	}

}
