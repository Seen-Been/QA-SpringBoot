package com.qa.myfirstspring;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class MyFirstSpringApplication
{

	public static void main(String[] args)
	{	//provides bean factory methods for accessing app components
		ApplicationContext context = SpringApplication.run(MyFirstSpringApplication.class, args);
		
		Object byName = context.getBean("city");
		Object byName1 = context.getBean("flower");
		
		System.out.println(byName);
		System.out.println(byName1);
	}

}
