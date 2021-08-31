package br.edu.univas;

import java.util.Scanner;

public class Questao33 {

	public static void main(String[] args) {
		
		Scanner leia = new Scanner(System.in);
		
		int[] numeros = new int[50];
		
		for(int i = 0; i < 50; i++) {
			numeros[i] = leia.nextInt();
		}
		
		for(int i = 0; i < 50; i++) {
			boolean numeroRepetido = false;
			
			for(int j = 0; j < 50; j++) {
				if( i != j && numeros[i] == numeros[j]) {
					numeroRepetido = true;
				}
			}
			
			if(numeroRepetido == true) {
				System.out.print(numeros[i] + ", ");
			}
			
			leia.close();
		}
	}
}
