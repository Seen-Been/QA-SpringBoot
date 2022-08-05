package com.example;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;

@Configuration
public class AppConfig
{
    @Bean
    @Scope("prototype")
    String greeting()
    {
        return "Hello, world";
    }

    @Bean
    @Scope("prototype")
    Book getBook()
    {
        return new Book();
    }

    @Bean
    Flower getFlower()
    {
        return new Flower();
    }
    
    @Bean
    Computer getComputer()
    {
        return new Computer();
    }
}
