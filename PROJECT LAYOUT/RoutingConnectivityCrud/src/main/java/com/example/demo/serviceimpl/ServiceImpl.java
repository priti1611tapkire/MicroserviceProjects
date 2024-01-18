package com.example.demo.serviceimpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.model.Employee;
import com.example.demo.repository.HomeRepository;
import com.example.demo.servicei.ServiceI;

@Service
public class ServiceImpl implements ServiceI {
	@Autowired
	HomeRepository hr;

	@Override
	public void saveData(Employee e) {
		// TODO Auto-generated method stub
		hr.save(e);
	}

	@Override
	public List<Employee> loginckc(String un, String ps) {
		// TODO Auto-generated method stub
		if(un.equals("admin")&&ps.equals("admin")) {
			List<Employee> elist=(List<Employee>) hr.findAll();
			return elist;
		}
		else {
			
			return hr.findByUnameAndPass(un, ps);
		}
	}

	@Override
	public List<Employee> loginc() {
		// TODO Auto-generated method stub
		return (List<Employee>) hr.findAll();
	}

	@Override
	public List<Employee> deleteopp(int id) {
		// TODO Auto-generated method stub
		hr.deleteById(id);
		return (List<Employee>) hr.findAll();
	}

	@Override
	public Employee editd(int id) {
		// TODO Auto-generated method stub
		
		return hr.findById(id).get();
	}

	@Override
	public List<Employee> updatedata(Employee e) {
		// TODO Auto-generated method stub
		hr.save(e);
		return (List<Employee>) hr.findAll();
	}

}
