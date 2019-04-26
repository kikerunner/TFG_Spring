package es.salesianos.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import es.salesianos.model.Film;
import es.salesianos.repository.RepositoryFilm;
@Service
public class FilmService {
	
	@Autowired
	private RepositoryFilm repositoryFilm;

	public RepositoryFilm getRepository() {
		return repositoryFilm;
	}

	public void setRepository(RepositoryFilm repositoryFilm) {
		this.repositoryFilm = repositoryFilm;
	}

	public void addFilm(Film film) {
		repositoryFilm.insertFilm(film);
	}

	public List<Film> listAllFilms() {
		return repositoryFilm.searchAllPeliculas();
	}

	public void searchAndDeleteFilm(Integer codPelicula) {
		repositoryFilm.searchAndDeletePelicula(codPelicula);
	}

}
