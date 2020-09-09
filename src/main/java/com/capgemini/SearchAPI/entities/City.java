package com.capgemini.SearchAPI.entities;

import java.util.List;

import com.amazonaws.services.dynamodbv2.datamodeling.DynamoDBAttribute;
import com.amazonaws.services.dynamodbv2.datamodeling.DynamoDBAutoGeneratedKey;
import com.amazonaws.services.dynamodbv2.datamodeling.DynamoDBHashKey;
import com.amazonaws.services.dynamodbv2.datamodeling.DynamoDBTable;
import com.capgemini.SearchAPI.beans.ShortTheater;

@DynamoDBTable(tableName = "Cities")
public class City {
	

	private String id;
	private String cityName;
	private List<ShortTheater> theaters;
	
	public City() {
		// Default Constructor
	}

	public City(String cityName, List<ShortTheater> theaters) {
		super();
		this.cityName = cityName;
		this.theaters = theaters;
	}
	
	@DynamoDBHashKey
    @DynamoDBAutoGeneratedKey
	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}
	
    @DynamoDBAttribute
	public String getCityName() {
		return cityName;
	}

	public void setCityName(String cityName) {
		this.cityName = cityName;
	}
	
    @DynamoDBAttribute
	public List<ShortTheater> getTheaters() {
		return theaters;
	}

	public void setTheaters(List<ShortTheater> theaters) {
		this.theaters = theaters;
	}
	
}