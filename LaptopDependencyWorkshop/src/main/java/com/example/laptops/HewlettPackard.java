package com.example.laptops;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

import com.example.interfaces.HardDisk;
import com.example.interfaces.Laptop;

@Component("myHP")
public class HewlettPackard implements Laptop
{
	@Autowired
	@Qualifier("hddSamsung")
	HardDisk hdd;
	
	public void config()
	{
		System.out.println("A HP laptop with " + hdd.storage());
	}
}
