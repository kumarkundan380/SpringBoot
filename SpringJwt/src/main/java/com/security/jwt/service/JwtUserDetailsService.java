package com.security.jwt.service;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

import com.security.jwt.model.User;
import com.security.jwt.repository.UserRepository;

@Service
public class JwtUserDetailsService implements UserDetailsService{
	
	@Autowired
	UserRepository userRepository;
	
	@Autowired
	private PasswordEncoder bcryptEncoder;
	
//	@Autowired
//	BCryptPasswordEncoder bcryptEncoder;

	@Override
	public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
		 
		  User user = userRepository.findByUserName(username); 
		 
		  if (!user.getUserName().equals(username)) { 
			  throw new UsernameNotFoundException("User not found with username: " + username); 
		  }
	//	  System.out.println(org.springframework.security.core.userdetails.User(user.getUserName(),user.getPassword(), new ArrayList<>()));
		  return new
		  org.springframework.security.core.userdetails.User(user.getUserName(),
		  user.getPassword(), new ArrayList<>());
//		  return new UserPrinciple(user);
	}
	
	public User save(User user) {
		System.out.println("Save method called");
		User newUser = new User();
		System.out.println(user.getUserName());
		newUser.setUserName(user.getUserName());
		
		System.out.println(bcryptEncoder.encode(user.getPassword()));
		newUser.setPassword(bcryptEncoder.encode(user.getPassword()));
		
		return userRepository.save(newUser);
	}

}
