package com.Springsecurity.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.Springsecurity.model.User;

@Repository
public interface UserRepository extends JpaRepository<User, Integer>{
   
////	Optional<User> findByUserName(String userName);
//	
//	 @Query("SELECT u FROM User u WHERE u.userName = :userName")
//	 public User getUserByUsername(@Param("userName") String userName);
	
	User findByEmail(String email);
	
    User findByUserName(String userName);

}
