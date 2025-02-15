package Application;

import java.util.Locale;
import java.util.Scanner;

import Entities.retangle;

public class Program {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		retangle retangle = new retangle();

		System.out.println("Enter rectangle width and height:");
		retangle.width = sc.nextDouble();
		retangle.height = sc.nextDouble();

		System.out.printf("AREA = %.2f%n", retangle.area());
		System.out.printf("PERIMETER = %.2f%n", retangle.perimeter());
		System.out.printf("DIAGONAL = %.2f%n", retangle.diagonal());

		sc.close();

	}

}
