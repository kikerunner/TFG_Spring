package es.salesianos.model;

import org.springframework.stereotype.Component;

@Component
public class City {
	private int idCity;
	private String cityName;
	private Country country;
	
	
	public int getIdCity() {
		return idCity;
	}
	public void setIdCity(int idCity) {
		this.idCity = idCity;
	}
	public String getCityName() {
		return cityName;
	}
	public void setCityName(String cityName) {
		this.cityName = cityName;
	}
	public Country getCountry() {
		return country;
	}
	public void setCountry(Country country) {
		this.country = country;
	}
	
	
}
