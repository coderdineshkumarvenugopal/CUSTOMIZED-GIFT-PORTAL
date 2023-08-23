package com.example.demo.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.Model.OrderEntity;

public interface OrderRepo extends JpaRepository<OrderEntity, Integer>
{
	
}
