package exercicio02;

import java.util.Locale;
import java.util.Scanner;

public class ex02 {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner (System.in);
		
		// fórmula de raio = pi . raio²
		
		double pi = 3.14159;
		
		double raio;
		
		raio = sc.nextDouble();
		
		double A = pi * Math.pow(raio, 2);
		
		System.out.printf("A= %.4f%n", A);		
		
		sc.close();

	}

}
