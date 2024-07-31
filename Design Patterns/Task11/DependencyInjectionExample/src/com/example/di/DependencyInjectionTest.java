package com.example.di;

public class DependencyInjectionTest {
    public static void main(String[] args) {
        CustomerRepository customerRepository = new CustomerRepositoryImpl();
        CustomerService customerService = new CustomerService(customerRepository);
        String customerDetails = customerService.getCustomerDetails(1);
        System.out.println(customerDetails);
    }
}
