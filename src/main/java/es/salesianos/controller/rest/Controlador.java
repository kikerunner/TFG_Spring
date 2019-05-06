package es.salesianos.controller.rest;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import es.salesianos.model.Actor;
import es.salesianos.model.Airplane;
import es.salesianos.model.Director;
import es.salesianos.model.Film;
import es.salesianos.model.FilmActors;
import es.salesianos.service.ActorService;
import es.salesianos.service.AirplaneService;
import es.salesianos.service.DirectorService;
import es.salesianos.service.FilmActorService;
import es.salesianos.service.FilmService;

@Controller
public class Controlador {
	///1
	@Autowired 
	@Qualifier("actorservice")
	ActorService serviceactores;
	@Autowired 
	List<Actor> listAllActors;
	
	@Autowired 
	List<Airplane> listAllAirplanes;
	
	@Autowired 
	@Qualifier("airplaneservice")
	AirplaneService airplaneservice;



	//2
	@Autowired FilmService servicepeliculas;
	@Autowired List<Film> listAllPeliculas;
	
	//3
	@Autowired DirectorService servicedirectores;
	@Autowired List<Director> listAllDirectors;
	
	
	@Autowired FilmActorService servicefilmactor;
	@Autowired FilmActors filmactor;
	
	////1punto
	
	@GetMapping(path="addAirplane")
	public ModelAndView getAddAirplanePage() {
		ModelAndView model = new ModelAndView("addAirplane");
		model.addObject("airplane",new Airplane());
		return model;
	}
	
	@PostMapping(path="/addAirplane")
	public String saveAirplane(Airplane airplane)  {
		airplaneservice.addAirplane(airplane);
		return "index";
	}
	
	@PostMapping(path = "/LoadAirplanesList")
	public ModelAndView loadAirplaneList() {
		listAllAirplanes = airplaneservice.listAllAirplanes();
		System.out.println(listAllAirplanes);
		ModelAndView model = new ModelAndView("listAllAirplanes");
		model.addObject("listAllAirplanes", listAllAirplanes);
		return model;
	}
	
	@PostMapping(path = "/BetweenDates")
	public ModelAndView fechas(@RequestParam int beginDate , @RequestParam int endDate) {
		listAllActors = serviceactores.filterAllActor(beginDate, endDate);
		System.out.println(listAllActors);
		ModelAndView model = new ModelAndView("addActor");
		model.addObject("actor",new Actor());
		model.addObject("listAllActors", listAllActors);
		return model;
	}
	
	
	@PostMapping(path = "/LoadActorsList")
	public ModelAndView loadActorList() {
		listAllActors = serviceactores.listAllActors();
		System.out.println(listAllActors);
		ModelAndView model = new ModelAndView("addActor");
		model.addObject("actor",new Actor());
		model.addObject("listAllActors", listAllActors);
		return model;
	}
	
	@GetMapping(path = "/deleteActor")
	public ModelAndView deleteAndList(@RequestParam Integer codActor) {
		serviceactores.searchAndDeleteActor(codActor);
		listAllActors = serviceactores.listAllActors();
		ModelAndView model = new ModelAndView("addActor");
		model.addObject("actor",new Actor());
		model.addObject("listAllActors", listAllActors);
		return model;
	}
	
	


	///2enlace
	
	@GetMapping(path="/addPelicula")
	public ModelAndView getAddFilmPage() {
		ModelAndView model = new ModelAndView("addPelicula");
		model.addObject("pelicula",new Film());
		return model;
	}
	
	@PostMapping(path="/AddPelicula")
	public String saveFilm(Film film)  {
		servicepeliculas.addFilm(film);
		return "index";
	}
	
	@PostMapping(path = "/LoadFilmsList")
	public ModelAndView loadFilmList() {
		this.listAllPeliculas = servicepeliculas.listAllFilms();
		System.out.println(listAllPeliculas);
		ModelAndView model = new ModelAndView("addPelicula");
		model.addObject("pelicula",new Film());
		model.addObject("listAllFilms", listAllPeliculas);
		return model;
	}
	
	@GetMapping(path = "/deletePelicula")
	public ModelAndView deleteAndListFilm(@RequestParam Integer codPelicula) {
		servicepeliculas.searchAndDeleteFilm(codPelicula);
		listAllPeliculas = servicepeliculas.listAllFilms();
		ModelAndView model = new ModelAndView("addPelicula");
		model.addObject("pelicula",new Film());
		model.addObject("listAllFilms", listAllPeliculas);
		return model;
	}
	
