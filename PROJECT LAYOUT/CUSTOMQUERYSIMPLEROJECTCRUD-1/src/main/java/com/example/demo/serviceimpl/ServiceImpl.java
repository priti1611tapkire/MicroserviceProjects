package com.example.demo.serviceimpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;

import com.example.demo.model.Student;
import com.example.demo.repository.HomeRepository;
import com.example.demo.serviceI.ServiceI;

@Service
public class ServiceImpl implements ServiceI {

	@Autowired
	HomeRepository hr;

	@Override
	public void saveData(Student s) {
		// TODO Auto-generated method stub
		hr.save(s);	
	}

	@Override
	public String getdata(int s) {
		// TODO Auto-generated method stub
		
		return hr.findByStudentslnameSid(s);
	}

	@Override
	public List<Student> getallstudata() {
		// TODO Auto-generated method stub
		return hr.getAllData();
	}

	@Override
	public void deletedata(int s) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public String getdatafrmstudent(int s) {
		// TODO Auto-generated method stub
		
	hr.dataByid(s);
	return hr.dataByid(s);
	}

	@Override
	public String getbyname(String sname) {
		// TODO Auto-generated method stub
		return hr.dataByname(sname);
	}
	
	
	


}
