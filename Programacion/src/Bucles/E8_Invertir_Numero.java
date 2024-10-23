package Bucles;

import java.util.Scanner;

public class E8_Invertir_Numero {
	public static void main(String[] args) {
		/*
		 * Invertir un número Crea un programa que solicite un número entero y,
		 * utilizando un bucle, invierta el número (es decir, si el número es 1234, debe
		 * mostrar 4321).
		 */
		String invertir = "";
		Scanner leer = new Scanner(System.in);
		System.out.print("Escriba un número entero: ");
		String num = leer.nextLine();

		for (int i = (num.length() - 1); i >= 0; i--) {
			// System.out.println(i);
			// System.out.println(num.charAt(i));
			invertir = invertir + num.charAt(i);
		}
		System.out.println(num + " invertido es: " + invertir);

		/*
		 * CON ARRAY NO ME SALE
		 * 
		 * for (int i = (num.length() - 1); i >= 0; i--) { invertir = invertir +
		 * arrayNum[i]; System.out.print(invertir); }
		 * System.out.println("El número invertido: " + invertir);
		 */

		/*
		 * OTROS TIPOS DE ARRAYS QUE USAREMOS MÁS ADELANTE ESTE TIPO DE ARRAYS NO HACE
		 * FALTA DIMENSIONARLOS
		 * 
		 * List<String> list = new ArrayList<String>(); list.add("");
		 */
	}
}
