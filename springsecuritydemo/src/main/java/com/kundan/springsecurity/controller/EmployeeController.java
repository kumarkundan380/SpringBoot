package com.kundan.springsecurity.controller;

import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.kundan.springsecurity.exception.ResourceNotFoundException;
import com.kundan.springsecurity.model.Employee;
import com.kundan.springsecurity.service.EmployeeService;

@RestController
@CrossOrigin(origins = "http://localhost:4200")
@RequestMapping("/employee")
public class EmployeeController {

	@Autowired
	private EmployeeService employeeService;
	
	/* To save a employee*/
	@PostMapping("/add")
	public Employee add(@RequestBody Employee employee){
		return employeeService.add(employee);
	}
	
	/* Get all employee */
	@GetMapping("/findAll")
	public List<Employee> findAll(){
		return employeeService.findAll();
	}
	
	/* Get a employee by id*/
	@GetMapping("/fetch/{id}")
	public Employee employeeByIds(@PathVariable(value = "id")int id)throws ResourceNotFoundException {
		return employeeService.findById(id).orElseThrow(() -> new ResourceNotFoundException("User not found :: " + id));
	}
	
	/* Update a employee by id*/
	@PutMapping("/update/{id}")
	public Employee updateEmployee(@PathVariable(value = "id") int id, @Valid @RequestBody Employee employee) throws ResourceNotFoundException {
		return employeeService.update(id,employee).orElseThrow(() -> new ResourceNotFoundException("User not found :: " + id));
	}
	
	/* Delete a employee by id*/
	@DeleteMapping("/delete/{id}")
	public ResponseEntity<Employee> deleteEmployeeById(@PathVariable(value = "id") int id){
		return employeeService.delete(id);
	}
	
	
}
