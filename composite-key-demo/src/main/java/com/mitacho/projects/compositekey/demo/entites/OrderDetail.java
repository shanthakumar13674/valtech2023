package com.mitacho.projects.compositekey.demo.entites;

import javax.persistence.EmbeddedId;
import javax.persistence.Entity;

@Entity
public class OrderDetail {
	
	@EmbeddedId
	private OrderDetailId id;
	private long quantity;
	private double subTotal;
	
	public OrderDetail() {}
	public OrderDetail(OrderDetailId id, long quantity, double subTotal) {
		this.id = id;
		this.quantity = quantity;
		this.subTotal = subTotal;
	}

	public OrderDetailId getId() {
		return id;
	}
	public void setId(OrderDetailId id) {
		this.id = id;
	}
	public long getQuantity() {
		return quantity;
	}
	public void setQuantity(long quantity) {
		this.quantity = quantity;
	}
	public double getSubTotal() {
		return subTotal;
	}
	public void setSubTotal(double subTotal) {
		this.subTotal = subTotal;
	}
}
