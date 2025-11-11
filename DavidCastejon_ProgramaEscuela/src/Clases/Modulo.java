package Clases;

public class Modulo {
	String nombre;
	int nºhoras;
	Profesor unProfe;
	boolean convalidable;
	
	
	public Modulo(String nombre, int nºhoras, Profesor unProfe, boolean convalidable) {
		super();
		this.nombre = nombre;
		this.nºhoras = nºhoras;
		this.unProfe = unProfe;
		this.convalidable = convalidable;
	}


	@Override
	public String toString() {
	    return "Módulo: " + nombre + ", Horas: " + nºhoras + ", Convalidable: " + convalidable +
	           ", Profesor: " + unProfe.getNombre();
	}



	public String getNombre() {
		return nombre;
	}


	public void setNombre(String nombre) {
		this.nombre = nombre;
	}


	public int getNºhoras() {
		return nºhoras;
	}


	public void setNºhoras(int nºhoras) {
		this.nºhoras = nºhoras;
	}


	public Profesor getUnProfe() {
		return unProfe;
	}


	public void setUnProfe(Profesor unProfe) {
		this.unProfe = unProfe;
	}


	public boolean isConvalidable() {
		return convalidable;
	}


	public void setConvalidable(boolean convalidable) {
		this.convalidable = convalidable;
	}
	
	
	
	
	
}
