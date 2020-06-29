package com.oldBookStore.demo.serviceImpl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.oldBookStore.demo.model.UserDetails;
import com.oldBookStore.demo.repository.UserDetailRepository;
import com.oldBookStore.demo.service.OldBookStoreServices;

@Service
public class OldBookStoreServiceImpl implements OldBookStoreServices{
	@Autowired
	UserDetailRepository userDetailRepository;
	@Override
	public UserDetails createUser(UserDetails userDetail) {
		userDetailRepository.save(userDetail);
		return userDetail;
	}
}
