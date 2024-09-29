package com.springlogin.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.springlogin.Repository.ProductRepo;
import com.springlogin.entities.Product;

@Service
public class Productservice {
    
	@Autowired
	private ProductRepo repo;
	
	public Product AddProduct(Product p) {
		return repo.save(p);
		
	}

	public List<Product> getAllProducts() {
		// TODO Auto-generated method stub
		return repo.findAll();
	}

	public Product UpdateProduct(Product P1) {
		// TODO Auto-generated method stub
		return repo.save(P1);
	}

	public void deleteProduct( String id) {
		// TODO Auto-generated method stub
		repo.deleteById(id);
		
	}

	public List<Product> findbyLowerLimit(String id) {
		// TODO Auto-generated method stub
		
		return repo.findAllByIdLessThan(id);
	}

	public List<Product> findbyHigherLimit(String id) {
		// TODO Auto-generated method stub
		return repo.findAllByIdGreaterThan(id);
	}

	public Optional<Product> getById(String id) {
		// TODO Auto-generated method stub
		return repo.findById(id);
	}

	public List<Product> findbyFeature(boolean feature) {
		// TODO Auto-generated method stub
		return repo.findbyFeature(feature);
	}


	
	
	
	
}
