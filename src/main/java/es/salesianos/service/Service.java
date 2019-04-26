package es.salesianos.service;

import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import es.salesianos.model.Actor;
import es.salesianos.model.Director;
import es.salesianos.model.Film;
import es.salesianos.repository.RepositoryActor;
import es.salesianos.repository.RepositoryDirector;
import es.salesianos.repository.RepositoryFilm;

public class Service {

	Logger logger = LogManager.getLogger();

	private RepositoryActor repositoryActor = new RepositoryActor();
	private RepositoryFilm repositoryFilm = new RepositoryFilm();
	private RepositoryDirector repositoryDirector = new RepositoryDirector();

	public List<Actor> selectAllActor() {
			return repositoryActor.selectAllActor();
	}
	public List<Director> selectAllDirector() {
		return repositoryDirector.searchAllDirectors();
	}
	public List<Film> selectAllPelicula() {
		return repositoryFilm.searchAllPeliculas();
	}
	
	public void insert(Actor actor) {
		repositoryActor.insertActor(actor);

	}
	public void insert(Film film) {
		repositoryFilm.insertFilm(film);
		
	}
	public void insert(Director director) {
		repositoryDirector.insertDirector(director);
	}
	
	public void delete(Actor actor) {
		repositoryActor.DeleteActorById(actor.getCod());

	}
	public void delete(Film film) {
		repositoryFilm.searchAndDeletePelicula(film.getCOD());
		
	}
	public void delete(Director director) {
		repositoryDirector.searchAndDeleteDirector(director.getCod());
	}

}
