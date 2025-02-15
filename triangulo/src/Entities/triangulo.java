package Entities;

public class triangulo {
	
	public double a;
	public double c;
	public double b;
	
	public double area() {
		double p = (a + b + c) / 2;
		return Math.sqrt(p * (p - a) * (p - b) * (p - c));
	}

}
