package es.salesianos.model;

import org.springframework.stereotype.Component;

@Component
public class Passenger {
	private int idPassenger;
	private Nationality nationality;
	private String passport;
	private int idNationality;
	private String name;
	private String surname;
	private String email;
	private int accumulatedPoints;
	private Country country;
	private int idCountry;
	private Role role;
	private int idRole;
	private String password;
	private int idPassengerCreator;
	
	public int getIdPassengerCreator() {
		return idPassengerCreator;
	}
	public void setIdPassengerCreator(int idPassengerCreator) {
		this.idPassengerCreator = idPassengerCreator;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public int getIdRole() {
		return idRole;
	}
	public void setIdRole(int idRole) {
		this.idRole = idRole;
	}
	public int getIdCountry() {
		return idCountry;
	}
	public void setIdCountry(int idCountry) {
		this.idCountry = idCountry;
	}
	public String getPassport() {
		return passport;
	}
	public void setPassport(String passport) {
		this.passport = passport;
	}
	public int getIdNationality() {
		return idNationality;
	}
	public void setIdNationality(int idNationality) {
		this.idNationality = idNationality;
	}
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
