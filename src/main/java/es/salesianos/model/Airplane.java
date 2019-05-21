package es.salesianos.model;

import org.springframework.stereotype.Component;

@Component
public class Airplane {
	private int IDAirplane;
	private String AirplaneName;
	private AirplaneModel Model;
	private int FlightHours;
	private int SeatsNumber;
	private int FuelQuantity;
	private int WorkersNumber;
	

	public AirplaneModel getModel() {
		return Model;
	}

	public void setModel(AirplaneModel model) {
		Model = model;
	}

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

	public void setIDAirplane(int iDAirplane) {
		IDAirplane = iDAirplane;
	}

	public String getAirplaneName() {
		return AirplaneName;
	}

	public void setAirplaneName(String airplaneName) {
		AirplaneName = airplaneName;
	}

	public int getIDAirplane() {
		return IDAirplane;
	}
	
	
}
