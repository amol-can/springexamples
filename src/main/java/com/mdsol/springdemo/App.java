package com.mdsol.springdemo;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;

public class App {
    public static void main(String[] args) {
        // find xml
        //Resource resource = new ClassPathResource("applicationContext.xml");
        // load xml into container
        //BeanFactory factory = new XmlBeanFactory(resource);
        ApplicationContext factory = new ClassPathXmlApplicationContext("applicationContext.xml");

        // create sample class object
        Object obj = factory.getBean("sample");
        Object obj2 = factory.getBean("sample");

        // check scope (Singletone/Prototype)
        System.out.println(obj==obj2);

        SamplePojo pojo = (SamplePojo) obj;
        System.out.println(pojo.getGreeting());
        //ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");

    }
}
