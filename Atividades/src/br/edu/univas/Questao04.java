package br.edu.univas;

import java.util.Scanner;

public class Questao04 {
 
	public static void main(String[] args) {
		
		Scanner leia = new Scanner(System.in);
		
		System.out.println("Digite o 1º valor: ");
		int valor1 = leia.nextInt();
		
		System.out.println("Digite o 2º valor: ");
		int valor2 = leia.nextInt();
		
		int resto = valor1 % valor2;
		
		if(resto == 0) {
			System.out.println("A divisão de " + valor1 + " por " + valor2 + " é perfeita");
		}else {
			System.out.println("A divisão de " + valor1 + " por " + valor2 + " não é perfeita, pos sobra " + resto);
		}
		leia.close();
	}
}
