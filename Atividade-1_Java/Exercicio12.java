package exercicios;

import java.util.Scanner;

public class Exercicio12 {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);

	        
	        System.out.print("Digite o raio do círculo: ");
	        
	        float raio = scanner.nextFloat();

	       
	        float pi = (float) Math.PI;

	     
	        float area = pi * raio * raio;

	      
	        System.out.println("A área do círculo com raio " + raio + " é: " + area);

	        
	        scanner.close();
	}
	
}
