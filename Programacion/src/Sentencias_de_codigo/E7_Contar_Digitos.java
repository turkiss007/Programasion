package Sentencias_de_codigo;

import java.util.Scanner;

public class E7_Contar_Digitos {
public static void main(String[]args) {
	/*Enunciado: Escribe un programa que pida un número entero positivo y 
	 * cuente cuántos dígitos tiene. Por ejemplo, si el número es 12345, debe 
	 * imprimir que tiene 5 dígitos.
Sentencias usadas: while.*/
	String digito;
	Scanner leer= new Scanner(System.in);
	System.out.println("Introduce un número: ");
	digito = leer.nextLine();
	System.out.println("El número " + digito + " tiene " + digito.length() + " dígitos.");
	
}
}
