package application;

import java.util.Scanner;

public class Program {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.print("Quantos numeros voce vai digitar? ");

		int n = sc.nextInt();
		int[] negativos = new int[n];

		for (int i = 0; i < negativos.length; i++) {
			System.out.print("Digite um numero: ");
			negativos[i] = sc.nextInt();
		}

		System.out.println("NUMEROS NEGATIVOS:");

		for (int i = 0; i < negativos.length; i++){
			if(negativos[i] < 0) {
				System.out.println(negativos[i]);
			}
		}

		sc.close();

	}

}
