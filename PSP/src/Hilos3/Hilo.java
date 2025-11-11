package Hilos3;


public class Hilo implements Runnable{
	
	int numHilo, miParte, miCuenta =0;
	private final Contador cont;
	

	Hilo (int numHilo, int miParte, Contador c){
		this.numHilo = numHilo;
		this.miParte = miParte;
		this.cont = c;
		
	}
	
	public int getmiCuenta() {
		return miCuenta;
	}
	
	
	public void run() {
		
		for (int i=0; i<miParte; i++) {
			this.cont.incrementa(); //incrementa el contador
			miCuenta++;
		}
		System.out.printf("Hilo %d terminado, cuenta: %d\n", numHilo, getmiCuenta());
		
	}
	
	
}
