package com.kundan.springsecurity.serviceimpl;

import java.util.List;
import java.util.Optional;

import org.slf4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PathVariable;

import com.kundan.springsecurity.model.Employee;
import com.kundan.springsecurity.repository.EmployeeRepository;
import com.kundan.springsecurity.service.EmployeeService;

@Service
public class EmployeeServiceImpl implements EmployeeService{
	
	@Autowired
	private EmployeeRepository employeeRepository;
	
	public static final Logger LOGGER=org.slf4j.LoggerFactory.getLogger(EmployeeServiceImpl.class);
	
	@Override
	public Employee add(Employee employee) {
		
		LOGGER.info("Add method is call");
		return employeeRepository.save(employee);
	}

	@Override
	public List<Employee> findAll() {
		
		LOGGER.info("FindAll method is call");
		return employeeRepository.findAll();
	}

	@Override
	public Optional<Employee> findById(@PathVariable(value="id")int id) {
		
		LOGGER.info("FindById method is call");
		
		return employeeRepository.findById(id);
	}

	@Override
	public Optional<Employee> update(@PathVariable(value="id")int id, Employee employee) {
		
		LOGGER.info("Update method is call");
		
		Employee emp=new Employee();
		emp.setName(employee.getName());
		emp.setDesignation(employee.getDesignation());
		emp.setEmail(employee.getEmail());
		emp.setSalary(employee.getSalary());
		employeeRepository.save(emp);
		return Optional.of(emp);
	}

	@Override
	public ResponseEntity<Employee> delete(int id) {
		
		LOGGER.info("Delete method is call");
		
		Employee employee=employeeRepository.findById(id).get();
		if(employee==null) {
			return ResponseEntity.notFound().build();
		}
		employeeRepository.delete(employee);
		return ResponseEntity.ok().build();
	}

}
