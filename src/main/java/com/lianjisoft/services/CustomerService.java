package com.lianjisoft.services;

import com.lianjisoft.entities.Customer;

public interface CustomerService {

    Iterable<Customer> listAllCustomers();

    Customer getCustomerById(Integer id);

    Customer saveCustomer(Customer customer);

    void deleteCustomer(Integer id);

}
