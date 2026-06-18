package com.educandoweb.course.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.educandoweb.course.entites.OrderItem;
import com.educandoweb.course.entites.pk.OrderItemPK;
//jpa gera o codigo automaticamente :p
public interface OrderItemRepository extends JpaRepository<OrderItem, OrderItemPK> {
	
}
