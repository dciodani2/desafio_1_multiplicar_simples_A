package br.com.deciodani.git;
import java.util.Scanner;

public class desafio_1_multiplicar_simples_A {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		
		int A, B, PROD; 
		
		
		System.out.println("Implemente um código que representa a multiplicação de inteiros em Java ");	
		
		
		A = sc.nextInt();
		System.out.println("o numero A e = " + A);
		
		
		B = sc.nextInt();
		System.out.println("o numero B e = " + B);
		
		PROD = (A*B)  ; //implemente o código que representa a multiplicação.
				
		System.out.println("PROD = (A * B) = " + PROD);
				
		sc.close();	
		
		
		

	}

}
