package es.salesianos.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import es.salesianos.model.Airplane;
import es.salesianos.model.AirplaneBrandName;
import es.salesianos.model.AirplaneModel;
import es.salesianos.model.City;
import es.salesianos.repository.RepositoryAirplane;
import es.salesianos.repository.RepositoryAirplaneBrandName;
import es.salesianos.repository.RepositoryAirplaneModel;
import es.salesianos.repository.RepositoryCity;

@Service("cityService")
public class CityService {
	@Autowired
	@Qualifier("repositoryCity")
	private RepositoryCity repoCity;
	
	public RepositoryCity getRepoCity() {
		return repoCity;
	}

	public void setRepoCity(RepositoryCity repoCity) {
		this.repoCity = repoCity;
	}

	public List<City> listAllCitiesByCountryID(int idCity) {
		return repoCity.sellectAllCitiesByCountry(idCity);
	}
}
