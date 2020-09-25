package zars.springframework.springmvcrest.service;

import java.util.List;

import zars.springframework.springmvcrest.domain.Customer;

public interface CustomerService {
	Customer findCustomerById(Long id);

	List<Customer> findAllCustomers();

	Customer saveCustomer(Customer customer);
}
