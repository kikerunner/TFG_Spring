package es.salesianos.model;

public class Worker {
	private int IDWorker;
	private String Passport;
	private String Name;
	private String Surname;
	private String Photo;
	private String Addres;
	private City City;
	private Nationality Nationality;
	private String Password;
	private Role role;
	
	public int getIDWorker() {
		return IDWorker;
	}
	public void setIDWorker(int iDWorker) {
		IDWorker = iDWorker;
	}
	public String getPassport() {
		return Passport;
	}
	public void setPassport(String passport) {
		Passport = passport;
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
	public String getPhoto() {
		return Photo;
	}
	public void setPhoto(String photo) {
		Photo = photo;
	}
	public String getAddres() {
		return Addres;
	}
	public void setAddres(String addres) {
		Addres = addres;
	}
	public City getCity() {
		return City;
	}
	public void setCity(City city) {
		City = city;
	}
	public Nationality getNationality() {
		return Nationality;
	}
	public void setNationality(Nationality nationality) {
		Nationality = nationality;
	}
	public String getPassword() {
		return Password;
	}
	public void setPassword(String password) {
		Password = password;
	}
	public Role getRole() {
		return role;
	}
	public void setRole(Role role) {
		this.role = role;
	}
}
