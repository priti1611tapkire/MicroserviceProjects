package com.example.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@Controller
public class HomeController {

	@RequestMapping("/index")
	public String pg() {
		return "index";
	}
	
	@RequestMapping("/register")
	public String rpg() {
		return "register";
	}
}
