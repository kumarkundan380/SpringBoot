package com.kundan.springsecurity.service;

import java.util.List;
import java.util.Optional;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import com.kundan.springsecurity.model.Employee;

public interface EmployeeService {
	
	public Employee add(Employee employee);
	
	public List<Employee> findAll();
	
	public Optional<Employee> findById(@PathVariable(value = "id")int id);
	
	public Optional<Employee> update(@PathVariable(value = "id")int id, Employee employee);
	
	public ResponseEntity<Employee> delete(@PathVariable(value = "id") int id);
	

}
