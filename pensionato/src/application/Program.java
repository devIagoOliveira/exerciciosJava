package application;

import java.util.Scanner;
import entities.Locador;

public class Program {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		Locador[] vect = new Locador[10];

		String nome, email;
		int quarto, aux;

		System.out.print("How many rooms will be rented? ");
		aux = sc.nextInt();

		for (int i = 0; i < aux; i++) {
			System.out.println();
			sc.nextLine();
			System.out.println("Rent #" + (i + 1) + ":");
			System.out.print("Name: ");
			nome = sc.nextLine();
			System.out.print("Email: ");
			email = sc.next();
			System.out.print("Room: ");
			quarto = sc.nextInt();
			vect[quarto] = new Locador(nome, email);
		}

		System.out.println();
		System.out.println("Busy rooms:");
		for (int i = 0; i < vect.length; i++) {
			if (vect[i] != null) {
				System.out.println(i + vect[i].toString());
			}
		}

		sc.close();

	}

}
