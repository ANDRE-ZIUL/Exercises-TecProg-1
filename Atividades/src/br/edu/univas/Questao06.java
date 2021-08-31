package br.edu.univas;

import java.util.Scanner;

public class Questao06 {

	public static void main(String[] args) {
		
		Scanner leia = new Scanner(System.in);
		
		System.out.println("Digite o preço da gasolina: ");
		float gasolina = leia.nextFloat();
		
		System.out.println("Digite o preço do estanol: ");
		float etanol = leia.nextFloat();
		
		float resultado = etanol / gasolina * 100;
		
		if(resultado > 70) {
			System.out.println("Compensa mais abastecer com Gasolina");
		}else {
			System.out.println("Compensa mais abastecer com Etanol");
		}
		leia.close();
	}
}
