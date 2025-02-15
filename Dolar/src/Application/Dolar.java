package Application;

import java.util.Locale;
import java.util.Scanner;

import Util.CurrencyConverter;

public class Dolar {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner (System.in);
		
		System.out.print("What is the dollar price? ");
		double a = sc.nextDouble();
		System.out.print("How many dollars will be bought? ");
		double b = sc.nextDouble();
		
		double aux = CurrencyConverter.Conversao(a, b);
		System.out.printf("Amount to be paid in reais = %.2f%n", aux);
		
		sc.close();

	}

}
