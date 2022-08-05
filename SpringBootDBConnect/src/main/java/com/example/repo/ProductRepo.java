package com.example.repo;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;
import com.example.model.Product;

@Repository
public interface ProductRepo extends JpaRepository<Product, Integer> // <Object, Identifier (ID in this case)>
{	//nativeQuery makes it not be considered as a string - as a SQL command instead
	@Query(value = "select * from product where brand =?1", nativeQuery = true) 
	List<Product> findProductByBrand(String brand);
	
	//Better query to the one above
	@Query("select pr from Product pr where pr.name =?1")	//Java Persistence Query Language
	List<Product> findProductByName(String name);			//^treated like class rather than table
}
