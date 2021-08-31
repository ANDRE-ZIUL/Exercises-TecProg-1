package br.edu.univas;

import java.util.Scanner;

public class Questao12 {

	public static void main(String[] args) {
		
		Scanner leia = new Scanner(System.in);
		
		System.out.println("Digite seu nome: ");
		String nome = leia.nextLine();
		
		int nota = 0;
		for(int contador = 1; contador <= 4; contador++) {
			System.out.println("Digite a " + contador + "º nota: ");
			nota += leia.nextInt();
		}
		
		int media = nota / 4;
		
		if(media > 59) {
			System.out.println("O aluno " + nome + " está Aprovado!");
		}else if(media >= 40 ) {
			System.out.println("O aluno " + nome + " está em Recuperação!");
		} else {
			System.out.println("O aluno " + nome + " está Reprovado!");
		}
		
		leia.close();
	}
}
