package br.edu.univas;

import java.util.Scanner;

public class Questao02 {
 public static void main(String[] args) {
	 
	Scanner leia = new Scanner(System.in);
	 
	 System.out.println("Digite um número de 0 à 10: ");
	 int numero = leia.nextInt();
	 
	 if(numero == 0) {
		 System.out.println("ZERO");
	 }else if(numero == 1) {
		 System.out.println("UM");
	 }else if(numero == 2) {
		 System.out.println("DOIS");
	 }else if(numero == 3) {
		 System.out.println("TRÊS");
	 }else if(numero == 4) {
		 System.out.println("QUATRO");
	 }else if(numero == 5) {
		 System.out.println("CINCO");
	 }else if(numero == 6) {
		 System.out.println("SEIS");
	 }else if(numero == 7) {
		 System.out.println("SETE");
	 }else if(numero == 8) {
		 System.out.println("OITO");
	 }else if(numero == 9) {
		 System.out.println("NOVE");
	 }else {
		 System.out.println("DEZ");
	 	}
	 leia.close();
 	}

}
