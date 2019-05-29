package es.salesianos.model;

import org.springframework.stereotype.Component;

@Component
public class Worker {
	private int idworker;
	private String passport;
	private String name;
	private String surname;
	private String photo;
	private String address;
	private City city;
	private Nationality nationality;
	private String password;
	private Role role;
	private int idCity;
	private int idNationality;
	private int idRole;
	
	public int getIdCity() {
		return idCity;
	}
	public void setIdCity(int idCity) {
		this.idCity = idCity;
	}
	public int getIdNationality() {
		return idNationality;
	}
	public void setIdNationality(int idNationality) {
		this.idNationality = idNationality;
	}
	public int getIdRole() {
		return idRole;
	}
	public void setIdRole(int idRole) {
		this.idRole = idRole;
	}
	public int getIdworker() {
		return idworker;
	}
	public void setIdworker(int idworker) {
		this.idworker = idworker;
	}
	public String getPassport() {
		return passport;
	}
	public void setPassport(String passport) {
		this.passport = passport;
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
	public String getPhoto() {
		return photo;
	}
	public void setPhoto(String photo) {
		this.photo = photo;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public City getCity() {
		return city;
	}
	public void setCity(City city) {
		this.city = city;
	}
	public Nationality getNationality() {
		return nationality;
	}
	public void setNationality(Nationality nationality) {
		this.nationality = nationality;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public Role getRole() {
		return role;
	}
	public void setRole(Role role) {
		this.role = role;
	}
}
