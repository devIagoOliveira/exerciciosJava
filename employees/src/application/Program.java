package application;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import entities.Employees;
import java.util.Scanner;

public class Program {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		List<Employees> employee = new ArrayList<>();

		System.out.print("How many employees will be registered? ");

		int n = sc.nextInt();

		for (int i = 0; i < n; i++) {
			System.out.println("\nEmplyoee #" + (i + 1) + ":");
			System.out.print("Id: ");
			int id = sc.nextInt();
			System.out.print("Name: ");
			sc.nextLine();
			String name = sc.nextLine();
			System.out.print("Salary: ");
			double salary = sc.nextDouble();
			employee.add(new Employees(id, name, salary));
		}

		System.out.print("\nEnter the employee id that will have salary increase : ");
		int id = sc.nextInt();
		Employees obj = employee.stream().filter(x -> x.getId() == id).findFirst().orElse(null);

		if (obj == null) {
			System.out.println("This id does not exist!");
		} else {
			System.out.print("Enter the percentage: ");
			double percent = sc.nextDouble();
			obj.increaseSalary(percent);
		}

		System.out.println("\nList of employees:");
		for (Employees z : employee) {
			System.out.println(z);
		}

		sc.close();

	}

}
