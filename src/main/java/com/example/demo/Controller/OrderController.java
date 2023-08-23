package com.example.demo.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.Model.OrderEntity;
import com.example.demo.Service.OrderService;

@RestController
public class OrderController {

	@Autowired
	OrderService os;
	
	@GetMapping("orders")
	public List<OrderEntity> showord()
	{
		return os.show();
	}
	
	@PostMapping("neworder")
	public List<OrderEntity> postord(@RequestBody List<OrderEntity> oe)
	{ 
		return os.add(oe);
	}
	
	@DeleteMapping("deleteorder/{id}")
	public String deleteord(@PathVariable int id)
	{
		os.deleteid(id);
		return "order_id : "+id+" is cancelled SuccesFully";
	}
}