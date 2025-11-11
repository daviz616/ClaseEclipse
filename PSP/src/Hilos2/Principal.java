package Hilos2;

public class Principal {

	public static void main(String[] args) {
		
		Thread h1 = new Thread(new Hilo("HILO1"));
		Thread h2 = new Thread(new Hilo("HILO2"));
		
		System.out.println("Desde hilo principal antes de lanzar otros hilos");
		
		h1.start();
		h2.start();
		
		try {
			h1.join();
			h2.join();
		} catch (InterruptedException e) {
			System.out.println("Interupción de hilo!!!");
		}
		
		System.out.println("Hilo principal terminado");
		
	}

}
