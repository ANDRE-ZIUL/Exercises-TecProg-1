package br.edu.univas;

import java.util.Scanner;

public class Questao10 {

	public static void main(String[] args) {
		
		Scanner leia = new Scanner(System.in);
		
		System.out.println("Digite o número do seu sexo: \n1 - Masculino \n2 - Feminino");
		int sexo = leia.nextInt();
		
		switch (sexo) {
		case 1:
			System.out.println("Digite a sua altura: ");
			float altura = leia.nextFloat();
			
			float pesoIdeal = 72.7f * altura - 58.0f;
			System.out.println("Seu peso ideal é: " + pesoIdeal);
		break;
		case 2:
			System.out.println("Digite a sua altura: ");
			altura = leia.nextFloat();
			
			pesoIdeal = 62.1f * altura - 44.7f;
			System.out.println("Seu peso ideal é: " + pesoIdeal);
		break;
		default: 
			System.out.println("Opção inválida");
		break;
		}
	
	leia.close();
	
	}
}
