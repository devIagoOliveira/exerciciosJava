package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Pessoa;

public class Program {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		System.out.print("Quantas pessoas serao digitadas? ");

		int n = sc.nextInt();

		Pessoa[] pessoa = new Pessoa[n];

		for (int i = 0; i < pessoa.length; i++) {
			System.out.print("Altura da " + (i + 1) + "a pessoa:");
			double altura = sc.nextDouble();
			System.out.print("Genero da " + (i + 1) + "a pessoa:");
			char sexo = sc.next().charAt(0);
			pessoa[i] = new Pessoa(altura, sexo);
		}

		double menorAltura, maiorAltura, mediaMulheres, somaAltMulheres;
		int countH, countM;
		
		menorAltura = pessoa[0].getAltura();
		
		for (int i = 1; i < pessoa.length; i++) {
			if(menorAltura > pessoa[i].getAltura()) {
				menorAltura = pessoa[i].getAltura();
			}
		}
		
		maiorAltura = pessoa[0].getAltura();
		
		for (int i = 1; i < pessoa.length; i++) {
			if(maiorAltura < pessoa[i].getAltura()) {
				maiorAltura = pessoa[i].getAltura();
			}
		}
		
		somaAltMulheres = 0.0;
		countM = 0;
		
		for (int i = 0; i < pessoa.length; i++) {
			if(pessoa[i].getSexo() == 'F') {
				somaAltMulheres += pessoa[i].getAltura();
				countM ++;
			}
		}
		
		mediaMulheres = somaAltMulheres / countM;
		
		countH = 0;
		
		for (int i = 0; i < pessoa.length; i++) {
			if(pessoa[i].getSexo() == 'M') {
				countH ++;
			}
		}
		
		System.out.printf("Menor Altura = %.2f%n", menorAltura);
		System.out.printf("Maior Altura = %.2f%n", maiorAltura);
		System.out.printf("Media de alturas das mulheres = %.2f%n", mediaMulheres);
		System.out.println("Numero de homens = " + countH);
				

			sc.close();

	}

}
