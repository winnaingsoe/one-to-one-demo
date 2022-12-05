package com.example.onetoonedemo.service;

import com.example.onetoonedemo.dao.AddressDao;
import com.example.onetoonedemo.dao.CustomerDao;
import com.example.onetoonedemo.ds.Address;
import com.example.onetoonedemo.ds.Customer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CustomerService {

    @Autowired
    private CustomerDao customerDao;
    @Autowired
    private AddressDao addressDao;


    public void createDb() {
        Customer c1 = new Customer("John", "Doe", "john@gmail.com");
        Customer c2 = new Customer("Thomas", "Hardy", "thomas@gmail.com");
        Customer c3 = new Customer("John", "Willia", "william@gmail.com");

        Address address1 = new Address("Love Lane", "1111", "Yangon");
        Address address2 = new Address("Dream Land", "2222", "Mandalay");
        Address address3 = new Address("Strand Road", "3333", "Yangon");

        c1.setAddress(address1);
        c2.setAddress(address2);
        c3.setAddress(address3);

        addressDao.save(address1);
        addressDao.save(address2);
        addressDao.save(address3);

        customerDao.save(c1);
        customerDao.save(c2);
        customerDao.save(c3);



    }
}
