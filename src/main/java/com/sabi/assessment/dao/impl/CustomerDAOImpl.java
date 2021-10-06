package com.sabi.assessment.dao.impl;

import java.util.List;

import javax.persistence.EntityManagerFactory;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.sabi.assessment.dao.CustomerDAO;
import com.sabi.assessment.model.Customer;

@Repository
public class CustomerDAOImpl implements CustomerDAO {

	private SessionFactory sessionFactory;
	
	@Autowired
	public void setSessionFactory(EntityManagerFactory entityManagerFactory){
		sessionFactory = entityManagerFactory.unwrap(SessionFactory.class);
	}

	@Override
	public void addCustomer(Customer customer) {
		sessionFactory.getCurrentSession().save(customer);
	}

	@Override
	public void addOrUpdateCustomer(Customer customer) {
		sessionFactory.getCurrentSession().saveOrUpdate(customer);
	}

	@Override
	public void updateCustomer(Customer customer) {
		sessionFactory.getCurrentSession().update(customer);
	}

	@Override
	public Customer getCustomerByPk(Long customerId) {
		return (Customer) sessionFactory.getCurrentSession().get(Customer.class, customerId);
	}
	
	@Override
	@SuppressWarnings("unchecked")
	public List<Customer> getAllCustomer() {
		return sessionFactory.getCurrentSession().createQuery("FROM Customer").list();
	}
	
	@Override
	public void deleteCustomer(Long customerId) {
		Customer customer = (Customer) sessionFactory.getCurrentSession().load(Customer.class, customerId);
		if (customer != null) {
			this.sessionFactory.getCurrentSession().delete(customer);
		}
	}					
	
}
