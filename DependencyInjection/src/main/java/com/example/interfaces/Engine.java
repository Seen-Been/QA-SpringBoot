package com.example.interfaces;

import org.springframework.stereotype.Component;

@Component 						// Configuration classes are used to create beans, conventionally called AppConfig,
public interface Engine				// if you want to have a bean dependent on another bean you MUST define it inside
{								// of a configuration class.
	
	public String type();
}
