package Application;

import java.util.Locale;
import java.util.Scanner;

import Entities.Funcionario;


public class Program {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner (System.in);
		
		Funcionario funcionario = new Funcionario();
		
		System.out.print("Name: ");
		funcionario.name = sc.nextLine();
		System.out.print("Gross salary: ");
		funcionario.grossSalary = sc.nextDouble();
		System.out.print("Tax: ");
		funcionario.tax = sc.nextDouble();
		
		System.out.println();
		System.out.printf("Employee: %s, $ %.2f%n", funcionario.name, funcionario.netSalary());
		
		System.out.println();
		System.out.print("Which percentage to increase salary? ");
		funcionario.percentage = sc.nextDouble();
		
		System.out.println();
		System.out.printf("Update data: %s, $ %.2f%n", funcionario.name, funcionario.increaseSalary());
		
		
		sc.close();
		

	}

}
