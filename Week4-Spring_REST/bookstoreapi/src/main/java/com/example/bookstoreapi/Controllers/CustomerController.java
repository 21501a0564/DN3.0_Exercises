package com.example.bookstoreapi.Controllers;
import java.util.ArrayList;
import java.util.List;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import com.example.bookstoreapi.Entity.Customer;

@RestController
@RequestMapping("/customers")
public class CustomerController {

    private List<Customer> cl = new ArrayList<>();

    @PostMapping
    public Customer createCustomer(@RequestBody Customer customer) {
        cl.add(customer);
        return customer;
    }
    @PostMapping("/register")
    public Customer registerCustomer(@RequestParam("name") String name,
                                     @RequestParam("email") String email,
                                     @RequestParam("password") String password) {
        Customer customer = new Customer(null, name, email, password);
        cl.add(customer);
        return customer;
    }
    @GetMapping
    public List<Customer> getAllCustomers() {
        return cl;
    }
    @DeleteMapping("/{id}")
    public String deleteCustomer(@PathVariable Long id) {
        for (Customer customer : cl) {
            if (customer.getId().equals(id)) {
                cl.remove(customer);
                return "Customer with ID " + id + " is deleted.";
            }
        }
        return "Customer with ID " + id + " was not found.";
    }


}