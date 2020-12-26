package com.vaibhav.service;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.vaibhav.repository.CityRepository;
import com.vaibhav.repository.CountryRepository;
import com.vaibhav.repository.StateRepository;
import com.vaibhav.repository.UserRepository;

@Service
public class UserServicesImpl implements UserService {
	
	@Autowired
	private UserRepository userRepo;
	
	@Autowired
	private CountryRepository countryRepo;
	
	@Autowired
	private StateRepository stateRepo;
	
	@Autowired
	private CityRepository cityRepo;

	@Override
	public Map<Integer, String> findCountries() {
		List<Country> countryList=countryRepo.findAll();
		Map<Integer,String> countries=new HashMap<>();
		countryList.forEach(country ->{
			countries.put(country.getCountryId(),country.getCountryName());
		});
		return countries;
	}

	@Override
	public Map<Integer, String> findStates(Integer CountryId) {
		Map<Integer,String> states=new HashMap<>();
		List<state> stateList=stateRepo.findByCountryId(CountryId);
		stateList.forEach(state->{states.put(state.getStateId(),state.getStateName());});
		return states;
	}

	@Override
	public Map<Integer, String> findCities(Integer StateId) {
		Map<Integer,String> cities=new HashMap<>();
		List<city> cityList=cityRepo.findByCountryId(StateId);
		cityList.forEach(city->{city.put(city.getCityId(),city.getCityName());});
		
		return cities;
	}

	@Override
	public Boolean isEmailUnique(String emailId) {
		User userDetails= userRepo.findByEmailId(emailId);
		return userDetails.getUserId()==null;
	}

	@Override
	public String LoginCheck(String email, String pws) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public boolean isTempPwdValid(String email, String tempPwd) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean UnlockAccount(String email, String newPwd) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public String forgotPwd(String email) {
		// TODO Auto-generated method stub
		return null;
	}

}
