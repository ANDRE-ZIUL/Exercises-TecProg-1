package br.edu.univas;

import java.util.Scanner;

public class Questao25 {

	public static void main(String[] args) {
		
		Scanner leia = new Scanner(System.in);
		int total = 0;
		int i = 0;
		int quantidade = 0;
		while (i < 1) {
		System.out.println("Digite um número: ");
		int numero = leia.nextInt();
		
		if(numero % 2 == 0) {
			total += numero;
			quantidade++;
			}
		if(quantidade == 10) {
			break;
			}
		}
		
		System.out.println("Resultado da soma é: " + total);
		leia.close();
	}
}
