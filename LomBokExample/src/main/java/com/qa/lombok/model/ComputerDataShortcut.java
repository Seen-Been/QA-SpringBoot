package com.qa.lombok.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@NoArgsConstructor
//@AllArgsConstructor
//@Getter
//@Setter
//@ToString
//@EqualsAndHashCode
@Data	//Includes all of the above commented out shortcuts
public class ComputerDataShortcut
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
	
	public ComputerDataShortcut()
	{
		super();
		// TODO Auto-generated constructor stub
	}
	

	public ComputerDataShortcut(int srNo, String brand, int rAM, int storage, String moBo, float price, int warranty,
			float deliveryCharge, int screenSize, String colour, String series)
	{
		super();
		this.srNo = srNo;
		this.brand = brand;
		RAM = rAM;
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
