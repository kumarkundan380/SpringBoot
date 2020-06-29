package com.oldBookStore.demo.repository;

import org.springframework.data.repository.CrudRepository;

import com.oldBookStore.demo.model.UserDetails;

public interface UserDetailRepository  extends CrudRepository<UserDetails,Integer>{

}
