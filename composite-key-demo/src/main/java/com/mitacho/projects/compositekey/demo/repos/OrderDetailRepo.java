package com.mitacho.projects.compositekey.demo.repos;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.mitacho.projects.compositekey.demo.entites.OrderDetail;

@Repository
public interface OrderDetailRepo extends JpaRepository<OrderDetail,Long> {

}
