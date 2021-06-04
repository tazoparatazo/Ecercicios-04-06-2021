package br.com.generation.Exercicios;

import java.util.Scanner;

public class Exercicio2 {
	
	
	
	public static void main(String[] args) {
		
		Scanner ler = new Scanner(System.in);
		
		int n1, n2, n3, x;
		
		System.out.println("Escrevca o primeiro valor :");
		n1 = ler.nextInt();
		
		System.out.println("Escrevca o segundo valor :");
		n2 = ler.nextInt();
		
		System.out.println("Escrevca o terceiro valor :");
		n3 = ler.nextInt();
		
		if ( n1 > n2) {
			
			x = n1;
			n1= n2;
			n2= x;
	}
		if( n2 > n3) {
			
			x= n2;
			n2 = n3;
			n3 = x;
			
		}
		
		if(n1 > n2) {
			
			x= n1;
			n1= n2;
			n2 = n3;
				
		}
		
		System.out.println(" Ordem : "  + n1+" " + n2+" " + n3);
		
		
		
		
		
		
	}

}
