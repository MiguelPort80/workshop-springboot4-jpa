package com.educandoweb.course.repository;


import org.springframework.data.jpa.repository.JpaRepository;

import com.educandoweb.course.entites.Product;
import com.educandoweb.course.entites.User;
//jpa gera o codigo automaticamente :p
public interface UserRepository extends JpaRepository<User, Long> {
	
}
