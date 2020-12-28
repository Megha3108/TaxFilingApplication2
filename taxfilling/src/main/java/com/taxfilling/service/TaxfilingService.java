package com.taxfilling.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.taxfilling.dao.Adminrepository;
import com.taxfilling.dao.CustomerRepository;
import com.taxfilling.dao.EmployerRepository;
import com.taxfilling.dao.Representativerepository;
import com.taxfilling.entity.Admin;
import com.taxfilling.entity.Customer;
import com.taxfilling.entity.Employer;
import com.taxfilling.entity.Representative;

@Service
public class TaxfilingService implements ServiceInterface {
	@Autowired
	CustomerRepository td;
	EmployerRepository ed;
	Representativerepository rd;
	Adminrepository ad;
	public int registercustomer(Customer c) {
	 td.save(c);
		return 1;
	}
	public int registerEmployer(Employer e) {
		ed.save(e);
		return 1;
	}
	public int registerRepresentative(Representative r) {
		rd.save(r);
		return 1;
	}
	public int registerAdmin(Admin a) {
		ad.save(a);
		return 1;
	}
	
	 

}
