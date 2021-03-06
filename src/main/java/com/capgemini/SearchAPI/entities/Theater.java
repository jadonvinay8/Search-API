package com.capgemini.SearchAPI.entities;

import java.util.List;

import com.amazonaws.services.dynamodbv2.datamodeling.DynamoDBAttribute;
import com.amazonaws.services.dynamodbv2.datamodeling.DynamoDBAutoGeneratedKey;
import com.amazonaws.services.dynamodbv2.datamodeling.DynamoDBHashKey;
import com.amazonaws.services.dynamodbv2.datamodeling.DynamoDBTable;
import com.capgemini.SearchAPI.beans.Address;
import com.capgemini.SearchAPI.beans.ShortCity;
import com.capgemini.SearchAPI.beans.ShortMovie;
import com.capgemini.SearchAPI.beans.ShortScreen;

@DynamoDBTable(tableName = "Theaters")
public class Theater {
	
	private	String theatreId;
	private	String theatreName;
	private	Address address;
	private	ShortCity city;
	private	List<ShortScreen> screens;
	private	List<ShortMovie> movies;
	private Integer rows;
	private Integer columns;
	
	public Theater() {
		// Default Constructor
	}

	public Theater(String theatreName, Address address, ShortCity city, List<ShortScreen> screens, List<ShortMovie> movies,
			Integer rows, Integer columns) {
		super();
		this.theatreName = theatreName;
		this.address = address;
		this.city = city;
		this.screens = screens;
		this.movies = movies;
		this.rows = rows;
		this.columns = columns;
	}

	@DynamoDBHashKey
    @DynamoDBAutoGeneratedKey
	public String getTheatreId() {
		return theatreId;
	}

	public void setTheatreId(String theatreId) {
		this.theatreId = theatreId;
	}

	@DynamoDBAttribute
	public String getTheatreName() {
		return theatreName;
	}

	public void setTheatreName(String theatreName) {
		this.theatreName = theatreName;
	}

	@DynamoDBAttribute
	public Address getAddress() {
		return address;
	}

	public void setAddress(Address address) {
		this.address = address;
	}

	@DynamoDBAttribute
	public ShortCity getCity() {
		return city;
	}

	public void setCity(ShortCity city) {
		this.city = city;
	}

	@DynamoDBAttribute
	public List<ShortScreen> getScreens() {
		return screens;
	}

	public void setScreens(List<ShortScreen> screens) {
		this.screens = screens;
	}

	@DynamoDBAttribute
	public List<ShortMovie> getMovies() {
		return movies;
	}

	public void setMovies(List<ShortMovie> movies) {
		this.movies = movies;
	}

	@DynamoDBAttribute
	public Integer getRows() {
		return rows;
	}

	public void setRows(Integer rows) {
		this.rows = rows;
	}

	@DynamoDBAttribute
	public Integer getColumns() {
		return columns;
	}

	public void setColumns(Integer columns) {
		this.columns = columns;
	}
	
}
