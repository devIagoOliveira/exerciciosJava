package application;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Locale;
import java.util.Scanner;

import entities.Client;
import entities.Order;
import entities.OrderItem;
import entities.Product;
import entities.enums.OrderStatus;

public class Program {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		DateTimeFormatter fmt1 = DateTimeFormatter.ofPattern("dd/MM/yyyy");

		System.out.println("Enter client data:");
		System.out.print("Name: ");
		String nameClient = sc.nextLine();
		System.out.print("Email: ");
		String emailClient = sc.next();
		System.out.print("Birth date (DD/MM/YYYY): ");
		LocalDate birthDateClient = LocalDate.parse(sc.next(), fmt1);

		System.out.println("Enter order data:");
		System.out.print("Status: ");
		String status = sc.next();
		System.out.print("How many items to this order? ");
		int n = sc.nextInt();
		sc.nextLine();

		Order order = new Order(LocalDateTime.now(), OrderStatus.valueOf(status),
				new Client(nameClient, emailClient, birthDateClient));

		for (int i = 1; i <= n; i++) {
			System.out.println("Enter #" + i + " item data:");
			System.out.print("Product name: ");
			String nameProduct = sc.nextLine();
			System.out.print("Product price: ");
			double priceProduct = sc.nextDouble();
			System.out.print("Quantity: ");
			int quantity = sc.nextInt();
			sc.nextLine();

			OrderItem orderItem = new OrderItem(quantity, priceProduct, new Product(nameProduct, priceProduct));
			order.addItem(orderItem);
		}

		System.out.println();
		System.out.println(order);
		System.out.println("Total price: $" + String.format("%.2f", order.total()));

		sc.close();

	}

}
