package com.example.demo.servicei;

import java.util.List;

import com.example.demo.model.Employee;

public interface ServiceI {

	void saveData(Employee e);

	List<Employee> loginckc(String un, String ps);

	List<Employee> loginc();

	List<Employee> deleteopp(int id);

	Employee editd(int id);

	List<Employee> updatedata(Employee e);

}
