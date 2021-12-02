package com.WeatherIT.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.WeatherIT.entity.Location;


public interface locationRepository extends JpaRepository<Location, Integer>  {

}
