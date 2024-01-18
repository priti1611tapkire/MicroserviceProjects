package com.example.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.model.Employee;
import com.example.demo.servicei.ServiceI;

@RestController
public class HomeController {
	@Autowired
	ServiceI si;

	@RequestMapping("/adddata")
	public void addData(@RequestBody Employee e) {
		 si.saveData(e);
	}
}

