package es.salesianos.model;

import java.util.List;

import org.springframework.stereotype.Component;

@Component
public class AirplaneBrandName {
	private int idairplaneBrandName;
	private String airplaneBrandName;
	private List<AirplaneModel> models;
	
	public int getIdairplaneBrandName() {
		return idairplaneBrandName;
	}
	public void setIdairplaneBrandName(int idairplaneBrandName) {
		this.idairplaneBrandName = idairplaneBrandName;
	}
	public String getAirplaneBrandName() {
		return airplaneBrandName;
	}
	public void setAirplaneBrandName(String airplaneBrandName) {
		this.airplaneBrandName = airplaneBrandName;
	}
	public List<AirplaneModel> getModels() {
		return models;
	}
	public void setModels(List<AirplaneModel> models) {
		this.models = models;
	}
}
