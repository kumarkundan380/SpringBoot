package com.oldBook.Store.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.oldBookStore.demo.model.UserDetails;
import com.oldBookStore.demo.service.OldBookStoreServices;

@RestController
@RequestMapping({"/oldBookStore"})
public class OldBookStoreController {

	@Autowired
	OldBookStoreServices oldBookStoreServices;
	
	@RequestMapping("/add")
	public UserDetails createUser(@RequestBody UserDetails userDetail) {
		System.out.println("aaa gaya.........");
		return  oldBookStoreServices.createUser(userDetail);
	}
	
	
}
