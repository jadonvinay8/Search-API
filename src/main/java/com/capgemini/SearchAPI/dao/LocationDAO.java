package com.capgemini.SearchAPI.dao;

import java.util.Optional;

import org.socialsignin.spring.data.dynamodb.repository.EnableScan;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.capgemini.SearchAPI.entities.City;

@Repository
@EnableScan
public interface LocationDAO extends CrudRepository<City, String> {
	
	Optional<City> findById(String id);
	
}
