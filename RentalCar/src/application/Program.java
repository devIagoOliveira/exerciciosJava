package application;

import java.text.ParseException;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Locale;
import java.util.Scanner;

import model.entities.CarRental;
import model.entities.Vehicle;
import model.services.BrazilTaxService;
import model.services.RentalService;

public class Program {

	public static void main(String[] args) throws ParseException {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		DateTimeFormatter fmt = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm");
		
		System.out.println("Enter the rental data");
		System.out.print("Car model: ");
		String carModel = sc.nextLine();
		System.out.print("Pickup date (dd/MM/yyyy HH:mm): ");
		LocalDateTime pickupDate = LocalDateTime.parse(sc.nextLine(), fmt);
		System.out.print("Return date (dd/MM/yyyy HH:mm): ");
		LocalDateTime returnDate = LocalDateTime.parse(sc.nextLine(), fmt);
		
		CarRental CR = new CarRental(pickupDate, returnDate, new Vehicle(carModel));
		
		System.out.print("Enter with price per hour: ");
		double pricePerHour = sc.nextDouble();
		System.out.print("Enter with price per day: ");
		double pricePerDay = sc.nextDouble();
		
		RentalService service = new RentalService(pricePerHour, pricePerDay, new BrazilTaxService());
		
		service.processInvoice(CR);
		
		System.out.println("INVOICE:");
		System.out.println("Basic Payment: " + String.format("%.2f",CR.getInvoice().getBasicPayment()));
		System.out.println("Tax: " + String.format("%.2f",CR.getInvoice().getTax()));
		System.out.println("Total Payment: " + String.format("%.2f",CR.getInvoice().getTotalPaymente()));
		
		 
		sc.close();
	}

}
