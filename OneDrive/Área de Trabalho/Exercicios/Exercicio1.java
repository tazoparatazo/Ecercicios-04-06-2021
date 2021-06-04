package br.com.generation.Exercicios;

import java.util.Scanner;

public class Exercicio1 {

	public static void main(String[] args) {
		
		Scanner ler = new Scanner (System.in);
		
		
		int n1, n2, n3, maior=0;
		
		
		
		System.out.println(" Digite o Primeiro valor : ");
		n1 = ler.nextInt(); 
		
		System.out.println(" Digite o Segundo valor : ");
		n2 = ler.nextInt(); 
		
		System.out.println(" Digite o Terceiro valor : ");
		n3 = ler.nextInt(); 
		
		
		if(n1 >maior) {
			
			maior = n1;
			
		}if (n2 > n1) {
			
			maior = n2;
		}if (n3 >n2) {
			
			maior = n3;
		}
		
		System.out.println(" O maior Numero é : "+ maior);
		
		
		
		

	}

}
