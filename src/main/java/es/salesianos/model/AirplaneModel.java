package es.salesianos.model;

import org.springframework.stereotype.Component;

@Component
public class AirplaneModel {
	private int idAirplaneModel;
	private String airplaneModel;
	private AirplaneBrandName airplaneBrandName;
	
	
	public int getIdAirplaneModel() {
		return idAirplaneModel;
	}
	public void setIdAirplaneModel(int idAirplaneModel) {
		this.idAirplaneModel = idAirplaneModel;
	}
	public String getAirplaneModel() {
		return airplaneModel;
	}
	public void setAirplaneModel(String airplaneModel) {
		this.airplaneModel = airplaneModel;
	}
	public AirplaneBrandName getAirplaneBrandName() {
		return airplaneBrandName;
	}
	public void setAirplaneBrandName(AirplaneBrandName airplaneBrandName) {
		this.airplaneBrandName = airplaneBrandName;
	}
}
