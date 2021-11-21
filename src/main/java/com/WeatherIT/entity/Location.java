package com.WeatherIT.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="location")
public class Location {

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	
	
	@Column(name="id")
	private int id;
	
	@Column(name="locationName")
	private String locationName;
	
	
	public Location() {
		
	}
	
	public Location(int id, String locationName) {
		super();
		this.id = id;
		this.locationName=locationName;
	}
	
	public int getId() {
		return id;
	}
	
	public String getlocationName() {
		return locationName;
	}
	
	@Override
	public String toString() {
		return "Location [id="id ","locationName=" locationName"];
	}
}
