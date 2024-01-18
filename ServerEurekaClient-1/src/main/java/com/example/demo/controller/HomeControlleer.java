package com.example.demo.controller;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.model.Student;

@RestController
public class HomeControlleer {

	@RequestMapping(value = "/adddata", method = RequestMethod.POST )
	public String adddata(@RequestBody Student s) {
		
		System.out.println("data:"+s.getName());
		return "Add Data Successfully";
	}
	
	@RequestMapping(value = "/login/{uname}/{pass}", method = RequestMethod.POST)
	public Student loginCheck(@PathVariable("uname")String un,@PathVariable("pass")String ps) {
		
		System.out.println(un);
		System.out.println(ps);
		Student s=new Student();
		s.setRollno(1);
		s.setName("Priti");
		s.setAddr("Abad");
		s.setUname("prit");
		s.setPass("prit");
		
		return s;
	}
	
	@RequestMapping(value = "/getdata", method = RequestMethod.GET)
	public Student getData() {
		Student s=new Student();
		s.setRollno(2);
		s.setName("Deepu");
		s.setAddr("kg");
		s.setUname("deep");
		s.setPass("deep");
		return s;
		
	}
	
	
}
