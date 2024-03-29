package es.salesianos.model;


import java.sql.Date;
import java.util.List;

import org.springframework.stereotype.Component;

@Component
public class Flight {
	private int idflight;
	private String flightName;
	private Airplane airplane;
	private int idAirplane;
	private String airplaneName;
	private String airportOriginName;
	private String airportDestinyName;
	private String foodAndDrinkName;
	private Float distance;
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
	
	public String getAirplaneName() {
		return airplaneName;
	}
	public void setAirplaneName(String airplaneName) {
		this.airplaneName = airplaneName;
	}
	public String getAirportOriginName() {
		return airportOriginName;
	}
	public void setAirportOriginName(String airportOriginName) {
		this.airportOriginName = airportOriginName;
	}
	public String getAirportDestinyName() {
		return airportDestinyName;
	}
	public void setAirportDestinyName(String airportDestinyName) {
		this.airportDestinyName = airportDestinyName;
	}
	public String getFoodAndDrinkName() {
		return foodAndDrinkName;
	}
	public void setFoodAndDrinkName(String foodAndDrinkName) {
		this.foodAndDrinkName = foodAndDrinkName;
	}
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
	public String getFlightName() {
		return flightName;
	}
	public void setFlightName(String flightName) {
		this.flightName = flightName;
	}
	public Airplane getAirplane() {
		return airplane;
	}
	public void setAirplane(Airplane airplane) {
		this.airplane = airplane;
	}
	public Float getDistance() {
		return distance;
	}
	public void setDistance(Float distance) {
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
