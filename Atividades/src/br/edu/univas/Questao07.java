package br.edu.univas;

import java.util.Scanner;

public class Questao07 {
	
	public static void main(String[] args) {
		
		Scanner leia = new Scanner(System.in);
		
		System.out.println("Digite 5 valores: ");
		System.out.println("1� valor: ");
		int valor1 = leia.nextInt();
		System.out.println("2� valor: ");
		int valor2 = leia.nextInt();
		System.out.println("3� valor: ");
		int valor3 = leia.nextInt();
		System.out.println("4� valor: ");
		int valor4 = leia.nextInt();
		System.out.println("5� valor: ");
		int valor5 = leia.nextInt();
		
		int soma = 0;
		if(valor1 % 2 == 0) {
			soma += valor1;
		}
		if(valor2 % 2 == 0) {
			soma += valor2;
		}
		if(valor3 % 2 == 0) {
			soma += valor3;
		}
		if(valor4 % 2 == 0) {
			soma += valor4;
		}
		if(valor5 % 2 == 0) {
			soma += valor5;
		}
		
		System.out.println("A soma dos valores pares �: " + soma);
		
		leia.close();
	}

}
