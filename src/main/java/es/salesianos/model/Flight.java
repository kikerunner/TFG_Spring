package es.salesianos.model;

import java.util.Date;
import java.util.List;

public class Flight {
	private int IDFlight;
	private String FlgihtName;
	private Airplane airplane;
	private int Distance;
	private Airport AirportOrigin;
	private Airport AirportDestiny;
	private Date BeginDate;
	private Date EndDate;
	private FoodAndDrink Foodanddrink;
	private CabrinCrewFlight Cabincrewflight;
	private List<Reservation> Reservations;
	
	public int getIDFlight() {
		return IDFlight;
	}
	public void setIDFlight(int iDFlight) {
		IDFlight = iDFlight;
	}
	public String getFlgihtName() {
		return FlgihtName;
	}
	public void setFlgihtName(String flgihtName) {
		FlgihtName = flgihtName;
	}
	public Airplane getAirplane() {
		return airplane;
	}
	public void setAirplane(Airplane airplane) {
		this.airplane = airplane;
	}
	public int getDistance() {
		return Distance;
	}
	public void setDistance(int distance) {
		Distance = distance;
	}
	public Airport getAirportOrigin() {
		return AirportOrigin;
	}
	public void setAirportOrigin(Airport airportOrigin) {
		AirportOrigin = airportOrigin;
	}
	public Airport getAirportDestiny() {
		return AirportDestiny;
	}
	public void setAirportDestiny(Airport airportDestiny) {
		AirportDestiny = airportDestiny;
	}
	public Date getBeginDate() {
		return BeginDate;
	}
	public void setBeginDate(Date beginDate) {
		BeginDate = beginDate;
	}
	public Date getEndDate() {
		return EndDate;
	}
	public void setEndDate(Date endDate) {
		EndDate = endDate;
	}
	public FoodAndDrink getFoodanddrink() {
		return Foodanddrink;
	}
	public void setFoodanddrink(FoodAndDrink foodanddrink) {
		Foodanddrink = foodanddrink;
	}
	public CabrinCrewFlight getCabincrewflight() {
		return Cabincrewflight;
	}
	public void setCabincrewflight(CabrinCrewFlight cabincrewflight) {
		Cabincrewflight = cabincrewflight;
	}
	
	
	
	
	
}
