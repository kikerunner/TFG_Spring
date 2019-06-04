package es.salesianos.model;

import org.springframework.stereotype.Component;

@Component
public class CabinCrewFlight {
	private int idcabinCrewFlight;
	private Flight flight;
	private Worker pilot;
	private int idPilot;
	private String pilotName;
	private String pilotSurname;
	private Worker coPilot;
	private int idCoPilot;
	private String coPilotName;
	private String coPilotSurname;
	private int numberOfFlightAttendants;
	private Worker chiefCrewMember;
	private int idChiefCrewMember;
	private String chiefCrewMemberName;
	private String chiefCrewSurname;
	private Worker flightAttendant1;
	private int idFlightAttendant1;
	private String flightAttendant1Name;
	private String flightAttendant1Surname;
	private Worker flightAttendant2;
	private int idFlightAttendant2;
	private String flightAttendant2Name;
	private String flightAttendant2Surname;
	private Worker flightAttendant3;
	private int idFlightAttendant3;
	private String flightAttendant3Name;
	private String flightAttendant3Surname;
	private Worker flightAttendant4;
	private int idFlightAttendant4;
	private String flightAttendant4Name;
	private String flightAttendant4Surname;
	private Worker flightAttendant5;
	private int idFlightAttendant5;
	private String flightAttendant5Name;
	private String flightAttendant5Surname;
	private Worker flightAttendant6;
	private int idFlightAttendant6;
	private String flightAttendant6Name;
	private String flightAttendant6Surname;
	
	public String getPilotName() {
		return pilotName;
	}
	public void setPilotName(String pilotName) {
		this.pilotName = pilotName;
	}
	public String getPilotSurname() {
		return pilotSurname;
	}
	public void setPilotSurname(String pilotSurname) {
		this.pilotSurname = pilotSurname;
	}
	public String getCoPilotName() {
		return coPilotName;
	}
	public void setCoPilotName(String coPilotName) {
		this.coPilotName = coPilotName;
	}
	public String getCoPilotSurname() {
		return coPilotSurname;
	}
	public void setCoPilotSurname(String coPilotSurname) {
		this.coPilotSurname = coPilotSurname;
	}
	public int getNumberOfFlightAttendants() {
		return numberOfFlightAttendants;
	}
	public void setNumberOfFlightAttendants(int numberOfFlightAttendants) {
		this.numberOfFlightAttendants = numberOfFlightAttendants;
	}
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
	public String getChiefCrewMemberName() {
		return chiefCrewMemberName;
	}
	public void setChiefCrewMemberName(String chiefCrewMemberName) {
		this.chiefCrewMemberName = chiefCrewMemberName;
	}
	public String getChiefCrewSurname() {
		return chiefCrewSurname;
	}
	public void setChiefCrewSurname(String chiefCrewSurname) {
		this.chiefCrewSurname = chiefCrewSurname;
	}
	public String getFlightAttendant1Name() {
		return flightAttendant1Name;
	}
	public void setFlightAttendant1Name(String flightAttendant1Name) {
		this.flightAttendant1Name = flightAttendant1Name;
	}
	public String getFlightAttendant1Surname() {
		return flightAttendant1Surname;
	}
	public void setFlightAttendant1Surname(String flightAttendant1Surname) {
		this.flightAttendant1Surname = flightAttendant1Surname;
	}
	public String getFlightAttendant2Name() {
		return flightAttendant2Name;
	}
	public void setFlightAttendant2Name(String flightAttendant2Name) {
		this.flightAttendant2Name = flightAttendant2Name;
	}
	public String getFlightAttendant2Surname() {
		return flightAttendant2Surname;
	}
	public void setFlightAttendant2Surname(String flightAttendant2Surname) {
		this.flightAttendant2Surname = flightAttendant2Surname;
	}
	public String getFlightAttendant3Name() {
		return flightAttendant3Name;
	}
	public void setFlightAttendant3Name(String flightAttendant3Name) {
		this.flightAttendant3Name = flightAttendant3Name;
	}
	public String getFlightAttendant3Surname() {
		return flightAttendant3Surname;
	}
	public void setFlightAttendant3Surname(String flightAttendant3Surname) {
		this.flightAttendant3Surname = flightAttendant3Surname;
	}
	public String getFlightAttendant4Name() {
		return flightAttendant4Name;
	}
	public void setFlightAttendant4Name(String flightAttendant4Name) {
		this.flightAttendant4Name = flightAttendant4Name;
	}
	public String getFlightAttendant4Surname() {
		return flightAttendant4Surname;
	}
	public void setFlightAttendant4Surname(String flightAttendant4Surname) {
		this.flightAttendant4Surname = flightAttendant4Surname;
	}
	public String getFlightAttendant5Name() {
		return flightAttendant5Name;
	}
	public void setFlightAttendant5Name(String flightAttendant5Name) {
		this.flightAttendant5Name = flightAttendant5Name;
	}
	public String getFlightAttendant5Surname() {
		return flightAttendant5Surname;
	}
	public void setFlightAttendant5Surname(String flightAttendant5Surname) {
		this.flightAttendant5Surname = flightAttendant5Surname;
	}
	public String getFlightAttendant6Name() {
		return flightAttendant6Name;
	}
	public void setFlightAttendant6Name(String flightAttendant6Name) {
		this.flightAttendant6Name = flightAttendant6Name;
	}
	public String getFlightAttendant6Surname() {
		return flightAttendant6Surname;
	}
	public void setFlightAttendant6Surname(String flightAttendant6Surname) {
		this.flightAttendant6Surname = flightAttendant6Surname;
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
