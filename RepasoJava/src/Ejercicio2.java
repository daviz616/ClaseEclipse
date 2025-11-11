
public class Ejercicio2 {

	public static void main(String[] args) {
		
		int[] array = {8,7,6,7,5,4};
		int contador = 0;
		
		for(int i = 0;  i <= 5; i++) {
			
			if(array[i] % 2 == 0) {
				contador++;
			}
			
		}
		System.out.println("La cantidad de pares es: "+contador);
		}
}
