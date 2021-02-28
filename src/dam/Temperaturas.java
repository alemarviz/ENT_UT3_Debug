package dam;

import java.util.Scanner;

public class Temperaturas {

	public static void main(String[] args) {
		
		boolean C2F = false; // if F to C conversion

		double x = 212;
		double y = (x + 40.0) * (C2F ? 9.0 / 5.0 : 5.0 / 9.0) - 40.0;
		System.out.println(y);

		C2F = true; // if C to F conversion
		x = 100;
		y = (x + 40.0) * (C2F ? 9.0 / 5.0 : 5.0 / 9.0) - 40.0;
		System.out.println(y);

	}

}
