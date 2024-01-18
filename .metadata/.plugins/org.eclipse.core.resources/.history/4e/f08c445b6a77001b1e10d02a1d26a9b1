package com.example.demo.controller;

import java.util.List;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import com.example.demo.model.Student;

@RestController
public class HomeController {

	@Autowired
	RestTemplate restT;
	
	@RequestMapping("/getReco")
	public List getData() {
		String url="http://zuul/getproduce/postdata";
	List l=restT.getForObject(url, List.class);
	return l;
	}
	 
	@RequestMapping(value="/postReco",method = RequestMethod.POST)
	public Student getdata(@RequestBody Student c) {
		String url="http://zuul/getproduce/adddata";
		Student s=restT.postForObject(url, c, Student.class);	
		return s;
	}
}
