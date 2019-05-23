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
import es.salesianos.service.AirplaneBrandNameService;
import es.salesianos.service.AirplaneService;

@Controller
public class Controlador {
	
	@Autowired 
	List<Airplane> listAllAirplanes;
	
	@Autowired 
	List<AirplaneBrandName> airplaneBrandNameList;
	
	@Autowired 
	@Qualifier("airplaneservice")
	AirplaneService airplaneservice;
	
	@Autowired 
	@Qualifier("airplaneBrandNameService")
	AirplaneBrandNameService airplaneBrandNameService;

	@GetMapping(path="/addAirplane")
	public ModelAndView getAddAirplanePage() {
		airplaneBrandNameList = airplaneBrandNameService.listAllAirplanesBrandName();
		ModelAndView model = new ModelAndView("addAirplane");
		model.addObject("airplane",new Airplane());
		model.addObject("AirplaneBrandNameList", airplaneBrandNameList);
		return model;
	}
	
	@PostMapping(path="/addAirplane")
	public String saveAirplane(Airplane airplane)  {
		airplaneservice.addAirplane(airplane);
		return "index";
	}
	
	@GetMapping(path = "/LoadAirplanesList")
	public ModelAndView loadAirplaneList() {
		listAllAirplanes = airplaneservice.listAllAirplanes();
		for (int i = 0; i < listAllAirplanes.size(); i++) {
			System.out.println("En controlador:" + listAllAirplanes.get(i).getAirplaneName());
		}
		ModelAndView model = new ModelAndView("ListAirplanes");
		model.addObject("ListAirplanes", listAllAirplanes);
		return model;
	}
}
