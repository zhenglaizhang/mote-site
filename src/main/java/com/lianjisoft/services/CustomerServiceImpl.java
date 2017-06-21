package com.lianjisoft.services;

import com.lianjisoft.entities.Customer;
import com.lianjisoft.repositories.CustomerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * Customer service implement.
 */
@Service
public class CustomerServiceImpl implements CustomerService {

    private CustomerRepository customerRepository;

    @Autowired
    public void setCustomerRepository(CustomerRepository customerRepository) {
        this.customerRepository = customerRepository;
    }

    @Override
    public Iterable<Customer> listAllCustomers() {
        return customerRepository.findAll();
    }

    @Override
    public Customer getCustomerById(Integer id) {
        return customerRepository.findOne(id);
    }

    @Override
    public Customer saveCustomer(Customer customer) {
        return customerRepository.save(customer);
    }

    @Override
    public void deleteCustomer(Integer id) {
        customerRepository.delete(id);
    }

}
