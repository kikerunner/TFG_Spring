package es.salesianos.model;

import java.util.List;

public class AirplaneBrandName {
	private int IDAirplaneBrandName;
	private String airplaneBrandName;
	private int FlightHours;
	private int SeatsNumber;
	private int FuelQuantity;
	private int WorkersNumber;
	private List<AirplaneModel> AirplaneModel;
	
	public int getFlightHours() {
		return FlightHours;
	}
	public void setFlightHours(int flightHours) {
		FlightHours = flightHours;
	}
	public int getSeatsNumber() {
		return SeatsNumber;
	}
	public void setSeatsNumber(int seatsNumber) {
		SeatsNumber = seatsNumber;
	}
	public int getFuelQuantity() {
		return FuelQuantity;
	}
	public void setFuelQuantity(int fuelQuantity) {
		FuelQuantity = fuelQuantity;
	}
	public int getWorkersNumber() {
		return WorkersNumber;
	}
	public void setWorkersNumber(int workersNumber) {
		WorkersNumber = workersNumber;
	}
	
	public int getIDAirplaneBrandName() {
		return IDAirplaneBrandName;
	}
	public void setIDAirplaneBrandName(int iDAirplaneBrandName) {
		IDAirplaneBrandName = iDAirplaneBrandName;
	}
	public String getAirplaneBrandName() {
		return airplaneBrandName;
	}
	public void setAirplaneBrandName(String airplaneBrandName) {
		this.airplaneBrandName = airplaneBrandName;
	}
	public List<AirplaneModel> getAirplaneModel() {
		return AirplaneModel;
	}
	public void setAirplaneModel(List<AirplaneModel> airplaneModel) {
		AirplaneModel = airplaneModel;
	}
}
