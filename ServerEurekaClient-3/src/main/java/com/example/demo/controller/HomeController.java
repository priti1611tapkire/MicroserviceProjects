package com.example.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

import com.example.demo.model.Employee;

@Controller
public class HomeController {

	@RequestMapping("/")
	public String firstpg() {
		return "index";
	}
	
	@RequestMapping("/register")
	public String prelogpg() {
		return "register";
	}
	
	@RequestMapping("/reg")
	public String regdata(@ModelAttribute("emp")Employee e) {
		return "success";
	}
}
