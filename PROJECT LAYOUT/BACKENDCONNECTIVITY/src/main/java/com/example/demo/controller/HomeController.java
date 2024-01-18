package com.example.demo.controller;

import java.util.List;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PatchMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;


import com.example.demo.model.Employee;

import com.example.demo.servicei.ServiceI;
@CrossOrigin("*")
@RestController
@RequestMapping("/employee")
public class HomeController {

	@Autowired
	ServiceI si;
	
	@PostMapping("/reg")
	public String save(@RequestBody Employee e) {
		si.savedata(e);
		return "save data";
	}
	
	
	@GetMapping("/getdata")
	public List<Employee> getdata() {
		System.out.println("priti");
		return si.getdata();
	}
	@GetMapping("/editdata/{id}")
	public  Employee editdata(@PathVariable("id") int id){
	Employee e1=si.editdata(id);
	return e1;
	}
	@PatchMapping("/updatedata")
	public List<Employee> updatedata(@RequestBody Employee e){
		List<Employee> list=si.updatedata(e);
		return list;
	}
	
	@DeleteMapping("/delete/{id}")
	public List<Employee> deletedata(@PathVariable("id")int id){
		List<Employee> elist=si.deletedata(id);
		return elist;
	}
	
}
