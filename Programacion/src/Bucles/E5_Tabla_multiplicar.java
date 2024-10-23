package Bucles;

import java.util.Scanner;

public class E5_Tabla_multiplicar {
	public static void main(String[] args) {
		int x, multiplicacion;
		Scanner numero = new Scanner(System.in);
		System.out.println("Escriba un número: ");
		x = numero.nextInt();

		System.out.println("Tabla de multiplicar del " + x);
		for (int i = 1; i <= 10; i++) {
			multiplicacion = i * x;
			System.out.println(x + " x " + i + " = " + multiplicacion);
		}
	}
}
