package com.WeatherIT;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class WeatherITApplicationController {
	@RequestMapping("/index")
	public String start() {
		return "index";
	}
	
	@GetMapping("/forecast")
	public String move() {
		return "forecast";
	}
}
