package Sentencias_de_codigo;

import java.util.Scanner;

public class E1_parOimpar {
public static void main (String[]args) {
	/*Enunciado: Escribe un programa que lea un número entero desde el 
	 * teclado y determine si es par o impar. Muestra un mensaje indicando 
	 * el resultado.
	 Sentencias usadas: if, else.*/
    
	int num;
	Scanner leer = new Scanner(System.in);
    System.out.print("Introduce un número: ");
    num = leer.nextInt();
    
 
    if ((num%2)==0) {
    	System.out.println("El número introducido es par");
    } else {
    	System.out.println("El número introducido es impar");
    }
}
}
