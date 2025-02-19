package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Alunos;

public class Program {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		System.out.print("Quantos alunos serao digitados? ");

		int n = sc.nextInt();

		Alunos[] aluno = new Alunos[n];

		for (int i = 0; i < aluno.length; i++) {
			System.out.println("Digite nome, primeira e segunda nota do " + (i + 1) + "o alnuo:");
			sc.nextLine();
			String nome = sc.nextLine();
			double nota1 = sc.nextDouble();
			double nota2 = sc.nextDouble();
			aluno[i] = new Alunos(nome, nota1, nota2);
		}

		System.out.println("Alunos Aprovados:");

		for (int i = 0; i < aluno.length; i++) {
			if((aluno[i].getNota1() + aluno[i].getNota2()) / 2 >= 6.0) {
				System.out.println(aluno[i].getNome());
			}
		}

		sc.close();

	}

}
