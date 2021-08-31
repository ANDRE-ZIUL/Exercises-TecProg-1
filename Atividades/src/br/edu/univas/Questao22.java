package br.edu.univas;

import java.util.Scanner;

public class Questao22 {

	public static void main(String[] args) {
		
		Scanner leia = new Scanner(System.in);
		
		int vitoriasBR = 0;
		int vitoriasAR = 0;
		int empate = 0;
		for(int i = 1; i <= 135; i++) {
			System.out.println("Resultado da partida número " + i);
			System.out.println("Digite o placar");
			System.out.println("Gols do Brasil na partida: ");
			int golBR = leia.nextInt();
			System.out.println("Gols da Argentina na partida: ");
			int golAR = leia.nextInt();
			
			if(golBR > golAR) {
				vitoriasBR++;
			} else if(golAR > golBR) {
				vitoriasAR++;
			} else if(golBR == golAR) {
				empate++;
			}
		}
		
		System.out.println("Quantidade de vitórias da Argentina: " + vitoriasAR);
		System.out.println("Quantidade de vitórias do Brasil: " + vitoriasBR);
		System.out.println("Quantidade de empates: " + empate);
		leia.close();
	}
}
