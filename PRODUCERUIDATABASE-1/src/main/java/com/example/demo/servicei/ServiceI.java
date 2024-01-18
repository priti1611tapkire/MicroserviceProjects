package com.example.demo.servicei;

import java.util.List;

import com.example.demo.model.Employee;

public interface ServiceI {

	void saveData(Employee e);

	List<Employee> loginck(String uname, String pass);

	List<Employee> deleteData(int id);

	List<Employee> updatData(Employee e);

	Employee editData(int id);

}
