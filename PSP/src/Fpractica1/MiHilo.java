package Fpractica1;

import java.util.Random;


public class MiHilo extends Thread {

	
		@Override
		public void run () {
			//El hilo inicalmente duerme una cantidad aleatoria de ms
			Random random = new Random();
			long mseconds = random.nextLong(1000);
			try {
				Thread.sleep(mseconds);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			System.out.println("Soy el hilo "+this.getName());
		}
}
