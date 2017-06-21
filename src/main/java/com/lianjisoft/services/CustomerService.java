package com.lianjisoft.services;

import com.lianjisoft.entities.Customer;

public interface CustomerService {

    Iterable<Customer> listAllCustomers();

    Customer getCustomerById(Integer id);

    Customer updateCustomer(Customer customer);

    Customer saveCustomer(Customer customer);

    void deleteCustomer(Integer id);

}
