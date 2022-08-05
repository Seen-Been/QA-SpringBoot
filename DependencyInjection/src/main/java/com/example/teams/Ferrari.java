package com.example.teams;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;
import com.example.interfaces.Car;
import com.example.interfaces.Engine;

@Component("Ferrari") // annotating a class with @Component simply instructs Spring to create a bean of that class at runtime.
public class Ferrari implements Car
{
	@Autowired //defines the exact instance that our class depends on
	@Qualifier("FerrariEngine")
	Engine eng; //new Engine();
	
	public String spec()
	{
		return "This is a Ferrari with a " + eng.type();
	}
}
