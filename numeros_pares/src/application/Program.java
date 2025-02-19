package application;

import java.util.Scanner;

public class Program {

	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		
		System.out.print("Quantos numeros voce vai digitar? ");
		int n = sc.nextInt();
		
		int[] numeros = new int[n];
		for(int i=0; i<numeros.length; i++) {
			System.out.print("Digite um numero: ");
			numeros[i] = sc.nextInt();
		}
		
		System.out.println();
		System.out.println("NUMEROS PARES:");
		int count = 0;
		for(int i=0; i<numeros.length; i++) {
			if (numeros[i] % 2 == 0) {
				count += 1;
				System.out.print(numeros[i] + " ");
			}
		}
		
		System.out.println();
		System.out.println("\nQUANTIDADE DE PARES = " + count);
		
		sc.close();
	}

}
