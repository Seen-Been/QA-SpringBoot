package com.example;

import java.util.Date;

import javax.validation.constraints.Max;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Pattern;
import javax.validation.constraints.Size;

public class Computer // can be mapped to table in MySQL
{
	@Size(min = 4, max = 15) // atributes of the string
	private String brand;
	
	@Max(2)
	private int warranty;
	
	@Min(8)
	@NotNull
	private int minRam;
	
	@NotNull
	@Pattern(regexp = "^(0[1-9]|1[012])[-/.](0[1-9]|[12][0-9]|3[01])[-/.](19|20)\\\\d\\\\d$")
	private Date dateOfDelivery;

	@Override
	public String toString()
	{
		return "Computer [brand=" + brand + ", warranty=" + warranty + ", minRam=" + minRam + ", dateOfDelivery="
				+ dateOfDelivery + "]";
	}
}
