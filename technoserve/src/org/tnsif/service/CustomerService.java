package org.tnsif.service;

import java.util.ArrayList;
import java.util.List;

public class CustomerService {

	 private List<Customer> customers;

	    public CustomerService() {
	        this.customer = new ArrayList<>();
	    }

	    public void addCustomer(Customer customer) {
	        customers.add(customer);
	    }

	    public List<Customer> getCustomers() {
	        return customers;
	    }

	    public Customer getCustomerById(int customerId) {
	        return customers.stream().filter(c -> c.getUserId() == customerId).findFirst().orElse(null);
	    }
}
