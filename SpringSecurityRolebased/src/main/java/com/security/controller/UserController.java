package com.security.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.security.model.User;
import com.security.service.UserService;

@RestController
@RequestMapping
public class UserController {
	
	@Autowired
	private UserService userService;
	
	@GetMapping("/")
	public String message() {
		return "This is for All";
	}
	
	@PostMapping("/register")
	public User saveUser(User user) {
		return userService.saveUser(user);
	}
	
	@GetMapping("/user")
	public String user() {
		return "This is user";
	}
	
	@GetMapping("/admin")
	public String admin() {
		return "This is admin";
	}

}
