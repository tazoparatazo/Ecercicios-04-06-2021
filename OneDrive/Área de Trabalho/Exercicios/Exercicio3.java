package br.com.generation.Exercicios;

import java.util.Scanner;

public class Exercicio3 {

	public static void main(String[] args) {
		
		Scanner ler = new Scanner(System.in);
		
		int id;
		
		System.out.println("Escreva a idade do participante :");
		id= ler.nextInt();
		
		if (id <=14) {
			
			System.out.println("Participante pertence ao grupo infantil");	
		}else
		
		if (id <= 17) {
			
			System.out.println("Participante pertence ao grupo Juvenil");
		}else
		
		if (id <= 25) {
			System.out.println("Participante pertence ao grupo Adulto");
			
		}
		
		
		
		

	}

}
