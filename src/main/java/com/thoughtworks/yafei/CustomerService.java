package com.thoughtworks.yafei;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CustomerService {
    @Autowired
    private CustomerDao customerDao;

    @Override
    public String toString() {
        return "I am customer service, I have a customer dao. He's name is " + customerDao.toString();
    }
}
