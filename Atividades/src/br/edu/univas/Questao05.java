package br.edu.univas;

import java.util.Scanner;

public class Questao05 {

	public static void main(String[] args) {
		
		Scanner leia = new Scanner(System.in);
		
		System.out.println("Digite um número entre 1 e 7");
		int dia = leia.nextInt();
		
		if(dia == 1) {
			System.out.println("DOMINGO");
		}else if(dia == 2) {
			System.out.println("SEGUNDA-FEIRA");
		}else if(dia == 3) {
			System.out.println("TERÇA-FEIRA");
		}else if(dia == 4) {
			System.out.println("QUARTA-FEIRA");
		}else if(dia == 5) {
			System.out.println("QUINTA-FEIRA");
		}else if(dia == 6) {
			System.out.println("SEXTA-FEIRA");
		}else {
			System.out.println("SABADO");
		}
		leia.close();
	}
}
