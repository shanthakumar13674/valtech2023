package com.mitacho.projects.compositekey.demo.entites;

import java.io.Serializable;

import javax.persistence.Embeddable;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

@Embeddable
public class OrderDetailId implements Serializable {
	
	@ManyToOne(targetEntity = Order.class)
	@JoinColumn(name="order_id",referencedColumnName = "id")
	private Order order;
	@ManyToOne(targetEntity = Product.class)
	@JoinColumn(name="product_id",referencedColumnName = "id")
	private Product product;
	
	public OrderDetailId() {}
	public OrderDetailId(Order order, Product product) {
		this.order = order;
		this.product = product;
	}

	public Order getOrder() {
		return order;
	}
	public void setOrder(Order order) {
		this.order = order;
	}
	public Product getProduct() {
		return product;
	}
	public void setProduct(Product product) {
		this.product = product;
	}
}
