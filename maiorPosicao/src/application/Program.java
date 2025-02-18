package application;

import java.util.Locale;
import java.util.Scanner;

public class Program {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner (System.in);
		
		int n;
		
		System.out.print("Quantos numeros voce vai digitar? ");
		n = sc.nextInt();
		
		double[] vect = new double[n];
		
		for(int i=0; i<vect.length; i++) {
			System.out.print("Digite um numero: ");
			vect[i] = sc.nextDouble();
		}
		
		double maior = vect[0];
		int posMaior = 0;
		
		for (int i=1; i<vect.length; i++) {
			if (vect[i] > maior) {
				maior = vect[i];
				posMaior = i;
			}
		}

		System.out.printf("\nMAIOR VALOR = %.1f%n", maior);
		System.out.println("POSICAO DO MAIOR VALOR = " + posMaior);
	
	
		sc.close();
	}

}
