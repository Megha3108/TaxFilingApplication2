package com.taxfilling.controller;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.taxfilling.entity.Admin;
import com.taxfilling.entity.Customer;
import com.taxfilling.entity.Employer;
import com.taxfilling.entity.Representative;
import com.taxfilling.service.ServiceInterface;

@RestController
public class TaxfilingController {
	@Autowired
private	ServiceInterface ts;
@PostMapping("/registercustomer")
public String registercustomer(@RequestBody Customer c) {	
	String str="Registration unsuccessful";
	int i=ts.registercustomer(c);
	if(i>0) {
		str="Registration successful";
	}
	 
	return str;
	
}
@PostMapping("/registerEmployer")
public String registerEmployer(@RequestBody Employer e) {
	String str="Registration unsuccessful";
	int i=ts.registerEmployer(e);
	if(i>0) {
		str="Registration successful";
	}
	 
	return str;
}
@PostMapping("/registerRepresentative")
public String registerRepresentative(@RequestBody Representative r) {
	String str="Registration unsuccessful";
	int i=ts.registerRepresentative(r);
	if(i>0) {
		str="Registration successful";
	}
	 
	return str;
}
@PostMapping("/registerAdmin")
public String registerAdmin(@RequestBody Admin a) {
	String str="Registration unsuccessful";
	int i=ts.registerAdmin(a);
	if(i>0) {
		str="Registration successful";
	}
	 
	return str;
}
}
