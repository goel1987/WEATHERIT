package com.WeatherIT;

import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.WeatherIT.entity.Location;
import com.WeatherIT.service.LocationService;

@Controller

public class WeatherITApplicationController {
	
	public LocationService locationService;
	
	public void WeatherITController(LocationService thelocationService) {
		locationService=thelocationService;
	}
	
	@RequestMapping("/index")
	public String start() {
		return "index";
	}
	
	@GetMapping("/forecast")
	public String move() {
		return "forecast";
	}
	
	@GetMapping("/home")
	public String home() {
		return "home";
	}
	
	@GetMapping("/table")
	public String listFaculties(Model theModel) {
		
		//Retrieve Locations from the database
		List<Location> theLocation = locationService.findall();

		// Add Locations to Spring Model
		theModel.addAttribute("location", theLocation);

		return "/home";

	}
}
