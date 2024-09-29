package com.springlogin.entities;

import java.util.Date;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class  Product { 
	
	@Id
	private String id;
	
	private String name;
	
	private int price;
	
	private boolean feature;
	
	private double rating;
	
	private Date date;
	
	private String companyname;

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	public boolean isFeature() {
		return feature;
	}

	public void setFeature(boolean feature) {
		this.feature = feature;
	}

	public double getRating() {
		return rating;
	}

	public void setRating(double rating) {
		this.rating = rating;
	}

	public Date getDate() {
		return date;
	}

	public void setDate(Date date) {
		this.date = date;
	}

	public String getCompanyname() {
		return companyname;
	}

	public void setCompanyname(String companyname) {
		this.companyname = companyname;
	}
	
	

	public Product(String id, String name, int price, boolean feature, double rating, Date date, String companyname) {
		super();
		this.id = id;
		this.name = name;
		this.price = price;
		this.feature = feature;
		this.rating = rating;
		this.date = date;
		this.companyname = companyname;
	}

	
	public Product() {
		super();
		// TODO Auto-generated constructor stub
	}

	@Override
	public String toString() {
		return "Product [id=" + id + ", name=" + name + ", price=" + price + ", feature=" + feature + ", rating="
				+ rating + ", date=" + date + ", companyname=" + companyname + "]";
	}
	
	

}
