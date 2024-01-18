package com.example.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.model.Student;
import com.example.demo.serviceI.ServiceI;

@RestController
public class HomeController {
	@Autowired
	ServiceI si;

	@PostMapping("/reg")
	public String reg(@RequestBody Student s) {
		si.saveData(s);
		return "Data inserted successfully";
	}
//=====sid
	@GetMapping("/getdata/{sid}")
	public String getdata(@PathVariable("sid") int s) {
		
		return si.getdata(s);
	}
	//===all data===
	@GetMapping("/getall")
	public List<Student> getAllData(@RequestBody Student s){
		
		return si.getallstudata();
	}
	
	@DeleteMapping("/delete/{sid}")
	public String del(@PathVariable("sid") int s) {
		si.deletedata(s);
		return null;
	}
	
	@GetMapping("/getbyid/{sid}")
	public String getbyid(@PathVariable ("sid") int s) {
		return si.getdatafrmstudent(s);
	}
	
	@GetMapping("/getbyname/{sname}")
	public String getbyname(@PathVariable("sname") String sname){
		
		return si.getbyname(sname);
	}
	
		
	
	
}
