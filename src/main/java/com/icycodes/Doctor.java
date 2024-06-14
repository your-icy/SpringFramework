package com.icycodes;

import jakarta.annotation.PostConstruct;
import org.springframework.beans.factory.BeanNameAware;
import org.springframework.stereotype.Component;


public class Doctor implements Staff, BeanNameAware {
    private String qualification;

    public void isWorking() {
        System.out.println("Doctor is working");
    }

    @Override
    public void setBeanName(String name) {
        System.out.println("set bean name method is called");
    }

    @PostConstruct
    public void postConstruct() {

    }
}
