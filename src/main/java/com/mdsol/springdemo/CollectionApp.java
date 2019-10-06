package com.mdsol.springdemo;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class CollectionApp {
    public static void main(String[] args) {

        ApplicationContext context = new ClassPathXmlApplicationContext("collectionContext.xml");
        Object obj = context.getBean("collectionPojo");

        System.out.println(obj.toString());

    }
}
