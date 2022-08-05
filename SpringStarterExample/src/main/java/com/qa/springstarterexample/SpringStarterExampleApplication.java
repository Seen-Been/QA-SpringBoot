package com.qa.springstarterexample;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class SpringStarterExampleApplication
{

	public static void main(String[] args)
	{	//provides bean factory methods for accessing app components
		ApplicationContext context = SpringApplication.run(SpringStarterExampleApplication.class, args);
		
		Object byName = context.getBean("greetingMethod");
		//String byType = context.getBean(String.class);
		//String byBoth = context.getBean("greetingMethod", String.class);
		System.out.println(byName);
		//System.out.println(byType);
		//System.out.println(byBoth);
		
		Object byName1 = context.getBean("book");
		//String byType1 = context.getBean(String.class);
		//String byBoth1 = context.getBean("book", String.class);
		System.out.println(byName1);
		//System.out.println(byType1);
		//System.out.println(byBoth1);
	}
}
