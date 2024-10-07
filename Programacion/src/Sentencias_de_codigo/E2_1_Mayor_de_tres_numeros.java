package Sentencias_de_codigo;

import java.util.Scanner;

public class E2_1_Mayor_de_tres_numeros {
public static void main (String[] args) {
	/*Enunciado: Escribe un programa que lea tres números enteros e imprima cuál 
	 * de ellos es el mayor. Si todos son iguales, imprime un mensaje indicándolo.
	 * Sentencias usadas: if, else if, else.
	 */
	
	int numero[];
	numero = new int[3];
	
	String listado[];
	listado = new String[3];
	listado[0]="primer";
	listado[1]="segundo";
	listado[2]="tercer";
	
	for(int i=0; i<3; i++) {
		Scanner leer = new Scanner(System.in);
		System.out.println("Escriba el " + listado[i] + " número: ");
		numero[i] = leer.nextInt(); 
	}
	
	if((numero[0]>numero[1])&&(numero[0]>numero[2])) {
		if(numero[1]>numero[2]) {
			System.out.println(numero[0] + ">" + numero[1] + ">" + numero[2]);
		} else {
			System.out.println(numero[0] + ">" + numero[2] + ">" + numero[1]);	
		}
	}
	
	if((numero[1]>numero[0])&&(numero[1]>numero[2])) {
		if(numero[0]>numero[2]) {
			System.out.println(numero[1] + ">" + numero[0] + ">" + numero[2]);
		} else {
			System.out.println(numero[1] + ">" + numero[2] + ">" + numero[0]);	
		}
	}
	
	if((numero[2]>numero[0])&&(numero[2]>numero[1])) {
		if(numero[0]>numero[1]) {
			System.out.println(numero[2] + ">" + numero[0] + ">" + numero[1]);
		} else {
			System.out.println(numero[2] + ">" + numero[1] + ">" + numero[0]);	
		}
	}
}
}
