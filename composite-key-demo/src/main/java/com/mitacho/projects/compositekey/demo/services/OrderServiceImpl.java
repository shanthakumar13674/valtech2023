package com.mitacho.projects.compositekey.demo.services;

import java.time.LocalDateTime;

import javax.annotation.PostConstruct;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.mitacho.projects.compositekey.demo.entites.Order;
import com.mitacho.projects.compositekey.demo.entites.OrderDetail;
import com.mitacho.projects.compositekey.demo.entites.OrderDetailId;
import com.mitacho.projects.compositekey.demo.entites.Product;
import com.mitacho.projects.compositekey.demo.repos.OrderDetailRepo;
import com.mitacho.projects.compositekey.demo.repos.OrderRepo;
import com.mitacho.projects.compositekey.demo.repos.ProductRepo;

@Service
public class OrderServiceImpl {

	@Autowired
	private OrderRepo orderRepo;
	@Autowired
	private ProductRepo productRepo;
	@Autowired
	private OrderDetailRepo orderDetailRepo;
	
	@PostConstruct
	public void populateData()	{
		Product macbookPro = productRepo.save(new Product("Macbook Pro",20,199999));
		Product macbook = productRepo.save(new Product("Macbook",12,149999));
		Product iphone15 = productRepo.save(new Product("IPhone 15",50,99999));
		Product iphone15Pro = productRepo.save(new Product("IPhone 15 Pro",90,129999));
		LocalDateTime dt = LocalDateTime.of(2023,11,21,5, 12);
		Order order = orderRepo.save(new Order(dt,dt,"New"));
		Order order1 = orderRepo.save(new Order(dt,dt,"Delivered"));
		orderDetailRepo.save(new OrderDetail(new OrderDetailId(order,macbook),1,149999));
		orderDetailRepo.save(new OrderDetail(new OrderDetailId(order,macbookPro),1,199999));
		orderDetailRepo.save(new OrderDetail(new OrderDetailId(order1,macbook),1,149999));
		orderDetailRepo.save(new OrderDetail(new OrderDetailId(order1,macbookPro),1,199999));
		orderDetailRepo.save(new OrderDetail(new OrderDetailId(order1,iphone15),1,99999));
//		orderRepo.save(new Order)
	}
	
}
