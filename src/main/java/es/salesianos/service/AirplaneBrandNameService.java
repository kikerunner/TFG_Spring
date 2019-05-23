package es.salesianos.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import es.salesianos.model.Airplane;
import es.salesianos.model.AirplaneBrandName;
import es.salesianos.repository.RepositoryAirplane;
import es.salesianos.repository.RepositoryAirplaneBrandName;

@Service("airplaneBrandNameService")
public class AirplaneBrandNameService {
	@Autowired
	@Qualifier("repositoryairplaneBrandName")
	private RepositoryAirplaneBrandName repoAirplaneBrandName;
	
	public RepositoryAirplaneBrandName getRepoAirplaneBrandName() {
		return repoAirplaneBrandName;
	}

	public void setRepoAirplaneBrandName(RepositoryAirplaneBrandName repoAirplaneBrandName) {
		this.repoAirplaneBrandName = repoAirplaneBrandName;
	}

	public List<AirplaneBrandName> listAllAirplanesBrandName() {
		return repoAirplaneBrandName.sellectAllAirplanesBrandName();
	}
}
