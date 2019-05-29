package es.salesianos.model;

import org.springframework.stereotype.Component;

@Component
public class Nationality {
	private int idNationality;
	private String nationality;
	
	
	public int getIdNationality() {
		return idNationality;
	}
	public void setIdNationality(int idNationality) {
		this.idNationality = idNationality;
	}
	public String getNationality() {
		return nationality;
	}
	public void setNationality(String nationality) {
		this.nationality = nationality;
	}
}
