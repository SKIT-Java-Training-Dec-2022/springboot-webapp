package com.skit.sb.web.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.ModelAndView;

import com.skit.sb.web.model.User;

@Controller
public class MessageConroller {
	
	@GetMapping("/")
	public String getMessage() {
		return "message";
	}
	
	@PostMapping("/saveUser")
	public ModelAndView save(User user) {
		System.out.println("user details:"+user);
		ModelAndView mnv = new ModelAndView();
		mnv.addObject("userdata", user);
		mnv.setViewName("user-data");
		return mnv;
		
	}

}
