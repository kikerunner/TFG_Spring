package es.salesianos.model;

import org.springframework.stereotype.Component;

@Component
public class Airplane {
	private int IDAirplane;
	private String AirplaneName;
	
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
