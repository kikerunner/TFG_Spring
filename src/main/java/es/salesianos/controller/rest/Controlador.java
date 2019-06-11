package es.salesianos.controller.rest;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.SessionAttributes;
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
import es.salesianos.service.AirportService;
import es.salesianos.service.CabinCrewFlightService;
import es.salesianos.service.CityService;
import es.salesianos.service.CountryService;
import es.salesianos.service.FlightService;
import es.salesianos.service.FoodAndDrinkService;
import es.salesianos.service.NationalityService;
import es.salesianos.service.PassengerService;
import es.salesianos.service.RoleService;
import es.salesianos.service.WorkerService;

@Controller
@SessionAttributes("workerInSession")
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
	List<Worker> flightAttendantList;
	
	@Autowired 
	List<Airport> airportsOriginList;
	
	@Autowired 
	List<Airport> airportsDestinyList;
	
	@Autowired 
	List<FoodAndDrink> foodAndDrinkList;
	
	@Autowired 
	List<CabinCrewFlight> cabinCrewFlightList;
	
	@Autowired 
	List<CabinCrewFlight> cabinCrewFlightWorkersList;
	
	@Autowired 
	List<Worker> workersList;
	
	@Autowired 
	List<Flight> flightsList;
	
	@Autowired 
	List<Airport> airportsList;
	
	@Autowired 
	Airplane airplaneFilter;
	
	@Autowired 
	Worker workerLoad;
	
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
	
	@Autowired 
	@Qualifier("airportService")
	AirportService airportService;
	
	@Autowired 
	@Qualifier("flightService")
	FlightService flightService;
	
	@GetMapping(path = "/login")
	public ModelAndView indexPage() {
		ModelAndView model = new ModelAndView("login");
		model.addObject("worker", new Worker());
		return model;
	}
	@PostMapping(path="/login")
	public ModelAndView startLogginSession(Worker worker)  {	
		workerLoad = workerService.selectAtLogIn(worker.getIdworker());
		if(!workerLoad.getPassword().equals(worker.getPassword())) {
			ModelAndView model = new ModelAndView("login");
			return model;
		}else {
			if (workerLoad.getIdRole() == 5) {
				ModelAndView model = new ModelAndView("administrationMenu");
				model.addObject("workerInSession", workerLoad);
				return model;
			}else {
				ModelAndView model = new ModelAndView("workerMenu");
				model.addObject("workerInSession", workerLoad);
				return model;
			}
		}
		
	}
	
	@GetMapping(path = "/LoadAirplanesList")
	public ModelAndView loadAirplaneList() {
		listAllAirplanes = airplaneservice.listAllAirplanesAndModels();
		ModelAndView model = new ModelAndView("ListAirplanes");
		model.addObject("ListAirplanes", listAllAirplanes);
		return model;
	}
	@GetMapping(path = "/LoadWorkersList")
	public ModelAndView loadWorkersList() {
		workersList = workerService.selectAllWorkers();
		ModelAndView model = new ModelAndView("workersList");
		model.addObject("workersList", workersList);
		return model;
	}
	@PostMapping(path = "/LoadWorkersListById")
	public ModelAndView loadWorkersListById(int id) {
		workersList = workerService.selectAllWorkersById(id);
		ModelAndView model = new ModelAndView("workersList");
		model.addObject("workersList", workersList);
		return model;
	}
	@PostMapping(path = "/LoadWorkersListByName")
	public ModelAndView loadWorkersListByName(String name) {
		workersList = workerService.selectAllWorkersByName(name);
		ModelAndView model = new ModelAndView("workersList");
		model.addObject("workersList", workersList);
		return model;
	}
	@PostMapping(path = "/LoadWorkersListBySurname")
	public ModelAndView loadWorkersListBySurname(String surname) {
		workersList = workerService.selectAllWorkersBySurname(surname);
		ModelAndView model = new ModelAndView("workersList");
		model.addObject("workersList", workersList);
		return model;
	}
	@PostMapping(path = "/LoadWorkersListByPassport")
	public ModelAndView loadWorkersListByPasport(String passport) {
		workersList = workerService.selectAllWorkersByPassport(passport);
		ModelAndView model = new ModelAndView("workersList");
		model.addObject("workersList", workersList);
		return model;
	}
	@GetMapping(path = "/LoadFlightsList")
	public ModelAndView loadFlightsList() {
		flightsList = flightService.listFlights();
		ModelAndView model = new ModelAndView("flightsList");
		model.addObject("FlightsList", flightsList);
		return model;
	}
	@PostMapping(path = "/LoadFlightsListById")
	public ModelAndView loadFlightsListById(int id) {
		flightsList = flightService.listFlightsById(id);
		ModelAndView model = new ModelAndView("flightsList");
		model.addObject("FlightsList", flightsList);
		return model;
	}
	@PostMapping(path = "/LoadFlightsListByAirplaneName")
	public ModelAndView loadFlightsListByAirplaneName(String airplane) {
		flightsList = flightService.listFlightsByAirplaneName(airplane);
		ModelAndView model = new ModelAndView("flightsList");
		model.addObject("FlightsList", flightsList);
		return model;
	}
	@PostMapping(path = "/LoadFlightsListByAirportOrigin")
	public ModelAndView loadFlightsListByAirportOrigin(String airportOrigin) {
		flightsList = flightService.listFlightsByAirportOrigin(airportOrigin);
		ModelAndView model = new ModelAndView("flightsList");
		model.addObject("FlightsList", flightsList);
		return model;
	}
	@PostMapping(path = "/LoadFlightsListByAirportDestiny")
	public ModelAndView loadFlightsListByAirportDestiny(String airportDestiny) {
		flightsList = flightService.listFlightsByAirportDestiny(airportDestiny);
		ModelAndView model = new ModelAndView("flightsList");
		model.addObject("FlightsList", flightsList);
		return model;
	}
	@PostMapping(path="/addAirplane")
	public String saveAirplane(Airplane airplane)  {
		airplaneservice.addAirplane(airplane);
		return "administrationMenu";
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
		return "administrationMenu";
	}
	@PostMapping(path="/addWorker")
	public String saveWorker(Worker worker)  {
		workerService.addWorker(worker);
		return "administrationMenu";
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
		flightAttendantList = workerService.listAllFlightAttendants(4);
		model.addObject("cabinCrewFlight",new CabinCrewFlight());
		model.addObject("ccf", cabincrewFlight);
		model.addObject("FlightAttendant1List", flightAttendantList);
		return model;
	}
	@GetMapping(path="/fa2")
	public ModelAndView getFlightAttendant2(CabinCrewFlight cabincrewFlight) {
		ModelAndView model = new ModelAndView("fa2");
		for (int i = 0; i < flightAttendantList.size(); i++) {
			if(cabincrewFlight.getIdFlightAttendant1() == flightAttendantList.get(i).getIdworker()) {
				flightAttendantList.remove(i);
			}
		}
		model.addObject("cabinCrewFlight",new CabinCrewFlight());
		model.addObject("ccf", cabincrewFlight);
		model.addObject("FlightAttendant2List", flightAttendantList);
		return model;
	}
	@GetMapping(path="/fa3")
	public ModelAndView getFlightAttendant3(CabinCrewFlight cabincrewFlight) {
		ModelAndView model = new ModelAndView("fa3");
		for (int i = 0; i < flightAttendantList.size(); i++) {
			if(cabincrewFlight.getIdFlightAttendant2() == flightAttendantList.get(i).getIdworker()) {
				flightAttendantList.remove(i);
			}
		}
		model.addObject("cabinCrewFlight",new CabinCrewFlight());
		model.addObject("ccf", cabincrewFlight);
		model.addObject("FlightAttendant3List", flightAttendantList);
		return model;
	}

	@GetMapping(path="/fa4")
	public ModelAndView getFlightAttendant4(CabinCrewFlight cabincrewFlight) {
		if(cabincrewFlight.getNumberOfFlightAttendants() == 4) {
			ModelAndView model = new ModelAndView("fa4Def");
			for (int i = 0; i < flightAttendantList.size(); i++) {
				if(cabincrewFlight.getIdFlightAttendant3() == flightAttendantList.get(i).getIdworker()) {
					flightAttendantList.remove(i);
				}
			}
			model.addObject("cabinCrewFlight",new CabinCrewFlight());
			model.addObject("ccf", cabincrewFlight);
			model.addObject("FlightAttendant4List", flightAttendantList);
			return model;	
		}else {
			ModelAndView model = new ModelAndView("fa4");
			for (int i = 0; i < flightAttendantList.size(); i++) {
				if(cabincrewFlight.getIdFlightAttendant3() == flightAttendantList.get(i).getIdworker()) {
					flightAttendantList.remove(i);
				}
			}
			model.addObject("cabinCrewFlight",new CabinCrewFlight());
			model.addObject("ccf", cabincrewFlight);
			model.addObject("FlightAttendant4List", flightAttendantList);
			return model;
		}
	}
	@PostMapping(path="/addCCF4A")
	public String saveCabinCrewFlight4Attendants(CabinCrewFlight cabincrewflight)  {
		cabinCrewFlightService.addCabinCrewFlight4A(cabincrewflight);;
		return "administrationMenu";
	}
	@GetMapping(path="/fa5")
	public ModelAndView getFlightAttendant5(CabinCrewFlight cabincrewFlight) {
		ModelAndView model = new ModelAndView("fa5");
		for (int i = 0; i < flightAttendantList.size(); i++) {
			if(cabincrewFlight.getIdFlightAttendant4() == flightAttendantList.get(i).getIdworker()) {
				flightAttendantList.remove(i);
			}
		}
		model.addObject("cabinCrewFlight",new CabinCrewFlight());
		model.addObject("ccf", cabincrewFlight);
		model.addObject("FlightAttendant5List", flightAttendantList);
		return model;
	}
	@GetMapping(path="/fa6")
	public ModelAndView getFlightAttendant6(CabinCrewFlight cabincrewFlight) {
		ModelAndView model = new ModelAndView("fa6");
		for (int i = 0; i < flightAttendantList.size(); i++) {
			if(cabincrewFlight.getIdFlightAttendant5() == flightAttendantList.get(i).getIdworker()) {
				flightAttendantList.remove(i);
			}
		}
		model.addObject("cabinCrewFlight",new CabinCrewFlight());
		model.addObject("ccf", cabincrewFlight);
		model.addObject("FlightAttendant6List", flightAttendantList);
		return model;
	}
	@PostMapping(path="/addCCF6A")
	public String saveCabinCrewFlight6Attendants(CabinCrewFlight cabincrewflight)  {
		cabinCrewFlightService.addCabinCrewFlight6A(cabincrewflight);;
		return "administrationMenu";
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
		airportsOriginList = airportService.listAllOriginAirportsByIdCountry(idOriginCountry);
		airportsDestinyList = airportService.listAllDestinyAirportsByIdCountry(idDestinyCountry);
		listAllAirplanes = airplaneservice.listAllAirplanes();
		foodAndDrinkList = foodAndDrinkService.selectFoodAndDrink();
		model.addObject("Flight",new Flight());
		model.addObject("AirportsOriginList", airportsOriginList);
		model.addObject("AirportsDestinyList", airportsDestinyList);
		model.addObject("ListAirplanes", listAllAirplanes);
		model.addObject("FoodAndDrinkList", foodAndDrinkList);
		return model;
	}
	@GetMapping(path="/selectingCabinCrewFlight")
	public ModelAndView getAddFlightPage(Flight flight) {
		airplaneFilter = airplaneservice.selectingAirplaneByID(flight.getIdAirplane());
		flight.setAvailableSeats(airplaneFilter.getSeatsNumber());
		if(airplaneFilter.getWorkersNumber() == 4) {
			ModelAndView model = new ModelAndView("selectingCabinCrewFlight4Workers");
			cabinCrewFlightWorkersList = cabinCrewFlightService.selectAllCabinCrewFlihgt4();
			model.addObject("Flight",new Flight());
			model.addObject("flight", flight);
			model.addObject("CabinCrewFlightWorkersList", cabinCrewFlightWorkersList);
			return model;
		}else {
			ModelAndView model = new ModelAndView("selectingCabinCrewFlight6Workers");
			cabinCrewFlightWorkersList = cabinCrewFlightService.selectAllCabinCrewFlihgt6();
			model.addObject("Flight",new Flight());
			model.addObject("flight", flight);
			model.addObject("CabinCrewFlightWorkersList", cabinCrewFlightWorkersList);
			return model;
		}
	}
	
	@GetMapping(path="/airportsList")
	public ModelAndView getAirportsPage() {
			ModelAndView model = new ModelAndView("airportsList");
			airportsList = airportService.listAllAirportsAndCities();
			model.addObject("AirportsList", airportsList);
			return model;
	}
	
	@PostMapping(path="/airportSearcher")
	public ModelAndView getAirportsByName(String airportName) {
			ModelAndView model = new ModelAndView("airportsList");
			airportsList = airportService.listAllAirportsAndCitiesByName(airportName);
			model.addObject("AirportsList", airportsList);
			return model;
	}
	
	@PostMapping(path="/airportSearcherIata")
	public ModelAndView getAirportsByIata(String iATA) {
			ModelAndView model = new ModelAndView("airportsList");
			airportsList = airportService.listAllAirportsAndCitiesByIata(iATA);
			model.addObject("AirportsList", airportsList);
			return model;
	}
	
	@PostMapping(path="/airportSearcherIcao")
	public ModelAndView getAirportsByIcao(String iCAO) {
			ModelAndView model = new ModelAndView("airportsList");
			airportsList = airportService.listAllAirportsAndCitiesByIcao(iCAO);
			model.addObject("AirportsList", airportsList);
			return model;
	}
	
	@GetMapping(path="/cabinCrewFlight4Workers")
	public ModelAndView getAddCCF4Page() {
			ModelAndView model = new ModelAndView("cabinCrewFlight4Workers");
			cabinCrewFlightWorkersList = cabinCrewFlightService.selectAllCabinCrewFlihgt4();
			model.addObject("CabinCrewFlightWorkersList", cabinCrewFlightWorkersList);
			return model;
	}
	
	@GetMapping(path="/cabinCrewFlight6Workers")
	public ModelAndView getAddCCF6Page() {
		ModelAndView model = new ModelAndView("cabinCrewFlight6Workers");
		cabinCrewFlightWorkersList = cabinCrewFlightService.selectAllCabinCrewFlihgt6();
		model.addObject("CabinCrewFlightWorkersList", cabinCrewFlightWorkersList);
		return model;
	}
	
	@GetMapping(path="/addFlightDef")
	public ModelAndView getAnadir(Flight flight) {
		ModelAndView model = new ModelAndView("addFlightDef");
		System.out.println(flight.getIdCabinCrewFlight());
		model.addObject("Flight",new Flight());
		model.addObject("flight", flight);
		return model;
	}
	@PostMapping(path="/addFlightDef")
	public String savePassenger(Flight flight)  {
		flightService.addFlight(flight);
		return "administrationMenu";
	}
}
