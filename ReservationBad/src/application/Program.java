package application;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

import model.entities.Reservation;

public class Program {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		DateTimeFormatter fmt = DateTimeFormatter.ofPattern("dd/MM/yyyy");

		System.out.print("Room number: ");
		int roomNumber = sc.nextInt();
		System.out.print("Check-in date (dd/MM/yyyy): ");
		LocalDate checkin = LocalDate.parse(sc.next(), fmt);
		System.out.print("Check-out date (dd/MM/yyyy): ");
		LocalDate checkout = LocalDate.parse(sc.next(), fmt);

		if (!checkout.isAfter(checkin)) {
			System.out.println("Error in reservation: Check-out date must beaftercheck-in date");
		} else {
			Reservation reserva = new Reservation(roomNumber, checkin, checkout);
			System.out.println("Reservation: " + reserva);

			System.out.println("\nEnter data to update the reservation:");
			System.out.print("Check-in date (dd/MM/yyyy): ");
			checkin = LocalDate.parse(sc.next(), fmt);
			System.out.print("Check-out date (dd/MM/yyyy): ");
			checkout = LocalDate.parse(sc.next(), fmt);
			
			String error = reserva.updateDates(checkin, checkout);
			
			if(error != null) {
				System.out.println("Error in reservation: " + error);
			} else {
				System.out.println("Reservation: " + reserva);
			}

		}

		sc.close();
	}

}
