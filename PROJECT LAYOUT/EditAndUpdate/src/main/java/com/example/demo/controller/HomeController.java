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

	@RequestMapping(value="/edit/{id}", method = RequestMethod.GET)
	public Employee editRecord(@PathVariable("id") int id) {
		Employee e= si.editData(id);
		return e;
	}
	
	@RequestMapping(value="/up", method = RequestMethod.PUT)
	public List<Employee> updateRecord(@RequestBody Employee e){
		List<Employee> elist=si.UpdateData(e);
		return elist;
	}

}
