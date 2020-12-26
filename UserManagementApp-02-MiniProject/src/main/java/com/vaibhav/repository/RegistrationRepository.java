package com.vaibhav.repository;

import java.io.Serializable;

import org.springframework.data.jpa.repository.JpaRepository;

import com.vaibhav.entity.Registration;

public interface RegistrationRepository extends JpaRepository<Registration,Serializable> {
	
	

}
