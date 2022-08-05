package com.example.types;

import org.springframework.stereotype.Component;
import com.example.interfaces.Engine;

@Component("MercedesEngine")
public class MercedesEngine implements Engine
{
	public String type()
	{
		return "Mercedes engine";
	}
}