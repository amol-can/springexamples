package com.mdsol.springdemo;

public class SamplePojo {

    private String name;
    private String role;

    public void setName(String name){
        this.name = name;
    }

    public SamplePojo(String role) {
        System.out.println("*** Inside SamplePojo constructor ***");
        this.role = role;
    }

    public String getGreeting() {
        return "Hello, well come to spring world: "+ name + "-"+ role ;
    }
}
