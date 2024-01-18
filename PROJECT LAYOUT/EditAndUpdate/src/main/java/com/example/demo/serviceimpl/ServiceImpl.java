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
	public Employee editData(int id) {
		Employee e = hr.findById(id).get();
		return e;
	}

	
	@Override
	public List<Employee> UpdateData(Employee e) {
		hr.save(e);
		return (List<Employee>) hr.findAll();
	}
}
