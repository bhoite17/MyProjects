package com.vaibhav.RestController;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import com.vaibhav.entity.Registration;
import com.vaibhav.service.UserService;

@RestController
public class RegistrationRestController {
	
	@Autowired
	private UserService service;
	
	@GetMapping("/FormRegistration")
	public String RegistrationForm(Model model) {
		
		return "index";
		
		
	}
	
	@PostMapping("/RegistrationSubmit")
	public String RegistrationSubmit(Model model) {
		
		
		return "index";
	}
	

}
