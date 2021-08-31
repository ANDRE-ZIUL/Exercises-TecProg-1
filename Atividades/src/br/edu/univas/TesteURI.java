package br.edu.univas;

import java.util.Scanner;

public class TesteURI {
 
	public static void main(String[] args) {
		
		Scanner leia = new Scanner(System.in);
	    
		double raio = leia.nextDouble();
	    double area = (raio * raio) * 3.14159;
	    
	    String resultado = String.format ( "%.2f" , area );
	    System.out.println("A=" + resultado);
	    leia.close();
	} 
}
