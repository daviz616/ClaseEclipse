import java.util.Arrays;

public class Alumno {
	
	String dni;
	String nombre;
	String apellidos;
	String fecha;
	String sexo;
	boolean repetidor;
	Modulo[] modulo;
	
	public Alumno(String dni, String nombre, String apellidos, String fecha, String sexo, boolean repetidor,
			Modulo[] modulo) {
		super();
		this.dni = dni;
		this.nombre = nombre;
		this.apellidos = apellidos;
		this.fecha = fecha;
		this.sexo = sexo;
		this.repetidor = repetidor;
		this.modulo = modulo;
	}

	@Override
	public String toString() {
		return "Alumno [dni=" + dni + 
				"\n nombre=" + nombre +
				"\n apellidos=" + apellidos +
				"\n fecha=" + fecha +
				"\n sexo="+ sexo + 
				"\n repetidor=" + repetidor +
				"\n modulo=" + Arrays.toString(modulo);
	}
	
	
}
