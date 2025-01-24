package main.java.com.example;

import org.springframework.context.annotaion.*;

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
