package br.edu.univas;

public class Questao20 {

	public static void main(String[] args) {
		
		int valor = 0;
		for(int contador = 2; contador <= 100; contador += 2) {
			valor += contador;
		}
		System.out.println("O resultado da soma é: "+ valor);
	}
}
