package com.example.controller;

import java.util.List;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import com.example.model.Product;
import com.example.service.ProductService;

@RestController
public class MainController // Each entity requires a controller, routes data to endpoint nodes.
{
	private ProductService service;
	
	public MainController(ProductService service)
	{
		super();
		this.service = service;
	}

	@PostMapping("/create")
	public Product createList(@RequestBody Product pr)
	{
		return this.service.addProd(pr);
	}
	
	@GetMapping("/read") // url extension for products page
	public List<Product> getList()
	{
		return this.service.readProd();
	}
	
	@PutMapping("/update/{id}") // url extension for home page
	public Product updateItem(@PathVariable("id") int id,@RequestBody Product pr)
	{
		//this.list.remove(id); // remove original id at a position
		//this.list.add(id, pr); // added new id at a position
		return this.service.updateProd(id, pr); // reading the id at 3rd position
	}
	
	@DeleteMapping("/delete/{id}") // url extension for home page
	public void deleteItem(@PathVariable int id)
	{
		this.service.deleteProd(id); // remove original id at a position
		// return this.list.get(id); // reading the id at 3rd position
	}
	
	@GetMapping("/readbrand/{brand}") // url extension for products page
	public List<Product> getBrand(@PathVariable String brand)
	{
		return this.service.findProductByBrand(brand);
	}
	
	@GetMapping("/readname/{name}") // url extension for products page
	public List<Product> getName(@PathVariable String name)
	{
		return this.service.findProductByName(name);
	}
	
	/*
	 * @GetMapping("/home") // url extension for home page public String home() {
	 * return "My home"; }
	 */
}
