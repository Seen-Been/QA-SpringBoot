package com.example.types;

import org.springframework.stereotype.Component;
import com.example.interfaces.Engine;

@Component("HondaEngine")
public class HondaEngine implements Engine
{
	public String type()
	{
		return "Honda engine";
	}
}
