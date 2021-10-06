package com.sabi.assessment.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.sabi.assessment.dao.CustomerDAO;
import com.sabi.assessment.model.Customer;
import com.sabi.assessment.service.CustomerService;

@Service
@Transactional
public class CustomerServiceImpl implements CustomerService {

	@Autowired CustomerDAO customerDAO;
	
	@Override
	public void addCustomer(Customer customer) {

		customerDAO.addCustomer(customer);
	}

	@Override
	public void addOrUpdateCustomer(Customer customer) {

		customerDAO.addOrUpdateCustomer(customer);
	}

	@Override
	public void updateCustomer(Customer customer) {

		customerDAO.updateCustomer(customer);
	}

	@Override
	public Customer getCustomerByPk(Long customerId) {

		return customerDAO.getCustomerByPk(customerId);
	}

	@Override
	public List<Customer> getAllCustomer() {

		return customerDAO.getAllCustomer();
	}

	@Override
	public void deleteCustomer(Long customerId) {

		customerDAO.deleteCustomer(customerId);
	}

}
