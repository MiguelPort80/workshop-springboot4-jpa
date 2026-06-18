package com.educandoweb.course.repository;


import org.springframework.data.jpa.repository.JpaRepository;

import com.educandoweb.course.entites.Product;
//jpa gera o codigo automaticamente :p
public interface ProductRepository extends JpaRepository<Product, Long> {
	
}
