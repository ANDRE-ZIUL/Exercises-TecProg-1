package br.edu.univas;

import java.util.Scanner;

public class Questao13 {

	public static void main(String[] args) {
		
		Scanner leia = new Scanner(System.in);
		
		System.out.println("Digite o 1� n�mero: ");
		int valor1 = leia.nextInt();
		
		System.out.println("Digite o 2� n�mero: ");
		int valor2 = leia.nextInt();
		
		System.out.println("Digite o 3� n�mero: ");
		int valor3 = leia.nextInt();
		
		System.out.println("Digite o 4� n�mero: ");
		int valor4 = leia.nextInt();
		
		int diferen�a = (valor1 * valor2) - (valor3 * valor4);
		
		System.out.println("A diferen�a �: " + diferen�a);
		
		leia.close();
	}
}
