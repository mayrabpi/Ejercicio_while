package main;

import java.util.Scanner;

public class Ejercicio2_do_while {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner entrada=new Scanner(System.in);
		
		System.out.println("Ingrese un número le calculare la suma de todos los pares desde 2");
		
		int numero = entrada.nextInt();
		int sumaPares=0;
		int i =2;
		 do {
			 sumaPares += i;
			 i +=2;
		 }while( i<=numero);
		 System.out.println("la suma de todos los pares desde 2 hasta " + numero + " es " + sumaPares);
	}

}
