package br.edu.univas;

import java.util.Scanner;

public class Questao27 {

	public static void main(String[] args) {
		
		Scanner leia = new Scanner(System.in);
		int soma = 0;
		for(int i = 1; i <= 50; i++) {
			
			System.out.println("Digite um número: ");
			int numero = leia.nextInt();
			
			if(numero % 3 == 0) {
				soma += numero;
			}
			continue;
		}
		System.out.println("O resultado da soma é: " + soma);
		leia.close();
	}
}
