package br.edu.univas;

import java.util.Scanner;

public class Questao04 {
 
	public static void main(String[] args) {
		
		Scanner leia = new Scanner(System.in);
		
		System.out.println("Digite o 1� valor: ");
		int valor1 = leia.nextInt();
		
		System.out.println("Digite o 2� valor: ");
		int valor2 = leia.nextInt();
		
		int resto = valor1 % valor2;
		
		if(resto == 0) {
			System.out.println("A divis�o de " + valor1 + " por " + valor2 + " � perfeita");
		}else {
			System.out.println("A divis�o de " + valor1 + " por " + valor2 + " n�o � perfeita, pos sobra " + resto);
		}
		leia.close();
	}
}
