package es.salesianos.model;

public class Airport {
	private int IDAirport;
	private String AirportName;
	private City city;
	private String IATA;
	private String ICAO;
	
	public int getIDAirport() {
		return IDAirport;
	}
	public void setIDAirport(int iDAirport) {
		IDAirport = iDAirport;
	}
	public String getAirportName() {
		return AirportName;
	}
	public void setAirportName(String airportName) {
		AirportName = airportName;
	}
	public City getCity() {
		return city;
	}
	public void setCity(City city) {
		this.city = city;
	}
	public String getIATA() {
		return IATA;
	}
	public void setIATA(String iATA) {
		IATA = iATA;
	}
	public String getICAO() {
		return ICAO;
	}
	public void setICAO(String iCAO) {
		ICAO = iCAO;
	}
}
