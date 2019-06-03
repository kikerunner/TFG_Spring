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
import es.salesianos.model.Airport;
import es.salesianos.model.CabinCrewFlight;
import es.salesianos.model.City;
import es.salesianos.model.Country;
import es.salesianos.model.Flight;
import es.salesianos.model.FoodAndDrink;
import es.salesianos.model.Nationality;
import es.salesianos.model.Passenger;
import es.salesianos.model.Role;
import es.salesianos.model.Worker;
import es.salesianos.service.AirplaneBrandNameService;
import es.salesianos.service.AirplaneModelService;
import es.salesianos.service.AirplaneService;
import es.salesianos.service.CabinCrewFlightService;
import es.salesianos.service.CityService;
import es.salesianos.service.CountryService;
import es.salesianos.service.FoodAndDrinkService;
import es.salesianos.service.NationalityService;
import es.salesianos.service.PassengerService;
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
	List<Worker> pilotList;

	@Autowired 
	List<Worker> coPilotList;
	
	@Autowired 
	List<Worker> chiefCrewMemberList;
	
	@Autowired 
	List<Worker> flightAttendant1List;
	
	@Autowired 
	List<Worker> flightAttendant2List;
	
	@Autowired 
	List<Worker> flightAttendant3List;
	
	@Autowired 
	List<Worker> flightAttendant4List;
	
	@Autowired 
	List<Worker> flightAttendant5List;
	
	@Autowired 
	List<Worker> flightAttendant6List;

	@Autowired 
	List<Airport> airportOrigin;
	
	@Autowired 
	List<Airport> airportDestiny;
	
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
	@Qualifier("passengerService")
	PassengerService passengerService;
	
	@Autowired 
	@Qualifier("nationalityService")
	NationalityService nationalityService;
	
	@Autowired 
	@Qualifier("roleService")
	RoleService roleService;
	
	@Autowired 
	@Qualifier("foodAndDrinkService")
	FoodAndDrinkService foodAndDrinkService;
	
	@Autowired 
	@Qualifier("cabinCrewFlightService")
	CabinCrewFlightService cabinCrewFlightService;
	
	
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
	@GetMapping(path="/addFoodAndDrink")
	public ModelAndView getAddFoodAndDrinkPage() {
		ModelAndView model = new ModelAndView("addFoodAndDrink");
		model.addObject("foodAndDrink",new FoodAndDrink());
		return model;
	}
	@PostMapping(path="/addFoodAndDrink")
	public String saveWorker(FoodAndDrink foodAndDrink)  {
		foodAndDrinkService.addFoodAndDrink(foodAndDrink);
		return "index";
	}
	@PostMapping(path="/addWorker")
	public String saveWorker(Worker worker)  {
		workerService.addWorker(worker);
		return "index";
	}
	@GetMapping(path="/addCabinCrewFlight")
	public ModelAndView getAddCabinCrewFlightPage() {
		ModelAndView model = new ModelAndView("addCabinCrewFlight");
		pilotList = workerService.listAllPilots(1);
		coPilotList = workerService.listAllCoPilots(2);
		model.addObject("cabinCrewFlight",new CabinCrewFlight());
		model.addObject("PilotsList", pilotList);
		model.addObject("CoPilotsList", coPilotList);
		return model;
	}
	@GetMapping(path="/chiefCrewMember")
	public ModelAndView getChiefCrewMember(CabinCrewFlight cabincrewFlight) {
		ModelAndView model = new ModelAndView("chiefCrewMember");
		chiefCrewMemberList = workerService.listAllChiefCrewMembers(3);
		model.addObject("cabinCrewFlight",new CabinCrewFlight());
		model.addObject("ccf", cabincrewFlight);
		model.addObject("ChiefCrewMembersList", chiefCrewMemberList);
		return model;
	}
	@GetMapping(path="/fa1")
	public ModelAndView getFlightAttendant1(CabinCrewFlight cabincrewFlight) {
		ModelAndView model = new ModelAndView("fa1");
		flightAttendant1List = workerService.listAllFlightAttendants(4);
		model.addObject("cabinCrewFlight",new CabinCrewFlight());
		model.addObject("ccf", cabincrewFlight);
		model.addObject("FlightAttendant1List", flightAttendant1List);
		return model;
	}
	@GetMapping(path="/fa2")
	public ModelAndView getFlightAttendant2(CabinCrewFlight cabincrewFlight) {
		ModelAndView model = new ModelAndView("fa2");
		flightAttendant2List = workerService.listAllFlightAttendants(4);
		for (int i = 0; i < flightAttendant2List.size(); i++) {
			if(cabincrewFlight.getIdFlightAttendant1() == flightAttendant2List.get(i).getIdworker()) {
				flightAttendant2List.remove(i);
			}
		}
		model.addObject("cabinCrewFlight",new CabinCrewFlight());
		model.addObject("ccf", cabincrewFlight);
		model.addObject("FlightAttendant2List", flightAttendant2List);
		return model;
	}
	@GetMapping(path="/fa3")
	public ModelAndView getFlightAttendant3(CabinCrewFlight cabincrewFlight) {
		ModelAndView model = new ModelAndView("fa3");
		flightAttendant3List = workerService.listAllFlightAttendants(4);
		for (int i = 0; i < flightAttendant3List.size(); i++) {
			if(cabincrewFlight.getIdFlightAttendant1() == flightAttendant3List.get(i).getIdworker()) {
				flightAttendant3List.remove(i);
			}
			if(cabincrewFlight.getIdFlightAttendant2() == flightAttendant3List.get(i).getIdworker()) {
				flightAttendant3List.remove(i);
			}
		}
		model.addObject("cabinCrewFlight",new CabinCrewFlight());
		model.addObject("ccf", cabincrewFlight);
		model.addObject("FlightAttendant3List", flightAttendant3List);
		return model;
	}

	@GetMapping(path="/fa4")
	public ModelAndView getFlightAttendant4(CabinCrewFlight cabincrewFlight) {
		if(cabincrewFlight.getNumberOfFlightAttendants() == 4) {
			ModelAndView model = new ModelAndView("fa4Def");
			flightAttendant4List = workerService.listAllFlightAttendants(4);
			for (int i = 0; i < flightAttendant4List.size(); i++) {
				if(cabincrewFlight.getIdFlightAttendant1() == flightAttendant4List.get(i).getIdworker()) {
					flightAttendant4List.remove(i);
				}
				if(cabincrewFlight.getIdFlightAttendant2() == flightAttendant4List.get(i).getIdworker()) {
					flightAttendant4List.remove(i);
				}
				if(cabincrewFlight.getIdFlightAttendant3() == flightAttendant4List.get(i).getIdworker()) {
					flightAttendant4List.remove(i);
				}
			}
			model.addObject("cabinCrewFlight",new CabinCrewFlight());
			model.addObject("ccf", cabincrewFlight);
			model.addObject("FlightAttendant4List", flightAttendant4List);
			return model;	
		}else {
			ModelAndView model = new ModelAndView("fa4");
			flightAttendant4List = workerService.listAllFlightAttendants(4);
			for (int i = 0; i < flightAttendant4List.size(); i++) {
				if(cabincrewFlight.getIdFlightAttendant1() == flightAttendant4List.get(i).getIdworker()) {
					flightAttendant4List.remove(i);
				}
				if(cabincrewFlight.getIdFlightAttendant2() == flightAttendant4List.get(i).getIdworker()) {
					flightAttendant4List.remove(i);
				}
				if(cabincrewFlight.getIdFlightAttendant3() == flightAttendant4List.get(i).getIdworker()) {
					flightAttendant4List.remove(i);
				}
			}
			model.addObject("cabinCrewFlight",new CabinCrewFlight());
			model.addObject("ccf", cabincrewFlight);
			model.addObject("FlightAttendant4List", flightAttendant4List);
			return model;
		}
	}
	@PostMapping(path="/addCCF4A")
	public String saveCabinCrewFlight4Attendants(CabinCrewFlight cabincrewflight)  {
		cabinCrewFlightService.addCabinCrewFlight4A(cabincrewflight);;
		return "index";
	}
	@GetMapping(path="/fa5")
	public ModelAndView getFlightAttendant5(CabinCrewFlight cabincrewFlight) {
		ModelAndView model = new ModelAndView("fa5");
		flightAttendant5List = workerService.listAllFlightAttendants(4);
		for (int i = 0; i < flightAttendant5List.size(); i++) {
			if(cabincrewFlight.getIdFlightAttendant1() == flightAttendant5List.get(i).getIdworker()) {
				flightAttendant5List.remove(i);
			}
			if(cabincrewFlight.getIdFlightAttendant2() == flightAttendant5List.get(i).getIdworker()) {
				flightAttendant5List.remove(i);
			}
			if(cabincrewFlight.getIdFlightAttendant3() == flightAttendant5List.get(i).getIdworker()) {
				flightAttendant5List.remove(i);
			}
			if(cabincrewFlight.getIdFlightAttendant4() == flightAttendant5List.get(i).getIdworker()) {
				flightAttendant5List.remove(i);
			}
		}
		model.addObject("cabinCrewFlight",new CabinCrewFlight());
		model.addObject("ccf", cabincrewFlight);
		model.addObject("FlightAttendant5List", flightAttendant5List);
		return model;
	}
	@GetMapping(path="/fa6")
	public ModelAndView getFlightAttendant6(CabinCrewFlight cabincrewFlight) {
		ModelAndView model = new ModelAndView("fa6");
		flightAttendant6List = workerService.listAllFlightAttendants(4);
		for (int i = 0; i < flightAttendant6List.size(); i++) {
			if(cabincrewFlight.getIdFlightAttendant1() == flightAttendant6List.get(i).getIdworker()) {
				flightAttendant6List.remove(i);
			}
			if(cabincrewFlight.getIdFlightAttendant2() == flightAttendant6List.get(i).getIdworker()) {
				flightAttendant6List.remove(i);
			}
			if(cabincrewFlight.getIdFlightAttendant3() == flightAttendant6List.get(i).getIdworker()) {
				flightAttendant6List.remove(i);
			}
			if(cabincrewFlight.getIdFlightAttendant4() == flightAttendant6List.get(i).getIdworker()) {
				flightAttendant6List.remove(i);
			}
			if(cabincrewFlight.getIdFlightAttendant5() == flightAttendant6List.get(i).getIdworker()) {
				flightAttendant6List.remove(i);
			}
		}
		model.addObject("cabinCrewFlight",new CabinCrewFlight());
		model.addObject("ccf", cabincrewFlight);
		model.addObject("FlightAttendant6List", flightAttendant6List);
		return model;
	}
	@PostMapping(path="/addCCF6A")
	public String saveCabinCrewFlight6Attendants(CabinCrewFlight cabincrewflight)  {
		cabinCrewFlightService.addCabinCrewFlight6A(cabincrewflight);;
		return "index";
	}
	@GetMapping(path="/addPassenger")
	public ModelAndView getPassengerPage() {
		ModelAndView model = new ModelAndView("addPassenger");
		nationalityList = nationalityService.listAllNationalities();
		countryList = countryService.listAllCountries();
		model.addObject("passenger",new Passenger());
		model.addObject("NationalityList", nationalityList);
		model.addObject("CountryList", countryList);
		return model;
	}
	@PostMapping(path="/addPassenger")
	public String savePassenger(Passenger passenger)  {
		passengerService.addPassenger(passenger);
		return "index";
	}
	@GetMapping(path = "/selectingOriginCountry")
	public ModelAndView asociateOriginCountry() {
		countryList = countryService.listAllCountries();
		ModelAndView model = new ModelAndView("selectingOriginCountry");
		model.addObject("CountryList", countryList);
		return model;
	}
	@GetMapping(path = "/selectingDestinyCountry")
	public ModelAndView asociateDestinyCountry(int idOriginCountry) {
		countryList = countryService.listAllCountries();
		ModelAndView model = new ModelAndView("selectingDestinyCountry");
		model.addObject("CountryList", countryList);
		model.addObject("IdOriginCountry", idOriginCountry);
		return model;
	}
	@GetMapping(path="/addFlight")
	public ModelAndView getAddFlightPage(int idOriginCountry, int idDestinyCountry) {
		ModelAndView model = new ModelAndView("addFlight");
		airportDestiny 
		airportOrigin 
		model.addObject("Flight",new Flight());
		model.addObject("NationalityList", nationalityList);
		model.addObject("CountryList", countryList);
		model.addObject("IdOriginCountry", idOriginCountry);
		model.addObject("IdDestinyCountry", idDestinyCountry);
		return model;
	}
}
