package application;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;
import java.util.stream.Collectors;

import entities.Employee;

public class Program {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		System.out.print("Enter full file path: ");
		String path = sc.nextLine();

		try (BufferedReader br = new BufferedReader(new FileReader(path))) {

			List<Employee> list = new ArrayList<>();
			String line = br.readLine();

			while (line != null) {
				String[] fields = line.split(",");
				list.add(new Employee(fields[0], fields[1], Double.parseDouble(fields[2])));
				line = br.readLine();
			}

			System.out.print("Enter salary: ");
			double salaryIn = sc.nextDouble();

			System.out.println("Email of people whose salary is more than " + String.format("%.2f", salaryIn) + ":");

			List<String> emails = list.stream().filter(p -> p.getSalary() > salaryIn).map(p -> p.getEmail()).sorted()
					.collect(Collectors.toList());

			emails.forEach(System.out::println);

			double salaryMax = list.stream().filter(p -> p.getName().charAt(0) == 'M').map(p -> p.getSalary())
					.reduce(0.0, (y, x) -> y + x);

			System.out.println("Sum of salary of people whose name starts with: 'M': " + String.format("%.2f", salaryMax));

		} catch (IOException e) {
			System.out.println("Error: " + e.getMessage());
		}

		sc.close();

	}

}
