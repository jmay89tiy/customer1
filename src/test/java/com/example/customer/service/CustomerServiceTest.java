package com.example.customer.service;

import com.example.customer.model.Customer;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.dao.DataIntegrityViolationException;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.ArrayList;
import java.util.List;

@RunWith(SpringRunner.class)
@SpringBootTest
public class CustomerServiceTest {

    @Autowired
    CustomerService customerService;

    @Test
    public void testAddGet() {
        String firstName;
        String lastName;
        String phone;
        String email;


        Customer customer1 = new Customer();
        customer1.setFirstName("Bill");
        customer1.setLastName("Lee");
        customer1.setPhone("803-716-1093");
        customer1.setEmail("email@email.com");
        List<Customer> customers = new ArrayList<>();
        customers.add(customer1);
        Assert.assertNotNull(customer1);

        customers = customerService.get();

        Assert.assertEquals("Bill",customer1.getFirstName());


    }
}