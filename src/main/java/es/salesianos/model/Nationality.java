package es.salesianos.model;

import org.springframework.stereotype.Component;

@Component
public class Nationality {
	private int idnationality;
	private String nationality;
	public int getIdnationality() {
		return idnationality;
	}
	public void setIdnationality(int idnationality) {
		this.idnationality = idnationality;
	}
	public String getNationality() {
		return nationality;
	}
	public void setNationality(String nationality) {
		this.nationality = nationality;
	}
}
