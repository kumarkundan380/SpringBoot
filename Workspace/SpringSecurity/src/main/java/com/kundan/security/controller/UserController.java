package com.kundan.security.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.kundan.security.model.User;
import com.kundan.security.repository.UserRepository;

@RestController
@RequestMapping("/user")
public class UserController {
	
	@Autowired
	private UserRepository userRepository;
	
	@Autowired
	private BCryptPasswordEncoder bCryptPasswordEncoder;
	
	@PostMapping("/add")
	User addUser(@RequestBody User user) {
		
		String password=user.getPassword();
		String passwordEndoder=bCryptPasswordEncoder.encode(password);
		user.setPassword(passwordEndoder);
		return userRepository.save(user);
	}

}
