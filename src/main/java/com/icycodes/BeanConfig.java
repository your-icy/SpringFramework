package com.icycodes;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan(basePackages = "com.icycodes")
public class BeanConfig {

    @Bean
    public Doctor doctor() {
        return new Doctor();
    }

    @Bean
    public Nurse nurse() {
        return new Nurse();
    }

}
