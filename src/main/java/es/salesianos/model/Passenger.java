package es.salesianos.model;

public class Passenger {
	private int idPassenger;
	private Nationality Nationality;
	private String Name;
	private String Surname;
	private String Email;
	private int AccumulatedPoints;
	private Country Country;
	private Role Role;
	
	public int getIdPassenger() {
		return idPassenger;
	}
	public void setIdPassenger(int idPassenger) {
		this.idPassenger = idPassenger;
	}
	public Nationality getNationality() {
		return Nationality;
	}
	public void setNationality(Nationality nationality) {
		Nationality = nationality;
	}
	public String getName() {
		return Name;
	}
	public void setName(String name) {
		Name = name;
	}
	public String getSurname() {
		return Surname;
	}
	public void setSurname(String surname) {
		Surname = surname;
	}
	public String getEmail() {
		return Email;
	}
	public void setEmail(String email) {
		Email = email;
	}
	public int getAccumulatedPoints() {
		return AccumulatedPoints;
	}
	public void setAccumulatedPoints(int accumulatedPoints) {
		AccumulatedPoints = accumulatedPoints;
	}
	public Country getCountry() {
		return Country;
	}
	public void setCountry(Country country) {
		Country = country;
	}
	public Role getRole() {
		return Role;
	}
	public void setRole(Role role) {
		Role = role;
	}
	public String getPassword() {
		return Password;
	}
	public void setPassword(String password) {
		Password = password;
	}
	private String Password;
}
