/**
 * Programa que rellena una tabla 3x6 con valores
 * generados aleatoriamente entre 0 y 9
 * A continuación, muestra la tabla en pantalla con formato
 */
package dam;

import java.util.Random;

public class Tablas {
	public static void main(String[] args) {
		Random rnd = new Random();
		int[][] tabla = new int[3][6];
		
		// Rellenamos la tabla con datos
		System.out.println("Rellenando la tabla con datos....");
		for (int i = 0; i < tabla.length; i++) {
			for (int j = 0; j < tabla.length; j++) {
				tabla[i][j] = rnd.nextInt(10);
			}
		}
		// Mostramos la tabla en pantalla
		System.out.println("Tabla:");
		for (int i = 0; i < tabla[0].length; i++) {
			System.out.print("|");
			for (int j = 0; j < tabla.length; j++) {
				System.out.printf("%2d", tabla[i][j]);
			}
			System.out.println("|");
		}
		
		
	}
}
