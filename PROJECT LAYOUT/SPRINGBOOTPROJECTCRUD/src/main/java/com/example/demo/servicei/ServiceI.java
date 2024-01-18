package com.example.demo.servicei;

import java.util.List;

import com.example.demo.model.Student;

public interface ServiceI {

	void saveData(Student s);

	Student loginck(int id);

	List<Student> deletedata(int id);

	Student editdata(int id);

	List<Student> updatedata(Student s);

	List<Student> loginckn();

	List<Student> updateRecord(int id, Student s);

}
