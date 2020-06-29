package com.Springsecurity.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.Springsecurity.model.User;
import com.Springsecurity.service.UserService;

@RestController
@RequestMapping
public class UserController {
	
	private static final Logger LOGGER=LoggerFactory.getLogger(UserController.class);
	
	@Autowired
	private UserService userService;
	
	@GetMapping("/")
	public String message() {
		LOGGER.info("User / Controller is calling.... ");
		return "This is for All";
	}
	
	@PostMapping("/register")
	public User saveUser(User user) {
		LOGGER.info("User saveUser Controller is calling.... ");
		return userService.saveUser(user);
	}
	
	@GetMapping("/user")
	public String user() {
		LOGGER.info("User /user Controller is calling.... ");
		return "This is user";
	}
	
	@GetMapping("/admin")
	public String admin() {
		LOGGER.info("User /admin Controller is calling.... ");
		return "This is admin";
	}
	

}
