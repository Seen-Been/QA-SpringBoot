package com.example.types;

import org.springframework.stereotype.Component;
import com.example.interfaces.Engine;

@Component("RenaultEngine")
public class RenaultEngine implements Engine
{
	public String type()
	{
		return "Renault engine";
	}
}
