package Clases;

enum Turnos{MAÑANA, TARDE}

public class Profesor extends Persona {
	
	
	
	int NºAsignaturas;
	boolean tutor;
	
	
	
	
	public Profesor(String dni, String nombre, String apellidos, double salario, int nºAsignaturas, boolean tutor) {
		super(dni,nombre,apellidos,salario);
		NºAsignaturas = nºAsignaturas;
		this.tutor = tutor;
	}
	
	@Override
	public String toString() {
	    return super.toString() + " | Profesor [Asignaturas=" + NºAsignaturas + ", Tutor=" + tutor + "]";
	}

	
	
	public int getNºAsignaturas() {
		return NºAsignaturas;
	}
	public void setNºAsignaturas(int nºAsignaturas) {
		NºAsignaturas = nºAsignaturas;
	}
	public boolean isTutor() {
		return tutor;
	}
	public void setTutor(boolean tutor) {
		this.tutor = tutor;
	}

	
}


