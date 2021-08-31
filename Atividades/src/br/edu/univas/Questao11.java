package br.edu.univas;

import java.util.Scanner;

public class Questao11 {

	public static void main(String[] args) {
		
		Scanner leia = new Scanner(System.in);

		int idadeMaior = 0;
		String nomeMaior = "";
		for(int contador = 1; contador <= 3; contador++) {
		System.out.println("Digite o " + contador + "º nome: ");
		String nome = leia.nextLine();
		leia.nextLine();
		
		System.out.println("Digite o ano de seu nascimento: ");
		int ano = leia.nextInt();
		leia.nextLine();
			
		int idade = 2021 - ano;
		if(idade > idadeMaior) {
			idadeMaior = idade;
			nomeMaior = nome;
			}
		}
		
		System.out.println("Seu nome é : " + nomeMaior + " e sua idade é: " + idadeMaior);
		leia.close();
		
			}
		}


