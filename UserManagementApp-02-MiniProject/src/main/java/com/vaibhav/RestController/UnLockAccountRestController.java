package com.vaibhav.RestController;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import com.vaibhav.entity.Registration;
import com.vaibhav.service.UserService;

@RestController
public class UnLockAccountRestController {
	
	@Autowired
	private UserService service;
	
	@GetMapping("UnlockAccount")
	public String UnlockAcc(Model model) {
		
		return "index";
	}
	
	@PostMapping("/UnlockAccSubmit")
	public String UnlockAccSubmit(Model model) {
		
		return "index";
	}
	
	
	

}
