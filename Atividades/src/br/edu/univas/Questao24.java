package br.edu.univas;

public class Questao24 {

	public static void main(String[] args) {
		
		int numero = 0;
		int numero1 = 0;
		
		for(int i = 1; i <= 101; i++) {
			numero++;
			
			if(numero % 5 == 0) {
				continue;
			}
				numero1 += numero;
		}
		System.out.println("Resultado da soma é: " + numero1);
	}
}
