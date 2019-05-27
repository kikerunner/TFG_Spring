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
import es.salesianos.service.AirplaneBrandNameService;
import es.salesianos.service.AirplaneModelService;
import es.salesianos.service.AirplaneService;

@Controller
public class Controlador {
	
	@Autowired 
	List<Airplane> listAllAirplanes;
	
	@Autowired 
	List<AirplaneBrandName> airplaneBrandNameList;

	@Autowired 
	List<AirplaneModel> airplaneModelList;
	
	@Autowired 
	@Qualifier("airplaneservice")
	AirplaneService airplaneservice;
	
	@Autowired 
	@Qualifier("airplaneBrandNameService")
	AirplaneBrandNameService airplaneBrandNameService;
	
	@Autowired 
	@Qualifier("airplaneModelService")
	AirplaneModelService airplaneModelService;
	
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
		System.out.println(cod);
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
}
