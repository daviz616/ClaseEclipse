package Biblioteca;

public class Revistas extends Comun {
	int numero;

	public Revistas(int codigo, String titulo, int año, int numero) {
		super(codigo, titulo, año);
		this.numero = numero;
	}

	@Override
	public String toString() {
		return "Revistas [numero=" + numero + ", codigo=" + codigo + ", titulo=" + titulo + ", año=" + año + "]";
	}

	public int getNumero() {
		return numero;
	}

	public void setNumero(int numero) {
		this.numero = numero;
	}
	
	
}
