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

import com.example.demo.model.Student;
import com.example.demo.servicei.ServiceI;

@RestController
@CrossOrigin("*")
@RequestMapping("/stu")
public class HomeController {

	@Autowired
	ServiceI si;

	@PostMapping("/register")
	public String postdata(@RequestBody Student e) {
		si.saveData(e);
		return "data save";
	}
	
	@GetMapping("/login/{uname}/{pass}")
	public List<Student> loginck(@PathVariable("uname") String un,@PathVariable("pass") String ps){
		List<Student> elist=si.loginckc(un,ps);
		return elist;
	}
	
	@GetMapping("/loginc")
	public List<Student> loginck(){	
		List<Student> elist=si.loginc();
		return elist;
	}
	
	@DeleteMapping("/delete/{id}")
	public List<Student> delop(@PathVariable("id")int id) {
		List<Student> elist=si.deleteopp(id);
		return elist;
	}
	
	@GetMapping("/edit/{id}")
	public Student editdata(@PathVariable("id")int id) {
		Student e=si.editd(id);
		return e;
	}
	
	@PutMapping("/up")
	public List<Student> upl(@RequestBody Student e){
		List<Student> elist=si.updatedata(e);
		return elist;
	}
	}
