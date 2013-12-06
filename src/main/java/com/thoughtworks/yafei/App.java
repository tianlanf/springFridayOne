package com.thoughtworks.yafei;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        ApplicationContext context = new ClassPathXmlApplicationContext("applicationContextSpringFridayOne.xml");
        CustomerService customerService = (CustomerService) context.getBean("customerService");
        System.out.println(customerService.toString());
    }
}
