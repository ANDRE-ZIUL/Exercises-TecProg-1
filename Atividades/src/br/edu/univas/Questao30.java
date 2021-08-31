package br.edu.univas;

import java.util.Scanner;

public class Questao30 {

	private static Scanner leia;

	public static void main(String[] args) {
		
		leia = new Scanner(System.in);
		int i;
		int[] array1 = new int[10];
		
		for(i = 0; i < 10; i++) {
			array1[i] = leia.nextInt();
		}
		
		int[] array2 = new int[10];
		
		for(i = 0; i < 10; i++) {
			array2[i] = leia.nextInt();
		}
		
		int[] array3 = new int[10];
		
		for(i = 0; i < 10; i++) {
			array3[i] = array1[i] * array2[i];
			System.out.println("Valor do array3["+ i +"]:" + array3[i]);
		}
		
	
		leia.close();
	}
}
