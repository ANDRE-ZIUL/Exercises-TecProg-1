package br.edu.univas;

import java.util.Scanner;

public class Questao15 {

	public static void main(String[] args) {
		
		Scanner leia = new Scanner(System.in);
		
		System.out.println("Digite seu peso: ");
		float peso = leia.nextFloat();
		
		System.out.println("Digite sua altura: ");
		float altura = leia.nextFloat();
		
		float imc = peso / (altura * altura);
		
		if(imc > 40.0) {
			System.out.println("Seu IMC é " + imc + " e indica Obesidade de 3º grau");
		} else if(imc >= 35.0) {
			System.out.println("Seu IMC é " + imc + " e indica Obesidade de 2º grau");
		} else if(imc >= 30.0) {
			System.out.println("Seu IMC é " + imc + " e indica Obesidade de 1º grau");
		} else if(imc >= 25.0) {
			System.out.println("Seu IMC é " + imc + " e indica Sobrepeso");
		} else if(imc >= 18.5) {
			System.out.println("Seu IMC é " + imc + " e indica Peso Normal");
		} else {
			System.out.println("Seu IMC é " + imc + " e indica que está Abaixo do Peso");
		}
		
		leia.close();
	}

}
