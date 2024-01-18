package com.example.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import com.example.demo.model.Employee;

@RestController
@CrossOrigin("*")
public class HomeController {
	@Autowired
	RestTemplate restT;
	
	@RequestMapping(value = "/postdata", method = RequestMethod.POST)
	public Employee postData(@RequestBody Employee e){
		//String url = "http://localhost:8094/adddata";
		String url = "http://zuul/addhere/adddata";
		Employee  e1 = restT.postForObject(url, e, Employee.class);
		System.out.println(e1);
		return e1;
	}
	
	@RequestMapping(value = "/logincheck/{uname}/{pass}", method = RequestMethod.GET)
	public List<Employee> loginCheck(@PathVariable("uname") String uname,@PathVariable("pass") String pass){
		//String url = "http://localhost:8095/log/"+uname+"/"+pass;
		String url = "http://zuul/gethere/log/"+uname+"/"+pass;
		System.out.println(url);
		List<Employee> ls = restT.getForObject(url, List.class);
		return ls;
	}
	
	@RequestMapping(value = "/delcheck/{id}", method = RequestMethod.DELETE)
	public String deleteRecord(@PathVariable("id") int id) {
		//String url = "http://localhost:8096/del/"+id;
		String url = "http://zuul/delhere/del/"+id;
		restT.delete(url);
		return "data deleted successfully";
	}
	
	@RequestMapping(value="/editdata/{id}", method = RequestMethod.GET)
	public Employee editRecord(@PathVariable("id") int id) {
	//	String url = "http://localhost:8097/edit/"+id;
		String url = "http://zuul/edituphere/edit/"+id;
		Employee e= restT.getForObject(url, Employee.class);
		return e;
	}
	
	@RequestMapping(value="/updatedata", method = RequestMethod.PUT)
	public String updateRecord(@RequestBody Employee e){
		//	String url = "http://localhost:8097/up";
		String url = "http://zuul/edituphere/up";
		restT.put(url, e);
		return "data updated successfully";
	}
	
}
