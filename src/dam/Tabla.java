package dam;

import java.util.Random;

public class Tabla {
	public static void main(String[] args) {
		Random rnd = new Random();
		int[][] tabla = new int[3][6];
		
		// Rellenamos con datos
		for (int i = 0; i < tabla.length; i++) {
			for (int j = 0; j < tabla[0].length; j++) {
				tabla[i][j] = rnd.nextInt(10);
			}
		}
		// Mostramos en pantalla
		System.out.println("Tabla:");
		for (int i = 0; i < tabla.length; i++) {
			System.out.print("|");
			for (int j = 0; j < tabla[0].length; j++) {
				System.out.printf("%2d", tabla[i][j]);
			}
			System.out.println("|");
		}
		
		
	}
}
