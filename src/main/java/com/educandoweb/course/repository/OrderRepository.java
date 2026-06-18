package com.educandoweb.course.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.educandoweb.course.entites.Order;
//jpa gera o codigo automaticamente :p
public interface OrderRepository extends JpaRepository<Order, Long> {
	
}
