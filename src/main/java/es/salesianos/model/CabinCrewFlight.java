package es.salesianos.model;

import org.springframework.stereotype.Component;

@Component
public class CabinCrewFlight {
	private int idcabinCrewFlight;
	private Flight flight;
	private Worker pilot;
	private int idPilot;
	private Worker coPilot;
	private int idCoPilot;
	private int numberOfFlightAttendants;
	private Worker chiefCrewMember;
	private int idChiefCrewMember;
	private Worker flightAttendant1;
	private int idFlightAttendant1;
	private Worker flightAttendant2;
	private int idFlightAttendant2;
	private Worker flightAttendant3;
	private int idFlightAttendant3;
	private Worker flightAttendant4;
	private int idFlightAttendant4;
	private Worker flightAttendant5;
	private int idFlightAttendant5;
	private Worker flightAttendant6;
	private int idFlightAttendant6;
	
	
	public Worker getChiefCrewMember() {
		return chiefCrewMember;
	}
	public void setChiefCrewMember(Worker chiefCrewMember) {
		this.chiefCrewMember = chiefCrewMember;
	}
	public int getIdChiefCrewMember() {
		return idChiefCrewMember;
	}
	public void setIdChiefCrewMember(int idChiefCrewMember) {
		this.idChiefCrewMember = idChiefCrewMember;
	}
	public int getNumberOfFlightAttendants() {
		return numberOfFlightAttendants;
	}
	public void setNumberOfFlightAttendants(int numberOfFlightAttendants) {
		this.numberOfFlightAttendants = numberOfFlightAttendants;
	}
	public int getIdPilot() {
		return idPilot;
	}
	public void setIdPilot(int idPilot) {
		this.idPilot = idPilot;
	}
	public int getIdCoPilot() {
		return idCoPilot;
	}
	public void setIdCoPilot(int idCoPilot) {
		this.idCoPilot = idCoPilot;
	}
	public int getIdFlightAttendant1() {
		return idFlightAttendant1;
	}
	public void setIdFlightAttendant1(int idFlightAttendant1) {
		this.idFlightAttendant1 = idFlightAttendant1;
	}
	public int getIdFlightAttendant2() {
		return idFlightAttendant2;
	}
	public void setIdFlightAttendant2(int idFlightAttendant2) {
		this.idFlightAttendant2 = idFlightAttendant2;
	}
	public int getIdFlightAttendant3() {
		return idFlightAttendant3;
	}
	public void setIdFlightAttendant3(int idFlightAttendant3) {
		this.idFlightAttendant3 = idFlightAttendant3;
	}
	public int getIdFlightAttendant4() {
		return idFlightAttendant4;
	}
	public void setIdFlightAttendant4(int idFlightAttendant4) {
		this.idFlightAttendant4 = idFlightAttendant4;
	}
	public int getIdFlightAttendant5() {
		return idFlightAttendant5;
	}
	public void setIdFlightAttendant5(int idFlightAttendant5) {
		this.idFlightAttendant5 = idFlightAttendant5;
	}
	public int getIdFlightAttendant6() {
		return idFlightAttendant6;
	}
	public void setIdFlightAttendant6(int idFlightAttendant6) {
		this.idFlightAttendant6 = idFlightAttendant6;
	}
	public int getIdcabinCrewFlight() {
		return idcabinCrewFlight;
	}
	public void setIdcabinCrewFlight(int idcabinCrewFlight) {
		this.idcabinCrewFlight = idcabinCrewFlight;
	}
	public Flight getFlight() {
		return flight;
	}
	public void setFlight(Flight flight) {
		this.flight = flight;
	}
	public Worker getPilot() {
		return pilot;
	}
	public void setPilot(Worker pilot) {
		this.pilot = pilot;
	}
	public Worker getCoPilot() {
		return coPilot;
	}
	public void setCoPilot(Worker coPilot) {
		this.coPilot = coPilot;
	}
	public Worker getFlightAttendant1() {
		return flightAttendant1;
	}
	public void setFlightAttendant1(Worker flightAttendant1) {
		this.flightAttendant1 = flightAttendant1;
	}
	public Worker getFlightAttendant2() {
		return flightAttendant2;
	}
	public void setFlightAttendant2(Worker flightAttendant2) {
		this.flightAttendant2 = flightAttendant2;
	}
	public Worker getFlightAttendant3() {
		return flightAttendant3;
	}
	public void setFlightAttendant3(Worker flightAttendant3) {
		this.flightAttendant3 = flightAttendant3;
	}
	public Worker getFlightAttendant4() {
		return flightAttendant4;
	}
	public void setFlightAttendant4(Worker flightAttendant4) {
		this.flightAttendant4 = flightAttendant4;
	}
	public Worker getFlightAttendant5() {
		return flightAttendant5;
	}
	public void setFlightAttendant5(Worker flightAttendant5) {
		this.flightAttendant5 = flightAttendant5;
	}
	public Worker getFlightAttendant6() {
		return flightAttendant6;
	}
	public void setFlightAttendant6(Worker flightAttendant6) {
		this.flightAttendant6 = flightAttendant6;
	}
}
