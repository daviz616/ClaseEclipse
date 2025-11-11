import java.util.Scanner;
import java.util.Random;

public class Ejercicio3 {

public static void main(String[] args) {
			
Scanner sc = new Scanner(System.in);
Random rand = new Random();

System.out.println("Introduce el número de filas: ");
int n = sc.nextInt();
System.out.println("Introduce el número de columnas: ");
int m = sc.nextInt();


int[][] matriz = new int[n][m];
int suma = 0;

for(int i=0; i < n; i++) {
	for(int j = 0; j < m; j++){
		matriz[i][j] = rand.nextInt(100);
        suma += matriz[i][j];
	}
}

System.out.println("Matriz generada:");
for (int i = 0; i < n; i++) {
    for (int j = 0; j < m; j++) {
        System.out.print(matriz[i][j] + "\t");
    }
    System.out.println();
}

System.out.println("Suma de todos los aleatorios: "+suma);

sc.close();
	}
}
