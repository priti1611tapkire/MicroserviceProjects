package com.example.demo.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.model.Student;
@RestController
public class HomeController {

	
	@RequestMapping("/getAllData")
	public List getAllData()
	{
		
		Student s=new Student();
		s.setId(1);
		s.setName("Priti");
		s.setAddr("Aurangabad");
		s.setUname("prit");
		s.setPass("prit");
		
		Student s1=new Student();
		s1.setId(2);
		s1.setName("Prit");
		s1.setAddr("Abad");
		s1.setUname("p");
		s1.setPass("p");
		List al=new ArrayList<>();
		al.add(s);
		al.add(s1);
		
		return al;
	}
}
