package Biblioteca;

public class Libros extends Comun {
	boolean prestado = false;

	public Libros(int codigo, String titulo, int año, boolean prestado) {
		super(codigo, titulo, año);
		this.prestado = prestado;
	}

	@Override
	public String toString() {
		return "Libros [prestado=" + prestado + ", codigo=" + codigo + ", titulo=" + titulo + ", año=" + año + "]";
	}

	public boolean isPrestado() {
		return prestado;
	}

	public void setPrestado(boolean prestado) {
		this.prestado = prestado;
	}
	
	public void prestar(){
		prestado=true;
	}
	
	public void devolver(){
		prestado=false;
	}
	
	public boolean prestado() {
		return prestado;
	}
}
