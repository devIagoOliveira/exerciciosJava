package Application;

import java.util.Locale;
import java.util.Scanner;
import Entities.Aluno;

public class Program {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		Aluno aluno = new Aluno();

		aluno.name = sc.nextLine();
		aluno.n1 = sc.nextDouble();
		aluno.n2 = sc.nextDouble();
		aluno.n3 = sc.nextDouble();

		if (aluno.finalNote() >= 60) {
			System.out.printf("FINAL GRADE = %.2f%nPASS", aluno.finalNote());
		} else {
			System.out.printf("FINAL GRADE = %.2f%nFAILED%n", aluno.finalNote());
			System.out.printf("MISSING %.2f POINTS", aluno.missing());
		}

		sc.close();

	}

}
