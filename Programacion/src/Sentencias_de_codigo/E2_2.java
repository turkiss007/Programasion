package Sentencias_de_codigo;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class E2_2 {
	public static void main (String[] args) {
		/*Enunciado: Escribe un programa que lea tres números enteros e imprima cuál 
		 * de ellos es el mayor. Si todos son iguales, imprime un mensaje indicándolo.
		 * Sentencias usadas: if, else if, else.
		 */
		
		List<Integer> lista = new ArrayList<>();
		
		String listado[];
		listado = new String[3];
		listado[0]="primer";
		listado[1]="segundo";
		listado[2]="tercer";
		
		for(int i=0; i<3; i++) {
			Scanner leer = new Scanner(System.in);
			System.out.println("Escriba el " + listado[i] + " número: ");
			lista.add(leer.nextInt()); 
		}
		Collections.sort(lista);
		System.out.println("Los números ordenados de menor a mayor: ");
		for(int n : lista) {
			System.out.print(n);
			System.out.print("<");
		}	
	}
}
