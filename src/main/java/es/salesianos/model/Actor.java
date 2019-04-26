package es.salesianos.model;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Component;
@Component
public class Actor {
	private Integer cod;
	private String name;
	private Integer yearofbirthday;
	private List<FilmActors> filmActor = new ArrayList<FilmActors>();
	public Integer getCod() {
		return cod;
	}
	public void setCod(Integer cod) {
		this.cod = cod;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Integer getYearofbirthday() {
		return yearofbirthday;
	}
	public void setYearofbirthday(Integer yearofbirthday) {
		this.yearofbirthday = yearofbirthday;
	}
	
	public List<FilmActors> getFilmActor() {
		return filmActor;
	}

	public void setFilmActor(List<FilmActors> peliculaActor) {
		this.filmActor = peliculaActor;
	}

}
