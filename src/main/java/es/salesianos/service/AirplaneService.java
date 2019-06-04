package es.salesianos.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import es.salesianos.model.Airplane;
import es.salesianos.repository.RepositoryAirplane;

@Service("airplaneservice")
public class AirplaneService {
	@Autowired
	@Qualifier("repositoryairplane")
	private RepositoryAirplane repositoryAirplane;

	public RepositoryAirplane getRepositoryAirplane() {
		return repositoryAirplane;
	}

	public void setRepositoryAirplane(RepositoryAirplane repositoryAirplane) {
		this.repositoryAirplane = repositoryAirplane;
	}

	public void addAirplane(Airplane airplane) {
		repositoryAirplane.insertAirplane(airplane);
		System.out.println("En service:" + airplane.getFlightHours());
	}
	
	public Airplane selectingAirplaneByID(int idAirplane) {
		return repositoryAirplane.selectAirplaneByID(idAirplane);
	}
	
	public List<Airplane> listAllAirplanes() {
		return repositoryAirplane.sellectAllAirplanes();
	}

	public List<Airplane> listAllAirplanesAndModels() {
		return repositoryAirplane.sellectAllAirplanesAndModel();
	}
}
