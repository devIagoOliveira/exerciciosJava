package model.entities;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;

import model.exceptions.DomainException;

public class Reservation {
	
	private Integer roomNumber;
	private LocalDate checkin;
	private LocalDate checkout;
	
	DateTimeFormatter fmt = DateTimeFormatter.ofPattern("dd/MM/yyyy");

	public Reservation(Integer roomNumber, LocalDate checkin, LocalDate checkout) throws DomainException{
		if(!checkout.isAfter(checkin)) {
			throw new DomainException("Check-out date must be after check-in date");
		}
		this.roomNumber = roomNumber;
		this.checkin = checkin;
		this.checkout = checkout;
	}

	public LocalDate getCheckin() {
		return checkin;
	}

	public void setCheckin(LocalDate checkin) {
		this.checkin = checkin;
	}

	public Integer getRoomNumber() {
		return roomNumber;
	}

	public LocalDate getCheckout() {
		return checkout;
	}
	
	public long duration() {
		return ChronoUnit.DAYS.between(checkin, checkout);
	}
	
	public void updateDates(LocalDate checkin, LocalDate checkout) throws DomainException {
		LocalDate now = LocalDate.now();
		
		if(checkin.isBefore(now) || checkout.isBefore(now)) {
			throw new DomainException("Reservation dates for update must be future dates");
		}
		if(!checkout.isAfter(checkin)) {
			throw new DomainException("Check-out date must be after check-in date");
		}
		this.checkin = checkin;
		this.checkout = checkout;
	}
	
	@Override
	public String toString() {
		return "Room "
				+ roomNumber
				+ ", check-in: "
				+ fmt.format(checkin)
				+ ", check-out: "
				+ fmt.format(checkout)
				+ ", "
				+ duration()
				+ " nights";
	}
	
	

}
