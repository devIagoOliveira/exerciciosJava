package application;

import java.util.Locale;
import java.util.Scanner;
import entities.Pessoa;

public class Program {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		System.out.print("Quantas pessoas serao digitadas? ");
		int x = sc.nextInt();

		Pessoa[] pessoa = new Pessoa[x];
		for (int i = 0; i < pessoa.length; i++) {
			System.out.println("Dados da " + (i + 1) + "a pessoa:");
			System.out.print("Nome: ");
			sc.nextLine();
			String nome = sc.nextLine();
			System.out.print("Idade: ");
			int idade = sc.nextInt();
			System.out.print("Altura: ");
			double altura = sc.nextDouble();
			pessoa[i] = new Pessoa(nome, idade, altura);
		}

		System.out.println();
		double sum = 0.0;
		for (int i = 0; i < pessoa.length; i++) {
			sum += pessoa[i].getAltura();
		}

		double avg = sum / x;
		System.out.printf("Altura média: %.2f%n", avg);

		int count = 0;
		for (int i = 0; i < pessoa.length; i++) {
			if (pessoa[i].getIdade() < 16) {
				count += 1;
			}
		}
		
		double percentual = (double) count / x * 100.0;
		
		System.out.printf("Pessoas com menos de 16 anos: %.1f%% %n", percentual);
		for (int i = 0; i < pessoa.length; i++) {
			if (pessoa[i].getIdade()< 16) {
				System.out.println(pessoa[i].getNome());
			}
		}

		
		sc.close();
	}

}
