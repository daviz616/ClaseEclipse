package Hilos3;



public class Principal {
	
	private static final int NUM_HILOS = 10;
	private static final int CUENTA_TOTAL = 100000;

	public static void main(String[] args) {
		Contador contCompartido = new Contador();
		Thread [] hilos = new Thread[NUM_HILOS];
		
		for (int i = 0; i < NUM_HILOS; i++) {
			
			Thread th = new Thread (new Hilo(i, CUENTA_TOTAL/NUM_HILOS, contCompartido));
			th.start();
			hilos[i] = th;
			
		}
		
		for(Thread h: hilos) {
			try {
				h.join();
			} catch(InterruptedException e) {
				System.out.println("Excepcion por interrupcion");
			}
		}
		
		System.out.println("");
	}
		
}
	