package es.salesianos.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import es.salesianos.model.Airplane;
import es.salesianos.model.AirplaneBrandName;
import es.salesianos.model.Country;
import es.salesianos.repository.RepositoryAirplane;
import es.salesianos.repository.RepositoryAirplaneBrandName;
import es.salesianos.repository.RepositoryCountry;

@Service("countryService")
public class CountryService {
	@Autowired
	@Qualifier("repositoryCountry")
	private RepositoryCountry repoCountry;
	
	public RepositoryCountry getRepoCountry() {
		return repoCountry;
	}

	public void setRepoCountry(RepositoryCountry repoCountry) {
		this.repoCountry = repoCountry;
	}

	public List<Country> listAllCountries() {
		return repoCountry.sellectAllCountries();
	}
}
