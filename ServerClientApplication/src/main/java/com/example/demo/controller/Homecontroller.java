package com.example.demo.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Homecontroller {

	@RequestMapping("/")
	public String firstpg() {
		return "Client1 calling";
	}
}
