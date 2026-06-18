package com.educandoweb.course.repository;


import org.springframework.data.jpa.repository.JpaRepository;

import com.educandoweb.course.entites.Category;
//jpa gera o codigo automaticamente :p
public interface CategoryRepository extends JpaRepository<Category, Long> {
	
}
