package Bucles;

import java.util.Scanner;

public class E12_Suma_Digitos {
	public static void main(String[] args) {

		/*
		 * 12. Suma de los dígitos de un número Escribe un programa que solicite al
		 * usuario un número entero y, utilizando un bucle, calcule la suma de todos los
		 * dígitos de ese número. Por ejemplo, si el usuario introduce 1234, la suma
		 * será 1+2+3+4=101 + 2 + 3 + 4 = 101+2+3+4=10.
		 */

		Scanner leer = new Scanner(System.in);
		System.out.println("Escriba un número de varios dígitos");
		String cadena = leer.nextLine();

		int[] num;
		num = new int[cadena.length()];
		int suma = 0;

		for (int i = 0; i < cadena.length(); i++) {
			char digitoChar = cadena.charAt(i);
			num[i] = Character.getNumericValue(digitoChar);
			// System.out.println("El número posicion " + i + " es " + num[i]);
			suma = suma + num[i];
		}
		System.out.println("La suma de los " + cadena.length() + " dígitos es: " + suma);
	}
}
