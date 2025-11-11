

public class Trabajador implements Comparable<Trabajador> {
    protected String dni;
    protected String nombre;
    protected String apellidos;
    protected double salario;

    public Trabajador(String dni, String nombre, String apellidos, double salario) {
        this.dni = dni;
        this.nombre = nombre;
        this.apellidos = apellidos;
        this.salario = salario;
    }

    @Override
    public String toString() {
        return "DNI: " + dni + "\n" +
               "Nombre: " + nombre + "\n" +
               "Apellidos: " + apellidos + "\n" +
               "Salario: " + salario + "€";
    }
    
    @Override
    public int compareTo (Trabajador p){
    if(salario>p.getSalario())
    return 1;
    if(salario<p.getSalario())
    return -1;

    return 0;
    }

    
    

	public String getDni() {
		return dni;
	}

	public void setDni(String dni) {
		this.dni = dni;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getApellidos() {
		return apellidos;
	}

	public void setApellidos(String apellidos) {
		this.apellidos = apellidos;
	}

	public double getSalario() {
		return salario;
	}

	public void setSalario(double salario) {
		this.salario = salario;
	}
    
    
}

