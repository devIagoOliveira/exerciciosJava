package application;

import java.util.Scanner;

import entities.Pessoa;

public class Program {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.print("Quantas pessoas voce vai digitar? ");

		int p = sc.nextInt();

		Pessoa[] pessoa = new Pessoa[p];

		for (int i = 0; i < pessoa.length; i++) {
			System.out.println("Dados da " + (i + 1) + "a pessoa:");
			System.out.print("Nome: ");
			sc.nextLine();
			String nome = sc.nextLine();
			System.out.print("Idade: ");
			int idade = sc.nextInt();
			pessoa[i] = new Pessoa(nome, idade);
		}

		int maisVelho = pessoa[0].getIdade();
		int pos = 0;

		for (int i = 1; i < pessoa.length; i++) {
			if (pessoa[i].getIdade() > maisVelho) {
				pos = i;	
			}
		}
		
		System.out.println("PESSOA MAIS VELHA: " + pessoa[pos].getNome());

		sc.close();
	}

}
