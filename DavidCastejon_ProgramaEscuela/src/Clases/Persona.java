package Clases;

	public class Persona {
		String dni, nombre, apellidos;
		double salario;
		
		public Persona(String dni, String nombre, String apellidos, double salario) {
			this.dni = dni;
			this.nombre = nombre;
			this.apellidos = apellidos;
			this.salario = salario;
		}

		

		public Persona(String dni, String nombre, String apellidos) {
			super();
			this.dni = dni;
			this.nombre = nombre;
			this.apellidos = apellidos;
			this.salario = 0.0;
		}



		@Override
		public String toString() {
			return "Persona [dni=" + dni + ", "+ "nombre=" + nombre + ", apellidos=" + apellidos + ", salario=" + salario + "]";
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