	//3punto
	
		@GetMapping(path="/addDirector")
		public ModelAndView getAddDirectorPage() {
			ModelAndView model = new ModelAndView("addDirector");
			model.addObject("director",new Director());
			return model;
		}
		
		@PostMapping(path="/AddDirector")
		public String saveDirector(Director director)  {
			servicedirectores.addDirector(director);
			return "index";
		}
		
		@PostMapping(path = "/LoadDirectorsList")
		public ModelAndView loadDirectorsList() {
			this.listAllDirectors = servicedirectores.listAllDirectors();
			System.out.println(listAllDirectors);
			ModelAndView model = new ModelAndView("addDirector");
			model.addObject("director",new Director());
			model.addObject("listAllDirectors", listAllDirectors);
			return model;
		}
		
		@GetMapping(path = "/deleteDirector")
		public ModelAndView deleteAndListDirector(@RequestParam Integer codDirector) {
			servicedirectores.searchAndDeleteDirector(codDirector);
			listAllDirectors = servicedirectores.listAllDirectors();
			ModelAndView model = new ModelAndView("addDirector");
			model.addObject("director",new Director());
			model.addObject("listAllDirectors", listAllDirectors);
			return model;
		}
		
	///4punto
		
		@GetMapping(path = "/FilmActor")
		public ModelAndView asociatepage() {
			this.listAllPeliculas = servicepeliculas.listAllFilms();
			System.out.println(listAllPeliculas);
			ModelAndView model = new ModelAndView("FilmActor");
			model.addObject("listAllFilms", listAllPeliculas);
			return model;
		}
		
		
		///--> Estamos en la pagina para asociar a la pelicula con un Actor
		@GetMapping(path = "/recoveryFilm")
		public ModelAndView asociateFilmWithActor(@RequestParam int cod) {
			this.listAllActors = serviceactores.listAllActors();
			System.out.println(listAllActors);
			ModelAndView model = new ModelAndView("selectActor");
			model.addObject("codPelicula", cod);
			model.addObject("listAllActores", listAllActors);
			return model;
		}
		
	/*Estamos donde vamos a seleccionar el cod actor y cod pelicula
	 * 
	 */			

		
		@GetMapping(path = "/fillPeliculaActor")
		public ModelAndView getCodPeliculaAndCodActor(@RequestParam int codActor,@RequestParam int codPelicula) {
			ModelAndView model = new ModelAndView("FillPeliculaActor");
			model.addObject("codPelicula", codPelicula);
			model.addObject("codActor", codActor);
			model.addObject("filmactor", filmactor);
			return model;
		}

		@PostMapping(path = "/fillPeliculaActor")
		public String saveFilmActor(FilmActors filmactor,@RequestParam int codPelicula,@RequestParam int codActor)  {
			filmactor.setCodActor(codActor);
			filmactor.setCodFilm(codPelicula);
			servicefilmactor.insertFilmActor(filmactor);
			return "index";
		}
		
		////6punto
		@GetMapping(path="/characterSearcher")
		public ModelAndView getAddCharacterPage() {
			ModelAndView model = new ModelAndView("characterSearcher");
			return model;
		}
		
		@PostMapping(path="/characterSearcherFind")
		public ModelAndView getAddCharacterPage(@RequestParam String role) {
			ModelAndView model = new ModelAndView("characterSearcher");
			FilmActors selectFilmActor = servicefilmactor.filterAllPeliculaActor(role);
			model.addObject("selectPeliculaActor",selectFilmActor);
			return model;
		}
	
		
		//7punto
	
		@GetMapping(path="/ActorSearcher")
		public ModelAndView getActorSearcherPage() {
			ModelAndView model = new ModelAndView("ActorSearcher");
			return model;
		}
		
		@PostMapping(path="/ActorSearcher")
		public ModelAndView getActorSearcherPage(@RequestParam String name) {
			ModelAndView model = new ModelAndView("ActorSearcher");
			Actor listFilterActor = serviceactores.filterAllDirector(name);
			model.addObject("listFilterActor",listFilterActor);
			return model;
		}
		
		
	
}
