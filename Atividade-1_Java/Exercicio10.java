package exercicios;

import java.util.Scanner;

public class Exercicio10 {
	
	public static void main(String[] args) {
		
		 Scanner scanner = new Scanner(System.in);

	    
	        System.out.print("Digite a diagonal maior do losango: ");
	       
	        int diagonalMaior = scanner.nextInt();

	      
	        System.out.print("Digite a diagonal menor do losango: ");
	   
	        int diagonalMenor = scanner.nextInt();

	     
	        int area = (diagonalMaior * diagonalMenor) / 2;

	        
	        System.out.println("A área do losango com diagonal maior " + diagonalMaior +
	                " e diagonal menor " + diagonalMenor + " é: " + area);

	    
	        scanner.close();
	}

}
