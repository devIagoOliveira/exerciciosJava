package model.entities;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;

public class Reservation {
	
	private Integer roomNumber;
	private LocalDate checkin;
	private LocalDate checkout;
	
	private static DateTimeFormatter fmt = DateTimeFormatter.ofPattern("dd/MM/yyyy");
	
	public Reservation(Integer roomNumber, LocalDate checkin, LocalDate checkout) {
		this.roomNumber = roomNumber;
		this.checkin = checkin;
		this.checkout = checkout;
	}

	public Integer getRoomNumber() {
		return roomNumber;
	}

	public void setRoomNumber(Integer roomNumber) {
		this.roomNumber = roomNumber;
	}

	public LocalDate getCheckin() {
		return checkin;
	}

	public LocalDate getCheckout() {
		return checkout;
	}
	
	public long duration() {
		return ChronoUnit.DAYS.between(checkin, checkout);
	}
	
	public String updateDates(LocalDate checkin, LocalDate checkout) {
		
		LocalDate now = LocalDate.now();
		if(!checkin.isAfter(now) || !checkout.isAfter(now)) {
			return "Reservation dates for updatemust be future dates";
		}
		if(!checkout.isAfter(checkin)) {
			return "Check-out date must be after check-in date";
		}
		
		this.checkin = checkin;
		this.checkout = checkout;
		
		return null;
	}
	
	
	@Override
	public String toString() {
		return "Room " + roomNumber + ", check-in: " + fmt.format(checkin) + ", check-out: " + fmt.format(checkout)
				+ ", " + duration() + " nights";
	}
	

}
