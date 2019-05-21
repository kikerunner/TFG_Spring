package es.salesianos.model;

import java.util.Date;

public class Reservation {
	private int IDReservation;
	private Passenger Passenger1;
	private Passenger Passenger2;
	private Passenger Passenger3;
	private Passenger Passenger4;
	private Passenger Passenger5;
	private Passenger Passenger6;
	private int SeatsNumber;
	private Flight Flight;
	private int LuggaggeNumber;
	private int Price;
	private Date ReservationTime;
	
	public int getIDReservation() {
		return IDReservation;
	}
	public void setIDReservation(int iDReservation) {
		IDReservation = iDReservation;
	}
	public Passenger getPassenger1() {
		return Passenger1;
	}
	public void setPassenger1(Passenger passenger1) {
		Passenger1 = passenger1;
	}
	public Passenger getPassenger2() {
		return Passenger2;
	}
	public void setPassenger2(Passenger passenger2) {
		Passenger2 = passenger2;
	}
	public Passenger getPassenger3() {
		return Passenger3;
	}
	public void setPassenger3(Passenger passenger3) {
		Passenger3 = passenger3;
	}
	public Passenger getPassenger4() {
		return Passenger4;
	}
	public void setPassenger4(Passenger passenger4) {
		Passenger4 = passenger4;
	}
	public Passenger getPassenger5() {
		return Passenger5;
	}
	public void setPassenger5(Passenger passenger5) {
		Passenger5 = passenger5;
	}
	public Passenger getPassenger6() {
		return Passenger6;
	}
	public void setPassenger6(Passenger passenger6) {
		Passenger6 = passenger6;
	}
	public int getSeatsNumber() {
		return SeatsNumber;
	}
	public void setSeatsNumber(int seatsNumber) {
		SeatsNumber = seatsNumber;
	}
	public Flight getFlight() {
		return Flight;
	}
	public void setFlight(Flight flight) {
		Flight = flight;
	}
	public int getLuggaggeNumber() {
		return LuggaggeNumber;
	}
	public void setLuggaggeNumber(int luggaggeNumber) {
		LuggaggeNumber = luggaggeNumber;
	}
	public int getPrice() {
		return Price;
	}
	public void setPrice(int price) {
		Price = price;
	}
	public Date getReservationTime() {
		return ReservationTime;
	}
	public void setReservationTime(Date reservationTime) {
		ReservationTime = reservationTime;
	}
}
