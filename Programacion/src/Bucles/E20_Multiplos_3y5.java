package Bucles;

public class E20_Multiplos_3y5 {
	public static void main(String[] args) {
		/*
		 * 20. Suma de múltiplos de 3 y 5 Escribe un programa que calcule la suma de
		 * todos los múltiplos de 3 y 5 que se encuentran entre 1 y 1000. Sugerencias:
		 * Puedes utilizar bucles for, while o do-while dependiendo del tipo de
		 * ejercicio y de cómo prefieras estructurarlo. Si necesitas validación de
		 * entrada del usuario, también
		 */

		int x = 3, suma = 0;
		do {
			for (int i = 1; (x * i) <= 1000; i++) {
				suma = suma + (x * i);
			}
			x = x + 2;
		} while (x < 6);

		for (int j = 1; (15 * j) <= 1000; j++) {
			suma = suma - (15 * j);
		}

		System.out.println("La suma de los multiplos de 3 y 5 hasta 1000 es: " + suma);
	}
}
