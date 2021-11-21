package com.WeatherIT.service;

import java.util.List;

import com.WeatherIT.entity.Location;

public interface LocationService {



	public List<Location> findall();
	
	public Location findbyId(int theId);
	
	public void save(Location theLocation);
	
	public void deletebyId(Location theLocation);
}