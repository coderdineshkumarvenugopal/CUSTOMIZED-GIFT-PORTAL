package com.example.demo.Service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.Model.OrderEntity;
import com.example.demo.Repository.OrderRepo;

@Service
public class OrderService{
@Autowired
OrderRepo or;
///to display
public List<OrderEntity> show()
{
	return or.findAll();
}
//to add elements
public List<OrderEntity> add(List<OrderEntity> oe)
{
	return or.saveAll(oe);
}
//to delete element
public String del(OrderEntity oe)
{
	or.delete(oe);
	return "DELETED";
	
}
///to delete by id
public void deleteid(int id)
{
	or.deleteById(id);
}

///get by id
public Optional<OrderEntity> getid(int id)
{
	return or.findById(id);
}

}
