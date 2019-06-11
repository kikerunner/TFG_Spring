package es.salesianos.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import es.salesianos.model.Airplane;
import es.salesianos.model.Airport;
import es.salesianos.model.Role;
import es.salesianos.model.Worker;
import es.salesianos.repository.RepositoryAirplane;
import es.salesianos.repository.RepositoryAirport;
import es.salesianos.repository.RepositoryWorker;

@Service("airportService")
public class AirportService {
	@Autowired
	@Qualifier("repositoryAirport")
	private RepositoryAirport repositoryAirport;

	public RepositoryAirport getRepositoryAirport() {
		return repositoryAirport;
	}

	public void setRepositoryAirport(RepositoryAirport repositoryAirport) {
		this.repositoryAirport = repositoryAirport;
	}
	
	public List<Airport> listAllAirportsAndCities() {
		return repositoryAirport.selectAllAirportsAndCities();
	}

	public List<Airport> listAllAirportsAndCitiesByName(String aiportName) {
		return repositoryAirport.selectAllAirportsAndCitiesByName(aiportName);
	}
	
	public List<Airport> listAllAirportsAndCitiesByIata(String iATA) {
		return repositoryAirport.selectAllAirportsAndCitiesByIata(iATA);
	}
	
	public List<Airport> listAllAirportsAndCitiesByIcao(String iCAO) {
		return repositoryAirport.selectAllAirportsAndCitiesByIcao(iCAO);
	}

	public List<Airport> listAllOriginAirportsByIdCountry(int idOriginCountry) {
		int idCountry = idOriginCountry;
		return repositoryAirport.sellectAllAirportsByCountry(idCountry);
	}
	public List<Airport> listAllDestinyAirportsByIdCountry(int idDestinyCountry) {
		int idCountry = idDestinyCountry;
		return repositoryAirport.sellectAllAirportsByCountry(idCountry);
	}
	
}
