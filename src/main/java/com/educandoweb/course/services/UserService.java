package com.educandoweb.course.services;

import java.sql.SQLIntegrityConstraintViolationException;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.educandoweb.course.entites.User;
import com.educandoweb.course.repository.UserRepository;

import jakarta.persistence.EntityNotFoundException;

@Service
public class UserService {
	@Autowired
	private UserRepository repository;
	
	//faz injeção automatica com autowired assim
	/*public UserService(UserRepository repository) {
		this.repository = repository;
	}
	public UserService() {}*/

	public List<User> findAll(){
		return repository.findAll();
	}
	
	public User findById(Long id) {
		Optional<User> obj = repository.findById(id);
		return obj.orElseThrow( () -> new EntityNotFoundException());
	}
	
	
	public User save(User obj) {
		return repository.save(obj);
	}
	
	public void delete(Long id) throws SQLIntegrityConstraintViolationException {
		
		repository.deleteById(id);
		
	}
	
	private void updateData(User entity, User obj) {
		entity.setName(obj.getName());
		entity.setEmail(obj.getEmail());
		entity.setPhone(obj.getPhone());
	}
	
	public User update(Long id, User obj) {
		User entity = repository.getReferenceById(id);
		updateData(entity, obj);
		return repository.save(entity);
	}

	
	
}
