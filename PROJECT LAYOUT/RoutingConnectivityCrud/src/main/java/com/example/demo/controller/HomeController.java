package com.example.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PatchMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.model.Employee;
import com.example.demo.servicei.ServiceI;

@RestController
@CrossOrigin("*")
@RequestMapping("/emp")
public class HomeController {

	@Autowired
	ServiceI si;

	@PostMapping("/register")
	public String postdata(@RequestBody Employee e) {
		si.saveData(e);
		return "data save";
	}
	
	@GetMapping("/login/{uname}/{pass}")
	public List<Employee> loginck(@PathVariable("uname") String un,@PathVariable("pass") String ps){
		
		List<Employee> elist=si.loginckc(un,ps);
		return elist;
	}
	
	@GetMapping("/loginc")
	public List<Employee> loginck(){
		
		List<Employee> elist=si.loginc();
		return elist;
	}
	
	@DeleteMapping("/delete/{id}")
	public List<Employee> delop(@PathVariable("id")int id) {
		List<Employee> elist=si.deleteopp(id);
		return elist;
	}
	
	@GetMapping("/edit/{id}")
	public Employee editdata(@PathVariable("id")int id) {
		Employee e=si.editd(id);
		return e;
	}
	
	@PutMapping("/up")
	public List<Employee> upl(@RequestBody Employee e){
		List<Employee> elist=si.updatedata(e);
		return elist;
	}
	}
