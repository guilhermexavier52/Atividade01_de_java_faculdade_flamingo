package exercicios;

import java.util.Scanner;

public class Exercicio08 {

	public static void main(String[] args) {
		 Scanner scanner = new Scanner(System.in);

	     
	        System.out.print("Digite a base do triângulo: ");
	      
	        int base = scanner.nextInt();

	     
	        System.out.print("Digite a altura do triângulo: ");
	      
	        int altura = scanner.nextInt();

	        
	        int area = (base * altura) / 2;

	       
	        System.out.println("A área do triângulo com base " + base + " e altura " + altura + " é: " + area);

	        
	        scanner.close();
	}
	
}
