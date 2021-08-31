package br.edu.univas;

import java.util.Scanner;

public class Questao28 {

	private static Scanner leia;

	public static void main(String[] args) {
		
		leia = new Scanner(System.in);
		
		int contador = 1;
		int i;
		int[] numerosSorteados = new int[6];
		
		for(i = 0; i < 6; i++) {
		System.out.println("Digite o " + contador + " número sorteados: ");
		int numeroSorteado = leia.nextInt();
		
		while(numeroSorteado < 1 || numeroSorteado > 60) {
			System.out.println("Número inválido!!! Digite novamente: ");
			 numeroSorteado = leia.nextInt();
		}
		numerosSorteados[i] = numeroSorteado;
		contador++;
		}
		
		contador = 1;
		int[] aposta = new int[6];
		for(i = 0; i < 6; i++) {
			System.out.println("Digite " + contador + " numeros da sua aposta: ");
			
			int numeroApostado = leia.nextInt();
			
			while(numeroApostado < 1 || numeroApostado > 60) {
				System.out.println("Número inválido!!! Digite novamente: ");
				numeroApostado = leia.nextInt();
			}
			aposta[i] = numeroApostado;
			contador++;
		}
		
		int acertos = 0;
		for(i = 0; i < 6; i++) {
			for(int j = 0; j < 6; j++) {
				if(numerosSorteados[j] == aposta[i]) {
					acertos++;
					break;
				}
			}
		}
		if(acertos == 6) {
			System.out.println("Parabéns!!! Você já pode se aposentar!");
		} else if(acertos == 5) {
			System.out.println("Você acertou 5 números! Vá até uma agência retirar seu prêmio!");
		} else if(acertos == 4) {
			System.out.println("Você acertou 4 números! Vá até uma agência retirar seu prêmio!");
		} else if(acertos > 0 && acertos < 4) {
			System.out.println("Você acertou apenas " + acertos + " números! Tente outra vez!");
		}else {
			System.out.println("Não foi dessa vez :C Tente outra vez !!!");
			}
		
		leia.close();
		}
	}

