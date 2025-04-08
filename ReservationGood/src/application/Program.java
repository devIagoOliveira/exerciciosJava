package application;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeParseException;
import java.util.Scanner;

import model.entities.Reservation;

public class Program {

	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		DateTimeFormatter fmt = DateTimeFormatter.ofPattern("dd/MM/yyyy");
		
		try {
			System.out.print("Room number: ");
			int roomNumber = sc.nextInt();
			System.out.print("Check-in date (dd/MM/yyyy): ");
			LocalDate checkin = LocalDate.parse(sc.next(), fmt);
			System.out.print("Check-out date (dd/MM/yyyy): ");
			LocalDate checkout = LocalDate.parse(sc.next(), fmt);
			
			Reservation reserva = new Reservation(roomNumber, checkin, checkout);
			System.out.println("Reservation: " + reserva);
			
			System.out.println("\nEnter data to update the reservation:");
			System.out.print("Check-in date (dd/MM/yyyy): ");
			checkin = LocalDate.parse(sc.next(), fmt);
			System.out.print("Check-out date (dd/MM/yyyy): ");
			checkout = LocalDate.parse(sc.next(), fmt);
			
			reserva.updateDates(checkin, checkout);
			System.out.println("Reservation: " + reserva);
		}
		catch (DateTimeParseException e){
			System.out.println("Invalid date format");
		}
		catch (IllegalArgumentException e) {
			System.out.println("Error in reservation: " + e.getMessage());
		}
		
		sc.close();
		}
	}


