package br.edu.univas;

import java.util.Scanner;

public class Questao21 {

	public static void main(String[] args) {
		
		Scanner leia = new Scanner(System.in);
		int impar = 0;
		int par = 0;
		for(int i = 1; i <= 20; i++) {
			System.out.println("Digite um número inteiro: ");
			int numero = leia.nextInt();
			
			if(numero % 2 == 0) {
				par++;
			} else {
				impar++;
			}
		}
		System.out.println("Foram digitados " + impar + " números impares e " + par + " números pares");
		
		leia.close();
	}
}
