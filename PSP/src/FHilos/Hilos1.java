package FHilos;

import java.util.Date;

public class Hilos1 implements Runnable{

public void run() {
		//Convierto el nombre del hilo en un número para mostrarlo por pantalla
		int threadNumber = Integer.parseInt(Thread.currentThread().getName());
		
		//El tiempo en ssii se mide en ms desde las 00:00:00 del 1/1/70
		long tsInicio = (new Date()).getTime();

		System.out.println("Comienza la ejecución del hilo = > " + threadNumber);

		try {

			//Simulamos que el hilo vive 2 secs
			Thread.sleep(2000);

		}catch(InterruptedException ex) {	
			ex.printStackTrace();
		}

		System.out.println("Llego a la meta, fin del hilo => " + threadNumber);
		long tsFinalizavion = (new Date()).getTime();

		System.out.println("Tardo " + (tsFinalizavion - tsInicio) /1000);
		registraFinEjecucionHilo(threadNumber);	
	}

	protected synchronized void registraFinEjecucionHilo(int threadNumber) {
		
	}
}
