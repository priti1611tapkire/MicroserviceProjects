package com.example.demo.serviceimpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;import org.springframework.boot.autoconfigure.mongo.embedded.EmbeddedMongoProperties;
import org.springframework.stereotype.Service;

import com.example.demo.model.Employee;
import com.example.demo.repository.HomeRepository;
import com.example.demo.servicei.ServiceI;

@Service
public class ServiceImpl implements ServiceI {

	@Autowired
	HomeRepository hr;
	
	@Override
	public void savedata(Employee e) {
		// TODO Auto-generated method stub
		hr.save(e);
	}

	@Override
	public List<Employee> getdata() {
		// TODO Auto-generated method stub
		
		List<Employee> elist=(List<Employee>) hr.findAll();
				return elist;
	}

	@Override
	public Employee editdata(int id) {
		// TODO Auto-generated method stub
		return hr.findById(id).get();
	}

	@Override
	public List<Employee> updatedata(Employee e) {
		// TODO Auto-generated method stub
		hr.save(e);
		List<Employee> elist=(List<Employee>) hr.findAll();
		return elist;
	}

	@Override
	public List<Employee> deletedata(int id) {
		
		// TODO Auto-generated method stub
		hr.deleteById(id);
		List<Employee> elist=(List<Employee>) hr.findAll();
		return elist;
		
	}

}
