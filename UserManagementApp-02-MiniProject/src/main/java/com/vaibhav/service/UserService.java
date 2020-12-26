package com.vaibhav.service;

import java.util.Map;

public interface UserService {
	
	//Registration Operations
	public Map<Integer,String> findCountries();
	
	public Map<Integer,String> findStates(Integer CountryId);
	
	public Map<Integer, String> findCities(Integer StateId);
	
	public Boolean isEmailUnique(String emailId);
	
	//it gives error after passing parameter UserMaster um
	public Boolean saveUser(String user);
	
	// Login Operations
	public String LoginCheck(String email,String pws);
	
	//unlock account operations
	public boolean isTempPwdValid(String email,String tempPwd);
	
	public boolean UnlockAccount(String email,String newPwd);
	
	//forgot password
	public String forgotPwd(String email);
	
	
}
