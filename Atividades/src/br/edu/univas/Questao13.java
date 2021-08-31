package br.edu.univas;

import java.util.Scanner;

public class Questao13 {

	public static void main(String[] args) {
		
		Scanner leia = new Scanner(System.in);
		
		System.out.println("Digite o 1º número: ");
		int valor1 = leia.nextInt();
		
		System.out.println("Digite o 2º número: ");
		int valor2 = leia.nextInt();
		
		System.out.println("Digite o 3º número: ");
		int valor3 = leia.nextInt();
		
		System.out.println("Digite o 4º número: ");
		int valor4 = leia.nextInt();
		
		int diferença = (valor1 * valor2) - (valor3 * valor4);
		
		System.out.println("A diferença é: " + diferença);
		
		leia.close();
	}
}
