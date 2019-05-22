package es.salesianos.model;

import org.springframework.stereotype.Component;

@Component
public class Airport {
	private int idairport;
	private String airportName;
	private City city;
	private String iata;
	private String icao;
	
	public int getIdairport() {
		return idairport;
	}
	public void setIdairport(int idairport) {
		this.idairport = idairport;
	}
	public String getAirportName() {
		return airportName;
	}
	public void setAirportName(String airportName) {
		this.airportName = airportName;
	}
	public City getCity() {
		return city;
	}
	public void setCity(City city) {
		this.city = city;
	}
	public String getIata() {
		return iata;
	}
	public void setIata(String iata) {
		this.iata = iata;
	}
	public String getIcao() {
		return icao;
	}
	public void setIcao(String icao) {
		this.icao = icao;
	}
}
