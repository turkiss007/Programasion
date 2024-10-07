package Sentencias_de_codigo;

import java.util.Scanner;

public class E10_Menú {
	public static void main(String[] args) {
		/*
		 * Escribe un programa que muestre un menú con las siguientes opciones: markdown
		 * Copiar código 1. Sumar dos números 2. Restar dos números 3. Multiplicar dos
		 * números 4. Dividir dos números 5. Salir El usuario debe poder elegir una
		 * opción y realizar la operación correspondiente. Si selecciona la opción 5, el
		 * programa debe terminar. Sentencias usadas: switch, while.
		 */
		int opcion;
		float num1, num2;
		Scanner leeropcion = new Scanner(System.in);
		System.out.println("Eliga que operación desea realizar: " + "\n1. Sumar" + "\n2. Restar" + "\n3. Multiplicar"
				+ "\n4. Dividir" + "\n5. Salir" + "\n");
		opcion = leeropcion.nextInt();
		switch (opcion) {
		case 1:
			Scanner leersuma = new Scanner(System.in);
			System.out.println("Escriba el primer número: ");
			num1 = leersuma.nextFloat();
			System.out.println("Escriba el segundo número: ");
			num2 = leersuma.nextFloat();
			System.out.println("La suma es " + (num1 + num2));
			break;
		case 2:
			Scanner leerresta = new Scanner(System.in);
			System.out.println("Escriba el primer número: ");
			num1 = leerresta.nextFloat();
			System.out.println("Escriba el segundo número: ");
			num2 = leerresta.nextFloat();
			System.out.println("La resta es " + (num1 - num2));
			break;
		case 3:
			Scanner leermulti = new Scanner(System.in);
			System.out.println("Escriba el primer número: ");
			num1 = leermulti.nextFloat();
			System.out.println("Escriba el segundo número: ");
			num2 = leermulti.nextFloat();
			System.out.println("La multiplicación es " + (num1 * num2));
			break;
		case 4:
			Scanner leer = new Scanner(System.in);
			System.out.println("Escriba el dividendo número: ");
			num1 = leer.nextFloat();
			System.out.println("Escriba el divisor número: ");
			num2 = leer.nextFloat();
			System.out.println("La suma es " + (num1 / num2));
			break;
		case 5:
			break;
		}
	}
}
