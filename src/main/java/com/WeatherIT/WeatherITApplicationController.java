package com.WeatherIT;

import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.WeatherIT.entity.Location;
import com.WeatherIT.service.LocationService;

@Controller
@RequestMapping("/home")
public class WeatherITApplicationController {
	
	public LocationService locationService;
	
	public void WeatherITController(LocationService thelocationService) {
		locationService=thelocationService;
	}
	
	@RequestMapping("/index")
	public String start() {
		return "index";
	}
	
	@RequestMapping("/home")
		public String Home() {
		 return "home";
	 }
	 
}
