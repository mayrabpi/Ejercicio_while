package main;

import java.util.Scanner;

public class Ejercicio1 {

	public static void main(String[] args) {
		// Pide al usuario que ingrese un número N y luego muestra todos los números desde 1 hasta N
		
		System.out.println("Ingrese un número entero");
		Scanner entrada = new Scanner(System.in);
		
		int numero= entrada.nextInt();
		int i =0;
		
		while(i<numero) {
			i++;
			
			System.out.print(i +" ");
		}
		

	}

}
