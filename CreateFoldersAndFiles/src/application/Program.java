package application;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import model.entities.Product;

public class Program {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		List<Product> list = new ArrayList<>();

		// "C:\Users\GICBRA027\Documents\Java\exerciciosJava\source.csv";

		System.out.println("Enter with path file:");
		String sourcePath = sc.nextLine();

		File filePath = new File(sourcePath);
		String directory = filePath.getParent();

		boolean success = new File(directory + "\\out").mkdir();

		String targetPath = directory + "\\out\\summary.csv";

		try (BufferedReader BR = new BufferedReader(new FileReader(sourcePath))) {
			String item = BR.readLine();

			while (item != null) {
				String[] fields = item.split(",");
				String name = fields[0];
				double price = Double.parseDouble(fields[1]);
				int quantity = Integer.parseInt(fields[2]);

				list.add(new Product(name, price, quantity));
				item = BR.readLine();
			}

			try (BufferedWriter BW = new BufferedWriter(new FileWriter(targetPath))) {
				for (Product product : list) {
					BW.write(product.getName() + "," + String.format("%.2f", product.totalPrice()));
					BW.newLine();
				}

				System.out.println(targetPath + " CREATED");
			} catch (IOException e) {
				System.out.println("Error: " + e.getMessage());
			}

		} catch (IOException e) {
			System.out.println("Error: " + e.getMessage());
		}

		sc.close();
	}

}
