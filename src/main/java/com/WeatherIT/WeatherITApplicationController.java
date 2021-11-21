package com.WeatherIT;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.WeatherIT.service.LocationService;

@Controller
public class WeatherITApplicationController {
	
	public LocationService locationService;
	
	public WeatherITController(LocationService locationService) {
		locationService=theLocationService;
	}
	
	private List<Location> theLocations;
	
	
	@RequestMapping("/index")
	public String start() {
		return "index";
	}
	
	@RequestMapping("/home")
		public String Home() {
		 return "home";
	 }
	 
}
