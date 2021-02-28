package dam;

import java.util.Scanner;

public class EsPrimo {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		
		System.out.print("Número: ");
		int num = Integer.parseInt(teclado.nextLine());
		
		boolean swPrimo = true;
		for(int i = 2; i <= Math.sqrt(num); i++) {
			if (num % i == 0) {
				swPrimo = false;
				break;
			}
		}
		if (swPrimo) {
			System.out.println(num+" es primo");
		}
		else {
			System.out.println(num+" no es primo");
		}

	}

}
