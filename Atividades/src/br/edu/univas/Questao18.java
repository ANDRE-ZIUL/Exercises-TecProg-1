package br.edu.univas;

import java.util.Scanner;

public class Questao18 {

	public static void main(String[] args) {
		
		Scanner leia = new Scanner(System.in);
		
		int total = 0;
		for(int i = 1; i <= 10; i++) {
			System.out.println("Digite um n�mero inteiro: ");
			int numero = leia.nextInt();
			
			if(numero % 2 != 0 && numero > 23 && numero < 99) {
					total += numero;
				}
			}
		System.out.println("O resultado da soma dos n�meros impares entre 23 e 99 �: " + total);
		leia.close();
	}
}
