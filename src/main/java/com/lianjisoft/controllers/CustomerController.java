package com.lianjisoft.controllers;

import com.lianjisoft.entities.Customer;
import com.lianjisoft.services.CustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * Customer controller.
 */
@Controller
public class CustomerController {

    private CustomerService customerService;

    @Autowired
    public void setCustomerService(CustomerService customerService) {
        this.customerService = customerService;
    }

    /**
     * List all customers.
     *
     * @param model
     * @return
     */
    @RequestMapping(value = "/account", method = RequestMethod.GET)
    public String accountView(Model model) {
        model.addAttribute("customers", customerService.listAllCustomers());
        return "account";
    }

    /**
     * List all customers.
     *
     * @param model
     * @return
     */
    @RequestMapping(value = "/customers", method = RequestMethod.GET)
    public String list(Model model) {
        model.addAttribute("customers", customerService.listAllCustomers());
        return "customers";
    }

    /**
     * View a specific customer by its id.
     *
     * @param id
     * @param model
     * @return
     */
    @RequestMapping("customer/{id}")
    public String showCustomer(@PathVariable Integer id, Model model) {
        model.addAttribute("customer", customerService.getCustomerById(id));
        return "customershow";
    }

    @RequestMapping("customer/edit/{id}")
    public String edit(@PathVariable Integer id, Model model) {
        model.addAttribute("customer", customerService.getCustomerById(id));
        return "customerform";
    }

    /**
     * New customer.
     *
     * @param model
     * @return
     */
    @RequestMapping("customer/new")
    public String newCustomer(Model model) {
        model.addAttribute("customer", new Customer());
        return "customerform";
    }

    /**
     * Save customer to database.
     *
     * @param customer
     * @return
     */
    @RequestMapping(value = "customer", method = RequestMethod.POST)
    public String saveCustomer(Customer customer) {
        customerService.saveCustomer(customer);
        return "redirect:/customer/" + customer.getId();
    }

    /**
     * Delete customer by its id.
     *
     * @param id
     * @return
     */
    @RequestMapping("customer/delete/{id}")
    public String delete(@PathVariable Integer id) {
        customerService.deleteCustomer(id);
        return "redirect:/customers";
    }

}
