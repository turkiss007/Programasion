package Ejercicios_programacion;

public class Ejercicio6_IntercambiarVariables {
public static void main (String[]args) {
	
	/*Declara dos variables enteras con diferentes valores. Intercambia sus
	 *valores sin usar una tercera variable temporal e imprime los 
	 *resultados antes y después del intercambio.
	 */
	int A = 5, B = 10;
	System.out.println("Estos son los valores iniciales de mis dos variables: A = " + A + " y B = " + B);
	A = A + B;
	B = A - B;
	A = A - B;
	System.out.println("Estos son los nuevos valores de mis dos variables: A = " + A + " y B = " + B);
}
}
