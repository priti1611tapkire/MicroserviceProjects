package com.example.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.model.Employee;
import com.example.demo.servicei.ServiceI;

@RestController
public class HomeController {
	@Autowired
	ServiceI si;

	@RequestMapping(value = "/del/{id}", method = RequestMethod.DELETE)
	public List<Employee> deleteRecord(@PathVariable("id") int id) {
		List<Employee> slist = si.deleteRecord(id);
		System.out.println("Record deleted successfully");
		return slist;
	}
}
