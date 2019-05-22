package es.salesianos.model;

import java.util.Date;

import org.springframework.stereotype.Component;

@Component
public class Reservation {
	private int idreservation;
	private Passenger passenger1;
	private Passenger passenger2;
	private Passenger passenger3;
	private Passenger passenger4;
	private Passenger passenger5;
	private Passenger passenger6;
	private int seatsNumber;
	private Flight flight;
	private int luggaggeNumber;
	private int price;
	private Date reservationTime;
	public int getIdreservation() {
		return idreservation;
	}
	public void setIdreservation(int idreservation) {
		this.idreservation = idreservation;
	}
	public Passenger getPassenger1() {
		return passenger1;
	}
	public void setPassenger1(Passenger passenger1) {
		this.passenger1 = passenger1;
	}
	public Passenger getPassenger2() {
		return passenger2;
	}
	public void setPassenger2(Passenger passenger2) {
		this.passenger2 = passenger2;
	}
	public Passenger getPassenger3() {
		return passenger3;
	}
	public void setPassenger3(Passenger passenger3) {
		this.passenger3 = passenger3;
	}
	public Passenger getPassenger4() {
		return passenger4;
	}
	public void setPassenger4(Passenger passenger4) {
		this.passenger4 = passenger4;
	}
	public Passenger getPassenger5() {
		return passenger5;
	}
	public void setPassenger5(Passenger passenger5) {
		this.passenger5 = passenger5;
	}
	public Passenger getPassenger6() {
		return passenger6;
	}
	public void setPassenger6(Passenger passenger6) {
		this.passenger6 = passenger6;
	}
	public int getSeatsNumber() {
		return seatsNumber;
	}
	public void setSeatsNumber(int seatsNumber) {
		this.seatsNumber = seatsNumber;
	}
	public Flight getFlight() {
		return flight;
	}
	public void setFlight(Flight flight) {
		this.flight = flight;
	}
	public int getLuggaggeNumber() {
		return luggaggeNumber;
	}
	public void setLuggaggeNumber(int luggaggeNumber) {
		this.luggaggeNumber = luggaggeNumber;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	public Date getReservationTime() {
		return reservationTime;
	}
	public void setReservationTime(Date reservationTime) {
		this.reservationTime = reservationTime;
	}
}
