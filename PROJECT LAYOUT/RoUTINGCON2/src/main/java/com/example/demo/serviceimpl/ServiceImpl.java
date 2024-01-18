package com.example.demo.serviceimpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.model.Student;
import com.example.demo.repository.HomeRepository;
import com.example.demo.servicei.ServiceI;

@Service
public class ServiceImpl implements ServiceI {
	@Autowired
	HomeRepository hr;

	@Override
	public void saveData(Student e) {
		// TODO Auto-generated method stub
		hr.save(e);
	}

	@Override
	public List<Student> loginckc(String un, String ps) {
		// TODO Auto-generated method stub
		if(un.equals("admin")&&ps.equals("admin")) {
			List<Student> elist=(List<Student>) hr.findAll();
			return elist;
		}
		else {
			
			return hr.findByUnameAndPass(un, ps);
		}
	}

	@Override
	public List<Student> loginc() {
		// TODO Auto-generated method stub
		return (List<Student>) hr.findAll();
	}

	@Override
	public List<Student> deleteopp(int id) {
		// TODO Auto-generated method stub
		hr.deleteById(id);
		return (List<Student>) hr.findAll();
	}

	@Override
	public Student editd(int id) {
		// TODO Auto-generated method stub
		
		return hr.findById(id).get();
	}

	@Override
	public List<Student> updatedata(Student e) {
		// TODO Auto-generated method stub
		hr.save(e);
		return (List<Student>) hr.findAll();
	}

}
