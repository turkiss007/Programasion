package Bucles;

import java.util.ArrayList;
import java.util.Scanner;

public class E16_Contador_Vocales {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		 * 16. Contador de vocales en una cadena Escribe un programa que solicite una
		 * cadena de texto al usuario y, utilizando un bucle, cuente cuántas vocales
		 * tiene esa cadena.
		 */
		Scanner leer = new Scanner(System.in);

		System.out.print("Introduzca una frase: ");
		String frase = leer.nextLine();
		String minuscula = frase.toLowerCase();
		// String noTildes = removeAccents(minuscula);

		ArrayList<Character> lista = new ArrayList<Character>(4);
		lista.add('a');
		lista.add('e');
		lista.add('i');
		lista.add('o');
		lista.add('u');

		int vocal_a = 0, vocal_e = 0, vocal_i = 0, vocal_o = 0, vocal_u = 0;

		for (int i = 0; i < minuscula.length(); i++) {
			char posicion = minuscula.charAt(i);
			// System.out.println(posicion);

			for (int j = 0; j < lista.size(); j++) {

				if (posicion == lista.get(j)) {
					switch (j) {
					case 0:
						vocal_a = vocal_a + 1;
						// System.out.println("a = " + vocal_a);
						break;
					case 1:
						vocal_e = vocal_e + 1;
						// System.out.println("e = " + vocal_e);
						break;
					case 2:
						vocal_i = vocal_i + 1;
						// System.out.println("i = " + vocal_i);
						break;
					case 3:
						vocal_o = vocal_o + 1;
						// System.out.println("o = " + vocal_o);
						break;
					case 4:
						vocal_u = vocal_u + 1;
						// System.out.println("u = " + vocal_u);
						break;
					}
				}
			}
		}

		System.out.println("Cantidad de vocales en la frase: " + "\na = " + vocal_a + "\ne = " + vocal_e + "\ni = "
				+ vocal_i + "\no = " + vocal_o + "\nu = " + vocal_u);

	}

	/*
	 * private static String removeAccents(String minuscula) {
	 * 
	 * // TODO Auto-generated method stub return null; }
	 */
}
