package br.edu.univas;

import java.util.Scanner;

public class Questao29 {

	private static Scanner leia;

	public static void main(String[] args) {
		
		leia = new Scanner(System.in);
		int i;
		int mes = 0;
		int contador = 1;
		float[] temperaturaMensal = new float[12];
		
		for(i = 0; i < 12; i++) {
			System.out.println("Digite a temperatura m�dia no m�s " + contador + ": ");
			temperaturaMensal[i] = leia.nextFloat();
			contador++;
		}
		
		double mediaAnual = 0;
		
		for(i = 0; i < 12; i++) {
			mediaAnual += temperaturaMensal[i];
		}
		
		mediaAnual = mediaAnual / 12;
		
		for(i = 0; i < 12; i++) {
			mes++;
			if(temperaturaMensal[i] > mediaAnual){
				System.out.println("No m�s " + mes + " a temperatura mensal foi maior que a anual chegando aos " + temperaturaMensal[i] + "�C");
			}
			
		}
		
		leia.close();
	}
}
