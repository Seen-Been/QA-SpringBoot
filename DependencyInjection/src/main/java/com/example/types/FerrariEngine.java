package com.example.types;

import org.springframework.stereotype.Component;
import com.example.interfaces.Engine;

@Component("FerrariEngine")
public class FerrariEngine implements Engine
{
	public String type()
	{
		return "Ferrari engine";
	}
}
