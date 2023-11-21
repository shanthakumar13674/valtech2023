package com.mitacho.projects.compositekey.demo.entites;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Product {
	
	@Id @GeneratedValue(strategy = GenerationType.IDENTITY)
	private long id;
	private String name;
	private long avalableQuantity;
	private double price;
	
	public Product() {}
	public Product(String name, long avalableQuantity, double price) {
		this.name = name;
		this.avalableQuantity = avalableQuantity;
		this.price = price;
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
	public long getAvalableQuantity() {
		return avalableQuantity;
	}
	public void setAvalableQuantity(long avalableQuantity) {
		this.avalableQuantity = avalableQuantity;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
}
