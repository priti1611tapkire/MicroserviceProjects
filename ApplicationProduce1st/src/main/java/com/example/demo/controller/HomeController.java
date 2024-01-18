package com.example.demo.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.model.Student;

@RestController
public class HomeController {

	@RequestMapping("/adddata")
	public String adddata(@RequestBody Student s) {
		return "data added successfully";
		
	}
	
	@RequestMapping(value = "/postdata", method = RequestMethod.GET)
	public List postdata() {
		
		List l=new ArrayList<>();
		
		Student s=new Student();
		s.setId(2);
		s.setName("Priti");
		s.setAddr("Abad");
		s.setUname("prit");
		s.setPass("prit");
		
		Student s1=new Student();
		s1.setId(3);
		s1.setName("Mahi");
		s1.setAddr("Parbhani");
		s1.setUname("mahi");
		s1.setPass("mahi");
		l.add(s);
		l.add(s1);
		return l;
		
	}
}
