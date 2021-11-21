package com.WeatherIT.service;
import com.WeatherIT.*;
import com.WeatherIT.dao.locationRepository;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.WeatherIT.entity.Location;


@Service
public class LocationServiceImpl implements LocationService {

	@Autowired
		public LocationServiceImpl(LocationRepository theLocationRepository) {
			locationRepository=theLocationRepository;
		}

	
	
	
	@Override
	public List<Location> findall() {
		// TODO Auto-generated method stub
		return locationRepository.findAll();
	}

	@Override
	public Location findbyId(int theId) {
		// TODO Auto-generated method stub
		return locationRepository.findById(theId);;
	}

	@Override
	public void save(Location theLocation) {
		// TODO Auto-generated method stub
		locationRepository.save(theLocation);;
	}

	@Override
	public void deletebyId(int theId) {
		// TODO Auto-generated method stub
		 locationRepository.deleteById(theId);;

	}

}
