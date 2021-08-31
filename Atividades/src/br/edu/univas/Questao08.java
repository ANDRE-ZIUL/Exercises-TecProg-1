package br.edu.univas;

import java.util.Scanner;

public class Questao08 {

	public static void main(String[] args) {
		
		Scanner leia = new Scanner(System.in);
		
		System.out.println("Digite o 1º valor: ");
		int valor1 = leia.nextInt();
		
		System.out.println("Digite o 2º valor: ");
		int valor2 = leia.nextInt();
		
		int temporaria = valor1;
		valor1 = valor2;
		valor2 = temporaria;
		
		System.out.println("1º valor é : " + valor1 + "\n2º valor é: " + valor2);
	
		leia.close();
	}
}
