package com.example;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan("com.example") //check target package for classes tagged with @Component
public class AppConfig
{
	/*@Bean("Mercedes")		//Singleton design pattern instead of @Component("Mercedes")
	 * public Mercedes merc()
	 * {
	 * 		return new Mercedes();
	 * }
	 */
}
