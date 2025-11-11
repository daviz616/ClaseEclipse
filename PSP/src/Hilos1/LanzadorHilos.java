package Hilos1;

public class LanzadorHilos implements Runnable {
    private final String nombre;

    public LanzadorHilos(String nombre) {
        this.nombre = nombre;
    }

    @Override
    public void run() {
    	System.out.printf("Hola soy un hilo: %s. \n", this.nombre);
		System.out.printf("Hilo terminado. \n", this.nombre);
    }
}
