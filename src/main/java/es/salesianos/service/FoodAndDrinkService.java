package es.salesianos.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import es.salesianos.model.Airplane;
import es.salesianos.model.AirplaneBrandName;
import es.salesianos.model.Country;
import es.salesianos.model.FoodAndDrink;
import es.salesianos.model.Nationality;
import es.salesianos.model.Role;
import es.salesianos.repository.RepositoryAirplane;
import es.salesianos.repository.RepositoryAirplaneBrandName;
import es.salesianos.repository.RepositoryCountry;
import es.salesianos.repository.RepositoryFoodAndDrink;
import es.salesianos.repository.RepositoryNationality;
import es.salesianos.repository.RepositoryRole;

@Service("foodAndDrinkService")
public class FoodAndDrinkService {
	@Autowired
	@Qualifier("repositoryFoodAndDrink")
	private RepositoryFoodAndDrink repoFoodAndDrink;

	public RepositoryFoodAndDrink getRepoFoodAndDrink() {
		return repoFoodAndDrink;
	}

	public void setRepoFoodAndDrink(RepositoryFoodAndDrink repoFoodAndDrink) {
		this.repoFoodAndDrink = repoFoodAndDrink;
	}

	public void addFoodAndDrink(FoodAndDrink foodAndDrink) {
		repoFoodAndDrink.insertFoodAndDrink(foodAndDrink);
	}
	
	public List<FoodAndDrink> selectFoodAndDrink() {
		return repoFoodAndDrink.sellectAllFoodAndDrink();
	}
}
