package Bucles;

import java.util.Scanner;

public class E6_Digitos_de_un_numero {
	public static void main(String[] args) {
		/*
		 * 6. Escribe un programa que pida al usuario un número entero y cuente cuántos
		 * dígitos tiene el número introducido. Utiliza un bucle para realizar el
		 * cálculo.
		 */
		Scanner leer = new Scanner(System.in);
		System.out.print("Escriba un número: ");
		String num = leer.nextLine();
		System.out.println("Tiene " + num.length() + "dígitos");

	}
}
