package com.mdsol.properties;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class PropertiesApp {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("propertiesContext.xml");

        ReadProperties read = (ReadProperties) context.getBean("prop");
        read.printDriverData();
    }
}
