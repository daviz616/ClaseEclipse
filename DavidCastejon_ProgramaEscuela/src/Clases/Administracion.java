package Clases;

public class Administracion extends Persona {
	
	
	String estudios;
	String antiguedad;
	

	public Administracion(String dni, String nombre, String apellidos, double salario, String estudio,
			String antiguedad) {
		super(dni, nombre, apellidos, salario);
	
		estudios = estudio;
		this.antiguedad = antiguedad;
	}
	
	@Override
	public String toString() {
	    return super.toString() + " | Administración [Estudios=" + estudios + ", Antigüedad=" + antiguedad + "]";
	}


	
	public String getEstudios() {
		return estudios;
	}

	public void setEstudios(String estudio) {
		estudios = estudio;
	}

	public String getAntigüedad() {
		return antiguedad;
	}

	public void setAntigüedad(String antigüedad) {
		this.antiguedad = antigüedad;
	}


	
	
}
