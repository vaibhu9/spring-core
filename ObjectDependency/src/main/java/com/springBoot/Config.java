package main.java.com.springBoot;

import org.springframework.context.annotation.*;

@Configuration
public class Config {
    @Bean
    public Employee getEmployee(){
        return new Employee();
    }

    @Bean
    public Company getCompany(){
        return new Company();
    }
}
