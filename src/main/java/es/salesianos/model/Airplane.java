package es.salesianos.model;

import org.springframework.stereotype.Component;

@Component
public class Airplane {
	private int idAirplane;
	private String airplaneName;
	private AirplaneModel model;
	private Float flightHours;
	private int idAirplaneModel;
	private int seatsNumber;
	private int fuelQuantity;
	private int workersNumber;
	
	public int getIdAirplaneModel() {
		return idAirplaneModel;
	}
	public void setIdAirplaneModel(int idAirplaneModel) {
		this.idAirplaneModel = idAirplaneModel;
	}
	public int getIdAirplane() {
		return idAirplane;
	}
	public void setIdAirplane(int idAirplane) {
		this.idAirplane = idAirplane;
	}
	public String getAirplaneName() {
		return airplaneName;
	}
	public void setAirplaneName(String airplaneName) {
		this.airplaneName = airplaneName;
	}
	public AirplaneModel getModel() {
		return model;
	}
	public void setModel(AirplaneModel model) {
		this.model = model;
	}
	public Float getFlightHours() {
		return flightHours;
	}
	public void setFlightHours(Float flightHours) {
		this.flightHours = flightHours;
	}
	public int getSeatsNumber() {
		return seatsNumber;
	}
	public void setSeatsNumber(int seatsNumber) {
		this.seatsNumber = seatsNumber;
	}
	public int getFuelQuantity() {
		return fuelQuantity;
	}
	public void setFuelQuantity(int fuelQuantity) {
		this.fuelQuantity = fuelQuantity;
	}
	public int getWorkersNumber() {
		return workersNumber;
	}
	public void setWorkersNumber(int workersNumber) {
		this.workersNumber = workersNumber;
	}
}
