package com.swiftacad.entity;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;

@Entity
public class Shop {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private long id;
	
	private String name;
	
	@OneToMany(mappedBy = "shop")

	private List<Product> products;

	
	public Shop() {
		super();
		// TODO Auto-generated constructor stub
	}


	public Shop(long id, String name, List<Product> products) {
		super();
		this.id = id;
		this.name = name;
		this.products = products;
	}


	public long getId() {
		return id;
	}


	public void setId(long id) {
		this.id = id;
	}


	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public List<Product> getProducts() {
		return products;
	}


	public void setProducts(List<Product> products) {
		this.products = products;
	}
	
	
}
