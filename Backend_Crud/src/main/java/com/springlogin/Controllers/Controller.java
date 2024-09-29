package com.springlogin.Controllers;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.springlogin.entities.Product;
import com.springlogin.service.Productservice;

@RestController
public class Controller {
    
	@Autowired
	private Productservice service;
	
	@PostMapping("/add")
	public Product AddProduct(@RequestBody Product p)
	{
	  return  service.AddProduct(p);
	
	}
	
	@GetMapping("/find")
	public List<Product> getAllProducts()
	{
		return service.getAllProducts();
	}
	
	@GetMapping("/get/{id}")
	public Optional<Product> getById(@PathVariable("id") String id)
	{
		return service.getById(id);
	}
	
	@PutMapping("/update/{id}")
	public Product UpdateProduct(@PathVariable("id") int id,@RequestBody Product p)
	{
		return service.UpdateProduct(p);
	
	}
	
	@DeleteMapping("/delete/{id}")
	public void deleteProduct(@PathVariable("id") String id )
	{
	    service.deleteProduct(id);
	}
	
	@GetMapping("/find/{limit}")
	public List<Product> findbyLowerLimit(@PathVariable("limit") String limit)
	{
	    return service.findbyLowerLimit(limit);
	
	}
	
	@GetMapping("/findby/{limit}")
	public List<Product> findbyHigherLimit(@PathVariable("limit") String limit)
	{
	       return service.findbyHigherLimit(limit);
	
	}
	
	@GetMapping("/getfeature/{feature}")
	public List<Product> findbyFeature(@PathVariable("feature") boolean feature )
	{
		return service.findbyFeature(feature);
	}
}
