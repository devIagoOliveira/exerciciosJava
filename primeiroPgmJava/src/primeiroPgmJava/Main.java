package primeiroPgmJava;

import java.util.Locale;

public class Main {

	public static void main(String[] args) {
		int y = 32;
		double x = 10.65486;
		
		System.out.println(y);
		System.out.printf("%.2f%n", x);
		System.out.printf("%.4f%n", x);
		Locale.setDefault(Locale.US);
		System.out.printf("%.4f%n", x);
		System.out.println("Resultado = " + x + " metros.");
		System.out.printf("Resultado = %.2f metros.%n", x);
		System.out.print("Olá Mundo! ");
		System.out.println("Tudo bem?");
		
		
		String nome = "Maria";
		int idade = 23;
		double renda = 4000.0;
		
		System.out.printf("%s tem %d anos e ganha R$%.2f por mês", nome, idade, renda);
	}

}
