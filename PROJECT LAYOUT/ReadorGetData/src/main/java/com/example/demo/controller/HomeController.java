package com.example.demo.controller;

import java.util.List;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.model.Employee;
import com.example.demo.servicei.ServiceI;

@RestController
public class HomeController {
	@Autowired
	ServiceI si;

	@RequestMapping(value = "/log/{uname}/{pass}" , method = RequestMethod.GET)
	public List<Employee> loginCheck(@PathVariable("uname") String uname, @PathVariable("pass") String pass) {
		List<Employee>  elist=si.loginCheck(uname, pass);
		System.out.println(elist);
		return elist;
	}
}
