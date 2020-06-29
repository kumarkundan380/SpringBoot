package com.security.jwt.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.security.jwt.dao.UserDTO;

@Repository
public interface UserRepository extends JpaRepository<UserDTO, Integer>{
	
//	User findByEmail(String name);
//	
//	boolean	existsByEmail(String name);
	UserDTO findByUserName(String username);

}
