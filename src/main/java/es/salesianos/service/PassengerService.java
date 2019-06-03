package es.salesianos.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import es.salesianos.model.Airplane;
import es.salesianos.model.Passenger;
import es.salesianos.model.Role;
import es.salesianos.model.Worker;
import es.salesianos.repository.RepositoryAirplane;
import es.salesianos.repository.RepositoryPassenger;
import es.salesianos.repository.RepositoryWorker;

@Service("passengerService")
public class PassengerService {
	@Autowired
	@Qualifier("repositoryPassenger")
	private RepositoryPassenger repositoryPassenger;

	public RepositoryPassenger getRepositoryPassenger() {
		return repositoryPassenger;
	}

	public void setRepositoryPassenger(RepositoryPassenger repositoryPassenger) {
		this.repositoryPassenger = repositoryPassenger;
	}

	public void addPassenger(Passenger passenger) {
		repositoryPassenger.insertPassenger(passenger);;
	}
}
