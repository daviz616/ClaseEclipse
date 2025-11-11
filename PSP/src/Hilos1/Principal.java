package Hilos1;

public class Principal {
	
	public static void main (String[] args) {
		Thread h1 = new Thread(new LanzadorHilos("H1"));
		Thread h2 = new Thread(new LanzadorHilos("H2"));
		
		h1.start();
		h2.start();
		System.out.println("Hilo principal terminado");
	}
}
