package com.example.demo.controller;

import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Profile;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.BindingResult;
import org.springframework.validation.Errors;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.HttpStatusCodeException;

import com.example.demo.model.Student;
import com.example.demo.servicei.ServiceI;

import ch.qos.logback.classic.Logger;
@CrossOrigin("*")
@RequestMapping("/student")
@RestController
public class HomeController {

	@Autowired
	ServiceI si;
	
	@RequestMapping(value = "/register", method = RequestMethod.POST)
	public String saveRecord( @Valid @RequestBody Student  s) {
		System.out.println("hdjfhdrghdfghfdjjhgfkj");
		si.saveData(s);
		return "data inserted successfully";
	}
	
	@RequestMapping(value = "/log/{id}", method =RequestMethod.GET )
	public Student login(@PathVariable("id")int id){
		
		Student s1=si.loginck(id);
		return s1;
	}
	
	@RequestMapping(value = "/login", method =RequestMethod.GET )
	public List<Student> loginck(){
		List<Student> slist=si.loginckn();
		return slist;
	}
	
	@RequestMapping (value ="/delete/{id}", method =RequestMethod.DELETE)
	public List<Student> deletedata(@PathVariable("id")int id){
		List<Student> slist=si.deletedata(id);
		return slist;
	}
	
	@RequestMapping(value = "/editdata/{id}",method=RequestMethod.GET)
		public  Student editdata(@PathVariable("id") int id){
		System.out.println("hfdshfusdy");
		Student s1=si.editdata(id);
		return s1;
	}
	
	@RequestMapping(value = "/updatedata",method =RequestMethod.PATCH )
	public List<Student> updatedata(@RequestBody Student s){
		System.out.println("updatye me");
		List<Student> list=si.updatedata(s);
		return list;
	}
	//=================================error=================
	 @RequestMapping(value ="/up/{id}", method= RequestMethod.PUT)  
	  public List<Student> putId(@RequestBody Student s , @PathVariable(value="id") int id) {
	    List<Student> slist=si.updateRecord(id, s);
	    return slist;
	  }
	
	
}
