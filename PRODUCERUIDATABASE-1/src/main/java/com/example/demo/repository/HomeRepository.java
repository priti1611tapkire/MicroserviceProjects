package com.example.demo.repository;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

import com.example.demo.model.Employee;

public interface HomeRepository extends CrudRepository<Employee, Integer> {
	List<Employee>findByUnameAndPass(String uname,String pass);
}
