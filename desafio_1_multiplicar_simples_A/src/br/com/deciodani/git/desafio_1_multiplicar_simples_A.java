package br.com.deciodani.git;
import java.util.Scanner;

public class desafio_1_multiplicar_simples_A {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		
		int A, B, PROD; 
		
		
		System.out.println("Implemente um c�digo que representa a multiplica��o de inteiros em Java ");	
		
		
		A = sc.nextInt();
		System.out.println("o numero A e = " + A);
		
		
		B = sc.nextInt();
		System.out.println("o numero B e = " + B);
		
		PROD = (A*B)  ; //implemente o c�digo que representa a multiplica��o.
				
		System.out.println("PROD = (A * B) = " + PROD);
				
		sc.close();	
		
		
		

	}

}
