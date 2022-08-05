package com.qa.springstarterexample;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class AppConfig //should contain all beans
{
	@Bean
    String greetingMethod()
    {
        return "Hello world!";
    }

    @Bean
    String book()
    {
        return "Tell me your dreams";
    }
}
