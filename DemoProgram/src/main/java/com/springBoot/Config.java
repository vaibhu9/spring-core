package com.springBoot;

import org.springframework.context.annotation.*;

@Configuration
public class Config {
    
    @Bean
    public College college()
    {
        return new College();
    }

}
