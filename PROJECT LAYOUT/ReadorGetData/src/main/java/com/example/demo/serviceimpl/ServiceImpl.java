package com.example.demo.serviceimpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.model.Employee;
import com.example.demo.repository.HomeRepository;
import com.example.demo.servicei.ServiceI;

@Service
public class ServiceImpl implements ServiceI{
	@Autowired
	HomeRepository hr;

	
	@Override
	public List<Employee> loginCheck(String uname, String pass) {
		if(uname.equals("admin") && pass.equals("admin")) {
			return (List<Employee>) hr.findAll();
		}else {
			return hr.findByUnameAndPass(uname, pass);
		}
	}

}
