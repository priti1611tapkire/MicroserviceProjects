package com.example.demo.servicei;

import java.util.List;

import com.example.demo.model.Student;

public interface ServiceI {

	void saveData(Student e);

	List<Student> loginckc(String un, String ps);

	List<Student> loginc();

	List<Student> deleteopp(int id);

	Student editd(int id);

	List<Student> updatedata(Student e);

}
