package com.example.demo.servicei;

import java.util.List;

import com.example.demo.model.Employee;

public interface ServiceI {

	

	List<Employee> loginCheck(String uname, String pass);

}
