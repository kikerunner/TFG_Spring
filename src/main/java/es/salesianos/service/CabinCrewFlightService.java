package es.salesianos.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import es.salesianos.model.Airplane;
import es.salesianos.model.CabinCrewFlight;
import es.salesianos.model.Role;
import es.salesianos.model.Worker;
import es.salesianos.repository.RepositoryAirplane;
import es.salesianos.repository.RepositoryCabinCrewFlight;
import es.salesianos.repository.RepositoryWorker;

@Service("cabinCrewFlightService")
public class CabinCrewFlightService {
	@Autowired
	@Qualifier("repositoryCabinCrewFlight")
	private RepositoryCabinCrewFlight repositoryCabinCrewFlight;

	public void addCabinCrewFlight4A(CabinCrewFlight cabinCrewFlight) {
		repositoryCabinCrewFlight.insertCabinCrewFlight4A(cabinCrewFlight);
	}
	public void addCabinCrewFlight6A(CabinCrewFlight cabinCrewFlight) {
		repositoryCabinCrewFlight.insertCabinCrewFlight6A(cabinCrewFlight);
	}
}
