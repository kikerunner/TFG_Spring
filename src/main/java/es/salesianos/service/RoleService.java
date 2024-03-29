package es.salesianos.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import es.salesianos.model.Airplane;
import es.salesianos.model.AirplaneBrandName;
import es.salesianos.model.Country;
import es.salesianos.model.Nationality;
import es.salesianos.model.Role;
import es.salesianos.repository.RepositoryAirplane;
import es.salesianos.repository.RepositoryAirplaneBrandName;
import es.salesianos.repository.RepositoryCountry;
import es.salesianos.repository.RepositoryNationality;
import es.salesianos.repository.RepositoryRole;

@Service("roleService")
public class RoleService {
	@Autowired
	@Qualifier("repositoryRole")
	private RepositoryRole repoRole;

	public RepositoryRole getRepoRole() {
		return repoRole;
	}

	public void setRepoRole(RepositoryRole repoRole) {
		this.repoRole = repoRole;
	}

	public List<Role> listAllRoles() {
		return repoRole.sellectAllNationalities();
	}
}
