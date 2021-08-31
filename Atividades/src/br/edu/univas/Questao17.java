package br.edu.univas;

public class Questao17 {

	public static void main(String[] args) {
		
		System.out.println("Valor inicial da mensalidade é R$1000,00");
		float valor = 1000.00f;
		for(int contador = 1; contador <= 7; contador++) {
			valor = valor / 100 * 5 + valor;
			String resultado = String.format ( "%.2f" , valor );
			System.out.println(resultado);
		}
		String resultado = String.format ( "%.2f" , valor );
		System.out.println("O valor da mensalidade no último semestre será : R$" + resultado);
	}
}
