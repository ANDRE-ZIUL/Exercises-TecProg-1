package br.edu.univas;

import java.util.Scanner;

public class Questao08 {

	public static void main(String[] args) {
		
		Scanner leia = new Scanner(System.in);
		
		System.out.println("Digite o 1� valor: ");
		int valor1 = leia.nextInt();
		
		System.out.println("Digite o 2� valor: ");
		int valor2 = leia.nextInt();
		
		int temporaria = valor1;
		valor1 = valor2;
		valor2 = temporaria;
		
		System.out.println("1� valor � : " + valor1 + "\n2� valor �: " + valor2);
	
		leia.close();
	}
}
