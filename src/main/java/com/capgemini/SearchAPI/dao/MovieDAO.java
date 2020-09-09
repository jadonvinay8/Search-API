package com.capgemini.SearchAPI.dao;

import java.util.Optional;

import org.socialsignin.spring.data.dynamodb.repository.EnableScan;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.capgemini.SearchAPI.entities.Movie;

@EnableScan
@Repository
public interface MovieDAO extends CrudRepository<Movie, String> {

	Optional<Movie> findById(String id);
	
}
