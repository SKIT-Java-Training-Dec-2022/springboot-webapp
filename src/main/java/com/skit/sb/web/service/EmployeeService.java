package com.skit.sb.web.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.skit.sb.web.model.Employee;
import com.skit.sb.web.repository.EmployeeRepository;


@Service("employeeService")
public class EmployeeService {
	
	@Autowired
	private EmployeeRepository employeeRepository;
	
	public List<Employee> getAllEmployee(){
		List<Employee> employees = (List<Employee>) employeeRepository.findAll();
		return employees;
	}

	public void saveEmployee(Employee emp) {
		employeeRepository.save(emp);
	}

}
