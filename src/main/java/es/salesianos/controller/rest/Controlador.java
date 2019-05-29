package es.salesianos.controller.rest;

import java.io.IOException;
import java.util.ArrayList;
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

import es.salesianos.model.Airplane;
import es.salesianos.model.AirplaneBrandName;
import es.salesianos.model.AirplaneModel;
import es.salesianos.model.City;
import es.salesianos.model.Country;
import es.salesianos.model.Nationality;
import es.salesianos.model.Role;
import es.salesianos.model.Worker;
import es.salesianos.service.AirplaneBrandNameService;
import es.salesianos.service.AirplaneModelService;
import es.salesianos.service.AirplaneService;
import es.salesianos.service.CityService;
import es.salesianos.service.CountryService;
import es.salesianos.service.NationalityService;
import es.salesianos.service.RoleService;
import es.salesianos.service.WorkerService;

@Controller
public class Controlador {
	
	@Autowired 
	List<Airplane> listAllAirplanes;
	
	@Autowired 
	List<AirplaneBrandName> airplaneBrandNameList;

	@Autowired 
	List<AirplaneModel> airplaneModelList;
	
	@Autowired 
	List<Country> countryList;
	
	@Autowired 
	List<City> cityList;
	
	@Autowired 
	List<Nationality> nationalityList;
	
	@Autowired 
	List<Role> roleList;
	
	@Autowired 
	@Qualifier("countryService")
	CountryService countryService;
	
	@Autowired 
	@Qualifier("airplaneservice")
	AirplaneService airplaneservice;
	
	@Autowired 
	@Qualifier("airplaneBrandNameService")
	AirplaneBrandNameService airplaneBrandNameService;
	
	@Autowired 
	@Qualifier("airplaneModelService")
	AirplaneModelService airplaneModelService;
	
	@Autowired 
	@Qualifier("workerService")
	WorkerService workerService;
	
	@Autowired 
	@Qualifier("cityService")
	CityService cityService;
	
	@Autowired 
	@Qualifier("nationalityService")
	NationalityService nationalityService;
	
	@Autowired 
	@Qualifier("roleService")
	RoleService roleService;
	
	@GetMapping(path = "/LoadAirplanesList")
	public ModelAndView loadAirplaneList() {
		listAllAirplanes = airplaneservice.listAllAirplanesAndModels();
		ModelAndView model = new ModelAndView("ListAirplanes");
		model.addObject("ListAirplanes", listAllAirplanes);
		return model;
	}
	@PostMapping(path="/addAirplane")
	public String saveAirplane(Airplane airplane)  {
		airplaneservice.addAirplane(airplane);
		System.out.println("en controlador" + airplane.getFlightHours());
		return "index";
	}
	@GetMapping(path="/addAirplane")
	public ModelAndView getAddAirplanePage(@RequestParam int cod) {
		airplaneModelList = airplaneModelService.listAllAirplanesModelByBrandName(cod);
		ModelAndView model = new ModelAndView("addAirplane");
		model.addObject("airplane",new Airplane());
		model.addObject("AirplaneModelList", airplaneModelList);
		return model;
	}
	@GetMapping(path = "/selectingAirplane")
	public ModelAndView asociatepage() {
		airplaneBrandNameList = airplaneBrandNameService.listAllAirplanesBrandName();
		System.out.println(airplaneBrandNameList);
		ModelAndView model = new ModelAndView("selectingAirplane");
		model.addObject("AirplaneBrandNameList", airplaneBrandNameList);
		return model;
	}
	@GetMapping(path = "/selectingCountry")
	public ModelAndView asociateCountry() {
		countryList = countryService.listAllCountries();
		ModelAndView model = new ModelAndView("selectingCountry");
		model.addObject("CountryList", countryList);
		return model;
	}
	@GetMapping(path="/addWorker")
	public ModelAndView getAddWorkerPage(@RequestParam int idCity) {
		cityList = cityService.listAllCitiesByCountryID(idCity);
		nationalityList = nationalityService.listAllNationalities();
		roleList = roleService.listAllRoles();
		ModelAndView model = new ModelAndView("addWorker");
		model.addObject("worker",new Worker());
		model.addObject("CityList", cityList);
		model.addObject("NationalityList", nationalityList);
		model.addObject("RoleList", roleList);
		return model;
	}
	@PostMapping(path="/addWorker")
	public String saveWorker(Worker worker)  {
		workerService.addWorker(worker);
		return "index";
	}
}
