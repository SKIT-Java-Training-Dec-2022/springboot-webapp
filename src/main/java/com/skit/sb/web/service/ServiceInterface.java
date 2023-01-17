package com.skit.sb.web.service;

import java.util.List;

import com.skit.sb.web.model.Employee;

public interface ServiceInterface {
	public List<Employee> getAllEmployee();

	public void saveEmployee(Employee emp);
}
