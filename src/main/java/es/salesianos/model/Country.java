package es.salesianos.model;

import java.util.List;

import org.springframework.stereotype.Component;

@Component
public class Country {
	private int idcountry;
	private String countryName;
	private String countryCode;
	private List<City> cities;
	public int getIdcountry() {
		return idcountry;
	}
	public void setIdcountry(int idcountry) {
		this.idcountry = idcountry;
	}
	public String getCountryName() {
		return countryName;
	}
	public void setCountryName(String countryName) {
		this.countryName = countryName;
	}
	public String getCountryCode() {
		return countryCode;
	}
	public void setCountryCode(String countryCode) {
		this.countryCode = countryCode;
	}
	public List<City> getCities() {
		return cities;
	}
	public void setCities(List<City> cities) {
		this.cities = cities;
	}
}
