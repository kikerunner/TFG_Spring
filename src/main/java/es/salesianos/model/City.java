package es.salesianos.model;

public class City {
	private int IdCity;
	private String CityName;
	private Country country;
	
	public int getIdCity() {
		return IdCity;
	}
	public void setIdCity(int idCity) {
		IdCity = idCity;
	}
	public String getCityName() {
		return CityName;
	}
	public void setCityName(String cityName) {
		CityName = cityName;
	}
	public Country getCountry() {
		return country;
	}
	public void setCountry(Country country) {
		this.country = country;
	}
	
	
}
