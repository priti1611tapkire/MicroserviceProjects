package com.example.demo.serviceI;

import java.util.List;

import com.example.demo.model.Student;

public interface ServiceI {

	public void saveData(Student s);

	public String getdata(int s);

	public List<Student> getallstudata();

	public void deletedata(int s);

	public String getdatafrmstudent(int s);

	public String getbyname(String sname);
	public static void m1() {
		
	}
	default void m2() {
		
	}

}
