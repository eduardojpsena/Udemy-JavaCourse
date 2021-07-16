package model.entities;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.concurrent.TimeUnit;

public class Reservation {

	private Integer roomNumber;
	private Date checkIn;
	private Date checkOut;
	
	private static SimpleDateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy");
	
	public Reservation() {
	}

	public Reservation(Integer roomNumber, Date checkIn, Date checkOut) {
		this.roomNumber = roomNumber;
		this.checkIn = checkIn;
		this.checkOut = checkOut;
	}

	public Integer getRoomNumber() {
		return roomNumber;
	}

	public void setRoomNumber(Integer roomNumber) {
		this.roomNumber = roomNumber;
	}

	public Date getCheckin() {
		return checkIn;
	}

	public Date getCheckout() {
		return checkOut;
	}
	
	public long duration() {
		long diff = checkOut.getTime() - checkIn.getTime(); //captura o tempo em milisegundos com o getTime
		return TimeUnit.DAYS.convert(diff, TimeUnit.MILLISECONDS); //converte de milisegundos para dias
	}
	
	public void updateDate(Date checkIn, Date checkOut) {
		Date now = new Date();
		if (checkIn.before(now) || checkOut.before(now)) {
			throw new IllegalArgumentException("Reservation dates for update must be future dates");
		} 
		if (checkIn.after(checkOut)) {
			throw new IllegalArgumentException("Check-out date must be after check-in date");
		}
		
		this.checkIn = checkIn;
		this.checkOut = checkOut;
		
	}

	@Override
	public String toString() {
		return "Reservation: Room " + 
				roomNumber + 
				", checkIn: " + 
				dateFormat.format(checkIn) + 
				", checkOut: " + 
				dateFormat.format(checkOut) + 
				", " + 
				duration() + 
				" nights";
	}
	
	
}
