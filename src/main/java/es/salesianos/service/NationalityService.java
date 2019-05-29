package es.salesianos.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import es.salesianos.model.Airplane;
import es.salesianos.model.AirplaneBrandName;
import es.salesianos.model.Country;
import es.salesianos.model.Nationality;
import es.salesianos.repository.RepositoryAirplane;
import es.salesianos.repository.RepositoryAirplaneBrandName;
import es.salesianos.repository.RepositoryCountry;
import es.salesianos.repository.RepositoryNationality;

@Service("nationalityService")
public class NationalityService {
	@Autowired
	@Qualifier("repositoryNationality")
	private RepositoryNationality repoNationality;
	
	public RepositoryNationality getRepoNationality() {
		return repoNationality;
	}

	public void setRepoNationality(RepositoryNationality repoNationality) {
		this.repoNationality = repoNationality;
	}

	public List<Nationality> listAllNationalities() {
		return repoNationality.sellectAllNationalities();
	}
}
