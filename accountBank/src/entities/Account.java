package entities;

public class Account {

	private int number;
	private String name;
	private double balance;

	public Account(int number, String name, double balance) {
		this.number = number;
		this.name = name;
		this.balance = balance;
	}
	
	public Account(int number, String name) {
		this.number = number;
		this.name = name;
	}

	public int getNumber() {
		return number;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getBalance() {
		return balance;
	}

	public void addBalance(double balance) {
		this.balance += balance;
	}

	public void removeBalance(double balance) {
		this.balance -= balance + 5.00;
	}
	
	public String toString() {
		return number + ", Holder: " + name + ", Balance: $ " + String.format("%.2f%n", balance); 
	}

}
