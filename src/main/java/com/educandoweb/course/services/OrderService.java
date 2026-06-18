package com.educandoweb.course.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.educandoweb.course.entites.Order;
import com.educandoweb.course.repository.OrderRepository;

@Service
public class OrderService {
	@Autowired
	private OrderRepository repository;
	//faz injeção automatica com autowired assim
	/*public OrderService(OrderRepository repository) {
		this.repository = repository;
	}
	public OrderService() {}*/

	public List<Order> findAll(){
		return repository.findAll();
	}
	
	public Order findById(Long id) {
		Optional<Order> obj = repository.findById(id);
		return obj.get();
	}
}
