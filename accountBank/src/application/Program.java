package application;

import java.util.Locale;
import java.util.Scanner;
import entities.Account;

public class Program {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		Account account;
		System.out.print("Enter account number: ");
		int number = sc.nextInt();
		System.out.print("Enter account holder: ");
		sc.nextLine();
		String name = sc.nextLine();
		System.out.print("Is there na initial deposit (y/n)? ");
		char x = sc.next().charAt(0);

		if (x == 'y') {
			System.out.print("Enter initial deposit value: ");
			double balance = sc.nextDouble();
			account = new Account(number, name, balance);
		} else {
			account = new Account(number, name);
		}

		System.out.println();
		System.out.println("Account data:");
		System.out.println("Account " + account);

		System.out.println();
		System.out.print("Enter a deposit value: ");
		double balance = sc.nextDouble();
		account.addBalance(balance);
		System.out.println("Updated account data: ");
		System.out.println("Account " + account);

		System.out.println();
		System.out.print("Enter a withdraw value: ");
		balance = sc.nextDouble();
		account.removeBalance(balance);
		System.out.println("Updated account data: ");
		System.out.println("Account " + account);

		sc.close();

	}

}
