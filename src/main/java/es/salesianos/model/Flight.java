package es.salesianos.model;

import java.util.Date;
import java.util.List;

import org.springframework.stereotype.Component;

@Component
public class Flight {
	private int idflight;
	private String flgihtName;
	private Airplane airplane;
	private int idAirplane;
	private int distance;
	private Airport airportOrigin;
	private int idAirportOrigin;
	private Airport airportDestiny;
	private int availableSeats;
	private int idAirportDestiny;
	private Date beginDate;
	private Date endDate;
	private FoodAndDrink foodanddrink;
	private int idFoodAndDrink;
	private CabinCrewFlight cabincrewflight;
	private int idCabinCrewFlight;
	
	
	public int getIdAirplane() {
		return idAirplane;
	}
	public void setIdAirplane(int idAirplane) {
		this.idAirplane = idAirplane;
	}
	public int getIdAirportOrigin() {
		return idAirportOrigin;
	}
	public void setIdAirportOrigin(int idAirportOrigin) {
		this.idAirportOrigin = idAirportOrigin;
	}
	public int getAvailableSeats() {
		return availableSeats;
	}
	public void setAvailableSeats(int availableSeats) {
		this.availableSeats = availableSeats;
	}
	public int getIdAirportDestiny() {
		return idAirportDestiny;
	}
	public void setIdAirportDestiny(int idAirportDestiny) {
		this.idAirportDestiny = idAirportDestiny;
	}
	public int getIdFoodAndDrink() {
		return idFoodAndDrink;
	}
	public void setIdFoodAndDrink(int idFoodAndDrink) {
		this.idFoodAndDrink = idFoodAndDrink;
	}
	public int getIdCabinCrewFlight() {
		return idCabinCrewFlight;
	}
	public void setIdCabinCrewFlight(int idCabinCrewFlight) {
		this.idCabinCrewFlight = idCabinCrewFlight;
	}
	private List<Reservation> reservations;
	
	public int getIdflight() {
		return idflight;
	}
	public void setIdflight(int idflight) {
		this.idflight = idflight;
	}
	public String getFlgihtName() {
		return flgihtName;
	}
	public void setFlgihtName(String flgihtName) {
		this.flgihtName = flgihtName;
	}
	public Airplane getAirplane() {
		return airplane;
	}
	public void setAirplane(Airplane airplane) {
		this.airplane = airplane;
	}
	public int getDistance() {
		return distance;
	}
	public void setDistance(int distance) {
		this.distance = distance;
	}
	public Airport getAirportOrigin() {
		return airportOrigin;
	}
	public void setAirportOrigin(Airport airportOrigin) {
		this.airportOrigin = airportOrigin;
	}
	public Airport getAirportDestiny() {
		return airportDestiny;
	}
	public void setAirportDestiny(Airport airportDestiny) {
		this.airportDestiny = airportDestiny;
	}
	public Date getBeginDate() {
		return beginDate;
	}
	public void setBeginDate(Date beginDate) {
		this.beginDate = beginDate;
	}
	public Date getEndDate() {
		return endDate;
	}
	public void setEndDate(Date endDate) {
		this.endDate = endDate;
	}
	public FoodAndDrink getFoodanddrink() {
		return foodanddrink;
	}
	public void setFoodanddrink(FoodAndDrink foodanddrink) {
		this.foodanddrink = foodanddrink;
	}
	public CabinCrewFlight getCabincrewflight() {
		return cabincrewflight;
	}
	public void setCabincrewflight(CabinCrewFlight cabincrewflight) {
		this.cabincrewflight = cabincrewflight;
	}
	public List<Reservation> getReservations() {
		return reservations;
	}
	public void setReservations(List<Reservation> reservations) {
		this.reservations = reservations;
	}
}
