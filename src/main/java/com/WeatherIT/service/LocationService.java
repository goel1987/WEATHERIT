package com.WeatherIT.service;

import java.util.List;

import com.WeatherIT.entity.Location;

public interface LocationService {



	public List<Location> findall();
	
	public Location findById(int theId);
	
	public void save(Location theLocation);
	
	public void deleteById(int theId);
}