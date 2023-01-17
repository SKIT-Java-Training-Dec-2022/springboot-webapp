package com.skit.sb.web.service;

import java.util.List;

import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import com.skit.sb.web.model.Employee;


@Service("messageService")
public class MessageService {
	
	public String getMessage() {
		return "Good Morning";
	}

	
	public List<Employee> getAllEmployee() {
		// TODO Auto-generated method stub
		return null;
	}
}
