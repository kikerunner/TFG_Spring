package es.salesianos.model;

import org.springframework.stereotype.Component;

@Component
public class Airplane {
	private int IDAirplane;
	private String AirplaneName;
	
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
