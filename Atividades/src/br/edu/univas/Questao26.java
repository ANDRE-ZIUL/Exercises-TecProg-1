package br.edu.univas;

import java.util.Scanner;

public class Questao26 {

	public static void main(String[] args) {
		
		Scanner leia = new Scanner(System.in);
		
		float valorFinal = 0;
		int contador = 1;
		
		while(contador > 0) {
			
			System.out.println("Digite o valor da sua " + contador + "º venda (digite -1 para encerrar o programa): ");
			float valorVenda = leia.nextFloat();
			
			if(valorVenda != -1) {
			valorFinal += valorVenda;
			}else {
				break;
				}
			}
			
		System.out.println(String.format("O valor total de suas vendas hoje foi: " + "%.2f", valorFinal));
		leia.close();
	}
}
