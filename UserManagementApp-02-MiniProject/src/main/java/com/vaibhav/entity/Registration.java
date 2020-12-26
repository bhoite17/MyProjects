package com.vaibhav.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

import org.springframework.stereotype.Repository;

import lombok.Data;

@Data
@Entity

public class Registration {
	@Id
	@Column(name="First_Name")
	private String fname;
	@Column(name="Last_Name")
	private String lname;
	@Column(name="Email")
	private String email;
	@Column(name="Phone_No")
	private Long phoneNo;
	@Column(name="DOB")
	private String dob;
	@Column(name="Gender")
	private String gender;
	@Column(name="Country")
	private String country;
	@Column(name="State")
	private String state;
	@Column(name="City")
	private String city;
	@Column(name="Password")
	private String password;
	@Column(name="Acc_Status")
	private String Acc_Status;

}
