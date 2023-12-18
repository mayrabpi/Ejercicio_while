package main;

import java.util.Scanner;

public class Ejercicio1_do_while {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner entrada=new Scanner(System.in);
		
		System.out.println("Ingrese un numero y le mostrare la tabla de multiplicar del 10");
		
		int numero =entrada.nextInt();
		int i=1;

		do {
			int resultado= numero*i;
			
			System.out.println(numero  + " X "+ i + " = " + resultado );
			 
			i++;
		}while (i<=10);
		

	}

}
