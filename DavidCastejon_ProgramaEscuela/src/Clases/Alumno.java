package Clases;

import java.util.Arrays;


public class Alumno extends Persona {
	String fechaNaci;
	int sexo;
	boolean repetidor;
	Modulo []  losModulos;
	
	
	public Alumno(String dni, String nombre, String apellidos, String fechaNaci, int sexo, boolean repetidor,
			Modulo[] losModulos) {
		super(dni, nombre, apellidos);
		this.fechaNaci = fechaNaci;
		this.sexo = sexo;
		this.repetidor = repetidor;
		this.losModulos = losModulos;
	}
	
	
	

	@Override
	public String toString() {
		return "Alumno [dni=" + super.getDni() + 
		           ", nombre=" + super.getNombre() + 
		           ", apellidos=" + super.getApellidos() +
		           ", fechaNaci=" + fechaNaci + 
		           ", sexo=" + sexo + 
		           ", repetidor=" + repetidor + 
		           ", losModulos=" + Arrays.toString(losModulos) + "]"; 
				
	}



	public String getFechaNaci() {
		return fechaNaci;
	}


	public void setFechaNaci(String fechaNaci) {
		this.fechaNaci = fechaNaci;
	}


	public int getSexo() {
		return sexo;
	}


	public void setSexo(int sexo) {
		this.sexo = sexo;
	}


	public boolean isRepetidor() {
		return repetidor;
	}


	public void setRepetidor(boolean repetidor) {
		this.repetidor = repetidor;
	}


	public Modulo[] getLosModulos() {
		return losModulos;
	}


	public void setLosModulos(Modulo[] losModulos) {
		this.losModulos = losModulos;
	}

	
	

}