package application;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

import model.entities.Reservation;

public class Program {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		DateTimeFormatter fmt1 = DateTimeFormatter.ofPattern("dd/MM/yyyy");

		System.out.print("Room number: ");
		int roomNumber = sc.nextInt();
		System.out.print("Check-in date (dd/MM/yyyy): ");
		LocalDate checkin = LocalDate.parse(sc.next(), fmt1);
		System.out.print("Check-out date (dd/MM/yyyy): ");
		LocalDate checkout = LocalDate.parse(sc.next(), fmt1);

		if (!checkout.isAfter(checkin)) {
			System.out.println("Check-out date must be after check-in date");
		} else {
			Reservation reserva = new Reservation(roomNumber, checkin, checkout);
			System.out.println("Reservation: " + reserva);

			System.out.println("\nEnter data to update the reservation:");
			System.out.print("Check-in date (dd/MM/yyyy): ");
			checkin = LocalDate.parse(sc.next(), fmt1);
			System.out.print("Check-out date (dd/MM/yyyy): ");
			checkout = LocalDate.parse(sc.next(), fmt1);

			LocalDate now = LocalDate.now();

			if (!checkin.isAfter(now) || checkout.isAfter(now)) {
				System.out.println("Error in reservation: Reservation dates for updatemust be future dates");
			} else if (!checkout.isAfter(checkin)) {
				System.out.println("Error in reservation: Check-out date must be after check-in date");
			} else {
				reserva.updateDates(checkin, checkout);
				System.out.println("Reservation: " + reserva);
			}
		}

		sc.close();

	}

}
