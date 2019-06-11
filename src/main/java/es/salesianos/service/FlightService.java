package es.salesianos.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import es.salesianos.model.Airplane;
import es.salesianos.model.Flight;
import es.salesianos.model.Role;
import es.salesianos.model.Worker;
import es.salesianos.repository.RepositoryAirplane;
import es.salesianos.repository.RepositoryFlight;
import es.salesianos.repository.RepositoryWorker;

@Service("flightService")
public class FlightService {
	@Autowired
	@Qualifier("repositoryFlight")
	private RepositoryFlight repositoryFlight;

	public void addFlight(Flight flight){
		repositoryFlight.insertFlight(flight);
	}
	
	public List<Flight> listFlights(){
		return repositoryFlight.sellectAllFlights();
	}
	
	public List<Flight> listFlightsById(int id){
		return repositoryFlight.sellectAllFlightsById(id);
	}
	
	public List<Flight> listFlightsByAirplaneName(String airplane){
		return repositoryFlight.sellectAllFlightsByAirplane(airplane);
	}
	public List<Flight> listFlightsByAirportDestiny(String airportDestiny){
		return repositoryFlight.sellectAllFlightsByAirportDestiny(airportDestiny);
	}
	public List<Flight> listFlightsByAirportOrigin(String airportOrigin){
		return repositoryFlight.sellectAllFlightsByAirportOrigin(airportOrigin);
	}
}
