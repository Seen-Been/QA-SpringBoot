package com.qa.lombok.model;

import lombok.AllArgsConstructor;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@NoArgsConstructor //LomBom can create problems for testing. They should be disabled for it.
@AllArgsConstructor
@Getter
@Setter
@ToString
@EqualsAndHashCode
public class Computer
{
	public int srNo;
	public String brand;
	public int RAM;
	public int storage;
	public String moBo;
	public float price;
	public int warranty;
	public float deliveryCharge;
	public int screenSize;
	public String colour;
	public String series;
	
	public Computer()
	{
		super();
	}
	

	public Computer(int srNo, String brand, int RAM, int storage, String moBo, float price, int warranty,
			float deliveryCharge, int screenSize, String colour, String series)
	{
		super();
		this.srNo = srNo;
		this.brand = brand;
		this.RAM = RAM;
		this.storage = storage;
		this.moBo = moBo;
		this.price = price;
		this.warranty = warranty;
		this.deliveryCharge = deliveryCharge;
		this.screenSize = screenSize;
		this.colour = colour;
		this.series = series;
	}
	
	
	
	
}
