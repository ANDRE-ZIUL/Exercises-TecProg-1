package br.edu.univas;

import java.util.Scanner;

public class Questao01 {

	public static void main(String[] args) {
		
		Scanner leia = new Scanner(System.in);
		
		System.out.println("Digite o valor do seu salário: ");
		float salario = leia.nextFloat();
		
		if(salario <= 1903.98f) {
			System.out.println("Você está isento do IR");
		}else if(salario <= 2826.66f) {
			System.out.println("Sua aliquota de IR é de 7,5%");
		}else if(salario <= 3751.05f) {
			System.out.println("Sua aliquota de IR é de 15%");
		}else if(salario <= 4664.68f) {
			System.out.println("Sua aliquota de IR é de 22,5%");
		}else {
			System.out.println("Sua aliquota de IR é de 27,5%");
		}
		leia.close();
	}
}
