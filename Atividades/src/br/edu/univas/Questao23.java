package br.edu.univas;

public class Questao23 {

	public static void main(String[] args) {
		
		String valor = "";
		
		for(int i = 0; i < 10; i++) {
			valor += "*";
			System.out.println(valor);
		}
	
/*OUTRA FORMA: */
	
		
		for(int i = 0; i < 10; i++) {
			
			for(int j = 0; j <= i; j++) {
				System.out.print("*");
			}
			System.out.println(" ");
		}
	}
}
