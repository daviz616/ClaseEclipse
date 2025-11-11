
public class Modulo {
	
	String nombre;
	int numHoras;
	Profesor profesor;
	boolean convalidable;
	
	public Modulo(String nombre, int numHoras, Profesor profesor, boolean convalidable) {
		super();
		this.nombre = nombre;
		this.numHoras = numHoras;
		this.profesor = profesor;
		this.convalidable = convalidable;
	}

	@Override
	public String toString() {
		return "Modulo [nombre=" + nombre +
				"\n numHoras=" + numHoras +
				"\n profesor=" + profesor + 
				"\n convalidable="+ convalidable;
	}
	
	
}
