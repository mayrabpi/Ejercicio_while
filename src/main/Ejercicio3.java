package main;

import java.util.Scanner;

public class Ejercicio3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
       Scanner entrada=new Scanner(System.in);
		
		System.out.print (" Ingresa un numero entero y contare los digitos que tiene el número ");
		
		
		int numero = entrada.nextInt () ;
		int digito= 0;
		
		while(numero !=0) {
			
			numero= numero/10;
			digito++;	
			
		}
		
		System. out.print("El número tiene " + digito + " digitos");
		
	

	}

}
