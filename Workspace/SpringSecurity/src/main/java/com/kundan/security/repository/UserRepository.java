package com.kundan.security.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.kundan.security.model.User;

@Repository
public interface UserRepository extends JpaRepository<User, Integer>{

}
