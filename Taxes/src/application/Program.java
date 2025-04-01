package application;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import entities.TaxPayer;
import entities.Company;
import entities.Individual;

public class Program {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		List<TaxPayer> list = new ArrayList<>();

		System.out.print("Enter the number of tax payers: ");
		int n = sc.nextInt();

		for (int i = 1; i <= n; i++) {
			System.out.println("Tax payer #" + i + " data:");
			System.out.print("Individual or company (i/c)? ");
			char ch = sc.next().charAt(0);
			sc.nextLine();
			System.out.print("Name: ");
			String name = sc.nextLine();
			System.out.print("Anual income: ");
			double anualIncome = sc.nextDouble();

			if (ch == 'i') {
				System.out.print("Health Expenditures: ");
				double healthExpenditures = sc.nextDouble();
				list.add(new Individual(name, anualIncome, healthExpenditures));
			} else {
				System.out.print("Number of employees: ");
				int numberEmployees = sc.nextInt();
				list.add(new Company(name, anualIncome, numberEmployees));
			}

		}

		double totalTaxes = 0.0;
		System.out.println("\nTAXES PAID:");
		for (TaxPayer tax : list) {
			System.out.println(tax.getName() + ": $ " + String.format("%.2f", tax.tax()));
			totalTaxes += tax.tax();
		}

		System.out.println(String.format("\nTOTAL TAXES: $ %.2f", totalTaxes));

		sc.close();

	}

}
