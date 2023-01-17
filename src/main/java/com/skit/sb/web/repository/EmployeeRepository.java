package com.skit.sb.web.repository;

import org.springframework.data.repository.CrudRepository;

import com.skit.sb.web.model.Employee;

public interface EmployeeRepository extends CrudRepository<Employee, Integer> {

}
