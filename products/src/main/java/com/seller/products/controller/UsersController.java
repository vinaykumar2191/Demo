package com.seller.products.controller;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.seller.products.entity.Users;
import com.seller.products.service.UsersService;

@Controller
@RequestMapping("/app")
public class UsersController {
	
	@Autowired
	private UsersService userservice;
	
	@GetMapping("/home_page")
	public String home() {
		
		return "home";
	}
	
	@GetMapping("/reg")
	public String showReg(Model model) {
		model.addAttribute("users", new Users());
		return "registration";
	}
	
	@PostMapping("/reg")
	public String register( @ModelAttribute Users user, Model model) {
		userservice.registerUser(user);
		return "Login";
	}
	
	@GetMapping("/user/{id}")
	public ResponseEntity<Users> getUserById(@PathVariable Long id) {
        Users user = userservice.getUserById(id);
        return ResponseEntity.ok(user);
    }
	
	@GetMapping("/login")
	public String showLogin(Model model) {
		model.addAttribute("users", new Users());
		return "home";
	}
}
