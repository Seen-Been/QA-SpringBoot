package com.example.service;

//import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;

import com.example.exception.ProductNotFoundException;
import com.example.model.Product;
import com.example.repo.ProductRepo;

@Service // Service layer to organise methods
public class ProductService
{
	private ProductRepo repo;
	
	//public List<Product> list = new ArrayList();
	
	public ProductService(ProductRepo repo) //constructor for repository. shortens CRUD method length.
	{
		super();
		this.repo = repo;
	}
	
	public Product addProd(Product pr)
	{
		//this.list.add(pr);
		//return this.list.get(list.size()-1);
		return this.repo.save(pr);
	}
	
	public List<Product> readProd()
	{
		//return this.list;
		return this.repo.findAll();
	}
	
	public Product updateProd(int id, Product pr)
	{
		//this.list.remove(id); // remove original id at a position
		//this.list.add(id, pr); // added new id at a position
		//return this.list.get(id); // reading the id at 3rd position
		//Optional<Product> tempProduct = this.repo.findById(id);
		Product temp = this.repo.findById(id).orElseThrow(ProductNotFoundException::new);
		Optional<Product> tempProduct = Optional.of(temp);
		Product existing = tempProduct.get();
		//existing.setId(pr.getId()); //primary key should not be changed
		existing.setName(pr.getName());
		existing.setBrand(pr.getBrand());
		return this.repo.save(existing);
	}
	
	public boolean deleteProd(int id)
	{
		//this.list.remove(id); // remove original id at a position
		this.repo.deleteById(id);
		boolean exists = this.repo.existsById(id);
		return !exists;
	}
	
	public List<Product> findProductByBrand(String brand)
	{
		//return this.list;
		return this.repo.findProductByBrand(brand);
	}
	
	public List<Product> findProductByName(String name)
	{
		return this.repo.findProductByName(name);
	}
	
}
