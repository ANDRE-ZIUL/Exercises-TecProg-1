package br.edu.univas;

import java.util.Scanner;

public class Questao19 {

	public static void main(String[] args) {
		
		Scanner leia = new Scanner(System.in);
		
		int maria = 0;
		int jose = 0;
		int joao = 0;
		
		for(int contador = 1; contador <= 5; contador++) {
		System.out.println("Por favor digite seu voto: \n 1 - MARIA \n 2 - JO�O \n 3 - JOS�");
		int voto = leia.nextInt();
		
		if(voto == 1) {
			maria++;
		} else if(voto == 2) {
			joao++;
		} else if (voto == 3) {
			jose++;
			}
		
		}
		
		if(maria > joao && maria > jose) {
			System.out.println("Maria � a vencedora com " + maria + " votos!");
		} else if(joao > maria && joao > jose) {
			System.out.println("Jo�o � o vencedor com " + joao + " votos!");
		} else if(jose > maria && jose > joao) {
			System.out.println("Jos� � o vencedor com " + jose + " votos!");
		}
		leia.close();
	}
}
