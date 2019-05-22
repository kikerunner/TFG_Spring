package es.salesianos.model;

import org.springframework.stereotype.Component;

@Component
public class Passenger {
	private int idPassenger;
	private Nationality nationality;
	private String name;
	private String surname;
	private String email;
	private int accumulatedPoints;
	private Country country;
	private Role role;
	
	public int getIdPassenger() {
		return idPassenger;
	}
	public void setIdPassenger(int idPassenger) {
		this.idPassenger = idPassenger;
	}
	public Nationality getNationality() {
		return nationality;
	}
	public void setNationality(Nationality nationality) {
		this.nationality = nationality;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getSurname() {
		return surname;
	}
	public void setSurname(String surname) {
		this.surname = surname;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public int getAccumulatedPoints() {
		return accumulatedPoints;
	}
	public void setAccumulatedPoints(int accumulatedPoints) {
		this.accumulatedPoints = accumulatedPoints;
	}
	public Country getCountry() {
		return country;
	}
	public void setCountry(Country country) {
		this.country = country;
	}
	public Role getRole() {
		return role;
	}
	public void setRole(Role role) {
		this.role = role;
	}
}
