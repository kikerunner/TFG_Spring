package es.salesianos.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import es.salesianos.model.Director;
import es.salesianos.repository.RepositoryDirector;

@Service
public class DirectorService {
	@Autowired
	private RepositoryDirector repositoryDirector;

	public RepositoryDirector getRepository() {
		return repositoryDirector;
	}

	public void setRepository(RepositoryDirector repositoryDirector) {
		this.repositoryDirector = repositoryDirector;
	}
	
	public List<Director> listAllDirectors() {
		return repositoryDirector.searchAllDirectors();
	}

	
	public void searchAndDeleteDirector(Integer codDirector) {
		repositoryDirector.searchAndDeleteDirector(codDirector);
	}


	public void addDirector(Director director) {
		repositoryDirector.insertDirector(director);
	}


}
