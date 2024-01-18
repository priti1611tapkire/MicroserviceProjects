package com.example.demo.serviceimpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.model.Student;
import com.example.demo.repository.HomeRepository;
import com.example.demo.servicei.ServiceI;
@Service
public class ServiceImpl implements ServiceI{

	@Autowired
	HomeRepository hr;

	@Override
	public void saveData(Student s) {
		// TODO Auto-generated method stub
		hr.save(s);
	}

	@Override
	public Student loginck(int id) {
		// TODO Auto-generated method stu
	Student s =hr.findById(id).get();
		
		return s;
	}

	@Override
	public List<Student> deletedata(int id) {
		// TODO Auto-generated method stub
		hr.deleteById(id);
		List<Student> slist=(List<Student>) hr.findAll();
		return slist;
	}

	@Override
	public Student editdata(int id) {
		// TODO Auto-generated method stub
		Student s=hr.findById(id).get();
		
		return s;
	}

	@Override
	public List<Student> updatedata(Student s) {
		// TODO Auto-generated method stub
		hr.save(s);
		List<Student> list=(List<Student>) hr.findAll();
		return list;
	}

	@Override
	public List<Student> loginckn() {
		// TODO Auto-generated method stub
		List<Student> slist=(List<Student>) hr.findAll();
		return slist;
	}

	@Override
	public List<Student> updateRecord(int id, Student stu) {
		Student s = hr.findById(id).get();
		if(stu.getId() == s.getId()) {
			hr.save(stu);
		}
		return (List<Student>) hr.findAll();
	}
	
	
}
