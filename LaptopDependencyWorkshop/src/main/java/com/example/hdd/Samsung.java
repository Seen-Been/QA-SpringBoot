package com.example.hdd;

import org.springframework.stereotype.Component;

import com.example.interfaces.HardDisk;

@Component("hddSamsung")
public class Samsung implements HardDisk
{
	public String storage()
	{
		return ("This HDD has a write speed of 6MB/s");
	}
}
