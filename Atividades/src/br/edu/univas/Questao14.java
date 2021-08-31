package br.edu.univas;

import java.util.Scanner;

public class Questao14 {

	public static void main(String[] args) {
		
		Scanner leia = new Scanner(System.in);
		
		System.out.println("Digite seu nome: ");
		String nome = leia.nextLine();
		
		System.out.println("Digite sua quantidade de horas trabalhadas: ");
		float horas = leia.nextFloat();
		
		System.out.println("Digite o valor da sua hora trabalhada: ");
		float valor = leia.nextFloat();
		
		double salario = horas * valor;
		
		System.out.println("O salário do Senhor(a) " + nome +  " esse mês será " + salario);
		
		leia.close();
	}
}
