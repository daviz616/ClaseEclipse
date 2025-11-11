package Clases;

public class Directivos extends Persona {
	

	boolean salesiano;
	Turnos horario;
	
	
	public Directivos(String dni, String nombre, String apellidos, double salario, boolean salesiano, Turnos horario) {
		super(dni, nombre, apellidos, salario);
	
		this.salesiano = salesiano;
		this.horario = horario;
	}


	@Override
	public String toString() {
	    return super.toString() + " | Directivo [Salesiano=" + salesiano + ", Turno=" + horario + "]";
	}


	
	public boolean isSalesiano() {
		return salesiano;
	}


	public void setSalesiano(boolean salesiano) {
		this.salesiano = salesiano;
	}


	public Turnos getHorario() {
		return horario;
	}


	public void setHorario(Turnos horario) {
		this.horario = horario;
	}
	
	
}

