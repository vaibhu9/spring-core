package main.java;

import java.beans.BeanProperty;

import main.java.springboot.Employee;

@Configuration
public class Config {
    @Bean
    public Employee employee(){
        return new Employee();
    }

    @Bean
    public Company company(){
        return new Employee();
    }
}
