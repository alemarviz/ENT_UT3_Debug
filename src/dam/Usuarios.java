/**
 * Programa que pide la edad al usuario para mostrar 
 * en pantalla de los siguientes mensajes todos los que le 
 * correspondan:
 * > User is 18 or younger
 * > User is between 19 and 39
 * > User is older than 40
 * > User is either 45 or 50
 */
package dam;

import java.util.Scanner;

public class Usuarios {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		
		System.out.print("Enter age: ");
		int age = Integer.parseInt(in.nextLine());
		
		if (age < 18) {
			System.out.println("User is 18 or younger");
		}
		else if (age > 18 && age <40) {
			System.out.println("User is between 19 and 39");
		}
		else if (age == 45 || age == 50) {
			System.out.println("User is either 45 or 50");
		}
		else {
			System.out.println("User is older than 40");
		}

	}

}
