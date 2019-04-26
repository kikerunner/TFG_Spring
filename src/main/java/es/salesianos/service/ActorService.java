package es.salesianos.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import es.salesianos.model.Actor;
import es.salesianos.repository.RepositoryActor;

@Service("actorservice")
public class ActorService {
	@Autowired
	@Qualifier("repositoryactor")
	private RepositoryActor repositoryActor;

	public RepositoryActor getRepository() {
		return repositoryActor;
	}

	public void setRepository(RepositoryActor repositoryActor) {
		this.repositoryActor = repositoryActor;
	}
	
	public List<Actor> listAllActors() {
		return repositoryActor.searchAllActors();
	}

	public void searchAndDeleteActor(Integer codActor) {
		repositoryActor.DeleteActorById(codActor);
	}

	public void addActor(Actor actor) {
		repositoryActor.insertActor(actor);
	}

	public List<Actor> filterAllActor(int beginDate, int endDate) {
		return repositoryActor.filterByYearOfDateBetween(beginDate, endDate);
	}

	public List<Actor> selectAllActor() {
		return repositoryActor.selectAllActor();
	}

	public Actor filterAllDirector(String name) {
		return repositoryActor.filterAllActor(name);
	}
}
