package application;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import java.util.Scanner;

import model.entities.Reservation;

public class Program {

	public static void main(String[] args){

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		SimpleDateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy");
		
		try {
			System.out.print("Room number: ");
			int number = sc.nextInt();
			System.out.print("Check-in date (dd/MM/yyyy): ");
			Date checkIn = dateFormat.parse(sc.next());
			System.out.print("Check-out date (dd/MM/yyyy): ");
			Date checkOut = dateFormat.parse(sc.next());

			Reservation reservation = new Reservation(number, checkIn, checkOut);
			System.out.println(reservation);

			System.out.println("\nEnter date to update the reservation: ");
			System.out.print("Check-in date (dd/MM/yyyy): ");
			checkIn = dateFormat.parse(sc.next());
			System.out.print("Check-out date (dd/MM/yyyy): ");
			checkOut = dateFormat.parse(sc.next());

			reservation.updateDate(checkIn, checkOut);
			System.out.println(reservation);
		} catch (ParseException e) {
			System.out.println("Invalid date format");
		} catch (IllegalArgumentException e) {
			System.out.println("Error in reservation: " + e.getMessage());
		}
		
		sc.close();
	}

}
