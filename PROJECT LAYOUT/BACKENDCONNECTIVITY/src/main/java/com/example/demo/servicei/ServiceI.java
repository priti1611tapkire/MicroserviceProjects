package com.example.demo.servicei;

import java.util.List;

import com.example.demo.model.Employee;

public interface ServiceI {

	void savedata(Employee e);

 

List<Employee> getdata();



Employee editdata(int id);



List<Employee> updatedata(Employee e);



List<Employee> deletedata(int id);

}
