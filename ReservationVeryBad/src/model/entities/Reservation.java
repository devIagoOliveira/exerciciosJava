package model.entities;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;

public class Reservation {

	private static DateTimeFormatter fmt1 = DateTimeFormatter.ofPattern("dd/MM/yyyy");

	private Integer roomNumber;
	private LocalDate checkin;
	private LocalDate checkout;

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

	public void updateDates(LocalDate checkin, LocalDate checkout) {
		this.checkin = checkin;
		this.checkout = checkout;
	}

	@Override
	public String toString() {
		return "Room " + roomNumber + ", check-in: " + fmt1.format(checkin) + ", check-out: " + fmt1.format(checkout)
				+ ", " + duration() + " nights";
	}

}
