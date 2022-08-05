package com.example;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class SpringStarterAppApplication
{

	public static void main(String[] args)
	{
		ApplicationContext context = SpringApplication.run(SpringStarterAppApplication.class, args);
		Object byName1 = context.getBean("greeting");
		Object byName2 = context.getBean("getBook");
		Object byName3 = context.getBean("getFlower");
		Object byName4 = context.getBean("getComputer");
		
		System.out.println(byName1);
		System.out.println(byName2);
		System.out.println(byName3);
		System.out.println(byName4);
		
		
	}

}
