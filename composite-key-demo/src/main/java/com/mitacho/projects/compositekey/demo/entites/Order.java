package com.mitacho.projects.compositekey.demo.entites;

import java.time.LocalDate;
import java.time.LocalDateTime;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="orders")
public class Order {
	
	@Id @GeneratedValue(strategy = GenerationType.IDENTITY)
	private long id;
	private LocalDateTime orderPlacedOn;
	private LocalDateTime orderDeliveredOn;
	private String orderStatus;
	
	public Order() {}
	
	public Order(LocalDateTime orderPlacedOn, LocalDateTime orderDeliveredOn, String orderStatus) {
		this.orderPlacedOn = orderPlacedOn;
		this.orderDeliveredOn = orderDeliveredOn;
		this.orderStatus = orderStatus;
	}

	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public LocalDateTime getOrderPlacedOn() {
		return orderPlacedOn;
	}
	public void setOrderPlacedOn(LocalDateTime orderPlacedOn) {
		this.orderPlacedOn = orderPlacedOn;
	}
	public LocalDateTime getOrderDeliveredOn() {
		return orderDeliveredOn;
	}
	public void setOrderDeliveredOn(LocalDateTime orderDeliveredOn) {
		this.orderDeliveredOn = orderDeliveredOn;
	}
	public String getOrderStatus() {
		return orderStatus;
	}
	public void setOrderStatus(String orderStatus) {
		this.orderStatus = orderStatus;
	}

}
