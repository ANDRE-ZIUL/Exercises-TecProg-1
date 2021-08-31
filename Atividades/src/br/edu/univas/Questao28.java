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
		System.out.println("Digite o " + contador + " n�mero sorteados: ");
		int numeroSorteado = leia.nextInt();
		
		while(numeroSorteado < 1 || numeroSorteado > 60) {
			System.out.println("N�mero inv�lido!!! Digite novamente: ");
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
				System.out.println("N�mero inv�lido!!! Digite novamente: ");
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
			System.out.println("Parab�ns!!! Voc� j� pode se aposentar!");
		} else if(acertos == 5) {
			System.out.println("Voc� acertou 5 n�meros! V� at� uma ag�ncia retirar seu pr�mio!");
		} else if(acertos == 4) {
			System.out.println("Voc� acertou 4 n�meros! V� at� uma ag�ncia retirar seu pr�mio!");
		} else if(acertos > 0 && acertos < 4) {
			System.out.println("Voc� acertou apenas " + acertos + " n�meros! Tente outra vez!");
		}else {
			System.out.println("N�o foi dessa vez :C Tente outra vez !!!");
			}
		
		leia.close();
		}
	}

