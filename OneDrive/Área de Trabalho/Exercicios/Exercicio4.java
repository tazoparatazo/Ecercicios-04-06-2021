package br.com.generation.Exercicios;

import java.util.Scanner;

public class Exercicio4 {

	public static void main(String[] args) {
	
		Scanner ler = new Scanner(System.in);
		
		int n  ,soma, v, r;
		
		
		System.out.println("Digite o numero : ");
		n = ler.nextInt();		
		
		
		soma = ( n % 2);
		
		if (soma ==0) {
			
		
			
			System.out.println(" O Numero é Par e a Raiz é : "+  Math.sqrt(n));
			
			
		}
		
		if(soma != 0) {
			
			r = n*n;
			
			System.out.println(" O Numero é Impar e a Potencia é : "+ r);
			
			
			
			
		}
		
		
		
		
	}

}
