package com.capgemini.SearchAPI.beans;

import com.amazonaws.services.dynamodbv2.datamodeling.DynamoDBDocument;

@DynamoDBDocument
public class ShortCity {
	
	private String id;
	private String name;
	
	public ShortCity() {
		// TODO Auto-generated constructor stub
	}
	
	public ShortCity(String name) {
		super();
		this.name = name;
	}

	public ShortCity(String id, String name) {
		super();
		this.id = id;
		this.name = name;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	
}
