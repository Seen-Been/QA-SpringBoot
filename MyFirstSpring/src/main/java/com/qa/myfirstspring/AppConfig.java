package com.qa.myfirstspring;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration		//<--important, do not forget to add
public class AppConfig //AppConfig should contain all beans
{
	@Bean
	String city()
	{
		return "New York";
	}
	
	@Bean
	String flower()
	{
		return "Rose";
	}
}
