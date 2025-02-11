package exercicio02;

import java.util.Locale;
import java.util.Scanner;

public class ex06 {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner (System.in);
		double A, B, C, pi;
		
		pi = 3.14159;
		
		A = sc.nextDouble();
		B = sc.nextDouble();
		C = sc.nextDouble();
		
		// TRIANGULO = (A)base x (C)altura / 2
		double triangulo = A * C / 2;
		
		// CIRCULO = pi x (C)raio²
		double circulo = pi * Math.pow(C, 2);
		
		// TRAPEZIO = (A)baseMaior + (B)basemenor / 2 * (C)altura
		double trapezio = (A + B) / 2 * C;
		
		// QUADRADO = (B)lado²
		double quadrado = Math.pow(B, 2);
		
		// RETANGULO = (A)base x (B)altura
		double retangulo = A * B;
		
		System.out.printf("TRIANGULO: %.3f%n", triangulo);
		System.out.printf("CIRCULO: %.3f%n", circulo);
		System.out.printf("TRAPEZIO: %.3f%n", trapezio);
		System.out.printf("QUADRADO: %.3f%n", quadrado);
		System.out.printf("RETANGULO: %.3f%n", retangulo);
		
		sc.close();
	}

}
