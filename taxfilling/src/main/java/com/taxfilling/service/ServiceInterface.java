package com.taxfilling.service;

import com.taxfilling.entity.Admin;
import com.taxfilling.entity.Customer;
import com.taxfilling.entity.Employer;
import com.taxfilling.entity.Representative;

public interface ServiceInterface {
	public int registercustomer(Customer c);
	public int registerEmployer(Employer e);
	public int registerRepresentative(Representative r);
	public int registerAdmin(Admin a);
}
