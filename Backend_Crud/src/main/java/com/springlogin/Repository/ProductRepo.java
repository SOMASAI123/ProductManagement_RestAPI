package com.springlogin.Repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.springlogin.entities.Product;

@Repository
public interface ProductRepo extends JpaRepository<Product, String>{
   
	 @Query("SELECT p FROM Product p WHERE p.id < :id")
	    List<Product> findAllByIdLessThan(String id);
	
	 @Query("SELECT p FROM Product p WHERE p.id > :id")
	    List<Product> findAllByIdGreaterThan(String id);
	   
	 @Query("SELECT p FROM Product p WHERE p.feature = true")
	    List<Product> findbyFeature(boolean feature);
}
