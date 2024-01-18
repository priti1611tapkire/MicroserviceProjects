package com.example.demo.controller;


import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.model.Employee;



@RestController
public class HomeController {

	@RequestMapping(value = "/adddata", method = RequestMethod.POST )
	public String adddata(@RequestBody Employee e) {
		
		System.out.println("data:"+e.getName());
		return "Add Data Successfully";
	}
	

	
	@RequestMapping(value = "/getdata", method = RequestMethod.GET)
	public Employee getData() {
		Employee s=new Employee();
		s.setId(2);
		s.setName("Deepa");
		s.setAddr("kgf");
		s.setUname("deepu");
		s.setPass("deepu");
		return s;
		
	}
	
	
}

