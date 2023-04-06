package org.example;


import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.util.ArrayList;
import java.util.List;

@Configuration
public class AppConfig {

    @Bean
    public Student getStudent() {
        return new Student(1, "kunhyuk", getPhone(), getAddress());
    }
    @Bean
    public Address getAddress() {
        return new Address("Lawrenceville", "Gwinnett", "GA", "30043");
    }

    @Bean
    public List<Phone> getPhone() {
        List<Phone> returnPhone = new ArrayList<Phone>();

        returnPhone.add(new Phone("4048209338"));
        returnPhone.add(new Phone("99999999"));
        return returnPhone;
    }



}
