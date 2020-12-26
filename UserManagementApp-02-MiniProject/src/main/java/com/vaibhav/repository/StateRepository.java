package com.vaibhav.repository;

import java.io.Serializable;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface StateRepository extends JpaRepository<State, Serializable> {
	
	List<State> findByCountryId(Integer CountryId);

}
