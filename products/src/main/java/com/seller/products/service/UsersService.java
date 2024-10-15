package com.seller.products.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.seller.products.entity.Users;
import com.seller.products.repository.UsersRepository;

import io.github.resilience4j.circuitbreaker.annotation.CircuitBreaker;

@Service
public class UsersService {
	
	@Autowired
	private UsersRepository user_repo;
	
	
	public void registerUser(Users user) {
		user_repo.save(user);
	}
	@CircuitBreaker(fallbackMethod="fallback", name="products")
	public Users getUserById(Long id) {
		for(int i=0; i<15; i++) {
			if(i>10) {
				throw new RuntimeException("Failed");
			}
		}
		return null;
	}
	
	public Users fallback(Exception ex) {
		return new Users();
	}
}
