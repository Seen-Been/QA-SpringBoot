package com.example;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.example.interfaces.Laptop;

//import org.springframework.boot.autoconfigure.SpringBootApplication;

//@SpringBootApplication
public class SpringStarterAppApplication
{

	public static void main(String[] args)
	{
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);
		Laptop myLaptop = context.getBean("myLenovo", Laptop.class);
		myLaptop.config();
		
		
	}

}
