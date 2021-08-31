package br.edu.univas;

import java.util.Scanner;

public class Questao03 {

	public static void main(String[] args) {
	
		Scanner leia = new Scanner(System.in);
		
		System.out.println("Digite a idade: ");
		int idade = leia.nextInt();
		
		if(idade <= 7) {
			System.out.println("Se encaixa na categoria Infantil A");
		}else if(idade <= 10) {
			System.out.println("Se encaixa na categoria Infantil B");
		}else if(idade <= 13) {
			System.out.println("Se encaixa na categoria Juvenil A");
		}else if(idade <= 17) {
			System.out.println("Se encaixa na categoria Juvenil B");
		}else if(idade <= 60) {
			System.out.println("Se encaixa na categoria Adulto");
		}else {
			System.out.println("Se encaixa na categoria Sênior");
		}
		leia.close();
	}
}
