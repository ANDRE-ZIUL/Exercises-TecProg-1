package br.edu.univas;

import java.util.Scanner;

public class Questao16 {

	public static void main(String[] args) {
		
		Scanner leia = new Scanner(System.in);
		
		int soma = 0;
		
		for(int contador = 1; contador <= 30; contador++) {
		System.out.println("Digite a nota do " + contador + "� aluno: ");
		int nota = leia.nextInt();
		soma += nota;
		
		}
		int media = soma / 30;
		System.out.println("A m�dia geral da sala � : " + media);
		
		leia.close();
	}
}
