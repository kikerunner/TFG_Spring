package es.salesianos.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import es.salesianos.model.Airplane;
import es.salesianos.model.AirplaneBrandName;
import es.salesianos.model.AirplaneModel;
import es.salesianos.repository.RepositoryAirplane;
import es.salesianos.repository.RepositoryAirplaneBrandName;
import es.salesianos.repository.RepositoryAirplaneModel;

@Service("airplaneModelService")
public class AirplaneModelService {
	@Autowired
	@Qualifier("repositoryairplaneModel")
	private RepositoryAirplaneModel repoAirplaneModel;
	
	

	public RepositoryAirplaneModel getRepoAirplaneModel() {
		return repoAirplaneModel;
	}

	public void setRepoAirplaneModel(RepositoryAirplaneModel repoAirplaneModel) {
		this.repoAirplaneModel = repoAirplaneModel;
	}

	public List<AirplaneModel> listAllAirplanesModelByBrandName(int cod) {
		return repoAirplaneModel.sellectAirplanesModelByCompany(cod);
	}
}
