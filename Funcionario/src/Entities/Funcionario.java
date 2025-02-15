package Entities;

public class Funcionario {
	public String name;
	public double grossSalary;
	public double tax;
	public double percentage;
	
	public double netSalary() {
		return grossSalary - tax;
	}
	
	public double increaseSalary() {
		return grossSalary + (grossSalary * (percentage / 100)) - tax;
	}
	

}
