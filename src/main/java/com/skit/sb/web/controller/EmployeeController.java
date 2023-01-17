package com.skit.sb.web.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.ModelAndView;

import com.skit.sb.web.model.Employee;
import com.skit.sb.web.service.EmployeeService;
import com.skit.sb.web.service.ServiceInterface;

@Controller
public class EmployeeController {
	
	@Autowired
	@Qualifier("employeeService")
	private EmployeeService service;
	
	@GetMapping("/employees")
	public ModelAndView getAllEmployee() {
		ModelAndView mnv = new ModelAndView();
		List<Employee> empList = service.getAllEmployee();
		mnv.addObject("empList", empList);
		mnv.setViewName("emp-list");
		return mnv;
	}
	
	@GetMapping("/empform")
	public String empForm() {		
		return "empform";
	}
	
	@PostMapping("/save")
	public ModelAndView saveEmployee(@ModelAttribute Employee emp) {
		ModelAndView mnv = new ModelAndView();
		service.saveEmployee(emp);
		List<Employee> empList = service.getAllEmployee();
		mnv.addObject("empList", empList);
		mnv.setViewName("emp-list");
		return mnv;
	}

}
