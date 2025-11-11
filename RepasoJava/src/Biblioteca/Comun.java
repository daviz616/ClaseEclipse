package Biblioteca;

public class Comun {
	int codigo;
	String titulo;
	int año;
	
	public Comun(int codigo, String titulo, int año) {
		super();
		this.codigo = codigo;
		this.titulo = titulo;
		this.año = año;
	}

	@Override
	public String toString() {
		return "Comun [codigo=" + codigo + ", titulo=" + titulo + ", año=" + año + "]";
	}

	public int getCodigo() {
		return codigo;
	}

	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}

	public String getTitulo() {
		return titulo;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	public int getAño() {
		return año;
	}

	public void setAño(int año) {
		this.año = año;
	}
	
	
	
	
}
