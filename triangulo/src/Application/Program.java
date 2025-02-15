package Application;

import java.util.Locale;
import java.util.Scanner;

import Entities.triangulo;

public class Program {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		triangulo x, y;
		x = new triangulo();
		y = new triangulo();

		System.out.println("Entre com as medidas do triangulo X:");
		x.a = sc.nextDouble();
		x.b = sc.nextDouble();
		x.c = sc.nextDouble();

		System.out.println("Entre com as medidas do triangulo Y:");
		y.a = sc.nextDouble();
		y.b = sc.nextDouble();
		y.c = sc.nextDouble();

		double areaX = x.area();
		double areaY = y.area();

		System.out.printf("Triangulo X, area: %.4f%n", areaX);
		System.out.printf("Triangulo Y, area: %.4f%n", areaY);

		if (areaX > areaY) {
			System.out.println("Maior Area: X");
		} else {
			System.out.println("Maior Area: Y");
		}

		sc.close();
	}

}

/*
 * double xA, xB, xC, yA, yB, yC;
 * 
 * System.out.println("Entre com as medidas do triangulo X:"); xA =
 * sc.nextDouble(); xB = sc.nextDouble(); xC = sc.nextDouble();
 * 
 * System.out.println("Entre com as medidas do triangulo Y:"); yA =
 * sc.nextDouble(); yB = sc.nextDouble(); yC = sc.nextDouble();
 * 
 * double p = (xA + xB + xC) / 2; double areaX = Math.sqrt(p * (p - xA) * (p -
 * xB) * (p - xC));
 * 
 * p = (yA + yB + yC) / 2; double areaY = Math.sqrt(p * (p - xA) * (p - xB) * (p
 * - xC));
 * 
 * System.out.printf("Triangulo X, area: %.4f%n", areaX);
 * System.out.printf("Triangulo Y, area: %.4f%n", areaY);
 * 
 * if (areaX > areaY) { System.out.println("Maior Area: X"); } else {
 * System.out.println("Maior Area: Y"); }
 */

/*triangulo x, y;
x = new triangulo();
y = new triangulo();

System.out.println("Entre com as medidas do triangulo X:");
x.a = sc.nextDouble();
x.b = sc.nextDouble();
x.c = sc.nextDouble();

System.out.println("Entre com as medidas do triangulo Y:");
y.a = sc.nextDouble();
y.b = sc.nextDouble();
y.c = sc.nextDouble();

double p = (x.a + x.b + x.c) / 2;
double areaX = Math.sqrt(p * (p - x.a) * (p - x.b) * (p - x.c));

p = (y.a + y.b + y.c) / 2;
double areaY = Math.sqrt(p * (p - y.a) * (p - y.b) * (p - y.c));

System.out.printf("Triangulo X, area: %.4f%n", areaX);
System.out.printf("Triangulo Y, area: %.4f%n", areaY);

if (areaX > areaY) {
	System.out.println("Maior Area: X");
} else {
	System.out.println("Maior Area: Y");
}*/