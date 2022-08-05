package com.example.laptops;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

import com.example.interfaces.HardDisk;
import com.example.interfaces.Laptop;

@Component("myLenovo")
public class Lenovo implements Laptop
{
	@Autowired
	@Qualifier("hddHitachi")
	HardDisk hdd;
	
	public void config()
	{
		System.out.println("A Lenovo laptop with " + hdd.storage());
	}
}
