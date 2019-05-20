package es.salesianos.model;

import java.util.List;

public class Country {
	private int IDCountry;
	private String CountryName;
	private String CountryCode;
	private List<City> Cities;
	
	public List<City> getCities() {
		return Cities;
	}
	public void setCities(List<City> cities) {
		Cities = cities;
	}
	public String getCountryCode() {
		return CountryCode;
	}
	public void setCountryCode(String countryCode) {
		CountryCode = countryCode;
	}
	public int getIDCountry() {
		return IDCountry;
	}
	public void setIDCountry(int iDCountry) {
		IDCountry = iDCountry;
	}
	public String getCountryName() {
		return CountryName;
	}
	public void setCountryName(String countryName) {
		CountryName = countryName;
	}

}
