package es.salesianos.model;

import org.springframework.stereotype.Component;

@Component
public class CabrinCrewFlight {
	private int idcabinCrewFlight;
	private Flight flight;
	private Worker pilot;
	private Worker coPilot;
	private Worker flightAttendant1;
	private Worker flightAttendant2;
	private Worker flightAttendant3;
	private Worker flightAttendant4;
	private Worker flightAttendant5;
	private Worker flightAttendant6;
	
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
