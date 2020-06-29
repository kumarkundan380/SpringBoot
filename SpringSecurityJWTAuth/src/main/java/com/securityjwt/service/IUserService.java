package com.securityjwt.service;

import com.securityjwt.entity.User;

public interface IUserService {

	public Integer saveUser(User user);
	
	public User findByUsername(String username);
}
