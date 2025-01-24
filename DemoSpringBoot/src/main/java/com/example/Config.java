package com.example;
import org.springframework.context.annotation.*;
import org.springframework.context.annotation.Bean;

@Configuration
public class Config {
    
    @Bean
    public Student student(){
        return new Student();
    }

    @Bean
    public College college(){
        return new College();
    }
}
