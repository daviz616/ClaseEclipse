import java.util.Scanner;

public class Ejercicio4 {

	public static void main(String[] args) {
				
	Scanner sc = new Scanner(System.in);
	

	System.out.println("Introduce el número para calcular el factorial: ");
	int n = sc.nextInt();
	
	CalcularFactorial(n);
	System.out.println(CalcularFactorial(n));

	sc.close();
	}
	
	public static int CalcularFactorial(int n){
		
	if(n == 0 || n == 1) {
		return 1;
	}else {
		return n * CalcularFactorial(n-1);
	}
	
	}
}
	
	

