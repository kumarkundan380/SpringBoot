package com.security.service;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

import com.security.model.User;
import com.security.repository.UserRepository;


@Service
public class UserService {
	
	private static final Logger LOGGER=LoggerFactory.getLogger(UserService.class);
	
	@Autowired	
	private UserRepository userRepository;
	
	@Autowired
	private PasswordEncoder bCryptPasswordEncoder;
	 
	public User saveUser(User user) {
		System.out.println(bCryptPasswordEncoder.encode(user.getPassword()));
		LOGGER.info(bCryptPasswordEncoder.encode(user.getPassword()));
		user.setPassword(bCryptPasswordEncoder.encode(user.getPassword()));
		return userRepository.save(user);
	}


}
