package com.example;

//import org.springframework.boot.SpringApplication;
//import org.springframework.boot.autoconfigure.SpringBootApplication;
//import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

//import com.example.cars.Mercedes;
//import com.example.cars.RedBull;
import com.example.interfaces.Car;
import com.example.teams.Ferrari;

//@SpringBootApplication
public class DependencyInjection
{

	public static void main(String[] args)
	{
		//ApplicationContext context = SpringApplication.run(DependencyInjection.class, args);
		
		/*Mercedes m = new Mercedes();
		System.out.println(m.spec());
		RedBull rb = new RedBull();
		System.out.println(rb.spec());*/
		
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class); // Inversion of control in creating new objects
		Car myCar = context.getBean("Mercedes", Car.class);		// Car myCar = new Mercedes(); -injection rather than creation
		Car yourCar = context.getBean(Ferrari.class);			// Car yourCar = new Ferrari(); -injection rather than creation
		Car marksCar = context.getBean("RedBull", Car.class);
		Car jameCar = context.getBean("Alpine", Car.class);
		System.out.println(myCar.spec());
		System.out.println(yourCar.spec());
		System.out.println(marksCar.spec());
		System.out.println(jameCar.spec());
		context.close();
	}

}
