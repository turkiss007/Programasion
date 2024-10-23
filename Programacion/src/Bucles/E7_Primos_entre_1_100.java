package Bucles;

public class E7_Primos_entre_1_100 {

	public static void main(String[] args) {
		/*
		 * Números primos entre 1 y 100 Escribe un programa que imprima todos los
		 * números primos entre 1 y 100 utilizando un bucle. Un número primo es aquel
		 * que solo es divisible por 1 y por sí mismo.
		 */
		int contador = 0;
		System.out.print("Los 100 primeros números primos son: ");
		for (int i = 1; i <= 100; i++) {
			for (int j = 1; j <= i; j++) {
				if (i % j == 0) {
					contador = contador + 1;
				} else {
					contador = contador + 0;
				}
			}
			if (contador == 2) {
				System.out.print(i + ", ");
			}
			contador = 0;
		}
	}

}
