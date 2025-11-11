package Fpractica1;



public class Ejercicio1 {
	
	public static void main(String[] args) {
		
		final int NUM_HILOS = 15;
		System.out.println("Soy el hilo principal");
		
		//Declaro un array de hilos
		MiHilo arrayHilos[] = new MiHilo[NUM_HILOS];
		
		//Instancio un hilo más y lanzo exec.
		for(int i = 0; i < NUM_HILOS; i++) {
			
			arrayHilos[i] = new MiHilo();
			arrayHilos[i].setName("H"+i);
			arrayHilos[i].start();
			
		}
	
	}
}//Pseudocodigo hacer esto perov para reservar un asiento en un avion
// mutex(caso particular de una seccion critica) seccion critica = una seccion de codigo que necesito que se ejecute
//de forma atómica en esta seccion puedo tener n procesos a la vez ejecutando un mismo código
