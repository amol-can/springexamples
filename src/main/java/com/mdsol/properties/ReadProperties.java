package com.mdsol.properties;

import java.util.Properties;
import java.util.Set;

public class ReadProperties {

    private Properties driver;

    public void setDriver(Properties driver){
        this.driver = driver;
    }

    public void printDriverData(){
        Set keys = driver.keySet();
        for (Object key:keys) {
            System.out.println(key+":"+driver.getProperty(key.toString()));
        }
    }
}
